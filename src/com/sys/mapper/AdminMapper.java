package com.sys.mapper;

import com.sys.po.Attend;
import com.sys.po.Money;
import com.sys.po.User;
import com.sys.po.Work;

import java.util.List;

public interface AdminMapper {

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

    void addMoneyInfo(Money money);

    List<Money> getPayList();
}
