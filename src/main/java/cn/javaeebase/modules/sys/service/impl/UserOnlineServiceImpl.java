package cn.javaeebase.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import cn.javaeebase.core.common.service.impl.CommonServiceImpl;
import cn.javaeebase.core.query.data.Page;
import cn.javaeebase.core.query.data.PageImpl;
import cn.javaeebase.core.query.data.PageRequest;
import cn.javaeebase.core.query.data.Pageable;
import cn.javaeebase.core.query.wrapper.EntityWrapper;
import cn.javaeebase.core.utils.IpUtils;
import cn.javaeebase.core.utils.ServletUtils;
import cn.javaeebase.core.utils.StringUtils;
import cn.javaeebase.modules.sys.entity.UserOnline;
import cn.javaeebase.modules.sys.mapper.UserOnlineMapper;
import cn.javaeebase.modules.sys.security.shiro.realm.UserRealm.Principal;
import cn.javaeebase.modules.sys.service.IUserOnlineService;
import cn.javaeebase.modules.sys.utils.UserUtils;

import java.util.Date;
import java.util.List;

@Service("userOnlineService")
public class UserOnlineServiceImpl extends CommonServiceImpl<UserOnlineMapper, UserOnline>
		implements IUserOnlineService {

	/**
	 * 上线
	 *
	 * @param userOnline
	 */
	public void online(UserOnline userOnline) {
		if (StringUtils.isEmpty(userOnline.getHost())) {
			String hostIp = IpUtils.getIpAddr(ServletUtils.getRequest());
			userOnline.setHost(hostIp);
		}
		Principal principal = UserUtils.getPrincipal(); // 如果已经登录，则跳转到管理首页
		userOnline.setUsername(principal.getUsername());
		userOnline.setUserId(principal.getId());
		UserOnline oldOnline = selectById(userOnline.getId());
		if (oldOnline != null) {
			insertOrUpdate(userOnline);
		} else {
			insert(userOnline);
		}
	}

	/**
	 * 下线
	 *
	 * @param sid
	 */
	public void offline(String sid) {
		UserOnline userOnline = selectById(sid);
		if (userOnline != null) {
			deleteById(userOnline.getId());
		}
	}

	/**
	 * 批量下线
	 *
	 * @param needOfflineIdList
	 */
	public void batchOffline(List<String> needOfflineIdList) {
		deleteBatchIds(needOfflineIdList);
	}

	/**
	 * 无效的UserOnline
	 *
	 * @return
	 */
	public Page<UserOnline> findExpiredUserOnlineList(Date expiredDate, int page, int rows) {
		com.baomidou.mybatisplus.plugins.Page<UserOnline> userOnlinePage = new com.baomidou.mybatisplus.plugins.Page<UserOnline>(
				page, rows);
		EntityWrapper<UserOnline> wrapper = new EntityWrapper<UserOnline>(UserOnline.class);
		wrapper.lt("lastAccessTime", expiredDate);
		wrapper.orderBy("lastAccessTime");
		List<UserOnline> content = baseMapper.selectUserOnlinePage(userOnlinePage, wrapper);
		Integer total = baseMapper.selectCount(wrapper);
		Pageable pageable = new PageRequest(page, rows);
		return new PageImpl<UserOnline>(content, pageable, total);
	}

}
