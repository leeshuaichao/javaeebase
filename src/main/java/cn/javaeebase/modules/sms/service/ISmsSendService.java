package cn.javaeebase.modules.sms.service;

import cn.javaeebase.core.disruptor.sms.SmsEvent.SmsHandlerCallBack;
import cn.javaeebase.core.utils.sms.data.SmsResult;

/**
 * @Title: 短信模版
 * @Description: 短信模版
 * @author javaeebase
 * @date 2017-06-08 10:50:52
 * @version V1.0
 *
 */
public interface ISmsSendService {
	/**
	 * 
	 * @title: sendAsyncSmsByCode
	 * @description: 通过模版编码发送短信
	 * @param phone
	 * @param code
	 * @param datas
	 * @return
	 */
	public void sendAsyncSmsByCode(String phone, String code, String... datas);

	/**
	 * 
	 * @title: sendAsyncSmsByCode
	 * @description: 通过模版编码发送短信
	 * @param phone
	 * @param code
	 * @param datas
	 * @return
	 */
	public void sendAsyncSmsByCode(String phone, String code, SmsHandlerCallBack callBack, String... datas);

	/**
	 * 
	 * @title: sendSyncSmsByCode
	 * @description: 通过模版编码发送短信
	 * @param phone
	 * @param code
	 * @param datas
	 * @return
	 */
	public SmsResult sendSyncSmsByCode(String phone, String code, String... datas);

	/**
	 * 
	 * @title: sendAsyncSmsByContent
	 * @description: 通过內容异步方式发送短信
	 * @param phone
	 * @param code
	 * @param datas
	 * @return
	 */
	public void sendAsyncSmsByContent(String phone, String content, String... datas);

	/**
	 * 
	 * @title: sendAsyncSmsByContent
	 * @description: 通过內容异步方式发送短信
	 * @param phone
	 * @param code
	 * @param datas
	 * @return
	 */
	public void sendAsyncSmsByContent(String phone, String content, SmsHandlerCallBack callBack, String... datas);

	/**
	 * 
	 * @title: sendSyncSmsByContent
	 * @description: 通过內容同步方式发送短信
	 * @param phone
	 * @param code
	 * @param datas
	 * @return
	 */
	public SmsResult sendSyncSmsByContent(String phone, String content, String... datas);

}
