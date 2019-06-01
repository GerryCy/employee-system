package com.sys.service.impl;

import com.sys.po.Department;

import java.util.List;

public interface DepartService {

    List<Department> getDepartInfoList();

    void addDepartment(Department department);

    Integer getDepartParentId(Integer departId);

    int getDepartEmployees(Integer departId);

    void deleteDepart(Integer departId);
}
