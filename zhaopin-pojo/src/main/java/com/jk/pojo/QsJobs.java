package com.jk.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

public class QsJobs implements Serializable {
    private Integer id;

    private Integer uid;

    private String jobsName;

    private String companyname;

    private Integer companyId;

    private Integer companyAddtime;

    private Boolean companyAudit;

    private Boolean emergency;

    private Boolean stick;

    private Integer nature;

    private String natureCn;

    private Boolean sex;

    private String sexCn;

    private String age;

    private Short amount;

    private Short topclass;

    private Short category;

    private Short subclass;

    private String categoryCn;

    private Short trade;

    private String tradeCn;

    private Short scale;

    private String scaleCn;

    private String district;

    private String districtCn;

    private String tag;

    private String tagCn;

    private Short education;

    private String educationCn;

    private Short experience;

    private String experienceCn;

    private Integer minwage;

    private Integer maxwage;

    private Boolean negotiable;

    private Integer addtime;

    private Integer deadline;

    private Integer refreshtime;

    private Integer stime;

    private Integer setmealDeadline;

    private Short setmealId;

    private String setmealName;

    private Integer audit;

    private Boolean display;

    private Integer click;

    private Boolean userStatus;

    private Boolean robot;

    private String tpl;

    private BigDecimal mapX;

    private BigDecimal mapY;

    private Byte mapZoom;

    private Boolean addMode;

    private String department;

    private Boolean famous;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getJobsName() {
        return jobsName;
    }

