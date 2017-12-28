package cn.javaeebase.modules.email.service.impl;

import cn.javaeebase.core.disruptor.email.EmailEvent.EmailHandlerCallBack;
import cn.javaeebase.core.disruptor.email.EmailHelper;
import cn.javaeebase.core.utils.SpringContextHolder;
import cn.javaeebase.core.utils.email.EmailResult;
import cn.javaeebase.modules.email.entity.EmailTemplate;
import cn.javaeebase.modules.email.service.IEmailSendService;
import cn.javaeebase.modules.email.service.IEmailTemplateService;

import org.apache.commons.lang3.StringEscapeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.baomidou.mybatisplus.mapper.EntityWrapper;

/**
 * @Title: 邮件模版
 * @Description: 邮件模版
 * @author javaeebase
 * @date 2017-06-08 10:50:52
 * @version V1.0
 *
 */
@Transactional
@Service("emailSendService")
public class EmailSendServiceImpl implements IEmailSendService {
	@Autowired
	private IEmailTemplateService emailTemplateService;

	@Override
	public void sendAsyncEmailByCode(String email, String code, String... datas) {
		sendAsyncEmailByCode(email, code, null, datas);
	}

	@Override
	public void sendAsyncEmailByCode(String email, String code, EmailHandlerCallBack callBack, String... datas) {
		EmailTemplate emailTemplate = emailTemplateService
				.selectOne(new EntityWrapper<EmailTemplate>().eq("code", code));
		String templateSubject = emailTemplate.getTemplateSubject();
		String templateContent = emailTemplate.getTemplateContent();
		templateContent = StringEscapeUtils.unescapeHtml4(StringEscapeUtils.unescapeHtml4(templateContent));
		SpringContextHolder.getBean(EmailHelper.class).sendAsyncEmail(email, templateSubject, templateContent, callBack,
				datas);
	}

	@Override
	public EmailResult sendSyncEmailByCode(String email, String code, String... datas) {
		EmailTemplate emailTemplate = emailTemplateService
				.selectOne(new EntityWrapper<EmailTemplate>().eq("code", code));
		String templateSubject = emailTemplate.getTemplateSubject();
		String templateContent = emailTemplate.getTemplateContent();
		templateContent = StringEscapeUtils.unescapeHtml4(StringEscapeUtils.unescapeHtml4(templateContent));
		return SpringContextHolder.getBean(EmailHelper.class).sendSyncEmail(email, templateSubject, templateContent,
				datas);
	}

	@Override
	public void sendAsyncEmail(String email, String subject, String content, String... datas) {
		SpringContextHolder.getBean(EmailHelper.class).sendAsyncEmail(email, subject, content, datas);
	}

	@Override
	public void sendAsyncEmail(String email, String subject, String content, EmailHandlerCallBack callBack,
			String... datas) {
		SpringContextHolder.getBean(EmailHelper.class).sendAsyncEmail(email, subject, content, callBack, datas);
	}

	@Override
	public EmailResult sendSyncEmail(String email, String subject, String content, String... datas) {
		return SpringContextHolder.getBean(EmailHelper.class).sendSyncEmail(email, subject, content, datas);
	}

}
