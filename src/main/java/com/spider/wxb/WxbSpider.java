package com.spider.wxb;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spider.common.Constants;
import com.spider.common.ImageBean;
import com.spider.common.MemberDynamic;
import com.spider.dto.WechatWeixiaobaoDto;
import com.spider.service.WechatDataReptileService;
import com.spider.util.JsoupUtil;
import com.spider.util.ObjectMapperSingle;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;

public class WxbSpider implements PageProcessor {
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	private WechatDataReptileService wechatDataReptileService;
	
	private String cookie;
	
	public WxbSpider(){
	}
	
	public WxbSpider(String cookie,WechatDataReptileService wechatDataReptileService){
		this.cookie = cookie;
		this.wechatDataReptileService=wechatDataReptileService;
	}
	private Site site = Site.me()
			.setUserAgent("Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36")
			.addHeader("Accept", "application/json, text/javascript, */*; q=0.01")
			.addHeader("Accept-Encoding", "gzip, deflate, sdch")
			.addHeader("Accept-Language", "zh-CN,zh;q=0.8")
			.addHeader("X-Requested-With","XMLHttpRequest")
			.addHeader("Cookie", "6aHW_e4af_saltkey=GCz11qQK; 6aHW_e4af_lastvisit=1477009190; 6aHW_e4af_auth=e0fbHeoTYbDMyc6EnNwhLdKFSDSOr%2FrrlEixbjTskte7CtYWcWnhy39wBeu9VyOlWmy9MyMsCgyaFP5bnCE5Cy%2FbDyo; RMU=449682; RMT=3c7c20a7ae232d35d9d3cabecbfcd04e; 6aHW_e4af_sid=j9Tq1t; 6aHW_e4af_lip=112.80.55.150%2C1477012792; 6aHW_e4af_lastact=1477012792%09uc.php%09; Hm_lvt_a8f5290f284cd47b2234d30f1d3bf0ae=1476675968,1476676207,1476956222,1477012795; Hm_lpvt_a8f5290f284cd47b2234d30f1d3bf0ae=1477012795; PHPSESSID=ktf0r0bvh7pjncbogrvqce06d3; Hm_lvt_5859c7e2fd49a1739a0b0f5a28532d91=1477017628; Hm_lpvt_5859c7e2fd49a1739a0b0f5a28532d91=1477017628")
			.setRetryTimes(3).setSleepTime(1000);

	public void process(Page page) {
		 String info = page.getRawText();
		 List<MemberDynamic> newsInfo = new ArrayList<MemberDynamic>();
		 try {
			 JSONObject json = JSON.parseObject(JsoupUtil.decodeUnicode(info));  
			 JSONArray array=json.getJSONArray("data");
			 if(array!=null&&!array.isEmpty()){
				 ObjectMapper mapper =ObjectMapperSingle.getInstance();
				 for(Object obj:array){
					String js = mapper.writeValueAsString(obj);
					WechatWeixiaobaoDto dto=mapper.readValue(js, WechatWeixiaobaoDto.class);
					if(null==wechatDataReptileService.findByTitle(dto.getArticle_title())){
						newsInfo.add(dtoToEntity(dto));
					}
				}
				page.putField("newsInfo", newsInfo);
			 }
		 } catch (Exception e) {
				logger.info(">>>>>>WechatSchoolTasks error "+e.getLocalizedMessage());
		}
	}
	private MemberDynamic dtoToEntity(WechatWeixiaobaoDto dto) {
		MemberDynamic entity=new MemberDynamic();
		
		entity.setMemberId("-1");
		entity.setType("newsPicture");
		
		entity.setContent(JsoupUtil.encode(dto.getArticle_url()));
	
		List<ImageBean>  images=new ArrayList<ImageBean>();
//		String imageUrl=findFirstImage(entity.getContent());
		String imageUrl="";
		if(StringUtils.isNotBlank(imageUrl)){
			ImageBean image=new ImageBean();
			image.setImageUrl(imageUrl);
			images.add(image);
		}
		entity.setImages(images);
		entity.setImageSize(1);
		entity.setStatus(Constants.STATUS_PADDING);
		entity.setIsPublish("N");
		entity.setFrom(dto.getGzh_name());
		entity.setTitle(dto.getArticle_title());
		entity.setCreateTime(System.currentTimeMillis());
//		entity.setWechatNo(source.getWechatNo());
		entity.setWechatId(dto.getGzh_id());
		entity.setWechatName(dto.getGzh_name());
//		entity.setGroup(source.getGroup());
		entity.setReleaseTime(dto.getPush_time()*1000);
		return entity;
	}
	
	public Site getSite() {
		return site;
	}
}
