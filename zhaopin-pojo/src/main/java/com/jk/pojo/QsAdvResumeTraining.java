package com.jk.pojo;

import java.io.Serializable;

public class QsAdvResumeTraining implements Serializable {
    private Integer id;

    private Integer pid;

    private Integer uid;

    private Short startyear;

    private Short startmonth;

    private Short endyear;

    private Short endmonth;

    private String agency;

    private String course;

    private String description;

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

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency == null ? null : agency.trim();
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course == null ? null : course.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getTodate() {
        return todate;
    }

    public void setTodate(Integer todate) {
        this.todate = todate;
    }
}