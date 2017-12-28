package cn.javaeebase.modules.sys.service.impl;

import cn.javaeebase.core.common.service.impl.CommonServiceImpl;
import cn.javaeebase.modules.sys.entity.UserOrganization;
import cn.javaeebase.modules.sys.mapper.UserOrganizationMapper;
import cn.javaeebase.modules.sys.service.IUserOrganizationService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Transactional
@Service("userOrganizationService")
public class UserOrganizationServiceImpl extends CommonServiceImpl<UserOrganizationMapper, UserOrganization>
		implements IUserOrganizationService {

}
