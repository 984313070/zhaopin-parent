package com.jk.pojo;

import java.io.Serializable;

/**
 @方法名   
 
 *@描述 会员表

 *@参数  

 *@返回值  

 *@创建人  顾可帅

 *@创建时间  2019/9/11 17:19

 *@修改人和其它信息

 */
public class QsMembersSetmeal implements Serializable {
    private Integer id;

    private Boolean expire;

    private Integer uid;

    private Integer setmealId;

    private String setmealName;

    private Integer days;

    private Integer expense;

    private Integer jobsMeanwhile;

    private Integer refreshJobsFree;

    private Integer downloadResume;

    private Integer downloadResumeMax;

    private String added;

    private Integer starttime;

    private Integer endtime;

    private String setmealImg;

    private Boolean showApplyContact;

    private Boolean isFree;

    private Double discountDownloadResume;

    private Double discountSms;

    private Double discountStick;

    private Double discountEmergency;

    private Double discountTpl;

    private Double discountAutoRefreshJobs;

    private Boolean showContactDirect;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getExpire() {
        return expire;
    }

    public void setExpire(Boolean expire) {
        this.expire = expire;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getSetmealId() {
        return setmealId;
    }

    public void setSetmealId(Integer setmealId) {
        this.setmealId = setmealId;
    }

    public String getSetmealName() {
        return setmealName;
    }

    public void setSetmealName(String setmealName) {
        this.setmealName = setmealName == null ? null : setmealName.trim();
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public Integer getExpense() {
        return expense;
    }

    public void setExpense(Integer expense) {
        this.expense = expense;
    }

    public Integer getJobsMeanwhile() {
        return jobsMeanwhile;
    }

    public void setJobsMeanwhile(Integer jobsMeanwhile) {
        this.jobsMeanwhile = jobsMeanwhile;
    }

    public Integer getRefreshJobsFree() {
        return refreshJobsFree;
    }

    public void setRefreshJobsFree(Integer refreshJobsFree) {
        this.refreshJobsFree = refreshJobsFree;
    }

    public Integer getDownloadResume() {
        return downloadResume;
    }

    public void setDownloadResume(Integer downloadResume) {
        this.downloadResume = downloadResume;
    }

    public Integer getDownloadResumeMax() {
        return downloadResumeMax;
    }

    public void setDownloadResumeMax(Integer downloadResumeMax) {
        this.downloadResumeMax = downloadResumeMax;
    }

    public String getAdded() {
        return added;
    }

    public void setAdded(String added) {
        this.added = added == null ? null : added.trim();
    }

    public Integer getStarttime() {
        return starttime;
    }

    public void setStarttime(Integer starttime) {
        this.starttime = starttime;
    }

    public Integer getEndtime() {
        return endtime;
    }

    public void setEndtime(Integer endtime) {
        this.endtime = endtime;
    }

    public String getSetmealImg() {
        return setmealImg;
    }

    public void setSetmealImg(String setmealImg) {
        this.setmealImg = setmealImg == null ? null : setmealImg.trim();
    }

    public Boolean getShowApplyContact() {
        return showApplyContact;
    }

    public void setShowApplyContact(Boolean showApplyContact) {
        this.showApplyContact = showApplyContact;
    }

    public Boolean getIsFree() {
        return isFree;
    }

    public void setIsFree(Boolean isFree) {
        this.isFree = isFree;
    }

    public Double getDiscountDownloadResume() {
        return discountDownloadResume;
    }

    public void setDiscountDownloadResume(Double discountDownloadResume) {
        this.discountDownloadResume = discountDownloadResume;
    }

    public Double getDiscountSms() {
        return discountSms;
    }

    public void setDiscountSms(Double discountSms) {
        this.discountSms = discountSms;
    }

    public Double getDiscountStick() {
        return discountStick;
    }

    public void setDiscountStick(Double discountStick) {
        this.discountStick = discountStick;
    }

    public Double getDiscountEmergency() {
        return discountEmergency;
    }

    public void setDiscountEmergency(Double discountEmergency) {
        this.discountEmergency = discountEmergency;
    }

    public Double getDiscountTpl() {
        return discountTpl;
    }

    public void setDiscountTpl(Double discountTpl) {
        this.discountTpl = discountTpl;
    }

    public Double getDiscountAutoRefreshJobs() {
        return discountAutoRefreshJobs;
    }

    public void setDiscountAutoRefreshJobs(Double discountAutoRefreshJobs) {
        this.discountAutoRefreshJobs = discountAutoRefreshJobs;
    }

    public Boolean getShowContactDirect() {
        return showContactDirect;
    }

    public void setShowContactDirect(Boolean showContactDirect) {
        this.showContactDirect = showContactDirect;
    }
}