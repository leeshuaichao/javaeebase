package cn.javaeebase.modules.sys.service.impl;

import cn.javaeebase.core.common.service.impl.CommonServiceImpl;
import cn.javaeebase.modules.sys.entity.UserRole;
import cn.javaeebase.modules.sys.mapper.UserRoleMapper;
import cn.javaeebase.modules.sys.service.IUserRoleService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("userRoleService")
public class UserRoleServiceImpl extends CommonServiceImpl<UserRoleMapper,UserRole> implements IUserRoleService {

}
