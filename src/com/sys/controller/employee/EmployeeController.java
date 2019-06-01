package com.sys.controller.employee;

import com.sys.po.LeaveInfo;
import com.sys.po.User;
import com.sys.service.impl.EmployeeService;
import com.sys.utils.DateConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("userPwEdit.action")
    public String userPassEdit(String loginpw1, HttpServletRequest request, HttpSession session) {
        System.out.println(loginpw1);
        User user = (User)session.getAttribute("user");
        user.setUser_pass(loginpw1);
        employeeService.updateUserPass(user);
        request.setAttribute("msg","密码已更改，请重新登录");
        return "login";
    }
//    public void testVoid(HttpServletRequest request, HttpServletResponse response) throws Exception{
//        request.setAttribute("test","返回值为void类型的测试");
//        request.getRequestDispatcher("/WEB-INF/items/hello.jsp").forward(request,response);
//    }

    @RequestMapping("leaveInfo.action")
    public String leaveAction(LeaveInfo leaveInfo, HttpSession session){
//        DateConverter dateConverter = new DateConverter();
        System.out.println(leaveInfo);
//        Date begin_time = (Date)dateConverter.convert(Date.class, leaveInfo.getBegin_time());
        User user = (User)session.getAttribute("user");
        leaveInfo.setReview_status(0);
        leaveInfo.setUser_id(user.getUser_id());
        employeeService.addLeaveInfo(leaveInfo);
        return "admin/index";
    }

    @RequestMapping("leaveInfoList.action")
    public String getLeaveInfoList(HttpServletRequest request,HttpSession session) {
        User user = (User)session.getAttribute("user");
        List<LeaveInfo> leaveInfoList = employeeService.getLeaveInfoList(user.getUser_id());
        request.setAttribute("leaveList",leaveInfoList);
        return "admin/qingjiashenqing/qingjiashenqingMana_me";
    }

    @RequestMapping("leaveInfoDel.action")
    public String delLeaveInfo(HttpServletRequest request,LeaveInfo leaveInfo, HttpSession session) {
        User user = (User)session.getAttribute("user");
        employeeService.delLeaveInfo(leaveInfo);
        List<LeaveInfo> leaveInfoList = employeeService.getLeaveInfoList(user.getUser_id());
        request.setAttribute("leaveList",leaveInfoList);
        return "admin/qingjiashenqing/qingjiashenqingMana_me";
    }

}
