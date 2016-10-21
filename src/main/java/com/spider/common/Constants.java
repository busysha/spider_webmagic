package com.spider.common;


public class Constants {
	
	/**
	 * 成功返回信息
	 */
	
	//成功返回码
	public static final int SUCCESS_CODE = 1;
	
	public static final int YES = 1;
	
	public static final int NO = 0;


	
	//成功返回信息
	public static final String SUCCESS_MSG = "success";
	
	
	public static final String FROM_SOUGOU = "sougou";
	
	public static final String FROM_WEIXIAOBAO = "wxb";


	
	
	/**
	 * 签名相关信息
	 */
	
	//跳过签名
	public static final String SKIP_VALIDATE_SIGN ="skip.validate.sign";
	
	//签名参数appid
	public static final String SIGN_PARAM_APPID = "appid";
	
	//签名参数sign
	public static final String SIGN_PARAM_SIGN = "sign";
	
	//签名参数timestamp
	public static final String SIGN_PARAM_TIMESTAMP="timestamp";
	
	//一天的时间戳
	public static final long ONE_DAY_TIMESTAMP= 86400000;
	/**
	 * 缓存相关信息
	 */
	
	//缓存appKey头
	public static final String REDIS_APP_KEY_HEAD = "appid_";
	
	//缓存member信息头
	public static final String REDIS_MEMBER_INFO_HEAD = "memberid_";
	
	//缓存任务url头
	public static final String REDIS_TASK_URL_HEAD = "task_url_";
	
	//缓存用户任务信息头
	public static final String REDIS_MEMBER_TASK_HEAD = "member_task_";
	
	
	/**
	 * leancloud相关信息
	 */
	
	//leancloud appid
	public static final String LEANCLOUD_APPID_KEY = ".leancloud.appid";
	
	//leancloud appkey
	public static final String LEANCLOUD_APPKEY_KEY = ".leancloud.appkey";
	
	//leancloud masterkey
	public static final String LEANCLOUD_MASTER_KEY = ".leancloud.masterkey";
	
	//leancloud 短信模板
	public static final String LEANCLOUD_SMS_TEMPLATE_KEY = ".leancloud.sms.template";
	
	//leancloud 消息推送
	public static final String LEANCLOUD_MM_PUSH = "mmpush";
	
	//leancloud 开启直播
	public static final String LEANCLOUD_EVENT_OPEN_LIVE = "openlive";


	/**
	 * 七牛相关信息
	 */
	
	//qiniu access key
	public static final String QINIU_ACCESS_KEY = "qiniu.access.key";
	
	//qiniu access key
	public static final String QINIU_SECRET_KEY = "qiniu.secret.key";
	
	//qiniu bucket
	public static final String QINIU_BUCKET_KEY = "qiniu.bucket.key";
	
	//qiniu hub
	public static final String QINIU_HUB_KEY = "qiniu.hub.key";
	
	
	
	
	/**
	 * 业务提示信息相关信息
	 */
	
	//系统异常
	public static final String SYSTEM_ERROR_KEY = "system.error";
	
	//参数异常
	public static final String PARAM_ERROR_KEY = "param.error";
	
	//发送验证码异常
	public static final String GETAUTHCODE_ERROR_KEY = "getauthcode.error";
	
	//验证验证码失败
	public static final String VALI_AUTHCODE_FAIL_KEY = "vali.authcode.fail";
	
	//用户已经存在
	public static final String USER_HAS_EXIST_KEY = "user.has.exist";
	
	//用户不存在
	public static final String USER_NOT_EXIST_KEY = "user.not.exist";
	
	//密码错误
	public static final String PASSWORD_ERROR_KEY = "password.error";
	
	//签名错误
	public static final String SIGN_ERROR_KEY = "sign.error";
	
	//一个设备最大允许注册量
	public static final String DEVIVE_MAX_REGISTER_ERROR_KEY = "device.max.register.error";
	
	//用户没有登录
	public static final String USER_NO_LOGIN_KEY = "user.no.login";
	
	//用户在另一台设备登录
	public static final String USER_LOGIN_ANOTHER_KEY = "user.login.another";
	
