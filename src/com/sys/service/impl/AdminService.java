package com.sys.service.impl;

import com.sys.po.Department;
import com.sys.po.User;
import com.sys.po.Work;

import java.util.List;

public interface AdminService {

     List<Department> getAllDeparts();

     List<Work> getWorkList();

     void addEmployeeInfos(User user);

     List<User> getAllEmployeeInfos();

     String getUserPosition(Integer depart_id);
}