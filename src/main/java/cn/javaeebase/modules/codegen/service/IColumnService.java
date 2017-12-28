package cn.javaeebase.modules.codegen.service;

import java.util.List;
import cn.javaeebase.core.common.service.ICommonService;
import cn.javaeebase.modules.codegen.entity.Column;

public interface IColumnService extends ICommonService<Column> {
	List<Column> selectListByTableId(String tableId);
}
