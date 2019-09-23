package com.jk.pojo;/**
 * @类名: PromotionJobsBean
 * @描述:
 * @作者: 顾可帅
 * @时间: 2019-09-18 14:32
 **/

import java.io.Serializable;

/**
 * <pre>项目名称：zhaopin-parent    
 * 类名称：PromotionJobsBean    
 * 类描述：   
 * 创建人：顾可帅
 * 创建时间：2019-09-18 14:32   
 * 修改人：顾可帅
 * 修改时间：2019-09-18 14:32    
 * 修改备注：       
 * @version </pre>  
 */
public class PromotionJobsBean implements Serializable {

    private QsJobs jobs;

    private QsPromotion promotion;

    public QsJobs getJobs() {
        return jobs;
    }

    public void setJobs(QsJobs jobs) {
        this.jobs = jobs;
    }

    public QsPromotion getPromotion() {
        return promotion;
    }

    public void setPromotion(QsPromotion promotion) {
        this.promotion = promotion;
    }

    public PromotionJobsBean() {
    }

    public PromotionJobsBean(QsJobs jobs, QsPromotion promotion) {
        this.jobs = jobs;
        this.promotion = promotion;
    }
}
