package com.jk.pojo;

import java.io.Serializable;

/**
 @方法名   
 
 *@描述 积分表实体

 *@参数  

 *@返回值  

 *@创建人  顾可帅

 *@创建时间  2019/9/16 9:35

 *@修改人和其它信息

 */
public class QsMembersPoints implements Serializable {
    private Integer id;

    private Integer uid;

    private Integer points;

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

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }
}