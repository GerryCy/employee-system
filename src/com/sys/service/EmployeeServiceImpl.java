package com.sys.service;

import com.sys.mapper.EmployeeMapper;
import com.sys.po.LeaveInfo;
import com.sys.po.User;
import com.sys.service.impl.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public User employeeLogin(User user) {
        User tmp = employeeMapper.findUserByIdAndNum(user);
        if(null != tmp) {
            return tmp;
        }
        return null;
    }

    @Override
    public User adminLogin(User user) {
        User tmp = employeeMapper.findAdminByIdAndNum(user);
        if(null != tmp) {
            return tmp;
        }
        return null;
    }

    @Override
    public void updateUserPass(User user) {
        employeeMapper.updateUserPass(user);
    }

    @Override
    public void addLeaveInfo(LeaveInfo leaveInfo) {
        employeeMapper.addLeaveInfo(leaveInfo);
    }

    @Override
    public List<LeaveInfo> getLeaveInfoList(Integer id) {
        return employeeMapper.getLeaveInfoList(id);
    }

    @Override
    public boolean delLeaveInfo(LeaveInfo leaveInfo) {
        if(leaveInfo.getReview_status() == 0) {
            employeeMapper.delLeaveInfo(leaveInfo.getLeave_id());
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void updateLeaveStatus(LeaveInfo leaveInfo) {
        employeeMapper.updateLeaveStatus(leaveInfo);
    }
}
