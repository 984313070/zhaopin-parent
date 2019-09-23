package com.jk.pojo;/**
 * @类名: MembersSetmealProfilePoints
 * @描述:
 * @作者: 顾可帅
 * @时间: 2019-09-17 09:24
 **/

import java.io.Serializable;

/**
 * <pre>项目名称：zhaopin-parent    
 * 类名称：MembersSetmealProfilePoints    
 * 类描述：   
 * 创建人：顾可帅
 * 创建时间：2019-09-17 09:24   
 * 修改人：顾可帅
 * 修改时间：2019-09-17 09:24    
 * 修改备注：       
 * @version </pre>  
 */
public class MembersSetmealProfilePoints implements Serializable {

    private QsCompanyProfile companyProfile;


    private QsMembers members;

    private QsMembersPoints membersPoints;

    private QsMembersSetmeal membersSetmeal;


    public QsCompanyProfile getCompanyProfile() {
        return companyProfile;
    }

    public void setCompanyProfile(QsCompanyProfile companyProfile) {
        this.companyProfile = companyProfile;
    }

    public QsMembers getMembers() {
        return members;
    }

    public void setMembers(QsMembers members) {
        this.members = members;
    }

    public QsMembersPoints getMembersPoints() {
        return membersPoints;
    }

    public void setMembersPoints(QsMembersPoints membersPoints) {
        this.membersPoints = membersPoints;
    }

    public QsMembersSetmeal getMembersSetmeal() {
        return membersSetmeal;
    }

    public void setMembersSetmeal(QsMembersSetmeal membersSetmeal) {
        this.membersSetmeal = membersSetmeal;
    }

    public MembersSetmealProfilePoints() {
    }

    public MembersSetmealProfilePoints(QsCompanyProfile companyProfile, QsMembers members, QsMembersPoints membersPoints, QsMembersSetmeal membersSetmeal) {
        this.companyProfile = companyProfile;
        this.members = members;
        this.membersPoints = membersPoints;
        this.membersSetmeal = membersSetmeal;
    }
}
