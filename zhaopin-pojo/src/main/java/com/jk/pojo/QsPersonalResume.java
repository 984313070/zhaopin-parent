package com.jk.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * 项目名称：zhaopin-parent
 * 类名称：QsPersonalResume
 * 类描述：
 * 创建人：马娇娇
 * 创建时间：2019-09-17 19:34
 * 修改人：马娇娇
 * 修改时间：2019-09-17 19:34
 * 修改备注：
 */
public class QsPersonalResume implements Serializable {

    private QsResume resume;

    private QsPersonalServiceStickLog personalServiceStickLog;

    public QsResume getResume() {
        return resume;
    }

    public void setResume(QsResume resume) {
        this.resume = resume;
    }

    public QsPersonalServiceStickLog getPersonalServiceStickLog() {
        return personalServiceStickLog;
    }

    public void setPersonalServiceStickLog(QsPersonalServiceStickLog personalServiceStickLog) {
        this.personalServiceStickLog = personalServiceStickLog;
    }

    public QsPersonalResume() {
    }

    public QsPersonalResume(QsResume resume, QsPersonalServiceStickLog personalServiceStickLog) {
        this.resume = resume;
        this.personalServiceStickLog = personalServiceStickLog;
    }

    @Override
    public String toString() {
        return "QsPersonalResume{" +
                "resume=" + resume +
                ", personalServiceStickLog=" + personalServiceStickLog +
                '}';
    }
}
