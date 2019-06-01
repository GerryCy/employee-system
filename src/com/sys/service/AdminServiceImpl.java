package com.sys.service;

import com.sys.mapper.AdminMapper;
import com.sys.mapper.DepartMapper;
import com.sys.po.Department;
import com.sys.po.User;
import com.sys.po.Work;
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
}
