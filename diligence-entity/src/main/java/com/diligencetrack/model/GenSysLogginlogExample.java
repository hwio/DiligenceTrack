package com.diligencetrack.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GenSysLogginlogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GenSysLogginlogExample() {
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

        public Criteria andLoggtimeIsNull() {
            addCriterion("loggTime is null");
            return (Criteria) this;
        }

        public Criteria andLoggtimeIsNotNull() {
            addCriterion("loggTime is not null");
            return (Criteria) this;
        }

        public Criteria andLoggtimeEqualTo(Date value) {
            addCriterion("loggTime =", value, "loggtime");
            return (Criteria) this;
        }

        public Criteria andLoggtimeNotEqualTo(Date value) {
            addCriterion("loggTime <>", value, "loggtime");
            return (Criteria) this;
        }

        public Criteria andLoggtimeGreaterThan(Date value) {
            addCriterion("loggTime >", value, "loggtime");
            return (Criteria) this;
        }

        public Criteria andLoggtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("loggTime >=", value, "loggtime");
            return (Criteria) this;
        }

        public Criteria andLoggtimeLessThan(Date value) {
            addCriterion("loggTime <", value, "loggtime");
            return (Criteria) this;
        }

        public Criteria andLoggtimeLessThanOrEqualTo(Date value) {
            addCriterion("loggTime <=", value, "loggtime");
            return (Criteria) this;
        }

        public Criteria andLoggtimeIn(List<Date> values) {
            addCriterion("loggTime in", values, "loggtime");
            return (Criteria) this;
        }

        public Criteria andLoggtimeNotIn(List<Date> values) {
            addCriterion("loggTime not in", values, "loggtime");
            return (Criteria) this;
        }

        public Criteria andLoggtimeBetween(Date value1, Date value2) {
            addCriterion("loggTime between", value1, value2, "loggtime");
            return (Criteria) this;
        }

        public Criteria andLoggtimeNotBetween(Date value1, Date value2) {
            addCriterion("loggTime not between", value1, value2, "loggtime");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andLoghoursIsNull() {
            addCriterion("logHours is null");
            return (Criteria) this;
        }

        public Criteria andLoghoursIsNotNull() {
            addCriterion("logHours is not null");
            return (Criteria) this;
        }

        public Criteria andLoghoursEqualTo(Date value) {
            addCriterion("logHours =", value, "loghours");
            return (Criteria) this;
        }

        public Criteria andLoghoursNotEqualTo(Date value) {
            addCriterion("logHours <>", value, "loghours");
            return (Criteria) this;
        }

        public Criteria andLoghoursGreaterThan(Date value) {
            addCriterion("logHours >", value, "loghours");
            return (Criteria) this;
        }

        public Criteria andLoghoursGreaterThanOrEqualTo(Date value) {
            addCriterion("logHours >=", value, "loghours");
            return (Criteria) this;
        }

        public Criteria andLoghoursLessThan(Date value) {
            addCriterion("logHours <", value, "loghours");
            return (Criteria) this;
        }

        public Criteria andLoghoursLessThanOrEqualTo(Date value) {
            addCriterion("logHours <=", value, "loghours");
            return (Criteria) this;
        }

        public Criteria andLoghoursIn(List<Date> values) {
            addCriterion("logHours in", values, "loghours");
            return (Criteria) this;
        }

        public Criteria andLoghoursNotIn(List<Date> values) {
            addCriterion("logHours not in", values, "loghours");
            return (Criteria) this;
        }

        public Criteria andLoghoursBetween(Date value1, Date value2) {
            addCriterion("logHours between", value1, value2, "loghours");
            return (Criteria) this;
        }

        public Criteria andLoghoursNotBetween(Date value1, Date value2) {
            addCriterion("logHours not between", value1, value2, "loghours");
            return (Criteria) this;
        }

        public Criteria andLogminsIsNull() {
            addCriterion("logMIns is null");
            return (Criteria) this;
        }

        public Criteria andLogminsIsNotNull() {
            addCriterion("logMIns is not null");
            return (Criteria) this;
        }

        public Criteria andLogminsEqualTo(Date value) {
            addCriterion("logMIns =", value, "logmins");
            return (Criteria) this;
        }

        public Criteria andLogminsNotEqualTo(Date value) {
            addCriterion("logMIns <>", value, "logmins");
            return (Criteria) this;
        }

        public Criteria andLogminsGreaterThan(Date value) {
            addCriterion("logMIns >", value, "logmins");
            return (Criteria) this;
        }

        public Criteria andLogminsGreaterThanOrEqualTo(Date value) {
            addCriterion("logMIns >=", value, "logmins");
            return (Criteria) this;
        }

        public Criteria andLogminsLessThan(Date value) {
            addCriterion("logMIns <", value, "logmins");
            return (Criteria) this;
        }

        public Criteria andLogminsLessThanOrEqualTo(Date value) {
            addCriterion("logMIns <=", value, "logmins");
            return (Criteria) this;
        }

        public Criteria andLogminsIn(List<Date> values) {
            addCriterion("logMIns in", values, "logmins");
            return (Criteria) this;
        }

        public Criteria andLogminsNotIn(List<Date> values) {
            addCriterion("logMIns not in", values, "logmins");
            return (Criteria) this;
        }

        public Criteria andLogminsBetween(Date value1, Date value2) {
            addCriterion("logMIns between", value1, value2, "logmins");
            return (Criteria) this;
        }

        public Criteria andLogminsNotBetween(Date value1, Date value2) {
            addCriterion("logMIns not between", value1, value2, "logmins");
            return (Criteria) this;
        }

        public Criteria andIpIsNull() {
            addCriterion("IP is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("IP is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("IP =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("IP <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("IP >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("IP >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("IP <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("IP <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("IP like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("IP not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("IP in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("IP not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("IP between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("IP not between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andOfflinetimeIsNull() {
            addCriterion("offlineTime is null");
            return (Criteria) this;
        }

        public Criteria andOfflinetimeIsNotNull() {
            addCriterion("offlineTime is not null");
            return (Criteria) this;
        }

        public Criteria andOfflinetimeEqualTo(Date value) {
            addCriterion("offlineTime =", value, "offlinetime");
            return (Criteria) this;
        }

        public Criteria andOfflinetimeNotEqualTo(Date value) {
            addCriterion("offlineTime <>", value, "offlinetime");
            return (Criteria) this;
        }

        public Criteria andOfflinetimeGreaterThan(Date value) {
            addCriterion("offlineTime >", value, "offlinetime");
            return (Criteria) this;
        }

        public Criteria andOfflinetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("offlineTime >=", value, "offlinetime");
            return (Criteria) this;
        }

        public Criteria andOfflinetimeLessThan(Date value) {
            addCriterion("offlineTime <", value, "offlinetime");
            return (Criteria) this;
        }

        public Criteria andOfflinetimeLessThanOrEqualTo(Date value) {
            addCriterion("offlineTime <=", value, "offlinetime");
            return (Criteria) this;
        }

        public Criteria andOfflinetimeIn(List<Date> values) {
            addCriterion("offlineTime in", values, "offlinetime");
            return (Criteria) this;
        }

        public Criteria andOfflinetimeNotIn(List<Date> values) {
            addCriterion("offlineTime not in", values, "offlinetime");
            return (Criteria) this;
        }

        public Criteria andOfflinetimeBetween(Date value1, Date value2) {
            addCriterion("offlineTime between", value1, value2, "offlinetime");
            return (Criteria) this;
        }

        public Criteria andOfflinetimeNotBetween(Date value1, Date value2) {
            addCriterion("offlineTime not between", value1, value2, "offlinetime");
            return (Criteria) this;
        }

        public Criteria andCountIsNull() {
            addCriterion("count is null");
            return (Criteria) this;
        }

        public Criteria andCountIsNotNull() {
            addCriterion("count is not null");
            return (Criteria) this;
        }

        public Criteria andCountEqualTo(Integer value) {
            addCriterion("count =", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotEqualTo(Integer value) {
            addCriterion("count <>", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThan(Integer value) {
            addCriterion("count >", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("count >=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThan(Integer value) {
            addCriterion("count <", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThanOrEqualTo(Integer value) {
            addCriterion("count <=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountIn(List<Integer> values) {
            addCriterion("count in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotIn(List<Integer> values) {
            addCriterion("count not in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountBetween(Integer value1, Integer value2) {
            addCriterion("count between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotBetween(Integer value1, Integer value2) {
            addCriterion("count not between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andMdateIsNull() {
            addCriterion("mdate is null");
            return (Criteria) this;
        }

        public Criteria andMdateIsNotNull() {
            addCriterion("mdate is not null");
            return (Criteria) this;
        }

        public Criteria andMdateEqualTo(Date value) {
            addCriterion("mdate =", value, "mdate");
            return (Criteria) this;
        }

        public Criteria andMdateNotEqualTo(Date value) {
            addCriterion("mdate <>", value, "mdate");
            return (Criteria) this;
        }

        public Criteria andMdateGreaterThan(Date value) {
            addCriterion("mdate >", value, "mdate");
            return (Criteria) this;
        }

        public Criteria andMdateGreaterThanOrEqualTo(Date value) {
            addCriterion("mdate >=", value, "mdate");
            return (Criteria) this;
        }

        public Criteria andMdateLessThan(Date value) {
            addCriterion("mdate <", value, "mdate");
            return (Criteria) this;
        }

        public Criteria andMdateLessThanOrEqualTo(Date value) {
            addCriterion("mdate <=", value, "mdate");
            return (Criteria) this;
        }

        public Criteria andMdateIn(List<Date> values) {
            addCriterion("mdate in", values, "mdate");
            return (Criteria) this;
        }

        public Criteria andMdateNotIn(List<Date> values) {
            addCriterion("mdate not in", values, "mdate");
            return (Criteria) this;
        }

        public Criteria andMdateBetween(Date value1, Date value2) {
            addCriterion("mdate between", value1, value2, "mdate");
            return (Criteria) this;
        }

        public Criteria andMdateNotBetween(Date value1, Date value2) {
            addCriterion("mdate not between", value1, value2, "mdate");
            return (Criteria) this;
        }

        public Criteria andModifierIsNull() {
            addCriterion("modifier is null");
            return (Criteria) this;
        }

        public Criteria andModifierIsNotNull() {
            addCriterion("modifier is not null");
            return (Criteria) this;
        }

        public Criteria andModifierEqualTo(String value) {
            addCriterion("modifier =", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotEqualTo(String value) {
            addCriterion("modifier <>", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThan(String value) {
            addCriterion("modifier >", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThanOrEqualTo(String value) {
            addCriterion("modifier >=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThan(String value) {
            addCriterion("modifier <", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThanOrEqualTo(String value) {
            addCriterion("modifier <=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLike(String value) {
            addCriterion("modifier like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotLike(String value) {
            addCriterion("modifier not like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierIn(List<String> values) {
            addCriterion("modifier in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotIn(List<String> values) {
            addCriterion("modifier not in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierBetween(String value1, String value2) {
            addCriterion("modifier between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotBetween(String value1, String value2) {
            addCriterion("modifier not between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andDfIsNull() {
            addCriterion("df is null");
            return (Criteria) this;
        }

        public Criteria andDfIsNotNull() {
            addCriterion("df is not null");
            return (Criteria) this;
        }

        public Criteria andDfEqualTo(Integer value) {
            addCriterion("df =", value, "df");
            return (Criteria) this;
        }

        public Criteria andDfNotEqualTo(Integer value) {
            addCriterion("df <>", value, "df");
            return (Criteria) this;
        }

        public Criteria andDfGreaterThan(Integer value) {
            addCriterion("df >", value, "df");
            return (Criteria) this;
        }

        public Criteria andDfGreaterThanOrEqualTo(Integer value) {
            addCriterion("df >=", value, "df");
            return (Criteria) this;
        }

        public Criteria andDfLessThan(Integer value) {
            addCriterion("df <", value, "df");
            return (Criteria) this;
        }

        public Criteria andDfLessThanOrEqualTo(Integer value) {
            addCriterion("df <=", value, "df");
            return (Criteria) this;
        }

        public Criteria andDfIn(List<Integer> values) {
            addCriterion("df in", values, "df");
            return (Criteria) this;
        }

        public Criteria andDfNotIn(List<Integer> values) {
            addCriterion("df not in", values, "df");
            return (Criteria) this;
        }

        public Criteria andDfBetween(Integer value1, Integer value2) {
            addCriterion("df between", value1, value2, "df");
            return (Criteria) this;
        }

        public Criteria andDfNotBetween(Integer value1, Integer value2) {
            addCriterion("df not between", value1, value2, "df");
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