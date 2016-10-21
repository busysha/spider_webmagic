package com.spider.dto;

import java.io.Serializable;

public class WechatSchoolCommMsgInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7533168257944875723L;
	
	private int id;
	private int type;
	private long datetime;
	private String fakeid;
	private int status;
	private String content;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public long getDatetime() {
		return datetime;
	}
	public void setDatetime(long datetime) {
		this.datetime = datetime;
	}
	public String getFakeid() {
		return fakeid;
	}
	public void setFakeid(String fakeid) {
		this.fakeid = fakeid;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
	
}
