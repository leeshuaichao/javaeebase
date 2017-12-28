package cn.javaeebase.modules.codegen.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.javaeebase.core.common.service.impl.CommonServiceImpl;
import cn.javaeebase.core.query.wrapper.EntityWrapper;
import cn.javaeebase.modules.codegen.entity.Column;
import cn.javaeebase.modules.codegen.mapper.ColumnMapper;
import cn.javaeebase.modules.codegen.service.IColumnService;

@Transactional
@Service("columnService")
public class ColumnServiceImpl extends CommonServiceImpl<ColumnMapper, Column> implements IColumnService {

	@Override
	public List<Column> selectListByTableId(String tableId) {
		EntityWrapper<Column> columnWrapper = new EntityWrapper<Column>(Column.class);
		columnWrapper.eq("table.id", tableId);
		columnWrapper.orderBy("sort");
		List<Column> oldColumnList = selectList(columnWrapper);
		return oldColumnList;
	}

}
