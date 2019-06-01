package com.sys.po;

public class User {

    Integer user_id;
    String user_name;
    String user_age;
    String user_sex;
    String user_position;
    Integer depart_id;
    String user_num;
    String user_pass;
    Integer work_id;
    Integer userType;
    Integer del_status;

    public Integer getDel_status() {
        return del_status;
    }

    public void setDel_status(Integer del_status) {
        this.del_status = del_status;
    }

    Integer admin_id;
    String admin_num;
    String admin_pass;


    public Integer getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(Integer admin_id) {
        this.admin_id = admin_id;
    }

    public String getAdmin_num() {
        return admin_num;
    }

    public void setAdmin_num(String admin_num) {
        this.admin_num = admin_num;
    }

    public String getAdmin_pass() {
        return admin_pass;
    }

    public void setAdmin_pass(String admin_pass) {
        this.admin_pass = admin_pass;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", user_name='" + user_name + '\'' +
                ", user_age='" + user_age + '\'' +
                ", user_sex='" + user_sex + '\'' +
                ", user_position='" + user_position + '\'' +
                ", depart_id=" + depart_id +
                ", user_num='" + user_num + '\'' +
                ", user_pass='" + user_pass + '\'' +
                ", work_id=" + work_id +
                '}';
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_age() {
        return user_age;
    }

    public void setUser_age(String user_age) {
        this.user_age = user_age;
    }

    public String getUser_sex() {
        return user_sex;
    }

    public void setUser_sex(String user_sex) {
        this.user_sex = user_sex;
    }

    public String getUser_position() {
        return user_position;
    }

    public void setUser_position(String user_position) {
        this.user_position = user_position;
    }

    public Integer getDepart_id() {
        return depart_id;
    }

    public void setDepart_id(Integer depart_id) {
        this.depart_id = depart_id;
    }

    public String getUser_num() {
        return user_num;
    }

    public void setUser_num(String user_num) {
        this.user_num = user_num;
    }

    public String getUser_pass() {
        return user_pass;
    }

    public void setUser_pass(String user_pass) {
        this.user_pass = user_pass;
    }

    public Integer getWork_id() {
        return work_id;
    }

    public void setWork_id(Integer work_id) {
        this.work_id = work_id;
    }
}
