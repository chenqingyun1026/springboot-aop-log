package cn.cqy.springaopdemo.dao;

import cn.cqy.springaopdemo.pojo.AdminLog;

import java.util.List;

public interface MyLogMapper {
    void insertLog(AdminLog adminLog);

    List<AdminLog> findAllAdminLog();
}
