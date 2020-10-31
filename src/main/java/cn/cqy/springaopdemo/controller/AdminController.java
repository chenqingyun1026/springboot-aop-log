package cn.cqy.springaopdemo.controller;

import cn.cqy.springaopdemo.pojo.Admin;
import cn.cqy.springaopdemo.service.IAdminService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {
    private static final Logger log = LogManager.getLogger(AdminController.class);

    @Autowired
    private IAdminService adminService;

    @RequestMapping("/login")
    public Admin login(HttpServletRequest request) {
        List<Admin> adminList = adminService.findAllAdmin();
        Admin admin = adminList.get(0);
        request.getSession().setAttribute("admin",admin );
        return admin;
    }


}
