package com.sys.po;

import java.util.Date;

public class LeaveInfo {

    public Integer leave_id;
    public String begin_time;
    public String end_time;
    public String remark_info;
    public String reply_info;
    public Integer review_status;
    public String review_info;
    public Integer user_id;
    public String user_name;

    public String getReview_info() {
        return review_info;
    }

    public void setReview_info(String review_info) {
        this.review_info = review_info;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public Integer getLeave_id() {
        return leave_id;
    }

    public void setLeave_id(Integer leave_id) {
        this.leave_id = leave_id;
    }

    public String getReply_info() {
        return reply_info;
    }

    public void setReply_info(String reply_info) {
        this.reply_info = reply_info;
    }

    public String getBegin_time() {
        return begin_time;
    }

    public void setBegin_time(String begin_time) {
        this.begin_time = begin_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public String getRemark_info() {
        return remark_info;
    }

    public void setRemark_info(String remark_info) {
        this.remark_info = remark_info;
    }

    public Integer getReview_status() {
        return review_status;
    }

    public void setReview_status(Integer review_status) {
        this.review_status = review_status;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }
}
