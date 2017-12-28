package cn.javaeebase.modules.sys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.javaeebase.core.common.controller.BaseTreeController;
import cn.javaeebase.core.security.shiro.authz.annotation.RequiresPathPermission;
import cn.javaeebase.modules.sys.entity.Menu;

@Controller
@RequestMapping("${admin.url.prefix}/sys/menu")
@RequiresPathPermission("sys:menu")
public class MenuController extends BaseTreeController<Menu, String> {

}
