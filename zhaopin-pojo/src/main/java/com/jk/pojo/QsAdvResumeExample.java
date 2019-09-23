package com.jk.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class QsAdvResumeExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QsAdvResumeExample() {
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

        public Criteria andDisplayIsNull() {
            addCriterion("display is null");
            return (Criteria) this;
        }

        public Criteria andDisplayIsNotNull() {
            addCriterion("display is not null");
            return (Criteria) this;
        }

        public Criteria andDisplayEqualTo(Byte value) {
            addCriterion("display =", value, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayNotEqualTo(Byte value) {
            addCriterion("display <>", value, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayGreaterThan(Byte value) {
            addCriterion("display >", value, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayGreaterThanOrEqualTo(Byte value) {
            addCriterion("display >=", value, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayLessThan(Byte value) {
            addCriterion("display <", value, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayLessThanOrEqualTo(Byte value) {
            addCriterion("display <=", value, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayIn(List<Byte> values) {
            addCriterion("display in", values, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayNotIn(List<Byte> values) {
            addCriterion("display not in", values, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayBetween(Byte value1, Byte value2) {
            addCriterion("display between", value1, value2, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayNotBetween(Byte value1, Byte value2) {
            addCriterion("display not between", value1, value2, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayNameIsNull() {
            addCriterion("display_name is null");
            return (Criteria) this;
        }

        public Criteria andDisplayNameIsNotNull() {
            addCriterion("display_name is not null");
            return (Criteria) this;
        }

        public Criteria andDisplayNameEqualTo(Byte value) {
            addCriterion("display_name =", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameNotEqualTo(Byte value) {
            addCriterion("display_name <>", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameGreaterThan(Byte value) {
            addCriterion("display_name >", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameGreaterThanOrEqualTo(Byte value) {
            addCriterion("display_name >=", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameLessThan(Byte value) {
            addCriterion("display_name <", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameLessThanOrEqualTo(Byte value) {
            addCriterion("display_name <=", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameIn(List<Byte> values) {
            addCriterion("display_name in", values, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameNotIn(List<Byte> values) {
            addCriterion("display_name not in", values, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameBetween(Byte value1, Byte value2) {
            addCriterion("display_name between", value1, value2, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameNotBetween(Byte value1, Byte value2) {
            addCriterion("display_name not between", value1, value2, "displayName");
            return (Criteria) this;
        }

        public Criteria andAuditIsNull() {
            addCriterion("audit is null");
            return (Criteria) this;
        }

        public Criteria andAuditIsNotNull() {
            addCriterion("audit is not null");
            return (Criteria) this;
        }

        public Criteria andAuditEqualTo(Byte value) {
            addCriterion("audit =", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditNotEqualTo(Byte value) {
            addCriterion("audit <>", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditGreaterThan(Byte value) {
            addCriterion("audit >", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditGreaterThanOrEqualTo(Byte value) {
            addCriterion("audit >=", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditLessThan(Byte value) {
            addCriterion("audit <", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditLessThanOrEqualTo(Byte value) {
            addCriterion("audit <=", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditIn(List<Byte> values) {
            addCriterion("audit in", values, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditNotIn(List<Byte> values) {
            addCriterion("audit not in", values, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditBetween(Byte value1, Byte value2) {
            addCriterion("audit between", value1, value2, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditNotBetween(Byte value1, Byte value2) {
            addCriterion("audit not between", value1, value2, "audit");
            return (Criteria) this;
        }

        public Criteria andStickIsNull() {
            addCriterion("stick is null");
            return (Criteria) this;
        }

        public Criteria andStickIsNotNull() {
            addCriterion("stick is not null");
            return (Criteria) this;
        }

        public Criteria andStickEqualTo(Boolean value) {
            addCriterion("stick =", value, "stick");
            return (Criteria) this;
        }

        public Criteria andStickNotEqualTo(Boolean value) {
            addCriterion("stick <>", value, "stick");
            return (Criteria) this;
        }

        public Criteria andStickGreaterThan(Boolean value) {
            addCriterion("stick >", value, "stick");
            return (Criteria) this;
        }

        public Criteria andStickGreaterThanOrEqualTo(Boolean value) {
            addCriterion("stick >=", value, "stick");
            return (Criteria) this;
        }

        public Criteria andStickLessThan(Boolean value) {
            addCriterion("stick <", value, "stick");
            return (Criteria) this;
        }

        public Criteria andStickLessThanOrEqualTo(Boolean value) {
            addCriterion("stick <=", value, "stick");
            return (Criteria) this;
        }

        public Criteria andStickIn(List<Boolean> values) {
            addCriterion("stick in", values, "stick");
            return (Criteria) this;
        }

        public Criteria andStickNotIn(List<Boolean> values) {
            addCriterion("stick not in", values, "stick");
            return (Criteria) this;
        }

        public Criteria andStickBetween(Boolean value1, Boolean value2) {
            addCriterion("stick between", value1, value2, "stick");
            return (Criteria) this;
        }

        public Criteria andStickNotBetween(Boolean value1, Boolean value2) {
            addCriterion("stick not between", value1, value2, "stick");
            return (Criteria) this;
        }

        public Criteria andStrongTagIsNull() {
            addCriterion("strong_tag is null");
            return (Criteria) this;
        }

        public Criteria andStrongTagIsNotNull() {
            addCriterion("strong_tag is not null");
            return (Criteria) this;
        }

        public Criteria andStrongTagEqualTo(Integer value) {
            addCriterion("strong_tag =", value, "strongTag");
            return (Criteria) this;
        }

        public Criteria andStrongTagNotEqualTo(Integer value) {
            addCriterion("strong_tag <>", value, "strongTag");
            return (Criteria) this;
        }

        public Criteria andStrongTagGreaterThan(Integer value) {
            addCriterion("strong_tag >", value, "strongTag");
            return (Criteria) this;
        }

        public Criteria andStrongTagGreaterThanOrEqualTo(Integer value) {
            addCriterion("strong_tag >=", value, "strongTag");
            return (Criteria) this;
        }

        public Criteria andStrongTagLessThan(Integer value) {
            addCriterion("strong_tag <", value, "strongTag");
            return (Criteria) this;
        }

        public Criteria andStrongTagLessThanOrEqualTo(Integer value) {
            addCriterion("strong_tag <=", value, "strongTag");
            return (Criteria) this;
        }

        public Criteria andStrongTagIn(List<Integer> values) {
            addCriterion("strong_tag in", values, "strongTag");
            return (Criteria) this;
        }

        public Criteria andStrongTagNotIn(List<Integer> values) {
            addCriterion("strong_tag not in", values, "strongTag");
            return (Criteria) this;
        }

        public Criteria andStrongTagBetween(Integer value1, Integer value2) {
            addCriterion("strong_tag between", value1, value2, "strongTag");
            return (Criteria) this;
        }

        public Criteria andStrongTagNotBetween(Integer value1, Integer value2) {
            addCriterion("strong_tag not between", value1, value2, "strongTag");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andFullnameIsNull() {
            addCriterion("fullname is null");
            return (Criteria) this;
        }

        public Criteria andFullnameIsNotNull() {
            addCriterion("fullname is not null");
            return (Criteria) this;
        }

        public Criteria andFullnameEqualTo(String value) {
            addCriterion("fullname =", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameNotEqualTo(String value) {
            addCriterion("fullname <>", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameGreaterThan(String value) {
            addCriterion("fullname >", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameGreaterThanOrEqualTo(String value) {
            addCriterion("fullname >=", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameLessThan(String value) {
            addCriterion("fullname <", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameLessThanOrEqualTo(String value) {
            addCriterion("fullname <=", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameLike(String value) {
            addCriterion("fullname like", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameNotLike(String value) {
            addCriterion("fullname not like", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameIn(List<String> values) {
            addCriterion("fullname in", values, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameNotIn(List<String> values) {
            addCriterion("fullname not in", values, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameBetween(String value1, String value2) {
            addCriterion("fullname between", value1, value2, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameNotBetween(String value1, String value2) {
            addCriterion("fullname not between", value1, value2, "fullname");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Byte value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Byte value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Byte value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Byte value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Byte value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Byte value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Byte> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Byte> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Byte value1, Byte value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Byte value1, Byte value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexCnIsNull() {
            addCriterion("sex_cn is null");
            return (Criteria) this;
        }

        public Criteria andSexCnIsNotNull() {
            addCriterion("sex_cn is not null");
            return (Criteria) this;
        }

        public Criteria andSexCnEqualTo(String value) {
            addCriterion("sex_cn =", value, "sexCn");
            return (Criteria) this;
        }

        public Criteria andSexCnNotEqualTo(String value) {
            addCriterion("sex_cn <>", value, "sexCn");
            return (Criteria) this;
        }

        public Criteria andSexCnGreaterThan(String value) {
            addCriterion("sex_cn >", value, "sexCn");
            return (Criteria) this;
        }

        public Criteria andSexCnGreaterThanOrEqualTo(String value) {
            addCriterion("sex_cn >=", value, "sexCn");
            return (Criteria) this;
        }

        public Criteria andSexCnLessThan(String value) {
            addCriterion("sex_cn <", value, "sexCn");
            return (Criteria) this;
        }

        public Criteria andSexCnLessThanOrEqualTo(String value) {
            addCriterion("sex_cn <=", value, "sexCn");
            return (Criteria) this;
        }

        public Criteria andSexCnLike(String value) {
            addCriterion("sex_cn like", value, "sexCn");
            return (Criteria) this;
        }

        public Criteria andSexCnNotLike(String value) {
            addCriterion("sex_cn not like", value, "sexCn");
            return (Criteria) this;
        }

        public Criteria andSexCnIn(List<String> values) {
            addCriterion("sex_cn in", values, "sexCn");
            return (Criteria) this;
        }

        public Criteria andSexCnNotIn(List<String> values) {
            addCriterion("sex_cn not in", values, "sexCn");
            return (Criteria) this;
        }

        public Criteria andSexCnBetween(String value1, String value2) {
            addCriterion("sex_cn between", value1, value2, "sexCn");
            return (Criteria) this;
        }

        public Criteria andSexCnNotBetween(String value1, String value2) {
            addCriterion("sex_cn not between", value1, value2, "sexCn");
            return (Criteria) this;
        }

        public Criteria andNatureIsNull() {
            addCriterion("nature is null");
            return (Criteria) this;
        }

        public Criteria andNatureIsNotNull() {
            addCriterion("nature is not null");
            return (Criteria) this;
        }

        public Criteria andNatureEqualTo(Integer value) {
            addCriterion("nature =", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotEqualTo(Integer value) {
            addCriterion("nature <>", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureGreaterThan(Integer value) {
            addCriterion("nature >", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureGreaterThanOrEqualTo(Integer value) {
            addCriterion("nature >=", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureLessThan(Integer value) {
            addCriterion("nature <", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureLessThanOrEqualTo(Integer value) {
            addCriterion("nature <=", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureIn(List<Integer> values) {
            addCriterion("nature in", values, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotIn(List<Integer> values) {
            addCriterion("nature not in", values, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureBetween(Integer value1, Integer value2) {
            addCriterion("nature between", value1, value2, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotBetween(Integer value1, Integer value2) {
            addCriterion("nature not between", value1, value2, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureCnIsNull() {
            addCriterion("nature_cn is null");
            return (Criteria) this;
        }

        public Criteria andNatureCnIsNotNull() {
            addCriterion("nature_cn is not null");
            return (Criteria) this;
        }

        public Criteria andNatureCnEqualTo(String value) {
            addCriterion("nature_cn =", value, "natureCn");
            return (Criteria) this;
        }

        public Criteria andNatureCnNotEqualTo(String value) {
            addCriterion("nature_cn <>", value, "natureCn");
            return (Criteria) this;
        }

        public Criteria andNatureCnGreaterThan(String value) {
            addCriterion("nature_cn >", value, "natureCn");
            return (Criteria) this;
        }

        public Criteria andNatureCnGreaterThanOrEqualTo(String value) {
            addCriterion("nature_cn >=", value, "natureCn");
            return (Criteria) this;
        }

        public Criteria andNatureCnLessThan(String value) {
            addCriterion("nature_cn <", value, "natureCn");
            return (Criteria) this;
        }

        public Criteria andNatureCnLessThanOrEqualTo(String value) {
            addCriterion("nature_cn <=", value, "natureCn");
            return (Criteria) this;
        }

        public Criteria andNatureCnLike(String value) {
            addCriterion("nature_cn like", value, "natureCn");
            return (Criteria) this;
        }

        public Criteria andNatureCnNotLike(String value) {
            addCriterion("nature_cn not like", value, "natureCn");
            return (Criteria) this;
        }

        public Criteria andNatureCnIn(List<String> values) {
            addCriterion("nature_cn in", values, "natureCn");
            return (Criteria) this;
        }

        public Criteria andNatureCnNotIn(List<String> values) {
            addCriterion("nature_cn not in", values, "natureCn");
            return (Criteria) this;
        }

        public Criteria andNatureCnBetween(String value1, String value2) {
            addCriterion("nature_cn between", value1, value2, "natureCn");
            return (Criteria) this;
        }

        public Criteria andNatureCnNotBetween(String value1, String value2) {
            addCriterion("nature_cn not between", value1, value2, "natureCn");
            return (Criteria) this;
        }

        public Criteria andTradeIsNull() {
            addCriterion("trade is null");
            return (Criteria) this;
        }

        public Criteria andTradeIsNotNull() {
            addCriterion("trade is not null");
            return (Criteria) this;
        }

        public Criteria andTradeEqualTo(String value) {
            addCriterion("trade =", value, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeNotEqualTo(String value) {
            addCriterion("trade <>", value, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeGreaterThan(String value) {
            addCriterion("trade >", value, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeGreaterThanOrEqualTo(String value) {
            addCriterion("trade >=", value, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeLessThan(String value) {
            addCriterion("trade <", value, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeLessThanOrEqualTo(String value) {
            addCriterion("trade <=", value, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeLike(String value) {
            addCriterion("trade like", value, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeNotLike(String value) {
            addCriterion("trade not like", value, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeIn(List<String> values) {
            addCriterion("trade in", values, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeNotIn(List<String> values) {
            addCriterion("trade not in", values, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeBetween(String value1, String value2) {
            addCriterion("trade between", value1, value2, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeNotBetween(String value1, String value2) {
            addCriterion("trade not between", value1, value2, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeCnIsNull() {
            addCriterion("trade_cn is null");
            return (Criteria) this;
        }

        public Criteria andTradeCnIsNotNull() {
            addCriterion("trade_cn is not null");
            return (Criteria) this;
        }

        public Criteria andTradeCnEqualTo(String value) {
            addCriterion("trade_cn =", value, "tradeCn");
            return (Criteria) this;
        }

        public Criteria andTradeCnNotEqualTo(String value) {
            addCriterion("trade_cn <>", value, "tradeCn");
            return (Criteria) this;
        }

        public Criteria andTradeCnGreaterThan(String value) {
            addCriterion("trade_cn >", value, "tradeCn");
            return (Criteria) this;
        }

        public Criteria andTradeCnGreaterThanOrEqualTo(String value) {
            addCriterion("trade_cn >=", value, "tradeCn");
            return (Criteria) this;
        }

        public Criteria andTradeCnLessThan(String value) {
            addCriterion("trade_cn <", value, "tradeCn");
            return (Criteria) this;
        }

        public Criteria andTradeCnLessThanOrEqualTo(String value) {
            addCriterion("trade_cn <=", value, "tradeCn");
            return (Criteria) this;
        }

        public Criteria andTradeCnLike(String value) {
            addCriterion("trade_cn like", value, "tradeCn");
            return (Criteria) this;
        }

        public Criteria andTradeCnNotLike(String value) {
            addCriterion("trade_cn not like", value, "tradeCn");
            return (Criteria) this;
        }

        public Criteria andTradeCnIn(List<String> values) {
            addCriterion("trade_cn in", values, "tradeCn");
            return (Criteria) this;
        }

        public Criteria andTradeCnNotIn(List<String> values) {
            addCriterion("trade_cn not in", values, "tradeCn");
            return (Criteria) this;
        }

        public Criteria andTradeCnBetween(String value1, String value2) {
            addCriterion("trade_cn between", value1, value2, "tradeCn");
            return (Criteria) this;
        }

        public Criteria andTradeCnNotBetween(String value1, String value2) {
            addCriterion("trade_cn not between", value1, value2, "tradeCn");
            return (Criteria) this;
        }

        public Criteria andBirthdateIsNull() {
            addCriterion("birthdate is null");
            return (Criteria) this;
        }

        public Criteria andBirthdateIsNotNull() {
            addCriterion("birthdate is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdateEqualTo(Short value) {
            addCriterion("birthdate =", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateNotEqualTo(Short value) {
            addCriterion("birthdate <>", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateGreaterThan(Short value) {
            addCriterion("birthdate >", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateGreaterThanOrEqualTo(Short value) {
            addCriterion("birthdate >=", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateLessThan(Short value) {
            addCriterion("birthdate <", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateLessThanOrEqualTo(Short value) {
            addCriterion("birthdate <=", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateIn(List<Short> values) {
            addCriterion("birthdate in", values, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateNotIn(List<Short> values) {
            addCriterion("birthdate not in", values, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateBetween(Short value1, Short value2) {
            addCriterion("birthdate between", value1, value2, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateNotBetween(Short value1, Short value2) {
            addCriterion("birthdate not between", value1, value2, "birthdate");
            return (Criteria) this;
        }

        public Criteria andResidenceIsNull() {
            addCriterion("residence is null");
            return (Criteria) this;
        }

        public Criteria andResidenceIsNotNull() {
            addCriterion("residence is not null");
            return (Criteria) this;
        }

        public Criteria andResidenceEqualTo(String value) {
            addCriterion("residence =", value, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceNotEqualTo(String value) {
            addCriterion("residence <>", value, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceGreaterThan(String value) {
            addCriterion("residence >", value, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceGreaterThanOrEqualTo(String value) {
            addCriterion("residence >=", value, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceLessThan(String value) {
            addCriterion("residence <", value, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceLessThanOrEqualTo(String value) {
            addCriterion("residence <=", value, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceLike(String value) {
            addCriterion("residence like", value, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceNotLike(String value) {
            addCriterion("residence not like", value, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceIn(List<String> values) {
            addCriterion("residence in", values, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceNotIn(List<String> values) {
            addCriterion("residence not in", values, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceBetween(String value1, String value2) {
            addCriterion("residence between", value1, value2, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceNotBetween(String value1, String value2) {
            addCriterion("residence not between", value1, value2, "residence");
            return (Criteria) this;
        }

        public Criteria andHeightIsNull() {
            addCriterion("height is null");
            return (Criteria) this;
        }

        public Criteria andHeightIsNotNull() {
            addCriterion("height is not null");
            return (Criteria) this;
        }

        public Criteria andHeightEqualTo(String value) {
            addCriterion("height =", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotEqualTo(String value) {
            addCriterion("height <>", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThan(String value) {
            addCriterion("height >", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThanOrEqualTo(String value) {
            addCriterion("height >=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThan(String value) {
            addCriterion("height <", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThanOrEqualTo(String value) {
            addCriterion("height <=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLike(String value) {
            addCriterion("height like", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotLike(String value) {
            addCriterion("height not like", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightIn(List<String> values) {
            addCriterion("height in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotIn(List<String> values) {
            addCriterion("height not in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightBetween(String value1, String value2) {
            addCriterion("height between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotBetween(String value1, String value2) {
            addCriterion("height not between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andMarriageIsNull() {
            addCriterion("marriage is null");
            return (Criteria) this;
        }

        public Criteria andMarriageIsNotNull() {
            addCriterion("marriage is not null");
            return (Criteria) this;
        }

        public Criteria andMarriageEqualTo(Byte value) {
            addCriterion("marriage =", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageNotEqualTo(Byte value) {
            addCriterion("marriage <>", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageGreaterThan(Byte value) {
            addCriterion("marriage >", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageGreaterThanOrEqualTo(Byte value) {
            addCriterion("marriage >=", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageLessThan(Byte value) {
            addCriterion("marriage <", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageLessThanOrEqualTo(Byte value) {
            addCriterion("marriage <=", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageIn(List<Byte> values) {
            addCriterion("marriage in", values, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageNotIn(List<Byte> values) {
            addCriterion("marriage not in", values, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageBetween(Byte value1, Byte value2) {
            addCriterion("marriage between", value1, value2, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageNotBetween(Byte value1, Byte value2) {
            addCriterion("marriage not between", value1, value2, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageCnIsNull() {
            addCriterion("marriage_cn is null");
            return (Criteria) this;
        }

        public Criteria andMarriageCnIsNotNull() {
            addCriterion("marriage_cn is not null");
            return (Criteria) this;
        }

        public Criteria andMarriageCnEqualTo(String value) {
            addCriterion("marriage_cn =", value, "marriageCn");
            return (Criteria) this;
        }

        public Criteria andMarriageCnNotEqualTo(String value) {
            addCriterion("marriage_cn <>", value, "marriageCn");
            return (Criteria) this;
        }

        public Criteria andMarriageCnGreaterThan(String value) {
            addCriterion("marriage_cn >", value, "marriageCn");
            return (Criteria) this;
        }

        public Criteria andMarriageCnGreaterThanOrEqualTo(String value) {
            addCriterion("marriage_cn >=", value, "marriageCn");
            return (Criteria) this;
        }

        public Criteria andMarriageCnLessThan(String value) {
            addCriterion("marriage_cn <", value, "marriageCn");
            return (Criteria) this;
        }

        public Criteria andMarriageCnLessThanOrEqualTo(String value) {
            addCriterion("marriage_cn <=", value, "marriageCn");
            return (Criteria) this;
        }

        public Criteria andMarriageCnLike(String value) {
            addCriterion("marriage_cn like", value, "marriageCn");
            return (Criteria) this;
        }

        public Criteria andMarriageCnNotLike(String value) {
            addCriterion("marriage_cn not like", value, "marriageCn");
            return (Criteria) this;
        }

        public Criteria andMarriageCnIn(List<String> values) {
            addCriterion("marriage_cn in", values, "marriageCn");
            return (Criteria) this;
        }

        public Criteria andMarriageCnNotIn(List<String> values) {
            addCriterion("marriage_cn not in", values, "marriageCn");
            return (Criteria) this;
        }

        public Criteria andMarriageCnBetween(String value1, String value2) {
            addCriterion("marriage_cn between", value1, value2, "marriageCn");
            return (Criteria) this;
        }

        public Criteria andMarriageCnNotBetween(String value1, String value2) {
            addCriterion("marriage_cn not between", value1, value2, "marriageCn");
            return (Criteria) this;
        }

        public Criteria andExperienceIsNull() {
            addCriterion("experience is null");
            return (Criteria) this;
        }

        public Criteria andExperienceIsNotNull() {
            addCriterion("experience is not null");
            return (Criteria) this;
        }

        public Criteria andExperienceEqualTo(Short value) {
            addCriterion("experience =", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceNotEqualTo(Short value) {
            addCriterion("experience <>", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceGreaterThan(Short value) {
            addCriterion("experience >", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceGreaterThanOrEqualTo(Short value) {
            addCriterion("experience >=", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceLessThan(Short value) {
            addCriterion("experience <", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceLessThanOrEqualTo(Short value) {
            addCriterion("experience <=", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceIn(List<Short> values) {
            addCriterion("experience in", values, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceNotIn(List<Short> values) {
            addCriterion("experience not in", values, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceBetween(Short value1, Short value2) {
            addCriterion("experience between", value1, value2, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceNotBetween(Short value1, Short value2) {
            addCriterion("experience not between", value1, value2, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceCnIsNull() {
            addCriterion("experience_cn is null");
            return (Criteria) this;
        }

        public Criteria andExperienceCnIsNotNull() {
            addCriterion("experience_cn is not null");
            return (Criteria) this;
        }

        public Criteria andExperienceCnEqualTo(String value) {
            addCriterion("experience_cn =", value, "experienceCn");
            return (Criteria) this;
        }

        public Criteria andExperienceCnNotEqualTo(String value) {
            addCriterion("experience_cn <>", value, "experienceCn");
            return (Criteria) this;
        }

        public Criteria andExperienceCnGreaterThan(String value) {
            addCriterion("experience_cn >", value, "experienceCn");
            return (Criteria) this;
        }

        public Criteria andExperienceCnGreaterThanOrEqualTo(String value) {
            addCriterion("experience_cn >=", value, "experienceCn");
            return (Criteria) this;
        }

        public Criteria andExperienceCnLessThan(String value) {
            addCriterion("experience_cn <", value, "experienceCn");
            return (Criteria) this;
        }

        public Criteria andExperienceCnLessThanOrEqualTo(String value) {
            addCriterion("experience_cn <=", value, "experienceCn");
            return (Criteria) this;
        }

        public Criteria andExperienceCnLike(String value) {
            addCriterion("experience_cn like", value, "experienceCn");
            return (Criteria) this;
        }

        public Criteria andExperienceCnNotLike(String value) {
            addCriterion("experience_cn not like", value, "experienceCn");
            return (Criteria) this;
        }

        public Criteria andExperienceCnIn(List<String> values) {
            addCriterion("experience_cn in", values, "experienceCn");
            return (Criteria) this;
        }

        public Criteria andExperienceCnNotIn(List<String> values) {
            addCriterion("experience_cn not in", values, "experienceCn");
            return (Criteria) this;
        }

        public Criteria andExperienceCnBetween(String value1, String value2) {
            addCriterion("experience_cn between", value1, value2, "experienceCn");
            return (Criteria) this;
        }

        public Criteria andExperienceCnNotBetween(String value1, String value2) {
            addCriterion("experience_cn not between", value1, value2, "experienceCn");
            return (Criteria) this;
        }

        public Criteria andDistrictIsNull() {
            addCriterion("district is null");
            return (Criteria) this;
        }

        public Criteria andDistrictIsNotNull() {
            addCriterion("district is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictEqualTo(String value) {
            addCriterion("district =", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotEqualTo(String value) {
            addCriterion("district <>", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThan(String value) {
            addCriterion("district >", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThanOrEqualTo(String value) {
            addCriterion("district >=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThan(String value) {
            addCriterion("district <", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThanOrEqualTo(String value) {
            addCriterion("district <=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLike(String value) {
            addCriterion("district like", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotLike(String value) {
            addCriterion("district not like", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictIn(List<String> values) {
            addCriterion("district in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotIn(List<String> values) {
            addCriterion("district not in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictBetween(String value1, String value2) {
            addCriterion("district between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotBetween(String value1, String value2) {
            addCriterion("district not between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictCnIsNull() {
            addCriterion("district_cn is null");
            return (Criteria) this;
        }

        public Criteria andDistrictCnIsNotNull() {
            addCriterion("district_cn is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictCnEqualTo(String value) {
            addCriterion("district_cn =", value, "districtCn");
            return (Criteria) this;
        }

        public Criteria andDistrictCnNotEqualTo(String value) {
            addCriterion("district_cn <>", value, "districtCn");
            return (Criteria) this;
        }

        public Criteria andDistrictCnGreaterThan(String value) {
            addCriterion("district_cn >", value, "districtCn");
            return (Criteria) this;
        }

        public Criteria andDistrictCnGreaterThanOrEqualTo(String value) {
            addCriterion("district_cn >=", value, "districtCn");
            return (Criteria) this;
        }

        public Criteria andDistrictCnLessThan(String value) {
            addCriterion("district_cn <", value, "districtCn");
            return (Criteria) this;
        }

        public Criteria andDistrictCnLessThanOrEqualTo(String value) {
            addCriterion("district_cn <=", value, "districtCn");
            return (Criteria) this;
        }

        public Criteria andDistrictCnLike(String value) {
            addCriterion("district_cn like", value, "districtCn");
            return (Criteria) this;
        }

        public Criteria andDistrictCnNotLike(String value) {
            addCriterion("district_cn not like", value, "districtCn");
            return (Criteria) this;
        }

        public Criteria andDistrictCnIn(List<String> values) {
            addCriterion("district_cn in", values, "districtCn");
            return (Criteria) this;
        }

        public Criteria andDistrictCnNotIn(List<String> values) {
            addCriterion("district_cn not in", values, "districtCn");
            return (Criteria) this;
        }

        public Criteria andDistrictCnBetween(String value1, String value2) {
            addCriterion("district_cn between", value1, value2, "districtCn");
            return (Criteria) this;
        }

        public Criteria andDistrictCnNotBetween(String value1, String value2) {
            addCriterion("district_cn not between", value1, value2, "districtCn");
            return (Criteria) this;
        }

        public Criteria andWageIsNull() {
            addCriterion("wage is null");
            return (Criteria) this;
        }

        public Criteria andWageIsNotNull() {
            addCriterion("wage is not null");
            return (Criteria) this;
        }

        public Criteria andWageEqualTo(Short value) {
            addCriterion("wage =", value, "wage");
            return (Criteria) this;
        }

        public Criteria andWageNotEqualTo(Short value) {
            addCriterion("wage <>", value, "wage");
            return (Criteria) this;
        }

        public Criteria andWageGreaterThan(Short value) {
            addCriterion("wage >", value, "wage");
            return (Criteria) this;
        }

        public Criteria andWageGreaterThanOrEqualTo(Short value) {
            addCriterion("wage >=", value, "wage");
            return (Criteria) this;
        }

        public Criteria andWageLessThan(Short value) {
            addCriterion("wage <", value, "wage");
            return (Criteria) this;
        }

        public Criteria andWageLessThanOrEqualTo(Short value) {
            addCriterion("wage <=", value, "wage");
            return (Criteria) this;
        }

        public Criteria andWageIn(List<Short> values) {
            addCriterion("wage in", values, "wage");
            return (Criteria) this;
        }

        public Criteria andWageNotIn(List<Short> values) {
            addCriterion("wage not in", values, "wage");
            return (Criteria) this;
        }

        public Criteria andWageBetween(Short value1, Short value2) {
            addCriterion("wage between", value1, value2, "wage");
            return (Criteria) this;
        }

        public Criteria andWageNotBetween(Short value1, Short value2) {
            addCriterion("wage not between", value1, value2, "wage");
            return (Criteria) this;
        }

        public Criteria andWageCnIsNull() {
            addCriterion("wage_cn is null");
            return (Criteria) this;
        }

        public Criteria andWageCnIsNotNull() {
            addCriterion("wage_cn is not null");
            return (Criteria) this;
        }

        public Criteria andWageCnEqualTo(String value) {
            addCriterion("wage_cn =", value, "wageCn");
            return (Criteria) this;
        }

        public Criteria andWageCnNotEqualTo(String value) {
            addCriterion("wage_cn <>", value, "wageCn");
            return (Criteria) this;
        }

        public Criteria andWageCnGreaterThan(String value) {
            addCriterion("wage_cn >", value, "wageCn");
            return (Criteria) this;
        }

        public Criteria andWageCnGreaterThanOrEqualTo(String value) {
            addCriterion("wage_cn >=", value, "wageCn");
            return (Criteria) this;
        }

        public Criteria andWageCnLessThan(String value) {
            addCriterion("wage_cn <", value, "wageCn");
            return (Criteria) this;
        }

        public Criteria andWageCnLessThanOrEqualTo(String value) {
            addCriterion("wage_cn <=", value, "wageCn");
            return (Criteria) this;
        }

        public Criteria andWageCnLike(String value) {
            addCriterion("wage_cn like", value, "wageCn");
            return (Criteria) this;
        }

        public Criteria andWageCnNotLike(String value) {
            addCriterion("wage_cn not like", value, "wageCn");
            return (Criteria) this;
        }

        public Criteria andWageCnIn(List<String> values) {
            addCriterion("wage_cn in", values, "wageCn");
            return (Criteria) this;
        }

        public Criteria andWageCnNotIn(List<String> values) {
            addCriterion("wage_cn not in", values, "wageCn");
            return (Criteria) this;
        }

        public Criteria andWageCnBetween(String value1, String value2) {
            addCriterion("wage_cn between", value1, value2, "wageCn");
            return (Criteria) this;
        }

        public Criteria andWageCnNotBetween(String value1, String value2) {
            addCriterion("wage_cn not between", value1, value2, "wageCn");
            return (Criteria) this;
        }

        public Criteria andHouseholdaddressIsNull() {
            addCriterion("householdaddress is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdaddressIsNotNull() {
            addCriterion("householdaddress is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdaddressEqualTo(String value) {
            addCriterion("householdaddress =", value, "householdaddress");
            return (Criteria) this;
        }

        public Criteria andHouseholdaddressNotEqualTo(String value) {
            addCriterion("householdaddress <>", value, "householdaddress");
            return (Criteria) this;
        }

        public Criteria andHouseholdaddressGreaterThan(String value) {
            addCriterion("householdaddress >", value, "householdaddress");
            return (Criteria) this;
        }

        public Criteria andHouseholdaddressGreaterThanOrEqualTo(String value) {
            addCriterion("householdaddress >=", value, "householdaddress");
            return (Criteria) this;
        }

        public Criteria andHouseholdaddressLessThan(String value) {
            addCriterion("householdaddress <", value, "householdaddress");
            return (Criteria) this;
        }

        public Criteria andHouseholdaddressLessThanOrEqualTo(String value) {
            addCriterion("householdaddress <=", value, "householdaddress");
            return (Criteria) this;
        }

        public Criteria andHouseholdaddressLike(String value) {
            addCriterion("householdaddress like", value, "householdaddress");
            return (Criteria) this;
        }

        public Criteria andHouseholdaddressNotLike(String value) {
            addCriterion("householdaddress not like", value, "householdaddress");
            return (Criteria) this;
        }

        public Criteria andHouseholdaddressIn(List<String> values) {
            addCriterion("householdaddress in", values, "householdaddress");
            return (Criteria) this;
        }

        public Criteria andHouseholdaddressNotIn(List<String> values) {
            addCriterion("householdaddress not in", values, "householdaddress");
            return (Criteria) this;
        }

        public Criteria andHouseholdaddressBetween(String value1, String value2) {
            addCriterion("householdaddress between", value1, value2, "householdaddress");
            return (Criteria) this;
        }

        public Criteria andHouseholdaddressNotBetween(String value1, String value2) {
            addCriterion("householdaddress not between", value1, value2, "householdaddress");
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

        public Criteria andMajorIsNull() {
            addCriterion("major is null");
            return (Criteria) this;
        }

        public Criteria andMajorIsNotNull() {
            addCriterion("major is not null");
            return (Criteria) this;
        }

        public Criteria andMajorEqualTo(Short value) {
            addCriterion("major =", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotEqualTo(Short value) {
            addCriterion("major <>", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThan(Short value) {
            addCriterion("major >", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThanOrEqualTo(Short value) {
            addCriterion("major >=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThan(Short value) {
            addCriterion("major <", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThanOrEqualTo(Short value) {
            addCriterion("major <=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorIn(List<Short> values) {
            addCriterion("major in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotIn(List<Short> values) {
            addCriterion("major not in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorBetween(Short value1, Short value2) {
            addCriterion("major between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotBetween(Short value1, Short value2) {
            addCriterion("major not between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andMajorCnIsNull() {
            addCriterion("major_cn is null");
            return (Criteria) this;
        }

        public Criteria andMajorCnIsNotNull() {
            addCriterion("major_cn is not null");
            return (Criteria) this;
        }

        public Criteria andMajorCnEqualTo(String value) {
            addCriterion("major_cn =", value, "majorCn");
            return (Criteria) this;
        }

        public Criteria andMajorCnNotEqualTo(String value) {
            addCriterion("major_cn <>", value, "majorCn");
            return (Criteria) this;
        }

        public Criteria andMajorCnGreaterThan(String value) {
            addCriterion("major_cn >", value, "majorCn");
            return (Criteria) this;
        }

        public Criteria andMajorCnGreaterThanOrEqualTo(String value) {
            addCriterion("major_cn >=", value, "majorCn");
            return (Criteria) this;
        }

        public Criteria andMajorCnLessThan(String value) {
            addCriterion("major_cn <", value, "majorCn");
            return (Criteria) this;
        }

        public Criteria andMajorCnLessThanOrEqualTo(String value) {
            addCriterion("major_cn <=", value, "majorCn");
            return (Criteria) this;
        }

        public Criteria andMajorCnLike(String value) {
            addCriterion("major_cn like", value, "majorCn");
            return (Criteria) this;
        }

        public Criteria andMajorCnNotLike(String value) {
            addCriterion("major_cn not like", value, "majorCn");
            return (Criteria) this;
        }

        public Criteria andMajorCnIn(List<String> values) {
            addCriterion("major_cn in", values, "majorCn");
            return (Criteria) this;
        }

        public Criteria andMajorCnNotIn(List<String> values) {
            addCriterion("major_cn not in", values, "majorCn");
            return (Criteria) this;
        }

        public Criteria andMajorCnBetween(String value1, String value2) {
            addCriterion("major_cn between", value1, value2, "majorCn");
            return (Criteria) this;
        }

        public Criteria andMajorCnNotBetween(String value1, String value2) {
            addCriterion("major_cn not between", value1, value2, "majorCn");
            return (Criteria) this;
        }

        public Criteria andTagIsNull() {
            addCriterion("tag is null");
            return (Criteria) this;
        }

        public Criteria andTagIsNotNull() {
            addCriterion("tag is not null");
            return (Criteria) this;
        }

        public Criteria andTagEqualTo(String value) {
            addCriterion("tag =", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotEqualTo(String value) {
            addCriterion("tag <>", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThan(String value) {
            addCriterion("tag >", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThanOrEqualTo(String value) {
            addCriterion("tag >=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThan(String value) {
            addCriterion("tag <", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThanOrEqualTo(String value) {
            addCriterion("tag <=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLike(String value) {
            addCriterion("tag like", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotLike(String value) {
            addCriterion("tag not like", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagIn(List<String> values) {
            addCriterion("tag in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotIn(List<String> values) {
            addCriterion("tag not in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagBetween(String value1, String value2) {
            addCriterion("tag between", value1, value2, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotBetween(String value1, String value2) {
            addCriterion("tag not between", value1, value2, "tag");
            return (Criteria) this;
        }

        public Criteria andTagCnIsNull() {
            addCriterion("tag_cn is null");
            return (Criteria) this;
        }

        public Criteria andTagCnIsNotNull() {
            addCriterion("tag_cn is not null");
            return (Criteria) this;
        }

        public Criteria andTagCnEqualTo(String value) {
            addCriterion("tag_cn =", value, "tagCn");
            return (Criteria) this;
        }

        public Criteria andTagCnNotEqualTo(String value) {
            addCriterion("tag_cn <>", value, "tagCn");
            return (Criteria) this;
        }

        public Criteria andTagCnGreaterThan(String value) {
            addCriterion("tag_cn >", value, "tagCn");
            return (Criteria) this;
        }

        public Criteria andTagCnGreaterThanOrEqualTo(String value) {
            addCriterion("tag_cn >=", value, "tagCn");
            return (Criteria) this;
        }

        public Criteria andTagCnLessThan(String value) {
            addCriterion("tag_cn <", value, "tagCn");
            return (Criteria) this;
        }

        public Criteria andTagCnLessThanOrEqualTo(String value) {
            addCriterion("tag_cn <=", value, "tagCn");
            return (Criteria) this;
        }

        public Criteria andTagCnLike(String value) {
            addCriterion("tag_cn like", value, "tagCn");
            return (Criteria) this;
        }

        public Criteria andTagCnNotLike(String value) {
            addCriterion("tag_cn not like", value, "tagCn");
            return (Criteria) this;
        }

        public Criteria andTagCnIn(List<String> values) {
            addCriterion("tag_cn in", values, "tagCn");
            return (Criteria) this;
        }

        public Criteria andTagCnNotIn(List<String> values) {
            addCriterion("tag_cn not in", values, "tagCn");
            return (Criteria) this;
        }

        public Criteria andTagCnBetween(String value1, String value2) {
            addCriterion("tag_cn between", value1, value2, "tagCn");
            return (Criteria) this;
        }

        public Criteria andTagCnNotBetween(String value1, String value2) {
            addCriterion("tag_cn not between", value1, value2, "tagCn");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("telephone is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("telephone is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("telephone =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("telephone <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("telephone >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("telephone >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("telephone <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("telephone <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("telephone like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("telephone not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("telephone in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("telephone not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("telephone between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("telephone not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotifyIsNull() {
            addCriterion("email_notify is null");
            return (Criteria) this;
        }

        public Criteria andEmailNotifyIsNotNull() {
            addCriterion("email_notify is not null");
            return (Criteria) this;
        }

        public Criteria andEmailNotifyEqualTo(Boolean value) {
            addCriterion("email_notify =", value, "emailNotify");
            return (Criteria) this;
        }

        public Criteria andEmailNotifyNotEqualTo(Boolean value) {
            addCriterion("email_notify <>", value, "emailNotify");
            return (Criteria) this;
        }

        public Criteria andEmailNotifyGreaterThan(Boolean value) {
            addCriterion("email_notify >", value, "emailNotify");
            return (Criteria) this;
        }

        public Criteria andEmailNotifyGreaterThanOrEqualTo(Boolean value) {
            addCriterion("email_notify >=", value, "emailNotify");
            return (Criteria) this;
        }

        public Criteria andEmailNotifyLessThan(Boolean value) {
            addCriterion("email_notify <", value, "emailNotify");
            return (Criteria) this;
        }

        public Criteria andEmailNotifyLessThanOrEqualTo(Boolean value) {
            addCriterion("email_notify <=", value, "emailNotify");
            return (Criteria) this;
        }

        public Criteria andEmailNotifyIn(List<Boolean> values) {
            addCriterion("email_notify in", values, "emailNotify");
            return (Criteria) this;
        }

        public Criteria andEmailNotifyNotIn(List<Boolean> values) {
            addCriterion("email_notify not in", values, "emailNotify");
            return (Criteria) this;
        }

        public Criteria andEmailNotifyBetween(Boolean value1, Boolean value2) {
            addCriterion("email_notify between", value1, value2, "emailNotify");
            return (Criteria) this;
        }

        public Criteria andEmailNotifyNotBetween(Boolean value1, Boolean value2) {
            addCriterion("email_notify not between", value1, value2, "emailNotify");
            return (Criteria) this;
        }

        public Criteria andIntentionJobsIdIsNull() {
            addCriterion("intention_jobs_id is null");
            return (Criteria) this;
        }

        public Criteria andIntentionJobsIdIsNotNull() {
            addCriterion("intention_jobs_id is not null");
            return (Criteria) this;
        }

        public Criteria andIntentionJobsIdEqualTo(String value) {
            addCriterion("intention_jobs_id =", value, "intentionJobsId");
            return (Criteria) this;
        }

        public Criteria andIntentionJobsIdNotEqualTo(String value) {
            addCriterion("intention_jobs_id <>", value, "intentionJobsId");
            return (Criteria) this;
        }

        public Criteria andIntentionJobsIdGreaterThan(String value) {
            addCriterion("intention_jobs_id >", value, "intentionJobsId");
            return (Criteria) this;
        }

        public Criteria andIntentionJobsIdGreaterThanOrEqualTo(String value) {
            addCriterion("intention_jobs_id >=", value, "intentionJobsId");
            return (Criteria) this;
        }

        public Criteria andIntentionJobsIdLessThan(String value) {
            addCriterion("intention_jobs_id <", value, "intentionJobsId");
            return (Criteria) this;
        }

        public Criteria andIntentionJobsIdLessThanOrEqualTo(String value) {
            addCriterion("intention_jobs_id <=", value, "intentionJobsId");
            return (Criteria) this;
        }

        public Criteria andIntentionJobsIdLike(String value) {
            addCriterion("intention_jobs_id like", value, "intentionJobsId");
            return (Criteria) this;
        }

        public Criteria andIntentionJobsIdNotLike(String value) {
            addCriterion("intention_jobs_id not like", value, "intentionJobsId");
            return (Criteria) this;
        }

        public Criteria andIntentionJobsIdIn(List<String> values) {
            addCriterion("intention_jobs_id in", values, "intentionJobsId");
            return (Criteria) this;
        }

        public Criteria andIntentionJobsIdNotIn(List<String> values) {
            addCriterion("intention_jobs_id not in", values, "intentionJobsId");
            return (Criteria) this;
        }

        public Criteria andIntentionJobsIdBetween(String value1, String value2) {
            addCriterion("intention_jobs_id between", value1, value2, "intentionJobsId");
            return (Criteria) this;
        }

        public Criteria andIntentionJobsIdNotBetween(String value1, String value2) {
            addCriterion("intention_jobs_id not between", value1, value2, "intentionJobsId");
            return (Criteria) this;
        }

        public Criteria andIntentionJobsIsNull() {
            addCriterion("intention_jobs is null");
            return (Criteria) this;
        }

        public Criteria andIntentionJobsIsNotNull() {
            addCriterion("intention_jobs is not null");
            return (Criteria) this;
        }

        public Criteria andIntentionJobsEqualTo(String value) {
            addCriterion("intention_jobs =", value, "intentionJobs");
            return (Criteria) this;
        }

        public Criteria andIntentionJobsNotEqualTo(String value) {
            addCriterion("intention_jobs <>", value, "intentionJobs");
            return (Criteria) this;
        }

        public Criteria andIntentionJobsGreaterThan(String value) {
            addCriterion("intention_jobs >", value, "intentionJobs");
            return (Criteria) this;
        }

        public Criteria andIntentionJobsGreaterThanOrEqualTo(String value) {
            addCriterion("intention_jobs >=", value, "intentionJobs");
            return (Criteria) this;
        }

        public Criteria andIntentionJobsLessThan(String value) {
            addCriterion("intention_jobs <", value, "intentionJobs");
            return (Criteria) this;
        }

        public Criteria andIntentionJobsLessThanOrEqualTo(String value) {
            addCriterion("intention_jobs <=", value, "intentionJobs");
            return (Criteria) this;
        }

        public Criteria andIntentionJobsLike(String value) {
            addCriterion("intention_jobs like", value, "intentionJobs");
            return (Criteria) this;
        }

        public Criteria andIntentionJobsNotLike(String value) {
            addCriterion("intention_jobs not like", value, "intentionJobs");
            return (Criteria) this;
        }

        public Criteria andIntentionJobsIn(List<String> values) {
            addCriterion("intention_jobs in", values, "intentionJobs");
            return (Criteria) this;
        }

        public Criteria andIntentionJobsNotIn(List<String> values) {
            addCriterion("intention_jobs not in", values, "intentionJobs");
            return (Criteria) this;
        }

        public Criteria andIntentionJobsBetween(String value1, String value2) {
            addCriterion("intention_jobs between", value1, value2, "intentionJobs");
            return (Criteria) this;
        }

        public Criteria andIntentionJobsNotBetween(String value1, String value2) {
            addCriterion("intention_jobs not between", value1, value2, "intentionJobs");
            return (Criteria) this;
        }

        public Criteria andSpecialtyIsNull() {
            addCriterion("specialty is null");
            return (Criteria) this;
        }

        public Criteria andSpecialtyIsNotNull() {
            addCriterion("specialty is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialtyEqualTo(String value) {
            addCriterion("specialty =", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyNotEqualTo(String value) {
            addCriterion("specialty <>", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyGreaterThan(String value) {
            addCriterion("specialty >", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyGreaterThanOrEqualTo(String value) {
            addCriterion("specialty >=", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyLessThan(String value) {
            addCriterion("specialty <", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyLessThanOrEqualTo(String value) {
            addCriterion("specialty <=", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyLike(String value) {
            addCriterion("specialty like", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyNotLike(String value) {
            addCriterion("specialty not like", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyIn(List<String> values) {
            addCriterion("specialty in", values, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyNotIn(List<String> values) {
            addCriterion("specialty not in", values, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyBetween(String value1, String value2) {
            addCriterion("specialty between", value1, value2, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyNotBetween(String value1, String value2) {
            addCriterion("specialty not between", value1, value2, "specialty");
            return (Criteria) this;
        }

        public Criteria andPhotoIsNull() {
            addCriterion("photo is null");
            return (Criteria) this;
        }

        public Criteria andPhotoIsNotNull() {
            addCriterion("photo is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoEqualTo(Boolean value) {
            addCriterion("photo =", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotEqualTo(Boolean value) {
            addCriterion("photo <>", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThan(Boolean value) {
            addCriterion("photo >", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThanOrEqualTo(Boolean value) {
            addCriterion("photo >=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThan(Boolean value) {
            addCriterion("photo <", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThanOrEqualTo(Boolean value) {
            addCriterion("photo <=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoIn(List<Boolean> values) {
            addCriterion("photo in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotIn(List<Boolean> values) {
            addCriterion("photo not in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoBetween(Boolean value1, Boolean value2) {
            addCriterion("photo between", value1, value2, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotBetween(Boolean value1, Boolean value2) {
            addCriterion("photo not between", value1, value2, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoImgIsNull() {
            addCriterion("photo_img is null");
            return (Criteria) this;
        }

        public Criteria andPhotoImgIsNotNull() {
            addCriterion("photo_img is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoImgEqualTo(String value) {
            addCriterion("photo_img =", value, "photoImg");
            return (Criteria) this;
        }

        public Criteria andPhotoImgNotEqualTo(String value) {
            addCriterion("photo_img <>", value, "photoImg");
            return (Criteria) this;
        }

        public Criteria andPhotoImgGreaterThan(String value) {
            addCriterion("photo_img >", value, "photoImg");
            return (Criteria) this;
        }

        public Criteria andPhotoImgGreaterThanOrEqualTo(String value) {
            addCriterion("photo_img >=", value, "photoImg");
            return (Criteria) this;
        }

        public Criteria andPhotoImgLessThan(String value) {
            addCriterion("photo_img <", value, "photoImg");
            return (Criteria) this;
        }

        public Criteria andPhotoImgLessThanOrEqualTo(String value) {
            addCriterion("photo_img <=", value, "photoImg");
            return (Criteria) this;
        }

        public Criteria andPhotoImgLike(String value) {
            addCriterion("photo_img like", value, "photoImg");
            return (Criteria) this;
        }

        public Criteria andPhotoImgNotLike(String value) {
            addCriterion("photo_img not like", value, "photoImg");
            return (Criteria) this;
        }

        public Criteria andPhotoImgIn(List<String> values) {
            addCriterion("photo_img in", values, "photoImg");
            return (Criteria) this;
        }

        public Criteria andPhotoImgNotIn(List<String> values) {
            addCriterion("photo_img not in", values, "photoImg");
            return (Criteria) this;
        }

        public Criteria andPhotoImgBetween(String value1, String value2) {
            addCriterion("photo_img between", value1, value2, "photoImg");
            return (Criteria) this;
        }

        public Criteria andPhotoImgNotBetween(String value1, String value2) {
            addCriterion("photo_img not between", value1, value2, "photoImg");
            return (Criteria) this;
        }

        public Criteria andPhotoAuditIsNull() {
            addCriterion("photo_audit is null");
            return (Criteria) this;
        }

        public Criteria andPhotoAuditIsNotNull() {
            addCriterion("photo_audit is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoAuditEqualTo(Boolean value) {
            addCriterion("photo_audit =", value, "photoAudit");
            return (Criteria) this;
        }

        public Criteria andPhotoAuditNotEqualTo(Boolean value) {
            addCriterion("photo_audit <>", value, "photoAudit");
            return (Criteria) this;
        }

        public Criteria andPhotoAuditGreaterThan(Boolean value) {
            addCriterion("photo_audit >", value, "photoAudit");
            return (Criteria) this;
        }

        public Criteria andPhotoAuditGreaterThanOrEqualTo(Boolean value) {
            addCriterion("photo_audit >=", value, "photoAudit");
            return (Criteria) this;
        }

        public Criteria andPhotoAuditLessThan(Boolean value) {
            addCriterion("photo_audit <", value, "photoAudit");
            return (Criteria) this;
        }

        public Criteria andPhotoAuditLessThanOrEqualTo(Boolean value) {
            addCriterion("photo_audit <=", value, "photoAudit");
            return (Criteria) this;
        }

        public Criteria andPhotoAuditIn(List<Boolean> values) {
            addCriterion("photo_audit in", values, "photoAudit");
            return (Criteria) this;
        }

        public Criteria andPhotoAuditNotIn(List<Boolean> values) {
            addCriterion("photo_audit not in", values, "photoAudit");
            return (Criteria) this;
        }

        public Criteria andPhotoAuditBetween(Boolean value1, Boolean value2) {
            addCriterion("photo_audit between", value1, value2, "photoAudit");
            return (Criteria) this;
        }

        public Criteria andPhotoAuditNotBetween(Boolean value1, Boolean value2) {
            addCriterion("photo_audit not between", value1, value2, "photoAudit");
            return (Criteria) this;
        }

        public Criteria andPhotoDisplayIsNull() {
            addCriterion("photo_display is null");
            return (Criteria) this;
        }

        public Criteria andPhotoDisplayIsNotNull() {
            addCriterion("photo_display is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoDisplayEqualTo(Boolean value) {
            addCriterion("photo_display =", value, "photoDisplay");
            return (Criteria) this;
        }

        public Criteria andPhotoDisplayNotEqualTo(Boolean value) {
            addCriterion("photo_display <>", value, "photoDisplay");
            return (Criteria) this;
        }

        public Criteria andPhotoDisplayGreaterThan(Boolean value) {
            addCriterion("photo_display >", value, "photoDisplay");
            return (Criteria) this;
        }

        public Criteria andPhotoDisplayGreaterThanOrEqualTo(Boolean value) {
            addCriterion("photo_display >=", value, "photoDisplay");
            return (Criteria) this;
        }

        public Criteria andPhotoDisplayLessThan(Boolean value) {
            addCriterion("photo_display <", value, "photoDisplay");
            return (Criteria) this;
        }

        public Criteria andPhotoDisplayLessThanOrEqualTo(Boolean value) {
            addCriterion("photo_display <=", value, "photoDisplay");
            return (Criteria) this;
        }

        public Criteria andPhotoDisplayIn(List<Boolean> values) {
            addCriterion("photo_display in", values, "photoDisplay");
            return (Criteria) this;
        }

        public Criteria andPhotoDisplayNotIn(List<Boolean> values) {
            addCriterion("photo_display not in", values, "photoDisplay");
            return (Criteria) this;
        }

        public Criteria andPhotoDisplayBetween(Boolean value1, Boolean value2) {
            addCriterion("photo_display between", value1, value2, "photoDisplay");
            return (Criteria) this;
        }

        public Criteria andPhotoDisplayNotBetween(Boolean value1, Boolean value2) {
            addCriterion("photo_display not between", value1, value2, "photoDisplay");
            return (Criteria) this;
        }

        public Criteria andQqIsNull() {
            addCriterion("qq is null");
            return (Criteria) this;
        }

        public Criteria andQqIsNotNull() {
            addCriterion("qq is not null");
            return (Criteria) this;
        }

        public Criteria andQqEqualTo(String value) {
            addCriterion("qq =", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotEqualTo(String value) {
            addCriterion("qq <>", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThan(String value) {
            addCriterion("qq >", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThanOrEqualTo(String value) {
            addCriterion("qq >=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThan(String value) {
            addCriterion("qq <", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThanOrEqualTo(String value) {
            addCriterion("qq <=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLike(String value) {
            addCriterion("qq like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotLike(String value) {
            addCriterion("qq not like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqIn(List<String> values) {
            addCriterion("qq in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotIn(List<String> values) {
            addCriterion("qq not in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqBetween(String value1, String value2) {
            addCriterion("qq between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotBetween(String value1, String value2) {
            addCriterion("qq not between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andWeixinIsNull() {
            addCriterion("weixin is null");
            return (Criteria) this;
        }

        public Criteria andWeixinIsNotNull() {
            addCriterion("weixin is not null");
            return (Criteria) this;
        }

        public Criteria andWeixinEqualTo(String value) {
            addCriterion("weixin =", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotEqualTo(String value) {
            addCriterion("weixin <>", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinGreaterThan(String value) {
            addCriterion("weixin >", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinGreaterThanOrEqualTo(String value) {
            addCriterion("weixin >=", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinLessThan(String value) {
            addCriterion("weixin <", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinLessThanOrEqualTo(String value) {
            addCriterion("weixin <=", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinLike(String value) {
            addCriterion("weixin like", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotLike(String value) {
            addCriterion("weixin not like", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinIn(List<String> values) {
            addCriterion("weixin in", values, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotIn(List<String> values) {
            addCriterion("weixin not in", values, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinBetween(String value1, String value2) {
            addCriterion("weixin between", value1, value2, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotBetween(String value1, String value2) {
            addCriterion("weixin not between", value1, value2, "weixin");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNull() {
            addCriterion("addtime is null");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNotNull() {
            addCriterion("addtime is not null");
            return (Criteria) this;
        }

        public Criteria andAddtimeEqualTo(Integer value) {
            addCriterion("addtime =", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotEqualTo(Integer value) {
            addCriterion("addtime <>", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThan(Integer value) {
            addCriterion("addtime >", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("addtime >=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThan(Integer value) {
            addCriterion("addtime <", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThanOrEqualTo(Integer value) {
            addCriterion("addtime <=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeIn(List<Integer> values) {
            addCriterion("addtime in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotIn(List<Integer> values) {
            addCriterion("addtime not in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeBetween(Integer value1, Integer value2) {
            addCriterion("addtime between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("addtime not between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andRefreshtimeIsNull() {
            addCriterion("refreshtime is null");
            return (Criteria) this;
        }

        public Criteria andRefreshtimeIsNotNull() {
            addCriterion("refreshtime is not null");
            return (Criteria) this;
        }

        public Criteria andRefreshtimeEqualTo(Integer value) {
            addCriterion("refreshtime =", value, "refreshtime");
            return (Criteria) this;
        }

        public Criteria andRefreshtimeNotEqualTo(Integer value) {
            addCriterion("refreshtime <>", value, "refreshtime");
            return (Criteria) this;
        }

        public Criteria andRefreshtimeGreaterThan(Integer value) {
            addCriterion("refreshtime >", value, "refreshtime");
            return (Criteria) this;
        }

        public Criteria andRefreshtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("refreshtime >=", value, "refreshtime");
            return (Criteria) this;
        }

        public Criteria andRefreshtimeLessThan(Integer value) {
            addCriterion("refreshtime <", value, "refreshtime");
            return (Criteria) this;
        }

        public Criteria andRefreshtimeLessThanOrEqualTo(Integer value) {
            addCriterion("refreshtime <=", value, "refreshtime");
            return (Criteria) this;
        }

        public Criteria andRefreshtimeIn(List<Integer> values) {
            addCriterion("refreshtime in", values, "refreshtime");
            return (Criteria) this;
        }

        public Criteria andRefreshtimeNotIn(List<Integer> values) {
            addCriterion("refreshtime not in", values, "refreshtime");
            return (Criteria) this;
        }

        public Criteria andRefreshtimeBetween(Integer value1, Integer value2) {
            addCriterion("refreshtime between", value1, value2, "refreshtime");
            return (Criteria) this;
        }

        public Criteria andRefreshtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("refreshtime not between", value1, value2, "refreshtime");
            return (Criteria) this;
        }

        public Criteria andStimeIsNull() {
            addCriterion("stime is null");
            return (Criteria) this;
        }

        public Criteria andStimeIsNotNull() {
            addCriterion("stime is not null");
            return (Criteria) this;
        }

        public Criteria andStimeEqualTo(Integer value) {
            addCriterion("stime =", value, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeNotEqualTo(Integer value) {
            addCriterion("stime <>", value, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeGreaterThan(Integer value) {
            addCriterion("stime >", value, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("stime >=", value, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeLessThan(Integer value) {
            addCriterion("stime <", value, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeLessThanOrEqualTo(Integer value) {
            addCriterion("stime <=", value, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeIn(List<Integer> values) {
            addCriterion("stime in", values, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeNotIn(List<Integer> values) {
            addCriterion("stime not in", values, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeBetween(Integer value1, Integer value2) {
            addCriterion("stime between", value1, value2, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeNotBetween(Integer value1, Integer value2) {
            addCriterion("stime not between", value1, value2, "stime");
            return (Criteria) this;
        }

        public Criteria andEntrustIsNull() {
            addCriterion("entrust is null");
            return (Criteria) this;
        }

        public Criteria andEntrustIsNotNull() {
            addCriterion("entrust is not null");
            return (Criteria) this;
        }

        public Criteria andEntrustEqualTo(Byte value) {
            addCriterion("entrust =", value, "entrust");
            return (Criteria) this;
        }

        public Criteria andEntrustNotEqualTo(Byte value) {
            addCriterion("entrust <>", value, "entrust");
            return (Criteria) this;
        }

        public Criteria andEntrustGreaterThan(Byte value) {
            addCriterion("entrust >", value, "entrust");
            return (Criteria) this;
        }

        public Criteria andEntrustGreaterThanOrEqualTo(Byte value) {
            addCriterion("entrust >=", value, "entrust");
            return (Criteria) this;
        }

        public Criteria andEntrustLessThan(Byte value) {
            addCriterion("entrust <", value, "entrust");
            return (Criteria) this;
        }

        public Criteria andEntrustLessThanOrEqualTo(Byte value) {
            addCriterion("entrust <=", value, "entrust");
            return (Criteria) this;
        }

        public Criteria andEntrustIn(List<Byte> values) {
            addCriterion("entrust in", values, "entrust");
            return (Criteria) this;
        }

        public Criteria andEntrustNotIn(List<Byte> values) {
            addCriterion("entrust not in", values, "entrust");
            return (Criteria) this;
        }

        public Criteria andEntrustBetween(Byte value1, Byte value2) {
            addCriterion("entrust between", value1, value2, "entrust");
            return (Criteria) this;
        }

        public Criteria andEntrustNotBetween(Byte value1, Byte value2) {
            addCriterion("entrust not between", value1, value2, "entrust");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Boolean value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Boolean value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Boolean value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Boolean value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Boolean value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Boolean value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Boolean> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Boolean> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Boolean value1, Boolean value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Boolean value1, Boolean value2) {
            addCriterion("level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andCompletePercentIsNull() {
            addCriterion("complete_percent is null");
            return (Criteria) this;
        }

        public Criteria andCompletePercentIsNotNull() {
            addCriterion("complete_percent is not null");
            return (Criteria) this;
        }

        public Criteria andCompletePercentEqualTo(Byte value) {
            addCriterion("complete_percent =", value, "completePercent");
            return (Criteria) this;
        }

        public Criteria andCompletePercentNotEqualTo(Byte value) {
            addCriterion("complete_percent <>", value, "completePercent");
            return (Criteria) this;
        }

        public Criteria andCompletePercentGreaterThan(Byte value) {
            addCriterion("complete_percent >", value, "completePercent");
            return (Criteria) this;
        }

        public Criteria andCompletePercentGreaterThanOrEqualTo(Byte value) {
            addCriterion("complete_percent >=", value, "completePercent");
            return (Criteria) this;
        }

        public Criteria andCompletePercentLessThan(Byte value) {
            addCriterion("complete_percent <", value, "completePercent");
            return (Criteria) this;
        }

        public Criteria andCompletePercentLessThanOrEqualTo(Byte value) {
            addCriterion("complete_percent <=", value, "completePercent");
            return (Criteria) this;
        }

        public Criteria andCompletePercentIn(List<Byte> values) {
            addCriterion("complete_percent in", values, "completePercent");
            return (Criteria) this;
        }

        public Criteria andCompletePercentNotIn(List<Byte> values) {
            addCriterion("complete_percent not in", values, "completePercent");
            return (Criteria) this;
        }

        public Criteria andCompletePercentBetween(Byte value1, Byte value2) {
            addCriterion("complete_percent between", value1, value2, "completePercent");
            return (Criteria) this;
        }

        public Criteria andCompletePercentNotBetween(Byte value1, Byte value2) {
            addCriterion("complete_percent not between", value1, value2, "completePercent");
            return (Criteria) this;
        }

        public Criteria andCurrentIsNull() {
            addCriterion("current is null");
            return (Criteria) this;
        }

        public Criteria andCurrentIsNotNull() {
            addCriterion("current is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentEqualTo(Short value) {
            addCriterion("current =", value, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentNotEqualTo(Short value) {
            addCriterion("current <>", value, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentGreaterThan(Short value) {
            addCriterion("current >", value, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentGreaterThanOrEqualTo(Short value) {
            addCriterion("current >=", value, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentLessThan(Short value) {
            addCriterion("current <", value, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentLessThanOrEqualTo(Short value) {
            addCriterion("current <=", value, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentIn(List<Short> values) {
            addCriterion("current in", values, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentNotIn(List<Short> values) {
            addCriterion("current not in", values, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentBetween(Short value1, Short value2) {
            addCriterion("current between", value1, value2, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentNotBetween(Short value1, Short value2) {
            addCriterion("current not between", value1, value2, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentCnIsNull() {
            addCriterion("current_cn is null");
            return (Criteria) this;
        }

        public Criteria andCurrentCnIsNotNull() {
            addCriterion("current_cn is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentCnEqualTo(String value) {
            addCriterion("current_cn =", value, "currentCn");
            return (Criteria) this;
        }

        public Criteria andCurrentCnNotEqualTo(String value) {
            addCriterion("current_cn <>", value, "currentCn");
            return (Criteria) this;
        }

        public Criteria andCurrentCnGreaterThan(String value) {
            addCriterion("current_cn >", value, "currentCn");
            return (Criteria) this;
        }

        public Criteria andCurrentCnGreaterThanOrEqualTo(String value) {
            addCriterion("current_cn >=", value, "currentCn");
            return (Criteria) this;
        }

        public Criteria andCurrentCnLessThan(String value) {
            addCriterion("current_cn <", value, "currentCn");
            return (Criteria) this;
        }

        public Criteria andCurrentCnLessThanOrEqualTo(String value) {
            addCriterion("current_cn <=", value, "currentCn");
            return (Criteria) this;
        }

        public Criteria andCurrentCnLike(String value) {
            addCriterion("current_cn like", value, "currentCn");
            return (Criteria) this;
        }

        public Criteria andCurrentCnNotLike(String value) {
            addCriterion("current_cn not like", value, "currentCn");
            return (Criteria) this;
        }

        public Criteria andCurrentCnIn(List<String> values) {
            addCriterion("current_cn in", values, "currentCn");
            return (Criteria) this;
        }

        public Criteria andCurrentCnNotIn(List<String> values) {
            addCriterion("current_cn not in", values, "currentCn");
            return (Criteria) this;
        }

        public Criteria andCurrentCnBetween(String value1, String value2) {
            addCriterion("current_cn between", value1, value2, "currentCn");
            return (Criteria) this;
        }

        public Criteria andCurrentCnNotBetween(String value1, String value2) {
            addCriterion("current_cn not between", value1, value2, "currentCn");
            return (Criteria) this;
        }

        public Criteria andWordResumeIsNull() {
            addCriterion("word_resume is null");
            return (Criteria) this;
        }

        public Criteria andWordResumeIsNotNull() {
            addCriterion("word_resume is not null");
            return (Criteria) this;
        }

        public Criteria andWordResumeEqualTo(String value) {
            addCriterion("word_resume =", value, "wordResume");
            return (Criteria) this;
        }

        public Criteria andWordResumeNotEqualTo(String value) {
            addCriterion("word_resume <>", value, "wordResume");
            return (Criteria) this;
        }

        public Criteria andWordResumeGreaterThan(String value) {
            addCriterion("word_resume >", value, "wordResume");
            return (Criteria) this;
        }

        public Criteria andWordResumeGreaterThanOrEqualTo(String value) {
            addCriterion("word_resume >=", value, "wordResume");
            return (Criteria) this;
        }

        public Criteria andWordResumeLessThan(String value) {
            addCriterion("word_resume <", value, "wordResume");
            return (Criteria) this;
        }

        public Criteria andWordResumeLessThanOrEqualTo(String value) {
            addCriterion("word_resume <=", value, "wordResume");
            return (Criteria) this;
        }

        public Criteria andWordResumeLike(String value) {
            addCriterion("word_resume like", value, "wordResume");
            return (Criteria) this;
        }

        public Criteria andWordResumeNotLike(String value) {
            addCriterion("word_resume not like", value, "wordResume");
            return (Criteria) this;
        }

        public Criteria andWordResumeIn(List<String> values) {
            addCriterion("word_resume in", values, "wordResume");
            return (Criteria) this;
        }

        public Criteria andWordResumeNotIn(List<String> values) {
            addCriterion("word_resume not in", values, "wordResume");
            return (Criteria) this;
        }

        public Criteria andWordResumeBetween(String value1, String value2) {
            addCriterion("word_resume between", value1, value2, "wordResume");
            return (Criteria) this;
        }

        public Criteria andWordResumeNotBetween(String value1, String value2) {
            addCriterion("word_resume not between", value1, value2, "wordResume");
            return (Criteria) this;
        }

        public Criteria andWordResumeTitleIsNull() {
            addCriterion("word_resume_title is null");
            return (Criteria) this;
        }

        public Criteria andWordResumeTitleIsNotNull() {
            addCriterion("word_resume_title is not null");
            return (Criteria) this;
        }

        public Criteria andWordResumeTitleEqualTo(String value) {
            addCriterion("word_resume_title =", value, "wordResumeTitle");
            return (Criteria) this;
        }

        public Criteria andWordResumeTitleNotEqualTo(String value) {
            addCriterion("word_resume_title <>", value, "wordResumeTitle");
            return (Criteria) this;
        }

        public Criteria andWordResumeTitleGreaterThan(String value) {
            addCriterion("word_resume_title >", value, "wordResumeTitle");
            return (Criteria) this;
        }

        public Criteria andWordResumeTitleGreaterThanOrEqualTo(String value) {
            addCriterion("word_resume_title >=", value, "wordResumeTitle");
            return (Criteria) this;
        }

        public Criteria andWordResumeTitleLessThan(String value) {
            addCriterion("word_resume_title <", value, "wordResumeTitle");
            return (Criteria) this;
        }

        public Criteria andWordResumeTitleLessThanOrEqualTo(String value) {
            addCriterion("word_resume_title <=", value, "wordResumeTitle");
            return (Criteria) this;
        }

        public Criteria andWordResumeTitleLike(String value) {
            addCriterion("word_resume_title like", value, "wordResumeTitle");
            return (Criteria) this;
        }

        public Criteria andWordResumeTitleNotLike(String value) {
            addCriterion("word_resume_title not like", value, "wordResumeTitle");
            return (Criteria) this;
        }

        public Criteria andWordResumeTitleIn(List<String> values) {
            addCriterion("word_resume_title in", values, "wordResumeTitle");
            return (Criteria) this;
        }

        public Criteria andWordResumeTitleNotIn(List<String> values) {
            addCriterion("word_resume_title not in", values, "wordResumeTitle");
            return (Criteria) this;
        }

        public Criteria andWordResumeTitleBetween(String value1, String value2) {
            addCriterion("word_resume_title between", value1, value2, "wordResumeTitle");
            return (Criteria) this;
        }

        public Criteria andWordResumeTitleNotBetween(String value1, String value2) {
            addCriterion("word_resume_title not between", value1, value2, "wordResumeTitle");
            return (Criteria) this;
        }

        public Criteria andWordResumeAddtimeIsNull() {
            addCriterion("word_resume_addtime is null");
            return (Criteria) this;
        }

        public Criteria andWordResumeAddtimeIsNotNull() {
            addCriterion("word_resume_addtime is not null");
            return (Criteria) this;
        }

        public Criteria andWordResumeAddtimeEqualTo(Integer value) {
            addCriterion("word_resume_addtime =", value, "wordResumeAddtime");
            return (Criteria) this;
        }

        public Criteria andWordResumeAddtimeNotEqualTo(Integer value) {
            addCriterion("word_resume_addtime <>", value, "wordResumeAddtime");
            return (Criteria) this;
        }

        public Criteria andWordResumeAddtimeGreaterThan(Integer value) {
            addCriterion("word_resume_addtime >", value, "wordResumeAddtime");
            return (Criteria) this;
        }

        public Criteria andWordResumeAddtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("word_resume_addtime >=", value, "wordResumeAddtime");
            return (Criteria) this;
        }

        public Criteria andWordResumeAddtimeLessThan(Integer value) {
            addCriterion("word_resume_addtime <", value, "wordResumeAddtime");
            return (Criteria) this;
        }

        public Criteria andWordResumeAddtimeLessThanOrEqualTo(Integer value) {
            addCriterion("word_resume_addtime <=", value, "wordResumeAddtime");
            return (Criteria) this;
        }

        public Criteria andWordResumeAddtimeIn(List<Integer> values) {
            addCriterion("word_resume_addtime in", values, "wordResumeAddtime");
            return (Criteria) this;
        }

        public Criteria andWordResumeAddtimeNotIn(List<Integer> values) {
            addCriterion("word_resume_addtime not in", values, "wordResumeAddtime");
            return (Criteria) this;
        }

        public Criteria andWordResumeAddtimeBetween(Integer value1, Integer value2) {
            addCriterion("word_resume_addtime between", value1, value2, "wordResumeAddtime");
            return (Criteria) this;
        }

        public Criteria andWordResumeAddtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("word_resume_addtime not between", value1, value2, "wordResumeAddtime");
            return (Criteria) this;
        }

        public Criteria andClickIsNull() {
            addCriterion("click is null");
            return (Criteria) this;
        }

        public Criteria andClickIsNotNull() {
            addCriterion("click is not null");
            return (Criteria) this;
        }

        public Criteria andClickEqualTo(Integer value) {
            addCriterion("click =", value, "click");
            return (Criteria) this;
        }

        public Criteria andClickNotEqualTo(Integer value) {
            addCriterion("click <>", value, "click");
            return (Criteria) this;
        }

        public Criteria andClickGreaterThan(Integer value) {
            addCriterion("click >", value, "click");
            return (Criteria) this;
        }

        public Criteria andClickGreaterThanOrEqualTo(Integer value) {
            addCriterion("click >=", value, "click");
            return (Criteria) this;
        }

        public Criteria andClickLessThan(Integer value) {
            addCriterion("click <", value, "click");
            return (Criteria) this;
        }

        public Criteria andClickLessThanOrEqualTo(Integer value) {
            addCriterion("click <=", value, "click");
            return (Criteria) this;
        }

        public Criteria andClickIn(List<Integer> values) {
            addCriterion("click in", values, "click");
            return (Criteria) this;
        }

        public Criteria andClickNotIn(List<Integer> values) {
            addCriterion("click not in", values, "click");
            return (Criteria) this;
        }

        public Criteria andClickBetween(Integer value1, Integer value2) {
            addCriterion("click between", value1, value2, "click");
            return (Criteria) this;
        }

        public Criteria andClickNotBetween(Integer value1, Integer value2) {
            addCriterion("click not between", value1, value2, "click");
            return (Criteria) this;
        }

        public Criteria andTplIsNull() {
            addCriterion("tpl is null");
            return (Criteria) this;
        }

        public Criteria andTplIsNotNull() {
            addCriterion("tpl is not null");
            return (Criteria) this;
        }

        public Criteria andTplEqualTo(String value) {
            addCriterion("tpl =", value, "tpl");
            return (Criteria) this;
        }

        public Criteria andTplNotEqualTo(String value) {
            addCriterion("tpl <>", value, "tpl");
            return (Criteria) this;
        }

        public Criteria andTplGreaterThan(String value) {
            addCriterion("tpl >", value, "tpl");
            return (Criteria) this;
        }

        public Criteria andTplGreaterThanOrEqualTo(String value) {
            addCriterion("tpl >=", value, "tpl");
            return (Criteria) this;
        }

        public Criteria andTplLessThan(String value) {
            addCriterion("tpl <", value, "tpl");
            return (Criteria) this;
        }

        public Criteria andTplLessThanOrEqualTo(String value) {
            addCriterion("tpl <=", value, "tpl");
            return (Criteria) this;
        }

        public Criteria andTplLike(String value) {
            addCriterion("tpl like", value, "tpl");
            return (Criteria) this;
        }

        public Criteria andTplNotLike(String value) {
            addCriterion("tpl not like", value, "tpl");
            return (Criteria) this;
        }

        public Criteria andTplIn(List<String> values) {
            addCriterion("tpl in", values, "tpl");
            return (Criteria) this;
        }

        public Criteria andTplNotIn(List<String> values) {
            addCriterion("tpl not in", values, "tpl");
            return (Criteria) this;
        }

        public Criteria andTplBetween(String value1, String value2) {
            addCriterion("tpl between", value1, value2, "tpl");
            return (Criteria) this;
        }

        public Criteria andTplNotBetween(String value1, String value2) {
            addCriterion("tpl not between", value1, value2, "tpl");
            return (Criteria) this;
        }

        public Criteria andResumeFromPcIsNull() {
            addCriterion("resume_from_pc is null");
            return (Criteria) this;
        }

        public Criteria andResumeFromPcIsNotNull() {
            addCriterion("resume_from_pc is not null");
            return (Criteria) this;
        }

        public Criteria andResumeFromPcEqualTo(Boolean value) {
            addCriterion("resume_from_pc =", value, "resumeFromPc");
            return (Criteria) this;
        }

        public Criteria andResumeFromPcNotEqualTo(Boolean value) {
            addCriterion("resume_from_pc <>", value, "resumeFromPc");
            return (Criteria) this;
        }

        public Criteria andResumeFromPcGreaterThan(Boolean value) {
            addCriterion("resume_from_pc >", value, "resumeFromPc");
            return (Criteria) this;
        }

        public Criteria andResumeFromPcGreaterThanOrEqualTo(Boolean value) {
            addCriterion("resume_from_pc >=", value, "resumeFromPc");
            return (Criteria) this;
        }

        public Criteria andResumeFromPcLessThan(Boolean value) {
            addCriterion("resume_from_pc <", value, "resumeFromPc");
            return (Criteria) this;
        }

        public Criteria andResumeFromPcLessThanOrEqualTo(Boolean value) {
            addCriterion("resume_from_pc <=", value, "resumeFromPc");
            return (Criteria) this;
        }

        public Criteria andResumeFromPcIn(List<Boolean> values) {
            addCriterion("resume_from_pc in", values, "resumeFromPc");
            return (Criteria) this;
        }

        public Criteria andResumeFromPcNotIn(List<Boolean> values) {
            addCriterion("resume_from_pc not in", values, "resumeFromPc");
            return (Criteria) this;
        }

        public Criteria andResumeFromPcBetween(Boolean value1, Boolean value2) {
            addCriterion("resume_from_pc between", value1, value2, "resumeFromPc");
            return (Criteria) this;
        }

        public Criteria andResumeFromPcNotBetween(Boolean value1, Boolean value2) {
            addCriterion("resume_from_pc not between", value1, value2, "resumeFromPc");
            return (Criteria) this;
        }

        public Criteria andDefIsNull() {
            addCriterion("def is null");
            return (Criteria) this;
        }

        public Criteria andDefIsNotNull() {
            addCriterion("def is not null");
            return (Criteria) this;
        }

        public Criteria andDefEqualTo(Boolean value) {
            addCriterion("def =", value, "def");
            return (Criteria) this;
        }

        public Criteria andDefNotEqualTo(Boolean value) {
            addCriterion("def <>", value, "def");
            return (Criteria) this;
        }

        public Criteria andDefGreaterThan(Boolean value) {
            addCriterion("def >", value, "def");
            return (Criteria) this;
        }

        public Criteria andDefGreaterThanOrEqualTo(Boolean value) {
            addCriterion("def >=", value, "def");
            return (Criteria) this;
        }

        public Criteria andDefLessThan(Boolean value) {
            addCriterion("def <", value, "def");
            return (Criteria) this;
        }

        public Criteria andDefLessThanOrEqualTo(Boolean value) {
            addCriterion("def <=", value, "def");
            return (Criteria) this;
        }

        public Criteria andDefIn(List<Boolean> values) {
            addCriterion("def in", values, "def");
            return (Criteria) this;
        }

        public Criteria andDefNotIn(List<Boolean> values) {
            addCriterion("def not in", values, "def");
            return (Criteria) this;
        }

        public Criteria andDefBetween(Boolean value1, Boolean value2) {
            addCriterion("def between", value1, value2, "def");
            return (Criteria) this;
        }

        public Criteria andDefNotBetween(Boolean value1, Boolean value2) {
            addCriterion("def not between", value1, value2, "def");
            return (Criteria) this;
        }

        public Criteria andMobileAuditIsNull() {
            addCriterion("mobile_audit is null");
            return (Criteria) this;
        }

        public Criteria andMobileAuditIsNotNull() {
            addCriterion("mobile_audit is not null");
            return (Criteria) this;
        }

        public Criteria andMobileAuditEqualTo(Boolean value) {
            addCriterion("mobile_audit =", value, "mobileAudit");
            return (Criteria) this;
        }

        public Criteria andMobileAuditNotEqualTo(Boolean value) {
            addCriterion("mobile_audit <>", value, "mobileAudit");
            return (Criteria) this;
        }

        public Criteria andMobileAuditGreaterThan(Boolean value) {
            addCriterion("mobile_audit >", value, "mobileAudit");
            return (Criteria) this;
        }

        public Criteria andMobileAuditGreaterThanOrEqualTo(Boolean value) {
            addCriterion("mobile_audit >=", value, "mobileAudit");
            return (Criteria) this;
        }

        public Criteria andMobileAuditLessThan(Boolean value) {
            addCriterion("mobile_audit <", value, "mobileAudit");
            return (Criteria) this;
        }

        public Criteria andMobileAuditLessThanOrEqualTo(Boolean value) {
            addCriterion("mobile_audit <=", value, "mobileAudit");
            return (Criteria) this;
        }

        public Criteria andMobileAuditIn(List<Boolean> values) {
            addCriterion("mobile_audit in", values, "mobileAudit");
            return (Criteria) this;
        }

        public Criteria andMobileAuditNotIn(List<Boolean> values) {
            addCriterion("mobile_audit not in", values, "mobileAudit");
            return (Criteria) this;
        }

        public Criteria andMobileAuditBetween(Boolean value1, Boolean value2) {
            addCriterion("mobile_audit between", value1, value2, "mobileAudit");
            return (Criteria) this;
        }

        public Criteria andMobileAuditNotBetween(Boolean value1, Boolean value2) {
            addCriterion("mobile_audit not between", value1, value2, "mobileAudit");
            return (Criteria) this;
        }

        public Criteria andSubsiteIdIsNull() {
            addCriterion("subsite_id is null");
            return (Criteria) this;
        }

        public Criteria andSubsiteIdIsNotNull() {
            addCriterion("subsite_id is not null");
            return (Criteria) this;
        }

        public Criteria andSubsiteIdEqualTo(Integer value) {
            addCriterion("subsite_id =", value, "subsiteId");
            return (Criteria) this;
        }

        public Criteria andSubsiteIdNotEqualTo(Integer value) {
            addCriterion("subsite_id <>", value, "subsiteId");
            return (Criteria) this;
        }

        public Criteria andSubsiteIdGreaterThan(Integer value) {
            addCriterion("subsite_id >", value, "subsiteId");
            return (Criteria) this;
        }

        public Criteria andSubsiteIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("subsite_id >=", value, "subsiteId");
            return (Criteria) this;
        }

        public Criteria andSubsiteIdLessThan(Integer value) {
            addCriterion("subsite_id <", value, "subsiteId");
            return (Criteria) this;
        }

        public Criteria andSubsiteIdLessThanOrEqualTo(Integer value) {
            addCriterion("subsite_id <=", value, "subsiteId");
            return (Criteria) this;
        }

        public Criteria andSubsiteIdIn(List<Integer> values) {
            addCriterion("subsite_id in", values, "subsiteId");
            return (Criteria) this;
        }

        public Criteria andSubsiteIdNotIn(List<Integer> values) {
            addCriterion("subsite_id not in", values, "subsiteId");
            return (Criteria) this;
        }

        public Criteria andSubsiteIdBetween(Integer value1, Integer value2) {
            addCriterion("subsite_id between", value1, value2, "subsiteId");
            return (Criteria) this;
        }

        public Criteria andSubsiteIdNotBetween(Integer value1, Integer value2) {
            addCriterion("subsite_id not between", value1, value2, "subsiteId");
            return (Criteria) this;
        }

        public Criteria andAutoRefreshIsNull() {
            addCriterion("auto_refresh is null");
            return (Criteria) this;
        }

        public Criteria andAutoRefreshIsNotNull() {
            addCriterion("auto_refresh is not null");
            return (Criteria) this;
        }

        public Criteria andAutoRefreshEqualTo(Byte value) {
            addCriterion("auto_refresh =", value, "autoRefresh");
            return (Criteria) this;
        }

        public Criteria andAutoRefreshNotEqualTo(Byte value) {
            addCriterion("auto_refresh <>", value, "autoRefresh");
            return (Criteria) this;
        }

        public Criteria andAutoRefreshGreaterThan(Byte value) {
            addCriterion("auto_refresh >", value, "autoRefresh");
            return (Criteria) this;
        }

        public Criteria andAutoRefreshGreaterThanOrEqualTo(Byte value) {
            addCriterion("auto_refresh >=", value, "autoRefresh");
            return (Criteria) this;
        }

        public Criteria andAutoRefreshLessThan(Byte value) {
            addCriterion("auto_refresh <", value, "autoRefresh");
            return (Criteria) this;
        }

        public Criteria andAutoRefreshLessThanOrEqualTo(Byte value) {
            addCriterion("auto_refresh <=", value, "autoRefresh");
            return (Criteria) this;
        }

        public Criteria andAutoRefreshIn(List<Byte> values) {
            addCriterion("auto_refresh in", values, "autoRefresh");
            return (Criteria) this;
        }

        public Criteria andAutoRefreshNotIn(List<Byte> values) {
            addCriterion("auto_refresh not in", values, "autoRefresh");
            return (Criteria) this;
        }

        public Criteria andAutoRefreshBetween(Byte value1, Byte value2) {
            addCriterion("auto_refresh between", value1, value2, "autoRefresh");
            return (Criteria) this;
        }

        public Criteria andAutoRefreshNotBetween(Byte value1, Byte value2) {
            addCriterion("auto_refresh not between", value1, value2, "autoRefresh");
            return (Criteria) this;
        }

        public Criteria andAutoApplyIsNull() {
            addCriterion("auto_apply is null");
            return (Criteria) this;
        }

        public Criteria andAutoApplyIsNotNull() {
            addCriterion("auto_apply is not null");
            return (Criteria) this;
        }

        public Criteria andAutoApplyEqualTo(Byte value) {
            addCriterion("auto_apply =", value, "autoApply");
            return (Criteria) this;
        }

        public Criteria andAutoApplyNotEqualTo(Byte value) {
            addCriterion("auto_apply <>", value, "autoApply");
            return (Criteria) this;
        }

        public Criteria andAutoApplyGreaterThan(Byte value) {
            addCriterion("auto_apply >", value, "autoApply");
            return (Criteria) this;
        }

        public Criteria andAutoApplyGreaterThanOrEqualTo(Byte value) {
            addCriterion("auto_apply >=", value, "autoApply");
            return (Criteria) this;
        }

        public Criteria andAutoApplyLessThan(Byte value) {
            addCriterion("auto_apply <", value, "autoApply");
            return (Criteria) this;
        }

        public Criteria andAutoApplyLessThanOrEqualTo(Byte value) {
            addCriterion("auto_apply <=", value, "autoApply");
            return (Criteria) this;
        }

        public Criteria andAutoApplyIn(List<Byte> values) {
            addCriterion("auto_apply in", values, "autoApply");
            return (Criteria) this;
        }

        public Criteria andAutoApplyNotIn(List<Byte> values) {
            addCriterion("auto_apply not in", values, "autoApply");
            return (Criteria) this;
        }

        public Criteria andAutoApplyBetween(Byte value1, Byte value2) {
            addCriterion("auto_apply between", value1, value2, "autoApply");
            return (Criteria) this;
        }

        public Criteria andAutoApplyNotBetween(Byte value1, Byte value2) {
            addCriterion("auto_apply not between", value1, value2, "autoApply");
            return (Criteria) this;
        }

        public Criteria andCommentContentIsNull() {
            addCriterion("comment_content is null");
            return (Criteria) this;
        }

        public Criteria andCommentContentIsNotNull() {
            addCriterion("comment_content is not null");
            return (Criteria) this;
        }

        public Criteria andCommentContentEqualTo(String value) {
            addCriterion("comment_content =", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentNotEqualTo(String value) {
            addCriterion("comment_content <>", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentGreaterThan(String value) {
            addCriterion("comment_content >", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentGreaterThanOrEqualTo(String value) {
            addCriterion("comment_content >=", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentLessThan(String value) {
            addCriterion("comment_content <", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentLessThanOrEqualTo(String value) {
            addCriterion("comment_content <=", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentLike(String value) {
            addCriterion("comment_content like", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentNotLike(String value) {
            addCriterion("comment_content not like", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentIn(List<String> values) {
            addCriterion("comment_content in", values, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentNotIn(List<String> values) {
            addCriterion("comment_content not in", values, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentBetween(String value1, String value2) {
            addCriterion("comment_content between", value1, value2, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentNotBetween(String value1, String value2) {
            addCriterion("comment_content not between", value1, value2, "commentContent");
            return (Criteria) this;
        }

        public Criteria andTalentIsNull() {
            addCriterion("talent is null");
            return (Criteria) this;
        }

        public Criteria andTalentIsNotNull() {
            addCriterion("talent is not null");
            return (Criteria) this;
        }

        public Criteria andTalentEqualTo(Boolean value) {
            addCriterion("talent =", value, "talent");
            return (Criteria) this;
        }

        public Criteria andTalentNotEqualTo(Boolean value) {
            addCriterion("talent <>", value, "talent");
            return (Criteria) this;
        }

        public Criteria andTalentGreaterThan(Boolean value) {
            addCriterion("talent >", value, "talent");
            return (Criteria) this;
        }

        public Criteria andTalentGreaterThanOrEqualTo(Boolean value) {
            addCriterion("talent >=", value, "talent");
            return (Criteria) this;
        }

        public Criteria andTalentLessThan(Boolean value) {
            addCriterion("talent <", value, "talent");
            return (Criteria) this;
        }

        public Criteria andTalentLessThanOrEqualTo(Boolean value) {
            addCriterion("talent <=", value, "talent");
            return (Criteria) this;
        }

        public Criteria andTalentIn(List<Boolean> values) {
            addCriterion("talent in", values, "talent");
            return (Criteria) this;
        }

        public Criteria andTalentNotIn(List<Boolean> values) {
            addCriterion("talent not in", values, "talent");
            return (Criteria) this;
        }

        public Criteria andTalentBetween(Boolean value1, Boolean value2) {
            addCriterion("talent between", value1, value2, "talent");
            return (Criteria) this;
        }

        public Criteria andTalentNotBetween(Boolean value1, Boolean value2) {
            addCriterion("talent not between", value1, value2, "talent");
            return (Criteria) this;
        }

        public Criteria andIsQuickIsNull() {
            addCriterion("is_quick is null");
            return (Criteria) this;
        }

        public Criteria andIsQuickIsNotNull() {
            addCriterion("is_quick is not null");
            return (Criteria) this;
        }

        public Criteria andIsQuickEqualTo(Boolean value) {
            addCriterion("is_quick =", value, "isQuick");
            return (Criteria) this;
        }

        public Criteria andIsQuickNotEqualTo(Boolean value) {
            addCriterion("is_quick <>", value, "isQuick");
            return (Criteria) this;
        }

        public Criteria andIsQuickGreaterThan(Boolean value) {
            addCriterion("is_quick >", value, "isQuick");
            return (Criteria) this;
        }

        public Criteria andIsQuickGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_quick >=", value, "isQuick");
            return (Criteria) this;
        }

        public Criteria andIsQuickLessThan(Boolean value) {
            addCriterion("is_quick <", value, "isQuick");
            return (Criteria) this;
        }

        public Criteria andIsQuickLessThanOrEqualTo(Boolean value) {
            addCriterion("is_quick <=", value, "isQuick");
            return (Criteria) this;
        }

        public Criteria andIsQuickIn(List<Boolean> values) {
            addCriterion("is_quick in", values, "isQuick");
            return (Criteria) this;
        }

        public Criteria andIsQuickNotIn(List<Boolean> values) {
            addCriterion("is_quick not in", values, "isQuick");
            return (Criteria) this;
        }

        public Criteria andIsQuickBetween(Boolean value1, Boolean value2) {
            addCriterion("is_quick between", value1, value2, "isQuick");
            return (Criteria) this;
        }

        public Criteria andIsQuickNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_quick not between", value1, value2, "isQuick");
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