	//密码修改成功
	public static final String USER_RESETPASSWORD_KEY = "user.resetpassword";
	
	//附近学校距离
	public static final String NEAR_SCHOOLS_DISTANCE_KEY = "near.schools.distance";
	
	//退出登录
	public static final String LOGOUT_SUCCESS_KEY = "logout.success";
	
	//验证码获取成功
	public static final String GET_AUTHCODE_SUCCESS_KEY = "get.authcode.success";
	
	//保存兴趣爱好成功
	public static final String SAVE_INTERESTS_SUCCESS_KEY = "save.interest.success";
	
	//关注社团成功
	public static final String SAVE_ATTENTION_MEMBER_SUCCESS_KEY = "save.attention.member.success";
	
	//取消关注社团成功
	public static final String DELETE_ATTENTION_MEMBER_SUCCESS_KEY = "delete.attention.member.success";
	
	//社团不存在
	public static final String ORG_NOT_EXIST_KEY = "org.not.exist";
	
	//兴趣不存在
	public static final String INTEREST_NOT_EXIST_KEY = "interest.not.exist";
	
	//活动不存在
	public static final String ACTIVE_NOT_EXIST_KEY = "active.not.exist";
	
	//已经投票过
	public static final String HAS_ATTEND_KEY = "has.attend";
	
	//发布活动成功
	public static final String SUCCESS_SEND_ACTIVE_KEY = "success.send.active";
	
	//已经加入过此社团
	public static final String HAS_IN_ORG_KEY = "has.in.org";
	
	//投票日期已经截止
	public static final String ACTIVE_TIME_ERROR_KEY = "active.time.error";
	
	//竞猜规则A
	public static final String ACTIVE_SQUIZ_REWARD_RULE_A_NAME_KEY = "active.squiz.reward.rule.a.name";

	//竞猜使用猫粮
	public static final String ACTIVE_SQUIZ_USE_TYPE_CAT_NAME_KEY = "active.squiz.use.type.cat.name";
	
	//反馈成功
	public static final String SUGGEST_SUCCESS_KEY = "suggest.success";
	
	//反馈过多
	public static final String SUGGEST_MORE_KEY = "suggest.more";
	
	//没有新版本
	public static final String NO_NEW_VERSION_KEY = "no.new.version";
	
	//贡献经验成功
	public static final String DONATE_EXP_SUCCESS_KEY = "donate.exp.success";
	
	//发布照片墙活动成功
	public static final String SEND_PHOTOS_SUCCESS_KEY = "send.photos.success";

	//参加照片墙活动成功
	public static final String ATTEND_PHOTOS_SUCCESS_KEY = "attend.photos.success";

	//照片墙不存在
	public static final String PHOTOS_NOT_EXIST_KEY = "photos.not.exist";
	
	//发起辩论成功
	public static final String SEND_ARGU_SUCCESS_KEY = "send.argu.success";
	
	//点赞成功
	public static final String PRAISE_SUCCESS_KEY = "praise.success";
	
	//论据不存在
	public static final String ARGU_DESC_NOT_EXIST_KEY = "argu.desc.not.exist";
	
	//发表论据成功
	public static final String SEND_ARGU_DESC_SUCCESS_KEY = "send.argu.desc.success";
	
	//已经赞过
	public static final String HAS_PRAISE_KEY = "has.praise";
	
	//已经申请过团长
	public static final String HAS_APPLY_TEAMHEAD_KEY = "has.apply.teamhead";
	
	//已经是团长
	public static final String IS_TEAMHEAD_KEY = "is.teamhead";
	
	//申请团长成功
	public static final String APPLY_TEAMHEAD_SUCCESS = "apply.teamhead.success";

	//未关注社团
	public static final String NO_ATTEND_ORG_KEY = "no.attend.org";
	
	//团长不能取消关注的社团
	public static final String TEAMHEAD_CANNOT_CANCEL_ATTEND_KEY = "teamhead.cannot.cancel.attend";
	
	//没有开视频直播的权限
	public static final String HAS_NO_PEMISSION_KEY = "has.no.pemission";
	
	//无效的状态
	public static final String IS_INACTIVE_KEY = "is.inactive";

