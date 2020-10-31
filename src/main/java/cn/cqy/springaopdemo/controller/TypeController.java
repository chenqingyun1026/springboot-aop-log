package cn.cqy.springaopdemo.controller;

import cn.cqy.springaopdemo.anno.MyLog;
import cn.cqy.springaopdemo.pojo.Type;
import cn.cqy.springaopdemo.service.ITypeService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/type")
public class TypeController {
    private static final Logger log = LogManager.getLogger(TypeController.class);

    @Autowired
    private ITypeService typeService;


    @MyLog(operation = "增加书籍类型", type = 2)
    @RequestMapping("/add")
    public void insertType() {
        List<Type> typeList = new ArrayList<>();
        Type type = new Type();
        type.setName("自然科学");
        typeList.add(type);
        typeService.addTypeList(typeList);
        log.info("添加书籍类型" + type.getName());
    }

    @MyLog(operation = "查询所有书籍类型", type = 1)
    @RequestMapping("/findAll")
    public List<Type> findAllType() {
        List<Type> typeList = typeService.findAllType();
        log.info("查询所有书籍类型");

        return typeList;
    }
}
