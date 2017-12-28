package cn.javaeebase.core.disruptor.email;

import cn.javaeebase.core.utils.email.EmailResult;

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
public class EmailEvent {
	private EmailData emailData;
	private String id;
	private EmailHandlerCallBack handlerCallBack;

	public EmailHandlerCallBack getHandlerCallBack() {
		return handlerCallBack;
	}

	public void setHandlerCallBack(EmailHandlerCallBack handlerCallBack) {
		this.handlerCallBack = handlerCallBack;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public EmailData getEmailData() {
		return emailData;
	}

	public void setEmailData(EmailData emailData) {
		this.emailData = emailData;
	}

	public interface EmailHandlerCallBack {
		public void onResult(EmailResult emailResult);
	}

}