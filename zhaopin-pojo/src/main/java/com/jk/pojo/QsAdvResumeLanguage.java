package com.jk.pojo;

import java.io.Serializable;

public class QsAdvResumeLanguage implements Serializable {
    private Integer id;

    private Integer pid;

    private Integer uid;

    private Short language;

    private String languageCn;

    private Short level;

    private String levelCn;

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

    public Short getLanguage() {
        return language;
    }

    public void setLanguage(Short language) {
        this.language = language;
    }

    public String getLanguageCn() {
        return languageCn;
    }

    public void setLanguageCn(String languageCn) {
        this.languageCn = languageCn == null ? null : languageCn.trim();
    }

    public Short getLevel() {
        return level;
    }

    public void setLevel(Short level) {
        this.level = level;
    }

    public String getLevelCn() {
        return levelCn;
    }

    public void setLevelCn(String levelCn) {
        this.levelCn = levelCn == null ? null : levelCn.trim();
    }
}