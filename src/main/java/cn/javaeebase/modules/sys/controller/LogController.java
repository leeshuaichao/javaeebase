package cn.javaeebase.modules.sys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.javaeebase.core.common.controller.BaseCRUDController;
import cn.javaeebase.core.security.shiro.authz.annotation.RequiresPathPermission;
import cn.javaeebase.modules.sys.entity.Log;

/**
 * 
 * All rights Reserved, Designed By www.javaeebase.cn
 * 
 * @title: 系统日志
 * @package cn.javaeebase.modules.sys.controller
 * @description: 系统日志
 * @author: 李帅超
 * @date: 2017年5月29日 下午11:35:26
 * @version V1.0
 * @copyright: 2017 www.javaeebase.cn Inc. All rights reserved.
 *
 */
@Controller
@RequestMapping("${admin.url.prefix}/sys/log")
@RequiresPathPermission("sys:log")
public class LogController extends BaseCRUDController<Log, String> {

}
