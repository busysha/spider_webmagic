package com.spider.dto;

import java.io.Serializable;
import java.util.List;

public class WechatSchoolAppMsgExtInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8004528406728015691L;
	
	private String title;
	private String digest;
	private String content;
	private long fileid;
	private String content_url;
	private String source_url;
	private String cover;
	private int subtype;
	private int is_multi;
	private List<WechatSchoolAppMsgExtInfo> multi_app_msg_item_list;
	private String author;
	private int copyright_stat;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDigest() {
		return digest;
	}
	public void setDigest(String digest) {
		this.digest = digest;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public long getFileid() {
		return fileid;
	}
	public void setFileid(long fileid) {
		this.fileid = fileid;
	}
	public String getContent_url() {
		return content_url;
	}
	public void setContent_url(String content_url) {
		this.content_url = content_url;
	}
	public String getSource_url() {
		return source_url;
	}
	public void setSource_url(String source_url) {
		this.source_url = source_url;
	}
	public String getCover() {
		return cover;
	}
	public void setCover(String cover) {
		this.cover = cover;
	}
	public int getSubtype() {
		return subtype;
	}
	public void setSubtype(int subtype) {
		this.subtype = subtype;
	}
	public int getIs_multi() {
		return is_multi;
	}
	public void setIs_multi(int is_multi) {
		this.is_multi = is_multi;
	}
	public List<WechatSchoolAppMsgExtInfo> getMulti_app_msg_item_list() {
		return multi_app_msg_item_list;
	}
	public void setMulti_app_msg_item_list(List<WechatSchoolAppMsgExtInfo> multi_app_msg_item_list) {
		this.multi_app_msg_item_list = multi_app_msg_item_list;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getCopyright_stat() {
		return copyright_stat;
	}
	public void setCopyright_stat(int copyright_stat) {
		this.copyright_stat = copyright_stat;
	}
	
	
	
}