	public static final String ASK_CODE_TIMEOUT= "askcode.timeout";

	public static final String ASK_CODE_IS_SELF= "askcode.is.self";

	public static final String ASK_CODE_ONLY_ONCE = "askcode.only.once";

	public static final String ASK_CODE_NOT_EXIST = "askcode.not.exist";
	//猫巢业务码
	public static final String MC_NOT_MA        = "mc.not.ma";
	public static final String MC_CANT_GIVE_MA  = "mc.cant.give.ma";
	public static final String MC_CANT_MA_GIVED = "mc.cant.ma.gived";
	public static final String MC_MA_IS_FULL    = "mc.ma.is.full";
	public static final String MC_MA_SUCCESS    = "mc.ma.success";
	public static final String MC_GET_MONEY_OVER_TIMES = "get.money.over.times";
	//
	
	//开启直播间
	public static final String LIVE_OPEN_SUCCESS_KEY = "live.open.success";
	
	//开启直播间
	public static final String LIVE_STOP_SUCCESS_KEY = "live.stop.success";
	
	//主播不存在
	public static final String ANCHOR_NOT_EXIST_KEY = "anchor.not.exist";
	
	//订阅主播成功
	public static final String ATTEND_ANCHOR_SUCCESS = "attend.anchor.success";
	
	//取消订阅主播成功
	public static final String CANCEL_ATTEND_ANCHOR_SUCCESS = "cancel.attend.anchor.success";
	
	//当前主播已经订阅
	public static final String ANCHOR_HAS_ATTEND_KEY = "anchor.has.attend";
	
	//获取猫粮成功
	public static final String GET_CAT_SUCCESS_KEY = "get.cat.success";
	
	//没有此获取猫粮的业务
	public static final String NO_THIS_ACTIONTYPE_KEY = "no.this.actiontype";
	
	//当前业务当天已经达到获取最大数
	public static final String TODAY_MAX_GET_KEY = "today.max.get";
	
	//当天已经达到获取最大贡献经验次数
	public static final String HAS_NO_DONATE_EXP_KEY = "has.no.donate.exp";
	
	//猫粮不够不能参加活动
	public static final String USER_CAT_ISNOT_ENOUGH_KEY = "user.cat.isnot.enough";
	
	//竞猜使用猫粮
	public static final String MEMBER_GOODS_USE_CAT_SUQIZ_KEY = "member.goods.use.cat.squiz";
	
	//直播获取猫粮
	public static final String MEMBER_GOODS_GET_CAT_LIVE_KEY = "member.goods.get.cat.live";
	
	//直播分享获取猫粮
	public static final String MEMBER_GOODS_GET_CAT_LIVE_SHARE_KEY = "member.goods.get.cat.live.share";
	
	//评论成功
	public static final String COMMENT_SUCCESS_KEY = "comment.success";

	//举报成功
	public static final String REPORT_SUCCESS_KEY = "report.success";
	
	//时间错误
	public static final String TIME_ERROR_KEY = "time.error";
	
	//主播不能订阅自己
	public static final String ATTEND_SELF_KEY = "attend.self";
	
	//没有这个礼物
	public static final String NO_GIFT_KEY = "no.gift";

	//已经拉黑过
	public static final String HAS_BLACK_KEY = "has.black";
	
	//没有拉黑过
	public static final String HAS_NO_BLACK_KEY = "has.no.black";
	
	//拉黑成功
	public static final String MEMBER_BLACK_KEY = "member.black";
	
	//取消拉黑成功
	public static final String CANCEL_MEMBER_BLACK_KEY = "cacel.member.black";
		
	//已经申请主播
	public static final String HAS_APPLY_ANCHOR_KEY = "has.apply.anchor";
	
	//已经是主播了
	public static final String IS_ANCHOR_KEY = "is.anchor";
	
	//赠送礼物成功
	public static final String GIVE_GIFT_SUCCESS_KEY = "give.gift.success";
	
	//申请主播成功
	public static final String APPLY_ANCHOR_SUCCESS = "apply.anchor.success";
	
