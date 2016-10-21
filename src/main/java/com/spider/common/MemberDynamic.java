package com.spider.common;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="MM_MEMBER_DYNAMIC")
public class MemberDynamic extends MongoBaseEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4772057754264146724L;
	
	
	private String id;
	/**
	 * 用户id
	 */
	private String memberId;
	
	/**
	 * 动态类型
	 *  MemberDynamicTypeEnum
	 */
	private String type;
	
	/**
	 * 动态内容
	 */
	private String content;
	
	/**
	 * 视频id
	 */
	private String videoId;
	
	private String videoUrl;
	
	/**
	 * 图片集合
	 */
	private List<ImageBean>  images;
	
	/**
	 * 照片数量
	 */
	private Integer imageSize;
	
	private long commentCount;


	/**
	 * 状态
	 */
	private String status;
	
	private String from;
	
	private String title;
	
	private int sort;
	
	private String isPublish = "Y";
	
	private String timeType = "S";
	/**
	 * 微信公众号名称
	 */
	private String wechatName;
	/**
	 * 微信公众号
	 */
	private String wechatNo;
	
	/**
	 * 微信 id
	 */
	private String wechatId;
	
	/**
	 * 第三方发布时间
	 */
	private long releaseTime;
	
	
	/**
	 */
	private String group;
	
	@Id
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getVideoId() {
		return videoId;
	}

	public void setVideoId(String videoId) {
		this.videoId = videoId;
	}

	public List<ImageBean> getImages() {
		return images;
	}

	public void setImages(List<ImageBean> images) {
		this.images = images;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getImageSize() {
		return imageSize;
	}

	public void setImageSize(Integer imageSize) {
		this.imageSize = imageSize;
	}

	public String getVideoUrl() {
		return videoUrl;
	}

	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}

	public long getCommentCount() {
		return commentCount;
	}

	public void setCommentCount(long commentCount) {
		this.commentCount = commentCount;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getSort() {
		return sort;
	}

	public void setSort(int sort) {
		this.sort = sort;
	}

	public String getIsPublish() {
		return isPublish;
	}

	public void setIsPublish(String isPublish) {
		this.isPublish = isPublish;
	}

	public String getTimeType() {
		return timeType;
	}

	public void setTimeType(String timeType) {
		this.timeType = timeType;
	}

	public String getWechatName() {
		return wechatName;
	}

	public void setWechatName(String wechatName) {
		this.wechatName = wechatName;
	}

	public String getWechatNo() {
		return wechatNo;
	}

	public void setWechatNo(String wechatNo) {
		this.wechatNo = wechatNo;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public long getReleaseTime() {
		return releaseTime;
	}

	public void setReleaseTime(long releaseTime) {
		this.releaseTime = releaseTime;
	}

	public String getWechatId() {
		return wechatId;
	}

	public void setWechatId(String wechatId) {
		this.wechatId = wechatId;
	}
	
	
}
