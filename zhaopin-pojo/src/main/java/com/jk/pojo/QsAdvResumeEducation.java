package com.jk.pojo;

import java.io.Serializable;

public class QsAdvResumeEducation implements Serializable {
    private Integer id;

    private Integer pid;

    private Integer uid;

    private Short startyear;

    private Short startmonth;

    private Short endyear;

    private Short endmonth;

    private String school;

    private String speciality;

    private Short education;

    private String educationCn;

    private Integer todate;

    private Integer campusId;

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

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality == null ? null : speciality.trim();
    }

    public Short getEducation() {
        return education;
    }

    public void setEducation(Short education) {
        this.education = education;
    }

    public String getEducationCn() {
        return educationCn;
    }

    public void setEducationCn(String educationCn) {
        this.educationCn = educationCn == null ? null : educationCn.trim();
    }

    public Integer getTodate() {
        return todate;
    }

    public void setTodate(Integer todate) {
        this.todate = todate;
    }

    public Integer getCampusId() {
        return campusId;
    }

    public void setCampusId(Integer campusId) {
        this.campusId = campusId;
    }
}