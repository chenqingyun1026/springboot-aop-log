package cn.cqy.springaopdemo.dao;

import cn.cqy.springaopdemo.SpringaopdemoApplicationTests;
import cn.cqy.springaopdemo.pojo.Type;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;


public class TypeMapperTest extends SpringaopdemoApplicationTests {

    @Autowired
    private TypeMapper typeMapper;

    @Test
    public void findAllType() {
        List<Type> typeList = typeMapper.findAllType();
        typeList.forEach(type -> {
            System.out.println(type);
        });
    }

    @Test
    public void addOneType() {
        Type type = new Type();
        type.setName("地理");
        int i = typeMapper.addOneType(type);
        System.out.println(i);

    }

    @Test
    public void addTypeList() {
        List<Type> typeList = new ArrayList<>();
        Type type = new Type();
        Type type1 = new Type();
        type.setName("军事");
        type1.setName("宗教");
        typeList.add(type);
        typeList.add(type1);

        boolean isSuccess = false;
        isSuccess = typeMapper.addTypeList(typeList) > 0;
        System.out.println(isSuccess);

    }

    @Test
    public void deleteTypeList() {
        List<Integer> typeIdList = new ArrayList<>();
        typeIdList.add(8);
        typeIdList.add(9);
        boolean isSuccess = typeMapper.deleteTypeList(typeIdList) > 0;
        System.out.println(isSuccess);
    }
    @Test
    public void updateTypeList() {
        List<Type> typeList = new ArrayList<>();
        Type type = new Type();
        Type type1 = new Type();
        type.setId(10);
        type.setName("历史");
        type1.setId(11);
        type1.setName("艺术");
        typeList.add(type);
        typeList.add(type1);

        boolean isSuccess = typeMapper.updateTypeList(typeList) > 0;
        System.out.println(isSuccess);

    }
}