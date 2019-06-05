package com.sys.controller.admin;

import com.sys.po.Attend;
import com.sys.po.LeaveInfo;
import com.sys.po.Money;
import com.sys.po.User;
import com.sys.service.impl.AdminService;
import com.sys.service.impl.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

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

    @RequestMapping("getEmployeeList.action")
    public String getEmployeeList(HttpServletRequest request) {
        request.setAttribute("userList",adminService.getEmployeeList());
        return "admin/chuqin/chuqinAdd";
    }

    @RequestMapping("addAttendInfo.action")
    public String addAttendInfo(Attend attend, HttpServletRequest request) {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
        try {
            calendar.setTime(sdf.parse(attend.getAttend_date()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Integer leaveDays = adminService.getLeaveDays(attend);
        attend.setAttend_days(calendar.getActualMaximum(Calendar.DAY_OF_MONTH)-leaveDays);
        attend.setLeave_days(leaveDays);
        adminService.addAttendInfo(attend);
        request.setAttribute("attendList", adminService.getAttendList());
        return "admin/chuqin/chuqinMana";
    }

    @RequestMapping("getAttendList.action")
    public String getAttendList(HttpServletRequest request) {
        request.setAttribute("attendList", adminService.getAttendList());
        return "admin/chuqin/chuqinMana";
    }

    @RequestMapping("getUserInfoList.action")
    public String getUserInfoList(HttpServletRequest request) {
        request.setAttribute("userList",adminService.getEmployeeList());
        return "admin/gongzi/gongziAdd";
    }
    @RequestMapping("addMoneyInfo.action")
    public String addMoneyInfo(HttpServletRequest request, Money money) {
        Integer besicMoney = adminService.getBasicMoney(money.getUser_id());
        Attend attend = adminService.getAttendInfo(money);
        DecimalFormat df = new DecimalFormat("0.0000");//格式化小数，不足的补0
        String filesize = df.format((double) 30/31);//返回的是String类型的
        money.setPay_num(besicMoney * Double.valueOf(filesize) * 1000 / 1000);
        adminService.addMoneyIndfo(money);
        request.setAttribute("payList",adminService.getPayList());
        return "admin/gongzi/gongziMana";
    }

    @RequestMapping("getPayList.action")
    public String getPayList(HttpServletRequest request) {
        request.setAttribute("payList",adminService.getPayList());
        return "admin/gongzi/gongziAdd";
    }
}
