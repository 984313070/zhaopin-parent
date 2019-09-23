package com.jk.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class QsAdvResumeEducationExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QsAdvResumeEducationExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Integer value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Integer value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Integer value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Integer value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Integer value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Integer> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Integer> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Integer value1, Integer value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Integer value1, Integer value2) {
            addCriterion("pid not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andStartyearIsNull() {
            addCriterion("startyear is null");
            return (Criteria) this;
        }

        public Criteria andStartyearIsNotNull() {
            addCriterion("startyear is not null");
            return (Criteria) this;
        }

        public Criteria andStartyearEqualTo(Short value) {
            addCriterion("startyear =", value, "startyear");
            return (Criteria) this;
        }

        public Criteria andStartyearNotEqualTo(Short value) {
            addCriterion("startyear <>", value, "startyear");
            return (Criteria) this;
        }

        public Criteria andStartyearGreaterThan(Short value) {
            addCriterion("startyear >", value, "startyear");
            return (Criteria) this;
        }

        public Criteria andStartyearGreaterThanOrEqualTo(Short value) {
            addCriterion("startyear >=", value, "startyear");
            return (Criteria) this;
        }

        public Criteria andStartyearLessThan(Short value) {
            addCriterion("startyear <", value, "startyear");
            return (Criteria) this;
        }

        public Criteria andStartyearLessThanOrEqualTo(Short value) {
            addCriterion("startyear <=", value, "startyear");
            return (Criteria) this;
        }

        public Criteria andStartyearIn(List<Short> values) {
            addCriterion("startyear in", values, "startyear");
            return (Criteria) this;
        }

        public Criteria andStartyearNotIn(List<Short> values) {
            addCriterion("startyear not in", values, "startyear");
            return (Criteria) this;
        }

        public Criteria andStartyearBetween(Short value1, Short value2) {
            addCriterion("startyear between", value1, value2, "startyear");
            return (Criteria) this;
        }

        public Criteria andStartyearNotBetween(Short value1, Short value2) {
            addCriterion("startyear not between", value1, value2, "startyear");
            return (Criteria) this;
        }

        public Criteria andStartmonthIsNull() {
            addCriterion("startmonth is null");
            return (Criteria) this;
        }

        public Criteria andStartmonthIsNotNull() {
            addCriterion("startmonth is not null");
            return (Criteria) this;
        }

        public Criteria andStartmonthEqualTo(Short value) {
            addCriterion("startmonth =", value, "startmonth");
            return (Criteria) this;
        }

        public Criteria andStartmonthNotEqualTo(Short value) {
            addCriterion("startmonth <>", value, "startmonth");
            return (Criteria) this;
        }

        public Criteria andStartmonthGreaterThan(Short value) {
            addCriterion("startmonth >", value, "startmonth");
            return (Criteria) this;
        }

        public Criteria andStartmonthGreaterThanOrEqualTo(Short value) {
            addCriterion("startmonth >=", value, "startmonth");
            return (Criteria) this;
        }

        public Criteria andStartmonthLessThan(Short value) {
            addCriterion("startmonth <", value, "startmonth");
            return (Criteria) this;
        }

        public Criteria andStartmonthLessThanOrEqualTo(Short value) {
            addCriterion("startmonth <=", value, "startmonth");
            return (Criteria) this;
        }

        public Criteria andStartmonthIn(List<Short> values) {
            addCriterion("startmonth in", values, "startmonth");
            return (Criteria) this;
        }

        public Criteria andStartmonthNotIn(List<Short> values) {
            addCriterion("startmonth not in", values, "startmonth");
            return (Criteria) this;
        }

        public Criteria andStartmonthBetween(Short value1, Short value2) {
            addCriterion("startmonth between", value1, value2, "startmonth");
            return (Criteria) this;
        }

        public Criteria andStartmonthNotBetween(Short value1, Short value2) {
            addCriterion("startmonth not between", value1, value2, "startmonth");
            return (Criteria) this;
        }

        public Criteria andEndyearIsNull() {
            addCriterion("endyear is null");
            return (Criteria) this;
        }

        public Criteria andEndyearIsNotNull() {
            addCriterion("endyear is not null");
            return (Criteria) this;
        }

        public Criteria andEndyearEqualTo(Short value) {
            addCriterion("endyear =", value, "endyear");
            return (Criteria) this;
        }

        public Criteria andEndyearNotEqualTo(Short value) {
            addCriterion("endyear <>", value, "endyear");
            return (Criteria) this;
        }

        public Criteria andEndyearGreaterThan(Short value) {
            addCriterion("endyear >", value, "endyear");
            return (Criteria) this;
        }

        public Criteria andEndyearGreaterThanOrEqualTo(Short value) {
            addCriterion("endyear >=", value, "endyear");
            return (Criteria) this;
        }

        public Criteria andEndyearLessThan(Short value) {
            addCriterion("endyear <", value, "endyear");
            return (Criteria) this;
        }

        public Criteria andEndyearLessThanOrEqualTo(Short value) {
            addCriterion("endyear <=", value, "endyear");
            return (Criteria) this;
        }

        public Criteria andEndyearIn(List<Short> values) {
            addCriterion("endyear in", values, "endyear");
            return (Criteria) this;
        }

        public Criteria andEndyearNotIn(List<Short> values) {
            addCriterion("endyear not in", values, "endyear");
            return (Criteria) this;
        }

        public Criteria andEndyearBetween(Short value1, Short value2) {
            addCriterion("endyear between", value1, value2, "endyear");
            return (Criteria) this;
        }

        public Criteria andEndyearNotBetween(Short value1, Short value2) {
            addCriterion("endyear not between", value1, value2, "endyear");
            return (Criteria) this;
        }

        public Criteria andEndmonthIsNull() {
            addCriterion("endmonth is null");
            return (Criteria) this;
        }

        public Criteria andEndmonthIsNotNull() {
            addCriterion("endmonth is not null");
            return (Criteria) this;
        }

        public Criteria andEndmonthEqualTo(Short value) {
            addCriterion("endmonth =", value, "endmonth");
            return (Criteria) this;
        }

        public Criteria andEndmonthNotEqualTo(Short value) {
            addCriterion("endmonth <>", value, "endmonth");
            return (Criteria) this;
        }

        public Criteria andEndmonthGreaterThan(Short value) {
            addCriterion("endmonth >", value, "endmonth");
            return (Criteria) this;
        }

        public Criteria andEndmonthGreaterThanOrEqualTo(Short value) {
            addCriterion("endmonth >=", value, "endmonth");
            return (Criteria) this;
        }

        public Criteria andEndmonthLessThan(Short value) {
            addCriterion("endmonth <", value, "endmonth");
            return (Criteria) this;
        }

        public Criteria andEndmonthLessThanOrEqualTo(Short value) {
            addCriterion("endmonth <=", value, "endmonth");
            return (Criteria) this;
        }

        public Criteria andEndmonthIn(List<Short> values) {
            addCriterion("endmonth in", values, "endmonth");
            return (Criteria) this;
        }

        public Criteria andEndmonthNotIn(List<Short> values) {
            addCriterion("endmonth not in", values, "endmonth");
            return (Criteria) this;
        }

        public Criteria andEndmonthBetween(Short value1, Short value2) {
            addCriterion("endmonth between", value1, value2, "endmonth");
            return (Criteria) this;
        }

        public Criteria andEndmonthNotBetween(Short value1, Short value2) {
            addCriterion("endmonth not between", value1, value2, "endmonth");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNull() {
            addCriterion("school is null");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNotNull() {
            addCriterion("school is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolEqualTo(String value) {
            addCriterion("school =", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotEqualTo(String value) {
            addCriterion("school <>", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThan(String value) {
            addCriterion("school >", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("school >=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThan(String value) {
            addCriterion("school <", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThanOrEqualTo(String value) {
            addCriterion("school <=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLike(String value) {
            addCriterion("school like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotLike(String value) {
            addCriterion("school not like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolIn(List<String> values) {
            addCriterion("school in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotIn(List<String> values) {
            addCriterion("school not in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolBetween(String value1, String value2) {
            addCriterion("school between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotBetween(String value1, String value2) {
            addCriterion("school not between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andSpecialityIsNull() {
            addCriterion("speciality is null");
            return (Criteria) this;
        }

        public Criteria andSpecialityIsNotNull() {
            addCriterion("speciality is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialityEqualTo(String value) {
            addCriterion("speciality =", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityNotEqualTo(String value) {
            addCriterion("speciality <>", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityGreaterThan(String value) {
            addCriterion("speciality >", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityGreaterThanOrEqualTo(String value) {
            addCriterion("speciality >=", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityLessThan(String value) {
            addCriterion("speciality <", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityLessThanOrEqualTo(String value) {
            addCriterion("speciality <=", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityLike(String value) {
            addCriterion("speciality like", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityNotLike(String value) {
            addCriterion("speciality not like", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityIn(List<String> values) {
            addCriterion("speciality in", values, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityNotIn(List<String> values) {
            addCriterion("speciality not in", values, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityBetween(String value1, String value2) {
            addCriterion("speciality between", value1, value2, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityNotBetween(String value1, String value2) {
            addCriterion("speciality not between", value1, value2, "speciality");
            return (Criteria) this;
        }

        public Criteria andEducationIsNull() {
            addCriterion("education is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("education is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(Short value) {
            addCriterion("education =", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(Short value) {
            addCriterion("education <>", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(Short value) {
            addCriterion("education >", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(Short value) {
            addCriterion("education >=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(Short value) {
            addCriterion("education <", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(Short value) {
            addCriterion("education <=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<Short> values) {
            addCriterion("education in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<Short> values) {
            addCriterion("education not in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(Short value1, Short value2) {
            addCriterion("education between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(Short value1, Short value2) {
            addCriterion("education not between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationCnIsNull() {
            addCriterion("education_cn is null");
            return (Criteria) this;
        }

        public Criteria andEducationCnIsNotNull() {
            addCriterion("education_cn is not null");
            return (Criteria) this;
        }

        public Criteria andEducationCnEqualTo(String value) {
            addCriterion("education_cn =", value, "educationCn");
            return (Criteria) this;
        }

        public Criteria andEducationCnNotEqualTo(String value) {
            addCriterion("education_cn <>", value, "educationCn");
            return (Criteria) this;
        }

        public Criteria andEducationCnGreaterThan(String value) {
            addCriterion("education_cn >", value, "educationCn");
            return (Criteria) this;
        }

        public Criteria andEducationCnGreaterThanOrEqualTo(String value) {
            addCriterion("education_cn >=", value, "educationCn");
            return (Criteria) this;
        }

        public Criteria andEducationCnLessThan(String value) {
            addCriterion("education_cn <", value, "educationCn");
            return (Criteria) this;
        }

        public Criteria andEducationCnLessThanOrEqualTo(String value) {
            addCriterion("education_cn <=", value, "educationCn");
            return (Criteria) this;
        }

        public Criteria andEducationCnLike(String value) {
            addCriterion("education_cn like", value, "educationCn");
            return (Criteria) this;
        }

        public Criteria andEducationCnNotLike(String value) {
            addCriterion("education_cn not like", value, "educationCn");
            return (Criteria) this;
        }

        public Criteria andEducationCnIn(List<String> values) {
            addCriterion("education_cn in", values, "educationCn");
            return (Criteria) this;
        }

        public Criteria andEducationCnNotIn(List<String> values) {
            addCriterion("education_cn not in", values, "educationCn");
            return (Criteria) this;
        }

        public Criteria andEducationCnBetween(String value1, String value2) {
            addCriterion("education_cn between", value1, value2, "educationCn");
            return (Criteria) this;
        }

        public Criteria andEducationCnNotBetween(String value1, String value2) {
            addCriterion("education_cn not between", value1, value2, "educationCn");
            return (Criteria) this;
        }

        public Criteria andTodateIsNull() {
            addCriterion("todate is null");
            return (Criteria) this;
        }

        public Criteria andTodateIsNotNull() {
            addCriterion("todate is not null");
            return (Criteria) this;
        }

        public Criteria andTodateEqualTo(Integer value) {
            addCriterion("todate =", value, "todate");
            return (Criteria) this;
        }

        public Criteria andTodateNotEqualTo(Integer value) {
            addCriterion("todate <>", value, "todate");
            return (Criteria) this;
        }

        public Criteria andTodateGreaterThan(Integer value) {
            addCriterion("todate >", value, "todate");
            return (Criteria) this;
        }

        public Criteria andTodateGreaterThanOrEqualTo(Integer value) {
            addCriterion("todate >=", value, "todate");
            return (Criteria) this;
        }

        public Criteria andTodateLessThan(Integer value) {
            addCriterion("todate <", value, "todate");
            return (Criteria) this;
        }

        public Criteria andTodateLessThanOrEqualTo(Integer value) {
            addCriterion("todate <=", value, "todate");
            return (Criteria) this;
        }

        public Criteria andTodateIn(List<Integer> values) {
            addCriterion("todate in", values, "todate");
            return (Criteria) this;
        }

        public Criteria andTodateNotIn(List<Integer> values) {
            addCriterion("todate not in", values, "todate");
            return (Criteria) this;
        }

        public Criteria andTodateBetween(Integer value1, Integer value2) {
            addCriterion("todate between", value1, value2, "todate");
            return (Criteria) this;
        }

        public Criteria andTodateNotBetween(Integer value1, Integer value2) {
            addCriterion("todate not between", value1, value2, "todate");
            return (Criteria) this;
        }

        public Criteria andCampusIdIsNull() {
            addCriterion("campus_id is null");
            return (Criteria) this;
        }

        public Criteria andCampusIdIsNotNull() {
            addCriterion("campus_id is not null");
            return (Criteria) this;
        }

        public Criteria andCampusIdEqualTo(Integer value) {
            addCriterion("campus_id =", value, "campusId");
            return (Criteria) this;
        }

        public Criteria andCampusIdNotEqualTo(Integer value) {
            addCriterion("campus_id <>", value, "campusId");
            return (Criteria) this;
        }

        public Criteria andCampusIdGreaterThan(Integer value) {
            addCriterion("campus_id >", value, "campusId");
            return (Criteria) this;
        }

        public Criteria andCampusIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("campus_id >=", value, "campusId");
            return (Criteria) this;
        }

        public Criteria andCampusIdLessThan(Integer value) {
            addCriterion("campus_id <", value, "campusId");
            return (Criteria) this;
        }

        public Criteria andCampusIdLessThanOrEqualTo(Integer value) {
            addCriterion("campus_id <=", value, "campusId");
            return (Criteria) this;
        }

        public Criteria andCampusIdIn(List<Integer> values) {
            addCriterion("campus_id in", values, "campusId");
            return (Criteria) this;
        }

        public Criteria andCampusIdNotIn(List<Integer> values) {
            addCriterion("campus_id not in", values, "campusId");
            return (Criteria) this;
        }

        public Criteria andCampusIdBetween(Integer value1, Integer value2) {
            addCriterion("campus_id between", value1, value2, "campusId");
            return (Criteria) this;
        }

        public Criteria andCampusIdNotBetween(Integer value1, Integer value2) {
            addCriterion("campus_id not between", value1, value2, "campusId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}