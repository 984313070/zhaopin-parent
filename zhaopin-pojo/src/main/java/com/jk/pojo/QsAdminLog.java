package com.jk.pojo;

import java.io.Serializable;

public class QsAdminLog implements Serializable {
    private Integer logId;

    private String logUrl;

    private String logIp;

    private String logAddress;

    private Integer logAddtime;

    private Integer operaterId;

    private String operater;

    public Integer getLogId() {
        return logId;
    }

    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    public String getLogUrl() {
        return logUrl;
    }

    public void setLogUrl(String logUrl) {
        this.logUrl = logUrl == null ? null : logUrl.trim();
    }

    public String getLogIp() {
        return logIp;
    }

    public void setLogIp(String logIp) {
        this.logIp = logIp == null ? null : logIp.trim();
    }

    public String getLogAddress() {
        return logAddress;
    }

    public void setLogAddress(String logAddress) {
        this.logAddress = logAddress == null ? null : logAddress.trim();
    }

    public Integer getLogAddtime() {
        return logAddtime;
    }

    public void setLogAddtime(Integer logAddtime) {
        this.logAddtime = logAddtime;
    }

    public Integer getOperaterId() {
        return operaterId;
    }

    public void setOperaterId(Integer operaterId) {
        this.operaterId = operaterId;
    }

    public String getOperater() {
        return operater;
    }

    public void setOperater(String operater) {
        this.operater = operater == null ? null : operater.trim();
    }
}