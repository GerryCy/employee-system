package com.sys.controller.employee;

import com.sys.po.User;
import com.sys.service.impl.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("login.action")
    public String login(User user, HttpSession httpSession, HttpServletRequest request) {
        if(null != user && null != user.getUserType()) {
            User tmp = user.getUserType() == 1 ? employeeService.employeeLogin(user) : employeeService.adminLogin(user);
            if(null != tmp) {
                httpSession.setAttribute("user", tmp);
                httpSession.setAttribute("userType", user.getUserType());
                return "admin/index";
            }
        }
        request.setAttribute("msg","用户名或密码错误");
        return "login";
    }
}
