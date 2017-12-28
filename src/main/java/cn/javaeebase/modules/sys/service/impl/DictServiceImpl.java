package cn.javaeebase.modules.sys.service.impl;

import cn.javaeebase.core.common.service.impl.CommonServiceImpl;
import cn.javaeebase.modules.sys.entity.Dict;
import cn.javaeebase.modules.sys.mapper.DictMapper;
import cn.javaeebase.modules.sys.service.IDictService;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("dictService")
public class DictServiceImpl extends CommonServiceImpl<DictMapper, Dict> implements IDictService {

	@Override
	public List<Dict> selectDictList() {
		return baseMapper.selectDictList();
	}

}
