package com.sys.mapper;

import com.sys.po.Department;

import java.util.List;

public interface DepartMapper {

    List<Department>  getDepartInfoList();

    void addDepartment(Department department);

    Integer getDepartParentId(Integer departId);

    int getDepartEmployees(Integer departId);

    void updateDepartStatus(Integer departId);
}
