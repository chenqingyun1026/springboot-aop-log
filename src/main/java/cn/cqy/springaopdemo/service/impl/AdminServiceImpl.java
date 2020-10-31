package cn.cqy.springaopdemo.service.impl;

import cn.cqy.springaopdemo.dao.AdminMapper;
import cn.cqy.springaopdemo.pojo.Admin;
import cn.cqy.springaopdemo.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements IAdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public Admin findOneAdminById(Integer id) {
        return adminMapper.findOneAdminById(id);
    }

    @Override
    public List<Admin> findAllAdmin() {
        return adminMapper.findAllAdmin();
    }
}
