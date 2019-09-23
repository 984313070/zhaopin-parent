package com.jk.pojo;

import java.io.Serializable;
/**
 @方法名   
 
 *@描述 企业风采

 *@参数  

 *@返回值  

 *@创建人  顾可帅

 *@创建时间  2019/9/11 15:53

 *@修改人和其它信息

 */
public class QsCompanyImg implements Serializable {
    private Integer id;

    private Integer uid;

    private Integer companyId;

    private String title;

    private String img;

    private Integer addtime;

    private Integer audit;

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

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    public Integer getAddtime() {
        return addtime;
    }

    public void setAddtime(Integer addtime) {
        this.addtime = addtime;
    }

    public Integer getAudit() {
        return audit;
    }

    public void setAudit(Integer audit) {
        this.audit = audit;
    }
}