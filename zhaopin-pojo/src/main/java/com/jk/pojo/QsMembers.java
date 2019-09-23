package com.jk.pojo;

import java.io.Serializable;
import java.util.Date;

public class QsMembers implements Serializable {
    private Integer uid;

    private Integer utype;

    private String username;

    private String email;

    private Integer emailAudit;

    private String mobile;

    private Integer mobileAudit;

    private String password;

    private String pwdHash;

    private Date regTime;

    private String regIp;

    private String regAddress;

    private Date lastLoginTime;

    private String lastLoginIp;

    private Integer status;

    private String avatars;

    private Byte robot;

    private Short consultant;

    private Integer remindEmailTime;

    private String imei;

    private Integer smsNum;

    private Boolean regType;

    private Byte remindEmailExTime;

    private String invitationCode;

    private Boolean regSource;

    private String regSourceCn;

    private String secretkey;

    private Integer sitegroupUid;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getUtype() {
        return utype;
    }

    public void setUtype(Integer utype) {
        this.utype = utype;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getEmailAudit() {
        return emailAudit;
    }

    public void setEmailAudit(Integer emailAudit) {
        this.emailAudit = emailAudit;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Integer getMobileAudit() {
        return mobileAudit;
    }

    public void setMobileAudit(Integer mobileAudit) {
        this.mobileAudit = mobileAudit;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPwdHash() {
        return pwdHash;
    }

    public void setPwdHash(String pwdHash) {
        this.pwdHash = pwdHash == null ? null : pwdHash.trim();
    }

    public Date getRegTime() {
        return regTime;
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    public String getRegIp() {
        return regIp;
    }

    public void setRegIp(String regIp) {
        this.regIp = regIp == null ? null : regIp.trim();
    }

    public String getRegAddress() {
        return regAddress;
    }

    public void setRegAddress(String regAddress) {
        this.regAddress = regAddress == null ? null : regAddress.trim();
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp == null ? null : lastLoginIp.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getAvatars() {
        return avatars;
    }

    public void setAvatars(String avatars) {
        this.avatars = avatars == null ? null : avatars.trim();
    }

    public Byte getRobot() {
        return robot;
    }

    public void setRobot(Byte robot) {
        this.robot = robot;
    }

    public Short getConsultant() {
        return consultant;
    }

    public void setConsultant(Short consultant) {
        this.consultant = consultant;
    }

    public Integer getRemindEmailTime() {
        return remindEmailTime;
    }

    public void setRemindEmailTime(Integer remindEmailTime) {
        this.remindEmailTime = remindEmailTime;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei == null ? null : imei.trim();
    }

    public Integer getSmsNum() {
        return smsNum;
    }

    public void setSmsNum(Integer smsNum) {
        this.smsNum = smsNum;
    }

    public Boolean getRegType() {
        return regType;
    }

    public void setRegType(Boolean regType) {
        this.regType = regType;
    }

    public Byte getRemindEmailExTime() {
        return remindEmailExTime;
    }

    public void setRemindEmailExTime(Byte remindEmailExTime) {
        this.remindEmailExTime = remindEmailExTime;
    }

    public String getInvitationCode() {
        return invitationCode;
    }

    public void setInvitationCode(String invitationCode) {
        this.invitationCode = invitationCode == null ? null : invitationCode.trim();
    }

    public Boolean getRegSource() {
        return regSource;
    }

    public void setRegSource(Boolean regSource) {
        this.regSource = regSource;
    }

    public String getRegSourceCn() {
        return regSourceCn;
    }

    public void setRegSourceCn(String regSourceCn) {
        this.regSourceCn = regSourceCn == null ? null : regSourceCn.trim();
    }

    public String getSecretkey() {
        return secretkey;
    }

    public void setSecretkey(String secretkey) {
        this.secretkey = secretkey == null ? null : secretkey.trim();
    }

    public Integer getSitegroupUid() {
        return sitegroupUid;
    }

    public void setSitegroupUid(Integer sitegroupUid) {
        this.sitegroupUid = sitegroupUid;
    }
}