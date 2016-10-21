package com.spider.common;

import java.io.Serializable;

import org.apache.commons.lang3.StringUtils;

/**
 * 基础 图片 对象
 */
public class ImageBean implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = -2671301010352152080L;
	
	private String imageUrl;
	
	private String cutImageUrl;

	public String getImageUrl() {
		if(StringUtils.isNotBlank(this.cutImageUrl)){
			return this.cutImageUrl;
		}
		return imageUrl;
	}
	
	public String getOldImageUrl() {
		return this.imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getCutImageUrl() {
		return cutImageUrl;
	}

	public void setCutImageUrl(String cutImageUrl) {
		this.cutImageUrl = cutImageUrl;
	}
	
}