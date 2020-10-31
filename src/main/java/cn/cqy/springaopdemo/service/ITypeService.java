package cn.cqy.springaopdemo.service;

import cn.cqy.springaopdemo.pojo.Type;

import java.util.List;

public interface ITypeService {
    public List<Type> findAllType();

    public int addTypeList(List<Type> typeList);

    public int deleteTypeList(List<Integer> typeIdList);

    public int updateTypeList(List<Type> typeList);
}
