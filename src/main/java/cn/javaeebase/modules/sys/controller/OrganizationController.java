package cn.javaeebase.modules.sys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.javaeebase.core.common.controller.BaseTreeController;
import cn.javaeebase.core.security.shiro.authz.annotation.RequiresPathPermission;
import cn.javaeebase.modules.sys.entity.Organization;

@Controller
@RequestMapping("${admin.url.prefix}/sys/organization")
@RequiresPathPermission("sys:organization")
public class OrganizationController extends BaseTreeController<Organization, String> {
	
}
