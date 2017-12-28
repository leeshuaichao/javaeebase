package cn.javaeebase.modules.sys.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import cn.javaeebase.core.common.controller.BaseCRUDController;
import cn.javaeebase.core.query.data.Queryable;
import cn.javaeebase.core.query.wrapper.EntityWrapper;
import cn.javaeebase.core.security.shiro.authz.annotation.RequiresPathPermission;
import cn.javaeebase.modules.sys.entity.Dict;
import cn.javaeebase.modules.sys.entity.DictGroup;
import cn.javaeebase.modules.sys.service.IDictGroupService;

@Controller
@RequestMapping("${admin.url.prefix}/sys/dict")
@RequiresPathPermission("sys:user")
public class DictController extends BaseCRUDController<Dict, String> {
	@Autowired
	private IDictGroupService dictGroupService;

	@Override
	public void preList(Model model, HttpServletRequest request, HttpServletResponse response) {
		String gid = request.getParameter("gid");
		DictGroup group = dictGroupService.selectById(gid);
		model.addAttribute("group", group);
	}

	@Override
	public void preAjaxList(Queryable queryable, EntityWrapper<Dict> entityWrapper, HttpServletRequest request,
			HttpServletResponse response) {
		String gid = request.getParameter("gid");
		queryable.addCondition("gid", gid);
	}

	@Override
	public void preEdit(Dict entity, Model model, HttpServletRequest request, HttpServletResponse response) {
		String gid = request.getParameter("gid");
		model.addAttribute("gid", gid);
	}
}
