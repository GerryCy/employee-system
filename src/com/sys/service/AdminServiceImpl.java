package com.sys.service;

import com.sys.mapper.AdminMapper;
import com.sys.mapper.DepartMapper;
import com.sys.po.*;
import com.sys.service.impl.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    DepartMapper departMapper;
    @Autowired
    AdminMapper adminMapper;


    public List<Department> getAllDeparts() {
        return departMapper.getDepartInfoList();
    }

    @Override
    public List<Work> getWorkList() {
        return adminMapper.getWorkList();
    }

    @Override
    public void addEmployeeInfos(User user) {
        adminMapper.addEmployeeInfos(user);
    }

    @Override
    public List<User> getAllEmployeeInfos() {
        return adminMapper.getAllEmployeeInfos();
    }

    @Override
    public String getUserPosition(Integer depart_id) {
        return adminMapper.getUserPosition(depart_id);
    }

    @Override
    public List<User> getEmployeeList() {
        return adminMapper.getEmployeeList();
    }

    @Override
    public int getLeaveDays(Attend attend) {
        return adminMapper.getLeaveDays(attend);
    }

    @Override
    public void addAttendInfo(Attend attend) {
        adminMapper.addAttendInfo(attend);
    }

    @Override
    public List<Attend> getAttendList() {
        return adminMapper.getAttendList();
    }

    @Override
    public Integer getBasicMoney(Integer userId) {
        return adminMapper.getBasicMoney(userId);
    }

    @Override
    public Attend getAttendInfo(Money money) {
        return adminMapper.getAttendInfo(money);
    }

    @Override
    public void addMoneyIndfo(Money money) {
        adminMapper.addMoneyInfo(money);
    }

    @Override
    public List<Money> getPayList() {
        return adminMapper.getPayList();
    }
}
