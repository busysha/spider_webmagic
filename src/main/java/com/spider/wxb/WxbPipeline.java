package com.spider.wxb;

import java.util.List;

import com.spider.common.MemberDynamic;
import com.spider.service.WechatDataReptileService;

import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.Pipeline;

public class  WxbPipeline implements Pipeline{
	private WechatDataReptileService wechatDataReptileService;
	public WxbPipeline(){
	}
	public WxbPipeline(WechatDataReptileService wechatDataReptileService){
		this.wechatDataReptileService=wechatDataReptileService;
	}
	
	@SuppressWarnings("unchecked")
	public void process(ResultItems resultItems, Task task) {
		List<MemberDynamic> dynamics = (List<MemberDynamic>)resultItems.getAll().get("newsInfo");
		wechatDataReptileService.insert(dynamics);
	}

}
