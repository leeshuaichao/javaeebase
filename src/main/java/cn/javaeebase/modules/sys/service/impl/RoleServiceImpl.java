package cn.javaeebase.modules.sys.service.impl;

import cn.javaeebase.core.common.service.impl.CommonServiceImpl;
import cn.javaeebase.modules.sys.entity.Role;
import cn.javaeebase.modules.sys.mapper.RoleMapper;
import cn.javaeebase.modules.sys.service.IRoleService;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("roleService")
public class RoleServiceImpl extends CommonServiceImpl<RoleMapper, Role> implements IRoleService {

	@Override
	public List<Role> findListByUserId(String userid) {
		return baseMapper.findRoleByUserId(userid);
	}

}