	//已经领取过猫粮
	public static final String HAS_GET_CAT_KEY = "has.get.cat";
	
	//主播不能送自己礼物
	public static final String ANCHOR_SEND_GIFT_KEY = "anchor.send.gift";
	
	//推送人数线程池数量
	public static final String PUSH_PEOPLE_THREAD_NUM = "push.people.thread.num";
	
	//找不到学校id
	public static final int SCHOOL_NOT_FOUND_ID = 0;
	
	/**
	 * 系统其它常量信息
	 */
	
	//用户序列号查询id
	public static final String MEMBER_SEQUENCE_ID = "memberId";
	
	//默认头像地址
	public static final String MEMBER_DEFAULT_AVATAL = "http://www.baidu.com";
	
	//允许最大注册次数
	public static final String DEVICE_MAX_REGISTER = "device.max.register";
	
	//客户端pagesize
	public static final String CLIENT_PAGESIZE_KEY = "client.pagesize";
	
	//官方社团编号
	public static final String CLIENT_OFFICIAL_ORGID_KEY = "-1";
	
	//官方社团名字
	public static final String CLIENT_OFFICIAL_ORGNAME_KEY = "官方推荐";

	//官方账户名字
	public static final String CLIENT_OFFICIAL_MEMBER_NAME_KEY = "猫盟";
	
	//猫盟
	public static final String OFFICIAL_STAR_NEWS_NAME_KEY = "猫盟";
	
	
	//社团等级详情排行展示量首页
	public static final int ORG_LEVEL_DETAIL_MAX_COUNT = 5;
	
	//社团等级详情排行展示量更多
	public static final int ORG_LEVEL_DETAIL_MAX_MORE_COUNT = 20;
	
	//客户端更多成员pagesize
	public static final int CLIENT_MORE_MEMBER_PAGESIZE = 10;
	
	//客户端照片墙详情pagesize
	public static final int CLIENT_PHOTOS_DETAIL_PAGESIZE = 12;
	
	//官方活动权重
	public static final String OFFICIAL_ACTIVE_WEIGHT = "official.active.weight";
	
	//商城接口地址
	public static final String MM_SHOP_URL = "mm.shop.url";
	
	//热门页数
	public static final String HOT_RANGE_PAGENO = "hot.range.pageno";

	//提现最小值
	public static final Integer GET_MONEY_MIN =10;

	//提现最大值
	public static final Integer GET_MONEY_MAX =2000;

	//提现小于提示语
	public static final String LT_GET_MONEY_MIN ="lt.get.money.min";

	//提现大于提示语
	public static final String GT_GET_MONEY_MAX ="gt.get.money.max";

	//开店提示语
	public static final String SHOP_NAME_OVER = "shop.name.over";

	//开店敏感词
	public static final String SENSITIVE_SHOP_NAME = "sensitive.shop.name";

	//提现金额不够提示语
	public static final String GET_MONEY_NOT_ENOUGH ="get.money.not.enough";
	
	//星闻不分兴趣
	public static final String STAR_NEWS_ALL_USER = "-1";
	
	//商城首页
	public static final String SHOP_INDEX_URL = "shop.index.url";
	
	//商城店铺首页
	public static final String GET_SHOP_ORG_INDEX_URL = "get.shop.org.index.url";
	
	//商城订单首页
	public static final String SHOP_ORDER_URL = "shop.order.url";
	
	//RSA PUBLIC KEY
	public static final String RSA_PUBLIC_KEY = "rsa.public.key";
	
	//环境
	public static final String MM_IOS_ENVIRONMENT = "mm.ios.environment";
	
	//系统消息渠道
	public static final String SYSTEM_PUSH_CHANNEL = "systemchannel";
	
	//ios平台
	public static final String PLATFORM_IOS = "ios";
	
	//android平台
	public static final String PLATFORM_ANDROID = "android";

	//是否开启弹幕
	public static final String SPEAK_CONFIG = "speak.config";
	
/*	//直播分享标题
	public static final String LIVE_SHARE_TITLE = "live.share.title";
	
	//直播分享内容
	public static final String LIVE_SHARE_CONTENT = "live.share.content";
	
	//直播分享图片
	public static final String LIVE_SHARE_PIC = "live.share.pic";
	
	//直播分享路径
	public static final String LIVE_SHARE_URL = "live.share.url";*/
	
