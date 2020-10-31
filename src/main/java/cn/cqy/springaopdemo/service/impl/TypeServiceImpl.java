package cn.cqy.springaopdemo.service.impl;

import cn.cqy.springaopdemo.dao.TypeMapper;
import cn.cqy.springaopdemo.pojo.Type;
import cn.cqy.springaopdemo.service.ITypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeServiceImpl implements ITypeService {

    @Autowired
    private TypeMapper typeMapper;

    @Override
    public List<Type> findAllType() {
        return typeMapper.findAllType();
    }

    @Override
    public int addTypeList(List<Type> typeList) {
        return typeMapper.addTypeList(typeList);
    }

    @Override
    public int deleteTypeList(List<Integer> typeIdList) {
        return typeMapper.deleteTypeList(typeIdList);
    }

    @Override
    public int updateTypeList(List<Type> typeList) {
        return typeMapper.updateTypeList(typeList);
    }
}
