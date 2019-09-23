package com.jk.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

public class QsCompanyProfile implements Serializable {


    private Integer id;

    private Integer uid;

    private String tpl;

    private String companyname;

    private Short nature;

    private String natureCn;

    private Short trade;

    private String tradeCn;

    private String district;

    private String districtCn;

    private Short street;

    private String streetCn;

    private Short scale;

    private String scaleCn;

    private String registered;

    private String currency;

    private String address;

    private String contact;

    private String telephone;

    private String landlineTel;

    private String email;

    private String website;

    private String certificateImg;

    private String logo;

    private Short setmealId;

    private String setmealName;

    private Byte audit;

    private Byte mapOpen;

    private BigDecimal mapX;

    private BigDecimal mapY;

    private Byte mapZoom;

    private Integer addtime;

    private Integer refreshtime;

    private Integer click;

    private Byte userStatus;

    private Boolean contactShow;

    private Boolean telephoneShow;

    private Boolean emailShow;

    private Boolean landlineTelShow;

    private Byte robot;

    private Integer comment;

    private Byte resumeProcessing;

    private String tag;

    private Boolean wzpTpl;

    private Integer jobs;

    private Integer replys;

    private String qq;

    private String shortName;

    private String shortDesc;

    private Boolean famous;

    private String contents;

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

    public String getTpl() {
        return tpl;
    }

    public void setTpl(String tpl) {
        this.tpl = tpl == null ? null : tpl.trim();
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname == null ? null : companyname.trim();
    }

    public Short getNature() {
        return nature;
    }

    public void setNature(Short nature) {
        this.nature = nature;
    }

    public String getNatureCn() {
        return natureCn;
    }

    public void setNatureCn(String natureCn) {
        this.natureCn = natureCn == null ? null : natureCn.trim();
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

    public Short getStreet() {
        return street;
    }

    public void setStreet(Short street) {
        this.street = street;
    }

    public String getStreetCn() {
        return streetCn;
    }

    public void setStreetCn(String streetCn) {
        this.streetCn = streetCn == null ? null : streetCn.trim();
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

    public String getRegistered() {
        return registered;
    }

    public void setRegistered(String registered) {
        this.registered = registered == null ? null : registered.trim();
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getLandlineTel() {
        return landlineTel;
    }

    public void setLandlineTel(String landlineTel) {
        this.landlineTel = landlineTel == null ? null : landlineTel.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website == null ? null : website.trim();
    }

    public String getCertificateImg() {
        return certificateImg;
    }

    public void setCertificateImg(String certificateImg) {
        this.certificateImg = certificateImg == null ? null : certificateImg.trim();
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
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

    public Byte getAudit() {
        return audit;
    }

    public void setAudit(Byte audit) {
        this.audit = audit;
    }

    public Byte getMapOpen() {
        return mapOpen;
    }

    public void setMapOpen(Byte mapOpen) {
        this.mapOpen = mapOpen;
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

    public Integer getAddtime() {
        return addtime;
    }

    public void setAddtime(Integer addtime) {
        this.addtime = addtime;
    }

    public Integer getRefreshtime() {
        return refreshtime;
    }

    public void setRefreshtime(Integer refreshtime) {
        this.refreshtime = refreshtime;
    }

    public Integer getClick() {
        return click;
    }

    public void setClick(Integer click) {
        this.click = click;
    }

    public Byte getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Byte userStatus) {
        this.userStatus = userStatus;
    }

    public Boolean getContactShow() {
        return contactShow;
    }

    public void setContactShow(Boolean contactShow) {
        this.contactShow = contactShow;
    }

    public Boolean getTelephoneShow() {
        return telephoneShow;
    }

    public void setTelephoneShow(Boolean telephoneShow) {
        this.telephoneShow = telephoneShow;
    }

    public Boolean getEmailShow() {
        return emailShow;
    }

    public void setEmailShow(Boolean emailShow) {
        this.emailShow = emailShow;
    }

    public Boolean getLandlineTelShow() {
        return landlineTelShow;
    }

    public void setLandlineTelShow(Boolean landlineTelShow) {
        this.landlineTelShow = landlineTelShow;
    }

    public Byte getRobot() {
        return robot;
    }

    public void setRobot(Byte robot) {
        this.robot = robot;
    }

    public Integer getComment() {
        return comment;
    }

    public void setComment(Integer comment) {
        this.comment = comment;
    }

    public Byte getResumeProcessing() {
        return resumeProcessing;
    }

    public void setResumeProcessing(Byte resumeProcessing) {
        this.resumeProcessing = resumeProcessing;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
    }

    public Boolean getWzpTpl() {
        return wzpTpl;
    }

    public void setWzpTpl(Boolean wzpTpl) {
        this.wzpTpl = wzpTpl;
    }

    public Integer getJobs() {
        return jobs;
    }

    public void setJobs(Integer jobs) {
        this.jobs = jobs;
    }

    public Integer getReplys() {
        return replys;
    }

    public void setReplys(Integer replys) {
        this.replys = replys;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName == null ? null : shortName.trim();
    }

    public String getShortDesc() {
        return shortDesc;
    }

    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc == null ? null : shortDesc.trim();
    }

    public Boolean getFamous() {
        return famous;
    }

    public void setFamous(Boolean famous) {
        this.famous = famous;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents == null ? null : contents.trim();
    }
}