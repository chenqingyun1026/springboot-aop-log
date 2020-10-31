package cn.cqy.springaopdemo.dao;

import cn.cqy.springaopdemo.pojo.Type;

import java.util.List;

public interface TypeMapper {
    List<Type> findAllType();

    int addOneType(Type type);

    int addTypeList(List<Type> typeList);

    int deleteTypeList(List<Integer> typeIdList);

    int updateTypeList(List<Type> typeList);
}
