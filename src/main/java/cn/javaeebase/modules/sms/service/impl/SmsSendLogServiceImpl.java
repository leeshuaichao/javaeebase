package cn.javaeebase.modules.sms.service.impl;

import cn.javaeebase.core.common.service.impl.CommonServiceImpl;
import cn.javaeebase.modules.sms.entity.SmsSendLog;
import cn.javaeebase.modules.sms.mapper.SmsSendLogMapper;
import cn.javaeebase.modules.sms.service.ISmsSendLogService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**   
 * @Title: 短信发送日志
 * @Description: 短信发送日志
 * @author javaeebase
 * @date 2017-06-08 12:56:37
 * @version V1.0   
 *
 */
@Transactional
@Service("smsSendLogService")
public class SmsSendLogServiceImpl  extends CommonServiceImpl<SmsSendLogMapper,SmsSendLog> implements  ISmsSendLogService {

}
