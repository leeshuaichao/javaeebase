package cn.javaeebase.core.disruptor.sms;

import cn.javaeebase.core.utils.sms.data.SmsResult;

/**
 * 
 * All rights Reserved, Designed By www.javaeebase.cn
 * 
 * @title: LongEvent.java
 * @package cn.javaeebase.core.disruptor.sms
 * @description: 内容传递
 * @author: 李帅超
 * @date: 2017年6月7日 下午11:17:40
 * @version V1.0
 * @copyright: 2017 www.javaeebase.cn Inc. All rights reserved.
 *
 */
public class SmsEvent {
	private SmsData smsData;
	private String id;
	private SmsHandlerCallBack handlerCallBack;

	public SmsData getSmsData() {
		return smsData;
	}

	public void setSmsData(SmsData smsData) {
		this.smsData = smsData;
	}

	public SmsHandlerCallBack getHandlerCallBack() {
		return handlerCallBack;
	}

	public void setHandlerCallBack(SmsHandlerCallBack handlerCallBack) {
		this.handlerCallBack = handlerCallBack;
	}

	public interface SmsHandlerCallBack {
		public void onResult(SmsResult smsResult);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}