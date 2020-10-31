package cn.cqy.springaopdemo.dao;

import cn.cqy.springaopdemo.pojo.Admin;

import java.util.List;

public interface AdminMapper {

   List<Admin> findAllAdmin();

   Admin findOneAdminById(Integer id);
}
