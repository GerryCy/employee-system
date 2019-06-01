package com.sys.mapper;

import com.sys.po.LeaveInfo;
import com.sys.po.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface EmployeeMapper {
    User findUserByIdAndNum(User user);
    User findAdminByIdAndNum(User user);
    void updateUserPass(User user);
    void addLeaveInfo(LeaveInfo leaveInfo);
    List<LeaveInfo> getLeaveInfoList(Integer id);
    void delLeaveInfo(Integer leaveId);
    void updateLeaveStatus(LeaveInfo leaveInfo);
}
