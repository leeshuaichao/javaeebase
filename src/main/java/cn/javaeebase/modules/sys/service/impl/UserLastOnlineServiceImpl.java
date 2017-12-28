package cn.javaeebase.modules.sys.service.impl;

import cn.javaeebase.core.common.service.impl.CommonServiceImpl;
import cn.javaeebase.modules.sys.entity.UserLastOnline;
import cn.javaeebase.modules.sys.mapper.UserLastOnlineMapper;
import cn.javaeebase.modules.sys.service.IUserLastOnlineService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**   
 * @Title: 最后在线情况
 * @Description: 最后在线情况
 * @author javaeebase
 * @date 2017-05-15 08:18:21
 * @version V1.0   
 *
 */
@Transactional
@Service("userLastOnlineService")
public class UserLastOnlineServiceImpl  extends CommonServiceImpl<UserLastOnlineMapper,UserLastOnline> implements  IUserLastOnlineService {

}
