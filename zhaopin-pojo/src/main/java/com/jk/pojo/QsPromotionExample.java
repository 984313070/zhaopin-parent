package com.jk.pojo;

import java.util.ArrayList;
import java.util.List;

public class QsPromotionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QsPromotionExample() {
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

        public Criteria andCpIdIsNull() {
            addCriterion("cp_id is null");
            return (Criteria) this;
        }

        public Criteria andCpIdIsNotNull() {
            addCriterion("cp_id is not null");
            return (Criteria) this;
        }

        public Criteria andCpIdEqualTo(Integer value) {
            addCriterion("cp_id =", value, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdNotEqualTo(Integer value) {
            addCriterion("cp_id <>", value, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdGreaterThan(Integer value) {
            addCriterion("cp_id >", value, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cp_id >=", value, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdLessThan(Integer value) {
            addCriterion("cp_id <", value, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdLessThanOrEqualTo(Integer value) {
            addCriterion("cp_id <=", value, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdIn(List<Integer> values) {
            addCriterion("cp_id in", values, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdNotIn(List<Integer> values) {
            addCriterion("cp_id not in", values, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdBetween(Integer value1, Integer value2) {
            addCriterion("cp_id between", value1, value2, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cp_id not between", value1, value2, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpUidIsNull() {
            addCriterion("cp_uid is null");
            return (Criteria) this;
        }

        public Criteria andCpUidIsNotNull() {
            addCriterion("cp_uid is not null");
            return (Criteria) this;
        }

        public Criteria andCpUidEqualTo(Integer value) {
            addCriterion("cp_uid =", value, "cpUid");
            return (Criteria) this;
        }

        public Criteria andCpUidNotEqualTo(Integer value) {
            addCriterion("cp_uid <>", value, "cpUid");
            return (Criteria) this;
        }

        public Criteria andCpUidGreaterThan(Integer value) {
            addCriterion("cp_uid >", value, "cpUid");
            return (Criteria) this;
        }

        public Criteria andCpUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cp_uid >=", value, "cpUid");
            return (Criteria) this;
        }

        public Criteria andCpUidLessThan(Integer value) {
            addCriterion("cp_uid <", value, "cpUid");
            return (Criteria) this;
        }

        public Criteria andCpUidLessThanOrEqualTo(Integer value) {
            addCriterion("cp_uid <=", value, "cpUid");
            return (Criteria) this;
        }

        public Criteria andCpUidIn(List<Integer> values) {
            addCriterion("cp_uid in", values, "cpUid");
            return (Criteria) this;
        }

        public Criteria andCpUidNotIn(List<Integer> values) {
            addCriterion("cp_uid not in", values, "cpUid");
            return (Criteria) this;
        }

        public Criteria andCpUidBetween(Integer value1, Integer value2) {
            addCriterion("cp_uid between", value1, value2, "cpUid");
            return (Criteria) this;
        }

        public Criteria andCpUidNotBetween(Integer value1, Integer value2) {
            addCriterion("cp_uid not between", value1, value2, "cpUid");
            return (Criteria) this;
        }

        public Criteria andCpPtypeIsNull() {
            addCriterion("cp_ptype is null");
            return (Criteria) this;
        }

        public Criteria andCpPtypeIsNotNull() {
            addCriterion("cp_ptype is not null");
            return (Criteria) this;
        }

        public Criteria andCpPtypeEqualTo(String value) {
            addCriterion("cp_ptype =", value, "cpPtype");
            return (Criteria) this;
        }

        public Criteria andCpPtypeNotEqualTo(String value) {
            addCriterion("cp_ptype <>", value, "cpPtype");
            return (Criteria) this;
        }

        public Criteria andCpPtypeGreaterThan(String value) {
            addCriterion("cp_ptype >", value, "cpPtype");
            return (Criteria) this;
        }

        public Criteria andCpPtypeGreaterThanOrEqualTo(String value) {
            addCriterion("cp_ptype >=", value, "cpPtype");
            return (Criteria) this;
        }

        public Criteria andCpPtypeLessThan(String value) {
            addCriterion("cp_ptype <", value, "cpPtype");
            return (Criteria) this;
        }

        public Criteria andCpPtypeLessThanOrEqualTo(String value) {
            addCriterion("cp_ptype <=", value, "cpPtype");
            return (Criteria) this;
        }

        public Criteria andCpPtypeLike(String value) {
            addCriterion("cp_ptype like", value, "cpPtype");
            return (Criteria) this;
        }

        public Criteria andCpPtypeNotLike(String value) {
            addCriterion("cp_ptype not like", value, "cpPtype");
            return (Criteria) this;
        }

        public Criteria andCpPtypeIn(List<String> values) {
            addCriterion("cp_ptype in", values, "cpPtype");
            return (Criteria) this;
        }

        public Criteria andCpPtypeNotIn(List<String> values) {
            addCriterion("cp_ptype not in", values, "cpPtype");
            return (Criteria) this;
        }

        public Criteria andCpPtypeBetween(String value1, String value2) {
            addCriterion("cp_ptype between", value1, value2, "cpPtype");
            return (Criteria) this;
        }

        public Criteria andCpPtypeNotBetween(String value1, String value2) {
            addCriterion("cp_ptype not between", value1, value2, "cpPtype");
            return (Criteria) this;
        }

        public Criteria andCpJobidIsNull() {
            addCriterion("cp_jobid is null");
            return (Criteria) this;
        }

        public Criteria andCpJobidIsNotNull() {
            addCriterion("cp_jobid is not null");
            return (Criteria) this;
        }

        public Criteria andCpJobidEqualTo(Integer value) {
            addCriterion("cp_jobid =", value, "cpJobid");
            return (Criteria) this;
        }

        public Criteria andCpJobidNotEqualTo(Integer value) {
            addCriterion("cp_jobid <>", value, "cpJobid");
            return (Criteria) this;
        }

        public Criteria andCpJobidGreaterThan(Integer value) {
            addCriterion("cp_jobid >", value, "cpJobid");
            return (Criteria) this;
        }

        public Criteria andCpJobidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cp_jobid >=", value, "cpJobid");
            return (Criteria) this;
        }

        public Criteria andCpJobidLessThan(Integer value) {
            addCriterion("cp_jobid <", value, "cpJobid");
            return (Criteria) this;
        }

        public Criteria andCpJobidLessThanOrEqualTo(Integer value) {
            addCriterion("cp_jobid <=", value, "cpJobid");
            return (Criteria) this;
        }

        public Criteria andCpJobidIn(List<Integer> values) {
            addCriterion("cp_jobid in", values, "cpJobid");
            return (Criteria) this;
        }

        public Criteria andCpJobidNotIn(List<Integer> values) {
            addCriterion("cp_jobid not in", values, "cpJobid");
            return (Criteria) this;
        }

        public Criteria andCpJobidBetween(Integer value1, Integer value2) {
            addCriterion("cp_jobid between", value1, value2, "cpJobid");
            return (Criteria) this;
        }

        public Criteria andCpJobidNotBetween(Integer value1, Integer value2) {
            addCriterion("cp_jobid not between", value1, value2, "cpJobid");
            return (Criteria) this;
        }

        public Criteria andCpDaysIsNull() {
            addCriterion("cp_days is null");
            return (Criteria) this;
        }

        public Criteria andCpDaysIsNotNull() {
            addCriterion("cp_days is not null");
            return (Criteria) this;
        }

        public Criteria andCpDaysEqualTo(Integer value) {
            addCriterion("cp_days =", value, "cpDays");
            return (Criteria) this;
        }

        public Criteria andCpDaysNotEqualTo(Integer value) {
            addCriterion("cp_days <>", value, "cpDays");
            return (Criteria) this;
        }

        public Criteria andCpDaysGreaterThan(Integer value) {
            addCriterion("cp_days >", value, "cpDays");
            return (Criteria) this;
        }

        public Criteria andCpDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("cp_days >=", value, "cpDays");
            return (Criteria) this;
        }

        public Criteria andCpDaysLessThan(Integer value) {
            addCriterion("cp_days <", value, "cpDays");
            return (Criteria) this;
        }

        public Criteria andCpDaysLessThanOrEqualTo(Integer value) {
            addCriterion("cp_days <=", value, "cpDays");
            return (Criteria) this;
        }

        public Criteria andCpDaysIn(List<Integer> values) {
            addCriterion("cp_days in", values, "cpDays");
            return (Criteria) this;
        }

        public Criteria andCpDaysNotIn(List<Integer> values) {
            addCriterion("cp_days not in", values, "cpDays");
            return (Criteria) this;
        }

        public Criteria andCpDaysBetween(Integer value1, Integer value2) {
            addCriterion("cp_days between", value1, value2, "cpDays");
            return (Criteria) this;
        }

        public Criteria andCpDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("cp_days not between", value1, value2, "cpDays");
            return (Criteria) this;
        }

        public Criteria andCpStarttimeIsNull() {
            addCriterion("cp_starttime is null");
            return (Criteria) this;
        }

        public Criteria andCpStarttimeIsNotNull() {
            addCriterion("cp_starttime is not null");
            return (Criteria) this;
        }

        public Criteria andCpStarttimeEqualTo(Integer value) {
            addCriterion("cp_starttime =", value, "cpStarttime");
            return (Criteria) this;
        }

        public Criteria andCpStarttimeNotEqualTo(Integer value) {
            addCriterion("cp_starttime <>", value, "cpStarttime");
            return (Criteria) this;
        }

        public Criteria andCpStarttimeGreaterThan(Integer value) {
            addCriterion("cp_starttime >", value, "cpStarttime");
            return (Criteria) this;
        }

        public Criteria andCpStarttimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("cp_starttime >=", value, "cpStarttime");
            return (Criteria) this;
        }

        public Criteria andCpStarttimeLessThan(Integer value) {
            addCriterion("cp_starttime <", value, "cpStarttime");
            return (Criteria) this;
        }

        public Criteria andCpStarttimeLessThanOrEqualTo(Integer value) {
            addCriterion("cp_starttime <=", value, "cpStarttime");
            return (Criteria) this;
        }

        public Criteria andCpStarttimeIn(List<Integer> values) {
            addCriterion("cp_starttime in", values, "cpStarttime");
            return (Criteria) this;
        }

        public Criteria andCpStarttimeNotIn(List<Integer> values) {
            addCriterion("cp_starttime not in", values, "cpStarttime");
            return (Criteria) this;
        }

        public Criteria andCpStarttimeBetween(Integer value1, Integer value2) {
            addCriterion("cp_starttime between", value1, value2, "cpStarttime");
            return (Criteria) this;
        }

        public Criteria andCpStarttimeNotBetween(Integer value1, Integer value2) {
            addCriterion("cp_starttime not between", value1, value2, "cpStarttime");
            return (Criteria) this;
        }

        public Criteria andCpEndtimeIsNull() {
            addCriterion("cp_endtime is null");
            return (Criteria) this;
        }

        public Criteria andCpEndtimeIsNotNull() {
            addCriterion("cp_endtime is not null");
            return (Criteria) this;
        }

        public Criteria andCpEndtimeEqualTo(Integer value) {
            addCriterion("cp_endtime =", value, "cpEndtime");
            return (Criteria) this;
        }

        public Criteria andCpEndtimeNotEqualTo(Integer value) {
            addCriterion("cp_endtime <>", value, "cpEndtime");
            return (Criteria) this;
        }

        public Criteria andCpEndtimeGreaterThan(Integer value) {
            addCriterion("cp_endtime >", value, "cpEndtime");
            return (Criteria) this;
        }

        public Criteria andCpEndtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("cp_endtime >=", value, "cpEndtime");
            return (Criteria) this;
        }

        public Criteria andCpEndtimeLessThan(Integer value) {
            addCriterion("cp_endtime <", value, "cpEndtime");
            return (Criteria) this;
        }

        public Criteria andCpEndtimeLessThanOrEqualTo(Integer value) {
            addCriterion("cp_endtime <=", value, "cpEndtime");
            return (Criteria) this;
        }

        public Criteria andCpEndtimeIn(List<Integer> values) {
            addCriterion("cp_endtime in", values, "cpEndtime");
            return (Criteria) this;
        }

        public Criteria andCpEndtimeNotIn(List<Integer> values) {
            addCriterion("cp_endtime not in", values, "cpEndtime");
            return (Criteria) this;
        }

        public Criteria andCpEndtimeBetween(Integer value1, Integer value2) {
            addCriterion("cp_endtime between", value1, value2, "cpEndtime");
            return (Criteria) this;
        }

        public Criteria andCpEndtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("cp_endtime not between", value1, value2, "cpEndtime");
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