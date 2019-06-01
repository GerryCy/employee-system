package com.sys.mapper;

import com.sys.po.User;
import com.sys.po.Work;

import java.util.List;

public interface AdminMapper {

    List<Work> getWorkList();

    void addEmployeeInfos(User user);

    List<User> getAllEmployeeInfos();

    String getUserPosition(Integer depart_id);
}
