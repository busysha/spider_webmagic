package com.spider.service;

import java.util.List;

import com.spider.common.MemberDynamic;
import com.spider.common.SpiderSource;

/**
 * 搜狗 微信数据抓取service
 *
 */
public interface WechatDataReptileService {
	
	
	MemberDynamic findByTitle(String title );
	
	void insert(List<MemberDynamic> dynamic);
	
	List<SpiderSource> findSourceByFrom(String from);
	
}
