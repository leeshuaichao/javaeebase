package cn.javaeebase.modules.sys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.javaeebase.core.common.controller.BaseCRUDController;
import cn.javaeebase.core.security.shiro.authz.annotation.RequiresPathPermission;
import cn.javaeebase.modules.sys.entity.UserLastOnline;

/**   
 * @Title: 最后在线情况
 * @Description: 最后在线情况
 * @author javaeebase
 * @date 2017-05-15 08:18:21
 * @version V1.0   
 *
 */
@Controller
@RequestMapping("${admin.url.prefix}/sys/lastOnline")
@RequiresPathPermission("sys:userlastonline")
public class UserLastOnlineController extends BaseCRUDController<UserLastOnline, Long> {

}
