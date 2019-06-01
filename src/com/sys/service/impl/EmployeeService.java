package com.sys.service.impl;

import com.sys.po.LeaveInfo;
import com.sys.po.User;

import java.util.List;

public interface EmployeeService {

    User employeeLogin(User user) ;

    User adminLogin(User user);

    void updateUserPass(User user);

    void addLeaveInfo(LeaveInfo leaveInfo);

    List<LeaveInfo> getLeaveInfoList(Integer id);

    boolean delLeaveInfo(LeaveInfo leaveInfo);

    void updateLeaveStatus(LeaveInfo leaveInfo);

}
