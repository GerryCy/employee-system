package com.sys.controller.admin;

import com.sys.po.Department;
import com.sys.service.impl.DepartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class DepartController {

    @Autowired
    private DepartService departService;

    @RequestMapping("getDepartInfoList.action")
    public String getDepartInfoList(HttpServletRequest request) {
        request.setAttribute("departList",departService.getDepartInfoList());
        return "admin/org/orgMana";
    }

    @RequestMapping("departAdd.action")
    public String addDepartment(Department department,HttpServletRequest request){
//        System.out.println(department);
        //添加新的一级部门
        if(department.getOrgId().equals("null")) {
            department.setDepart_parent(0);
            departService.addDepartment(department);
        } else {
            //添加二级
            department.setDepart_parent(Integer.valueOf(department.getOrgId()));
            departService.addDepartment(department);
        }
        request.setAttribute("departList",departService.getDepartInfoList());
        return "admin/org/orgMana";
    }

    @RequestMapping("delDepart.action")
    public String delDepart(HttpServletRequest request, Integer depart_id) {
        //判断是否是父级部门
        int departParentId = departService.getDepartParentId(depart_id);
        if(departParentId != 0) { //一级部门
            request.setAttribute("msg","该部门下有二级部门，不可以删除");
        } else { //等于0 但是需要判断该部门下是否有员工
            int num = departService.getDepartEmployees(depart_id);
            if(num != 0) {
                request.setAttribute("msg","该部门下有员工，不可以删除");
            } else {
                departService.deleteDepart(depart_id);
            }
        }
        //判断是否是二级部门
        request.setAttribute("departList",departService.getDepartInfoList());
        return "admin/org/orgMana";
    }
}
