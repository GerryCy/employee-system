package com.sys.service.impl;

import com.sys.po.*;

import java.util.List;

public interface AdminService {

     List<Department> getAllDeparts();

     List<Work> getWorkList();

     void addEmployeeInfos(User user);

     List<User> getAllEmployeeInfos();

     String getUserPosition(Integer depart_id);

    List<User> getEmployeeList();

     int getLeaveDays(Attend attend);

     void addAttendInfo(Attend attend);

     List<Attend> getAttendList();

     Integer getBasicMoney(Integer userId);

     Attend getAttendInfo(Money money);

     void addMoneyIndfo(Money money);

     List<Money> getPayList();
}
