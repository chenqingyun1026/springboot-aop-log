package cn.cqy.springaopdemo.dao;

import cn.cqy.springaopdemo.SpringaopdemoApplicationTests;
import cn.cqy.springaopdemo.pojo.AdminLog;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class MyLogMapperTest extends SpringaopdemoApplicationTests {

    @Autowired
    private MyLogMapper myLogMapper;
    @Test
    public void insertLog() {
    }

    @Test
    public void findAllAdminLog() {
        List<AdminLog> allAdminLog = myLogMapper.findAllAdminLog();
        allAdminLog.forEach(adminLog -> {
            System.out.println(adminLog);
        });
    }
}