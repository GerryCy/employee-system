package com.sys.service;

import com.sys.mapper.DepartMapper;
import com.sys.po.Department;
import com.sys.service.impl.DepartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DepartServiceImpl implements DepartService {

    @Autowired
    private DepartMapper departMapper;

    @Override
    public List<Department> getDepartInfoList() {
        return departMapper.getDepartInfoList();
    }

    @Override
    public void addDepartment(Department department) {
        department.setDepart_del(0);
        departMapper.addDepartment(department);
    }

    @Override
    public Integer getDepartParentId(Integer departId) {
        return departMapper.getDepartParentId(departId);
    }

    @Override
    public int getDepartEmployees(Integer departId) {
        return departMapper.getDepartEmployees(departId);
    }

    @Override
    public void deleteDepart(Integer departId) {
        departMapper.updateDepartStatus(departId);
    }
}
