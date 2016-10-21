package com.spider.common;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

/**
 *  抓取数据来源表
 */


@Document(collection = "MM_SPIDER_SOURCES")
public class SpiderSource extends MongoBaseEntity implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = -6068380217455642665L;
	
	
	private String id;
	
	/**
	 *  sougou:搜狗
	 *  wxb:微小宝
	 */
	private String from;
	
	/**
	 * 微信公众号
	 */
	private String wechatNo;
	
	/**
	 * 微信公众号名称
	 */
	private String wechatName;
	
	/**
	 * 微信公众号Id   微小宝 搜索id
	 */
	private String publicId;
	
	/**
	 * 分组
	 */
	private String group;
	
	private String status;

    @Id
    public String getId() {
        return id;
    }
    
	public void setId(String id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getWechatNo() {
		return wechatNo;
	}

	public void setWechatNo(String wechatNo) {
		this.wechatNo = wechatNo;
	}

	public String getWechatName() {
		return wechatName;
	}

	public void setWechatName(String wechatName) {
		this.wechatName = wechatName;
	}

	public String getPublicId() {
		return publicId;
	}

	public void setPublicId(String publicId) {
		this.publicId = publicId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}


    
    
    

}