	//直播分享标题
	public static final String LIVE_SHARE_TITLE = "猫盟直播";
	
	//直播分享内容
	public static final String LIVE_SHARE_CONTENT = "正在直播";
	
	//直播分享图片
	public static final String LIVE_SHARE_PIC = "live.share.pic";
	
	//直播分享路径
	public static final String LIVE_SHARE_URL = "live.share.url";
	

	/**
	 * 系统状态相关信息
	 */
	
	//有效状态
	public static final String STATUS_ACTIVE = "A";
	
	public static final String STATUS_SUCCESS = "S";
	
	public static final String STATUS_PADDING = "P";
	
	//无效状态
	public static final String STATUS_INACTIVE = "I";
	
	//团长
	public static final String MEMBER_HEAD = "ma";
	
	//副团
	public static final String MEMBER_DEPUTY_HEAD = "mb";
	
	//干事
	public static final String MEMBER_SECRETARY  = "mc";
	
	//普通
	public static final String MEMBER_NOMAL = "md";
	
	//设备历史记录注册
	public static final String DEVICE_OPERATION_REGIST = "R";
	
	//设备历史记录登录
	public static final String DEVICE_OPERATION_LOGIN = "L";
	
	//是
	public static final String STATUS_YES = "Y";
	
	//否
	public static final String STATUS_NO = "N";
	
	//投票活动
	public static final String ACTIVE_VOTE = "V";
	
	//竞猜活动
	public static final String ACTIVE_SQUIZ = "S";
	
	//照片墙活动
	public static final String ACTIVE_PHOTOS = "P";
	
	//辩论活动
	public static final String ACTIVE_ARGU = "A";
	
	//用户签到
	public static final String ACTIVE_MEMBER_SIGN = "S";

	//邀请码获取
	public static final String ACTIVE_ASK_CODE = "A";

    //商城购买
	public static final String ACTIVE_MALL_BUY = "B";

	//小灵猫奖励
	public static final String ACTIVE_XLM_REWARD = "R";

	//社团经验
	public static final String ORG_GOODS_EXP = "E";
	
	//社团基金
	public static final String ORG_GOODS_FOUND = "F";
	
	//社团现金
	public static final String ORG_GOODS_MONEY = "M";
	
	//用户申请待审核
	public static final String MEMBER_APPLY_AUDIT = "A";
	
	//用户申请成功
	public static final String MEMBER_APPLY_SUCCESS = "S";
	
	//用户申请失败
	public static final String MEMBER_APPLY_FAIL = "F";
	
	//用户申请团长
	public static final String MEMBER_APPLY_TEAMHEAD = "T";
	
	/**
	 * 团长类型
	 */
	public static final String MEMBER_TYPE_TEAMHEAD = "T";

		
	//用户申请主播
	public static final String MEMBER_APPLY_ANCHOR = "A";
	
	//用户申请推荐元
	public static final String MEMBER_APPLY_REFEREE = "R";
		
	//活动状态进行中
	public static final String ACTIVE_STATUS_ING = "I";
	
	//活动状态所有
	public static final String ACTIVE_STATUS_ALL = "A";
	
	//系统订阅类栏目
	public static final String SYSTEM_TYPE_CATAGORY = "catagory";
		
	//系统社团类栏目
	public static final String SYSTEM_TYPE_ORG = "org";
	
	//直播状态开启
	public static final String LIVE_STATUS_OPEN = "O";
	
	//直播状态关闭
	public static final String LIVE_STATUS_STOP = "S";
	
	//用户猫粮
	public static final String MEMBER_GOODTYPE_CAT = "C";
	
	//用户金币
	public static final String MEMBER_GOODTYPE_GOLD = "G";
	
	//用户星闻评论
	public static final String COMMENT_FROM_STAR_NEWS = "sn";
	
	//用户辩论评论
	public static final String COMMENT_FROM_ARGU = "aa";
	
	//用户投票评论
	public static final String COMMENT_FROM_VOTE = "av";
	
