package com.jk.pojo;

import java.io.Serializable;

public class QsPersonalServiceStickLog implements Serializable {
    private Integer id;

    private Integer resumeId;

    private Integer resumeUid;

    private Integer days;

    private Integer points;

    private Integer addtime;

    private Integer endtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getResumeId() {
        return resumeId;
    }

    public void setResumeId(Integer resumeId) {
        this.resumeId = resumeId;
    }

    public Integer getResumeUid() {
        return resumeUid;
    }

    public void setResumeUid(Integer resumeUid) {
        this.resumeUid = resumeUid;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public Integer getAddtime() {
        return addtime;
    }

    public void setAddtime(Integer addtime) {
        this.addtime = addtime;
    }

    public Integer getEndtime() {
        return endtime;
    }

    public void setEndtime(Integer endtime) {
        this.endtime = endtime;
    }

    @Override
    public String toString() {
        return "QsPersonalServiceStickLog{" +
                "id=" + id +
                ", resumeId=" + resumeId +
                ", resumeUid=" + resumeUid +
                ", days=" + days +
                ", points=" + points +
                ", addtime=" + addtime +
                ", endtime=" + endtime +
                '}';
    }
}