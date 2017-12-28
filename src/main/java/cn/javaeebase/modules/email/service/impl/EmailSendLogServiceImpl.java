package cn.javaeebase.modules.email.service.impl;

import cn.javaeebase.core.common.service.impl.CommonServiceImpl;
import cn.javaeebase.modules.email.entity.EmailSendLog;
import cn.javaeebase.modules.email.mapper.EmailSendLogMapper;
import cn.javaeebase.modules.email.service.IEmailSendLogService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**   
 * @Title: 邮件发送日志
 * @Description: 邮件发送日志
 * @author javaeebase
 * @date 2017-06-10 07:46:06
 * @version V1.0   
 *
 */
@Transactional
@Service("emailSendLogService")
public class EmailSendLogServiceImpl  extends CommonServiceImpl<EmailSendLogMapper, EmailSendLog> implements  IEmailSendLogService {

	 
	 
}
