package ${basePackageServiceImpl};

import ${basePackageDao}.${modelNameUpperCamel}Mapper;
import ${basePackageModel}.${modelNameUpperCamel};
import ${basePackageService}.${modelNameUpperCamel}Service;
import ${basePackage}.core.universal.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
* @Description: ${modelNameUpperCamel}Service接口实现类
* @author ${author}
* @date ${date}
*/
@Service
public class ${modelNameUpperCamel}ServiceImpl extends AbstractService<${modelNameUpperCamel}> implements ${modelNameUpperCamel}Service {

    @Resource
    private ${modelNameUpperCamel}Mapper ${modelNameLowerCamel}Mapper;

}

作者：Mr_初晨
链接：https://juejin.im/post/5ae02c75f265da0ba76f67b3
来源：掘金
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。