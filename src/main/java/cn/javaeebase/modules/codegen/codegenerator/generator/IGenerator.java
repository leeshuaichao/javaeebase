package cn.javaeebase.modules.codegen.codegenerator.generator;

import java.io.IOException;
import java.util.Map;

import cn.javaeebase.modules.codegen.codegenerator.data.GeneratorInfo;
import cn.javaeebase.modules.codegen.codegenerator.exception.GenerationException;

public interface IGenerator {
	void generate(GeneratorInfo generatorInfo,Map<String, Object> dataMap) throws IOException,
			GenerationException;
}