    public void setJobsName(String jobsName) {
        this.jobsName = jobsName == null ? null : jobsName.trim();
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname == null ? null : companyname.trim();
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getCompanyAddtime() {
        return companyAddtime;
    }

    public void setCompanyAddtime(Integer companyAddtime) {
        this.companyAddtime = companyAddtime;
    }

    public Boolean getCompanyAudit() {
        return companyAudit;
    }

    public void setCompanyAudit(Boolean companyAudit) {
        this.companyAudit = companyAudit;
    }

    public Boolean getEmergency() {
        return emergency;
    }

    public void setEmergency(Boolean emergency) {
        this.emergency = emergency;
    }

    public Boolean getStick() {
        return stick;
    }

    public void setStick(Boolean stick) {
        this.stick = stick;
    }

    public Integer getNature() {
        return nature;
    }

    public void setNature(Integer nature) {
        this.nature = nature;
    }

    public String getNatureCn() {
        return natureCn;
    }

    public void setNatureCn(String natureCn) {
        this.natureCn = natureCn == null ? null : natureCn.trim();
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public String getSexCn() {
        return sexCn;
    }

    public void setSexCn(String sexCn) {
        this.sexCn = sexCn == null ? null : sexCn.trim();
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }

    public Short getAmount() {
        return amount;
    }

    public void setAmount(Short amount) {
        this.amount = amount;
    }

    public Short getTopclass() {
        return topclass;
    }

    public void setTopclass(Short topclass) {
        this.topclass = topclass;
    }

    public Short getCategory() {
        return category;
    }

    public void setCategory(Short category) {
        this.category = category;
    }

    public Short getSubclass() {
        return subclass;
    }

    public void setSubclass(Short subclass) {
        this.subclass = subclass;
    }

    public String getCategoryCn() {
        return categoryCn;
    }

    public void setCategoryCn(String categoryCn) {
        this.categoryCn = categoryCn == null ? null : categoryCn.trim();
    }

    public Short getTrade() {
        return trade;
    }

    public void setTrade(Short trade) {
        this.trade = trade;
    }

    public String getTradeCn() {
        return tradeCn;
    }

    public void setTradeCn(String tradeCn) {
        this.tradeCn = tradeCn == null ? null : tradeCn.trim();
    }

    public Short getScale() {
        return scale;
    }

    public void setScale(Short scale) {
        this.scale = scale;
    }

    public String getScaleCn() {
        return scaleCn;
    }

    public void setScaleCn(String scaleCn) {
        this.scaleCn = scaleCn == null ? null : scaleCn.trim();
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    public String getDistrictCn() {
        return districtCn;
    }

    public void setDistrictCn(String districtCn) {
        this.districtCn = districtCn == null ? null : districtCn.trim();
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
    }

    public String getTagCn() {
        return tagCn;
    }

    public void setTagCn(String tagCn) {
        this.tagCn = tagCn == null ? null : tagCn.trim();
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

    public Short getExperience() {
        return experience;
    }

    public void setExperience(Short experience) {
        this.experience = experience;
    }

    public String getExperienceCn() {
        return experienceCn;
    }

    public void setExperienceCn(String experienceCn) {
        this.experienceCn = experienceCn == null ? null : experienceCn.trim();
    }

    public Integer getMinwage() {
        return minwage;
    }

    public void setMinwage(Integer minwage) {
        this.minwage = minwage;
    }

    public Integer getMaxwage() {
        return maxwage;
    }

    public void setMaxwage(Integer maxwage) {
        this.maxwage = maxwage;
    }

    public Boolean getNegotiable() {
        return negotiable;
    }

    public void setNegotiable(Boolean negotiable) {
        this.negotiable = negotiable;
    }

    public Integer getAddtime() {
        return addtime;
    }

    public void setAddtime(Integer addtime) {
        this.addtime = addtime;
    }

    public Integer getDeadline() {
        return deadline;
    }

    public void setDeadline(Integer deadline) {
        this.deadline = deadline;
    }

    public Integer getRefreshtime() {
        return refreshtime;
    }

    public void setRefreshtime(Integer refreshtime) {
        this.refreshtime = refreshtime;
    }

    public Integer getStime() {
        return stime;
    }

    public void setStime(Integer stime) {
        this.stime = stime;
    }

    public Integer getSetmealDeadline() {
        return setmealDeadline;
    }

    public void setSetmealDeadline(Integer setmealDeadline) {
        this.setmealDeadline = setmealDeadline;
    }

    public Short getSetmealId() {
        return setmealId;
    }

    public void setSetmealId(Short setmealId) {
        this.setmealId = setmealId;
    }

    public String getSetmealName() {
        return setmealName;
    }

    public void setSetmealName(String setmealName) {
        this.setmealName = setmealName == null ? null : setmealName.trim();
    }

    public Integer getAudit() {
        return audit;
    }

    public void setAudit(Integer audit) {
        this.audit = audit;
    }

    public Boolean getDisplay() {
        return display;
    }

    public void setDisplay(Boolean display) {
        this.display = display;
    }

    public Integer getClick() {
        return click;
    }

    public void setClick(Integer click) {
        this.click = click;
    }

    public Boolean getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Boolean userStatus) {
        this.userStatus = userStatus;
    }

    public Boolean getRobot() {
        return robot;
    }

    public void setRobot(Boolean robot) {
        this.robot = robot;
    }

    public String getTpl() {
        return tpl;
    }

    public void setTpl(String tpl) {
        this.tpl = tpl == null ? null : tpl.trim();
    }

    public BigDecimal getMapX() {
        return mapX;
    }

    public void setMapX(BigDecimal mapX) {
        this.mapX = mapX;
    }

    public BigDecimal getMapY() {
        return mapY;
    }

    public void setMapY(BigDecimal mapY) {
        this.mapY = mapY;
    }

    public Byte getMapZoom() {
        return mapZoom;
    }

    public void setMapZoom(Byte mapZoom) {
        this.mapZoom = mapZoom;
    }

    public Boolean getAddMode() {
        return addMode;
    }

    public void setAddMode(Boolean addMode) {
        this.addMode = addMode;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public Boolean getFamous() {
        return famous;
    }

    public void setFamous(Boolean famous) {
        this.famous = famous;
    }
}