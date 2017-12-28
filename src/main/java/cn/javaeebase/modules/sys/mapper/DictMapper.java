package cn.javaeebase.modules.sys.mapper;

import java.util.List;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import cn.javaeebase.modules.sys.entity.Dict;

public interface DictMapper extends BaseMapper<Dict> {
	List<Dict> selectDictList();
}