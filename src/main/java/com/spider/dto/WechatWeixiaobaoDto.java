package com.spider.dto;

import java.io.Serializable;

/**
 * 微小宝 数据抓取dto
 * @author tianmao
 *
 */
public class WechatWeixiaobaoDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6935643698432939414L;

	private String id;
	
	private String article_title;
	
	private String article_url;
	
	private String publish_time;
	
	private long push_time;
	
	private String read_num;
	
	private String like_num;
	
	private String content_type;
	
	private int is_original;
	
	private String update_time;
	
	private String gzh_id;
	
	private String gzh_name;
	
	private int is_collect;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getArticle_title() {
		return article_title;
	}

	public void setArticle_title(String article_title) {
		this.article_title = article_title;
	}

	public String getArticle_url() {
		return article_url;
	}

	public void setArticle_url(String article_url) {
		this.article_url = article_url;
	}

	public String getPublish_time() {
		return publish_time;
	}

	public void setPublish_time(String publish_time) {
		this.publish_time = publish_time;
	}

	public long getPush_time() {
		return push_time;
	}

	public void setPush_time(long push_time) {
		this.push_time = push_time;
	}

	public String getRead_num() {
		return read_num;
	}

	public void setRead_num(String read_num) {
		this.read_num = read_num;
	}

	public String getLike_num() {
		return like_num;
	}

	public void setLike_num(String like_num) {
		this.like_num = like_num;
	}

	public String getContent_type() {
		return content_type;
	}

	public void setContent_type(String content_type) {
		this.content_type = content_type;
	}

	public int getIs_original() {
		return is_original;
	}

	public void setIs_original(int is_original) {
		this.is_original = is_original;
	}

	public String getUpdate_time() {
		return update_time;
	}

	public void setUpdate_time(String update_time) {
		this.update_time = update_time;
	}

	public String getGzh_id() {
		return gzh_id;
	}

	public void setGzh_id(String gzh_id) {
		this.gzh_id = gzh_id;
	}

	public String getGzh_name() {
		return gzh_name;
	}

	public void setGzh_name(String gzh_name) {
		this.gzh_name = gzh_name;
	}

	public int getIs_collect() {
		return is_collect;
	}

	public void setIs_collect(int is_collect) {
		this.is_collect = is_collect;
	}
	
	
	
	
	
}
