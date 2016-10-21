package com.spider.dto;

import java.io.Serializable;

public class WechatSchoolInfoDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6935643698432939414L;

	
	private WechatSchoolCommMsgInfo comm_msg_info;
	
	private WechatSchoolAppMsgExtInfo app_msg_ext_info;

	public WechatSchoolCommMsgInfo getComm_msg_info() {
		return comm_msg_info;
	}

	public void setComm_msg_info(WechatSchoolCommMsgInfo comm_msg_info) {
		this.comm_msg_info = comm_msg_info;
	}

	public WechatSchoolAppMsgExtInfo getApp_msg_ext_info() {
		return app_msg_ext_info;
	}

	public void setApp_msg_ext_info(WechatSchoolAppMsgExtInfo app_msg_ext_info) {
		this.app_msg_ext_info = app_msg_ext_info;
	}
	
	
	
}
