package com.spider.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.spider.common.Constants;
import com.spider.common.MemberDynamic;
import com.spider.common.SpiderSource;
import com.spider.service.WechatDataReptileService;

@Service
public class WechatDataReptileServiceImpl implements WechatDataReptileService{
	
	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public MemberDynamic findByTitle(String title) {
		Query query=new Query();
		query.addCriteria(new Criteria("title").is(title));
		return mongoTemplate.findOne(query, MemberDynamic.class);
	}

	@Override
	public void insert(List<MemberDynamic> dynamics) {
		if(dynamics==null||dynamics.isEmpty())
			return;
		mongoTemplate.insert(dynamics,MemberDynamic.class);
	}

	@Override
	public List<SpiderSource> findSourceByFrom(String from) {
		
		
		
		Query query=new Query();
		query.addCriteria(new Criteria("from").is(from));
		query.addCriteria(new Criteria("status").is(Constants.STATUS_ACTIVE));
		return mongoTemplate.find(query, SpiderSource.class);
	}


	

}