	//用户竞猜评论
	public static final String COMMENT_FROM_SQUIZ = "as";
	
	//用户照片墙评论
	public static final String COMMENT_FROM_PHOTOS = "ap";
	
	//用户星闻赞
	public static final String PTAISE_FROM_STAR_NEWS = "sn";
	
	//用户星闻评论赞
	public static final String PRAISE_FROM_STAR_NEWS_COMMENT = "snc";
	
	//用户辩论赞
	public static final String PRAISE_FROM_ARGU = "aa";
	
	//用户投票赞
	public static final String PRAISE_FROM_VOTE = "av";
	
	//用户竞猜赞
	public static final String PRAISE_FROM_SQUIZ = "as";
	
	//用户照片墙赞
	public static final String PRAISE_FROM_PHOTOS = "ap";
	
	//点赞和评论连接符
	public static final String PRAISE_AND_COMMENT_CHAR = "c";
	
	//发现推荐头部
	public static final String FOUND_RECOMMOND_HEAD = "H";
	
	//发现推荐尾部
	public static final String FOUND_RECOMMOND_END = "E";
	
	//物品获取行为社团来源
	public static final String GOODS_ACTION_FROM_ORG = "O";

	//物品获取行为用户来源
	public static final String GOODS_ACTION_FROM_MEMBER = "M";
	
	//官方星闻类型
	public static final String STAR_NEWS_OFFICIAL_TYPE = "O";
	
	//送礼物acntive
	public static final String ACTION_TYPE_GIVE_GIFT = "give_gift";
	
	//领猫粮acntive
	public static final String ACTION_TYPE_SQUIZ_REWARD = "squiz_reward";
	
	public static final String PUSH_PEOPLE_TIME = "push.people.time";

	//社团提现状态码
	//通过审核
	public static final String ORG_MONEY_VIA = "V";
	//审核中
	public static final String ORG_MONEY_CHECK = "C";
	//审核拒绝
	public static final String ORG_MONEY_REFUSE = "R";
	
	/**
	 * 支付类型  主播
	 */
	public static final String PAY_TYPE_ANCHOR = "A";
	
	/**
	 * 支付类型  社团团长
	 */
	public static final String PAY_TYPE_GXX = "G";


	
	
	/**
	 * 主播一次有效时长  五分钟
	 */
	public static final long LIVE_TIME_NEXT_VALID=5*60*1000;
	
	/**
	 * 主播一天有效时长   三十分钟
	 */
	public static final long LIVE_TIME_DAY_VALID=30*60*1000;
	
	/**
	 * 主播提现比例   40%  //TODO   以后会走表替换
	 */
	//public static final double ANCHOR_WITHDRAW_PERCENTAGE=0.4;
	
	/**
	 * 社团提现比例   20%  //TODO   以后会走表替换
	 */
	//public static final double ORG_WITHDRAW_PERCENTAGE=0.2;
	
	/**
	 * 平台分成比例 40%//TODO   以后会走表替换
	 */
	//public static final double PLATFORM_WITHDRAW_PERCENTAGE=1;

	

	/**
	 * 社团提现比例   5%  //TODO   以后会走表替换
	 */
	public static final double ORG_CASH_DEPOSIT_PERCENTAGE=0.05;
	
	/**
	 * 社团 比例  相对  主播
	 */
	//public static final double ORG_ANCHOR_PERCENTAGE=0.5;
	
	/**
	 * 精度
	 */
	//public static final int BILL_ACCURACY=2;
	
	
	public static final int ANCHOR_RECOMMEND_ORDER_MIN = 800;
	public static final int ANCHOR_RECOMMEND_ORDER_MAX = 900;
	
	/**
	 * 等待退回
	 */
	public static final String WAITE_RETURN_TYPE="WR";
	
	/**
	 * 主播自提
	 */
	public static final String PAY_TYPE_A="A";
	
	/**
	 * 社团代发
	 */
	public static final String PAY_TYPE_G="G";
	
	/**
	 * 提现类型  现金
	 */
	public static final String ACTION_TYPE_DRAW_CASH="withdraw_cash";


		
	
}
