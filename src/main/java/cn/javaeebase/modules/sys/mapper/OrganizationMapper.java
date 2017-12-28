package cn.javaeebase.modules.sys.mapper;

import java.util.List;

import cn.javaeebase.core.common.mapper.BaseTreeMapper;
import cn.javaeebase.modules.sys.entity.Organization;

public interface OrganizationMapper extends BaseTreeMapper<Organization> {
	
	/**
	 * 
	 * @title: findListByUserId
	 * @description: 通过用户查找组织机构
	 * @param userId
	 * @return
	 * @return: List<Organization>
	 */
	List<Organization> findListByUserId(String userId);
}