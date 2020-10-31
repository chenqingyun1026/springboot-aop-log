package cn.cqy.springaopdemo.service;

import cn.cqy.springaopdemo.pojo.Admin;

import java.util.List;

public interface IAdminService {

    public Admin findOneAdminById(Integer id);

    public List<Admin> findAllAdmin();
}
