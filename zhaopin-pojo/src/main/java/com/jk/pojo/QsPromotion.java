package com.jk.pojo;

import java.io.Serializable;

public class QsPromotion implements Serializable {
    private Integer cpId;

    private Integer cpUid;

    private String cpPtype;

    private Integer cpJobid;

    private Integer cpDays;

    private Integer cpStarttime;

    private Integer cpEndtime;

    public Integer getCpId() {
        return cpId;
    }

    public void setCpId(Integer cpId) {
        this.cpId = cpId;
    }

    public Integer getCpUid() {
        return cpUid;
    }

    public void setCpUid(Integer cpUid) {
        this.cpUid = cpUid;
    }

    public String getCpPtype() {
        return cpPtype;
    }

    public void setCpPtype(String cpPtype) {
        this.cpPtype = cpPtype == null ? null : cpPtype.trim();
    }

    public Integer getCpJobid() {
        return cpJobid;
    }

    public void setCpJobid(Integer cpJobid) {
        this.cpJobid = cpJobid;
    }

    public Integer getCpDays() {
        return cpDays;
    }

    public void setCpDays(Integer cpDays) {
        this.cpDays = cpDays;
    }

    public Integer getCpStarttime() {
        return cpStarttime;
    }

    public void setCpStarttime(Integer cpStarttime) {
        this.cpStarttime = cpStarttime;
    }

    public Integer getCpEndtime() {
        return cpEndtime;
    }

    public void setCpEndtime(Integer cpEndtime) {
        this.cpEndtime = cpEndtime;
    }
}