package com.sys.po;

public class Department {
    Integer depart_id;
    String depart_name;
    String depart_desc;
    Integer depart_del;
    Integer depart_parent;
    String depart_par_name;
    String orgId;

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getDepart_par_name() {
        return depart_par_name;
    }

    public void setDepart_par_name(String depart_par_name) {
        this.depart_par_name = depart_par_name;
    }

    public Integer getDepart_id() {
        return depart_id;
    }

    public void setDepart_id(Integer depart_id) {
        this.depart_id = depart_id;
    }

    public String getDepart_name() {
        return depart_name;
    }

    public void setDepart_name(String depart_name) {
        this.depart_name = depart_name;
    }

    public String getDepart_desc() {
        return depart_desc;
    }

    public void setDepart_desc(String depart_desc) {
        this.depart_desc = depart_desc;
    }

    public Integer getDepart_del() {
        return depart_del;
    }

    public void setDepart_del(Integer depart_del) {
        this.depart_del = depart_del;
    }

    public Integer getDepart_parent() {
        return depart_parent;
    }

    public void setDepart_parent(Integer depart_parent) {
        this.depart_parent = depart_parent;
    }
}
