package com.sys.controller.admin;

import com.sys.po.LeaveInfo;
import com.sys.po.User;
import com.sys.service.impl.AdminService;
import com.sys.service.impl.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class AdminController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private AdminService adminService;


    @RequestMapping("adminLeaveInfoList.action")
    public String getLeaveInfoList(HttpServletRequest request){
        request.setAttribute("leaveInfoList",employeeService.getLeaveInfoList(null));
        return "admin/qingjiashenqing/qingjiashenqingMana";
    }

    @RequestMapping("updateLeaveStatus.action")
    public String updateLeaveStatus(LeaveInfo leaveInfo, HttpServletRequest request){
        employeeService.updateLeaveStatus(leaveInfo);
        request.setAttribute("leaveInfoList",employeeService.getLeaveInfoList(null));
        return "admin/qingjiashenqing/qingjiashenqingMana";
    }

    @RequestMapping("adminDeleteLeaveInfo.action")
    public String deleteLeaveInfo(LeaveInfo leaveInfo, HttpServletRequest request) {
        employeeService.delLeaveInfo(leaveInfo);
        request.setAttribute("leaveInfoList",employeeService.getLeaveInfoList(null));
        return "admin/qingjiashenqing/qingjiashenqingMana";
    }

    @RequestMapping("addEmployeeInfo.action")
    public String addEmployeeInfo(User user, HttpServletRequest request) {
        System.out.println(user);
        user.setUser_position(adminService.getUserPosition(user.getDepart_id()));
        user.setDel_status(0);
        adminService.addEmployeeInfos(user);
        request.setAttribute("userList",adminService.getAllEmployeeInfos());
        return "admin/yuangong/yuangongMana";
    }

    @RequestMapping("getAllEmployeeInfos.action")
    public String getAllEmployeeInfos(HttpServletRequest request) {
        request.setAttribute("userList",adminService.getAllEmployeeInfos());
        return "admin/yuangong/yuangongMana";
    }

    @RequestMapping("getAllDeparts.action")
    public String getAllDeparts(HttpServletRequest request) {
        request.setAttribute("departList", adminService.getAllDeparts());
        request.setAttribute("workList",adminService.getWorkList());
        return "admin/yuangong/yuangongAdd";
    }
}
