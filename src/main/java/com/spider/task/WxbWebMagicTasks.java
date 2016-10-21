package com.spider.task;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.jsoup.Connection.Method;
import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.annotation.Schedules;
import org.springframework.stereotype.Component;

import com.spider.service.WechatDataReptileService;
import com.spider.util.PropertiesUtil;
import com.spider.wxb.WxbPipeline;
import com.spider.wxb.WxbSpider;

import us.codecraft.webmagic.Spider;

@Component
public class WxbWebMagicTasks {
	
	@Autowired
	private WechatDataReptileService wechatDataReptileService;

	private static Logger logger =Logger.getLogger(WxbWebMagicTasks.class);
	
	
    @Schedules({
    	@Scheduled(cron = " 0 09 11 * * ? "),
    })
    public void wechatSchoolSpiderRun() {
    	logger.info(">>>>>>WechatWeixiaobaoTasks start-=-=-=-=-");
		produce();
		logger.info(">>>>>>WechatWeixiaobaoTasks end-=-=-=-=-");
    }
    
    private void produce() {
//    	String sid=login();
    	String sid="vkac8cfdsbgc23k9og1gf5q0l2";
    	if(StringUtils.isBlank(sid)){
    		logger.info(">>>>>>WechatWeixiaobaoTasks sid  is null-=-=-=-=-");
    		return;
    	}
			logger.info(">>>>>>WechatWeixiaobaoTasks start-=-=-=-=-");
			try{	  
				Thread.sleep(3333);
				toReptileWechat(sid);
			}catch(Exception e){
				logger.error(">>>>>>WechatWeixiaobaoTasks errpr -=-=-=-=-",e);
			}
			
			logger.info(">>>>>>WechatWeixiaobaoTasks  end -=-=-=-=-");
	
	}

	private void toReptileWechat(String sid)throws Exception {
		int page=1;
//		String url="http://www.wxb.com/follow/index?page="+page+"&group_id="+source.getPublicId()+"&pageSize=30";
		String url="http://www.wxb.com/follow/index?page="+page+"&is_first=0&days=3";
		if(StringUtils.isNotBlank(url)){
			//TODO 更多页可以写while循环
//			Spider.create(new WxbSpider(sid,source)).addUrl(url).addPipeline(new WxbPipeline()).thread(1).run();
			Spider.create(new WxbSpider(sid,wechatDataReptileService)).addUrl(url).addPipeline(new WxbPipeline(wechatDataReptileService)).thread(1).run();
		}
		try {
			Thread.sleep(30000l);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	
	/**
	 *   登录获取 sid
	 */
	private static final String USERANME=PropertiesUtil.getValue("wxb.username");//登录用户名
	private static final String PASSWORD=PropertiesUtil.getValue("wxb.password");//登录密码
	private  String login() {
		try{
			String ua= "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/51.0.2704.103 Safari/537.36";
			String referer="http://account.wxb.com/?from=http%3A%2F%2Fwww.wxb.com%2F";
			String accept="application/json, text/javascript, */*; q=0.01";
			String X_Requested_With="XMLHttpRequest";
			String contentType = "Content-Type";
			String origin = "http://account.wxb.com";
			
			String url = "http://account.wxb.com/index/login";
			
			Response res = Jsoup.connect(url).userAgent(ua)
					.referrer(referer)
					.header("Accept", accept)
					.header("X-Requested-With",X_Requested_With)
					.header("Content-Type", contentType)
					.header("Origin", origin)
					.method(Method.POST)
					.requestBody("email="+USERANME+"&password="+PASSWORD+"&captcha&from=http://www.wxb.com/")
					.execute();
			String sid = res.cookie("PHPSESSID");
			logger.info(">>>>>>WechatWeixiaobaoTaskssid:"+sid );
			logger.info(">>>>>>WechatWeixiaobaoTasksbody:"+res.body() );
			return sid;
		}catch(Exception e){
			logger.error(">>>>>>WechatWeixiaobaoTasks error",e);
		}
		return null;
	}
}
