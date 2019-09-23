package com.jk.pojo;

import java.io.Serializable;

public class QsAdvResumeWork implements Serializable {
    private Integer id;

    private Integer pid;

    private Integer uid;

    private Short startyear;

    private Short startmonth;

    private Short endyear;

    private Short endmonth;

    private String companyname;

    private String jobs;

    private String achievements;

    private Integer todate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Short getStartyear() {
        return startyear;
    }

    public void setStartyear(Short startyear) {
        this.startyear = startyear;
    }

    public Short getStartmonth() {
        return startmonth;
    }

    public void setStartmonth(Short startmonth) {
        this.startmonth = startmonth;
    }

    public Short getEndyear() {
        return endyear;
    }

    public void setEndyear(Short endyear) {
        this.endyear = endyear;
    }

    public Short getEndmonth() {
        return endmonth;
    }

    public void setEndmonth(Short endmonth) {
        this.endmonth = endmonth;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname == null ? null : companyname.trim();
    }

    public String getJobs() {
        return jobs;
    }

    public void setJobs(String jobs) {
        this.jobs = jobs == null ? null : jobs.trim();
    }

    public String getAchievements() {
        return achievements;
    }

    public void setAchievements(String achievements) {
        this.achievements = achievements == null ? null : achievements.trim();
    }

    public Integer getTodate() {
        return todate;
    }

    public void setTodate(Integer todate) {
        this.todate = todate;
    }
}