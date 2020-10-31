package cn.cqy.springaopdemo.dao;

import cn.cqy.springaopdemo.SpringaopdemoApplicationTests;
import cn.cqy.springaopdemo.pojo.Admin;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class AdminMapperTest extends SpringaopdemoApplicationTests {

    @Autowired
    private  AdminMapper adminMapper;
    @Test
    public void findAllAdmin() {
        List<Admin> allAdmin = adminMapper.findAllAdmin();
        allAdmin.forEach(admin -> {
            System.out.println(admin);
        });
    }
}