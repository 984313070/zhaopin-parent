package com.jk.pojo;/**
 * @类名: OrderMembersJobsResult
 * @描述:
 * @作者: 顾可帅
 * @时间: 2019-09-17 17:35
 **/

import java.io.Serializable;

/**
 * <pre>项目名称：zhaopin-parent    
 * 类名称：OrderMembersJobsResult    
 * 类描述：   
 * 创建人：顾可帅
 * 创建时间：2019-09-17 17:35   
 * 修改人：顾可帅
 * 修改时间：2019-09-17 17:35    
 * 修改备注：       
 * @version </pre>  
 */
public class OrderMembersJobsResult implements Serializable {

    private QsOrder order;

    private QsJobs jobs;

    private QsMembers members;

    public QsOrder getOrder() {
        return order;
    }

    public void setOrder(QsOrder order) {
        this.order = order;
    }

    public QsJobs getJobs() {
        return jobs;
    }

    public void setJobs(QsJobs jobs) {
        this.jobs = jobs;
    }

    public QsMembers getMembers() {
        return members;
    }

    public void setMembers(QsMembers members) {
        this.members = members;
    }

    public OrderMembersJobsResult() {
    }

    public OrderMembersJobsResult(QsOrder order, QsJobs jobs, QsMembers members) {
        this.order = order;
        this.jobs = jobs;
        this.members = members;
    }
}
