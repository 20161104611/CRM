package com.imnu.crm.pojo;

import java.util.ArrayList;
import java.util.List;

public class MarketExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MarketExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("flag is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("flag is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(String value) {
            addCriterion("flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(String value) {
            addCriterion("flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(String value) {
            addCriterion("flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(String value) {
            addCriterion("flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(String value) {
            addCriterion("flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(String value) {
            addCriterion("flag <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLike(String value) {
            addCriterion("flag like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotLike(String value) {
            addCriterion("flag not like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<String> values) {
            addCriterion("flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<String> values) {
            addCriterion("flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(String value1, String value2) {
            addCriterion("flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(String value1, String value2) {
            addCriterion("flag not between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andYuqshourIsNull() {
            addCriterion("yuqshour is null");
            return (Criteria) this;
        }

        public Criteria andYuqshourIsNotNull() {
            addCriterion("yuqshour is not null");
            return (Criteria) this;
        }

        public Criteria andYuqshourEqualTo(Double value) {
            addCriterion("yuqshour =", value, "yuqshour");
            return (Criteria) this;
        }

        public Criteria andYuqshourNotEqualTo(Double value) {
            addCriterion("yuqshour <>", value, "yuqshour");
            return (Criteria) this;
        }

        public Criteria andYuqshourGreaterThan(Double value) {
            addCriterion("yuqshour >", value, "yuqshour");
            return (Criteria) this;
        }

        public Criteria andYuqshourGreaterThanOrEqualTo(Double value) {
            addCriterion("yuqshour >=", value, "yuqshour");
            return (Criteria) this;
        }

        public Criteria andYuqshourLessThan(Double value) {
            addCriterion("yuqshour <", value, "yuqshour");
            return (Criteria) this;
        }

        public Criteria andYuqshourLessThanOrEqualTo(Double value) {
            addCriterion("yuqshour <=", value, "yuqshour");
            return (Criteria) this;
        }

        public Criteria andYuqshourIn(List<Double> values) {
            addCriterion("yuqshour in", values, "yuqshour");
            return (Criteria) this;
        }

        public Criteria andYuqshourNotIn(List<Double> values) {
            addCriterion("yuqshour not in", values, "yuqshour");
            return (Criteria) this;
        }

        public Criteria andYuqshourBetween(Double value1, Double value2) {
            addCriterion("yuqshour between", value1, value2, "yuqshour");
            return (Criteria) this;
        }

        public Criteria andYuqshourNotBetween(Double value1, Double value2) {
            addCriterion("yuqshour not between", value1, value2, "yuqshour");
            return (Criteria) this;
        }

        public Criteria andYucshourIsNull() {
            addCriterion("yucshour is null");
            return (Criteria) this;
        }

        public Criteria andYucshourIsNotNull() {
            addCriterion("yucshour is not null");
            return (Criteria) this;
        }

        public Criteria andYucshourEqualTo(Double value) {
            addCriterion("yucshour =", value, "yucshour");
            return (Criteria) this;
        }

        public Criteria andYucshourNotEqualTo(Double value) {
            addCriterion("yucshour <>", value, "yucshour");
            return (Criteria) this;
        }

        public Criteria andYucshourGreaterThan(Double value) {
            addCriterion("yucshour >", value, "yucshour");
            return (Criteria) this;
        }

        public Criteria andYucshourGreaterThanOrEqualTo(Double value) {
            addCriterion("yucshour >=", value, "yucshour");
            return (Criteria) this;
        }

        public Criteria andYucshourLessThan(Double value) {
            addCriterion("yucshour <", value, "yucshour");
            return (Criteria) this;
        }

        public Criteria andYucshourLessThanOrEqualTo(Double value) {
            addCriterion("yucshour <=", value, "yucshour");
            return (Criteria) this;
        }

        public Criteria andYucshourIn(List<Double> values) {
            addCriterion("yucshour in", values, "yucshour");
            return (Criteria) this;
        }

        public Criteria andYucshourNotIn(List<Double> values) {
            addCriterion("yucshour not in", values, "yucshour");
            return (Criteria) this;
        }

        public Criteria andYucshourBetween(Double value1, Double value2) {
            addCriterion("yucshour between", value1, value2, "yucshour");
            return (Criteria) this;
        }

        public Criteria andYucshourNotBetween(Double value1, Double value2) {
            addCriterion("yucshour not between", value1, value2, "yucshour");
            return (Criteria) this;
        }

        public Criteria andShjshourIsNull() {
            addCriterion("shjshour is null");
            return (Criteria) this;
        }

        public Criteria andShjshourIsNotNull() {
            addCriterion("shjshour is not null");
            return (Criteria) this;
        }

        public Criteria andShjshourEqualTo(Double value) {
            addCriterion("shjshour =", value, "shjshour");
            return (Criteria) this;
        }

        public Criteria andShjshourNotEqualTo(Double value) {
            addCriterion("shjshour <>", value, "shjshour");
            return (Criteria) this;
        }

        public Criteria andShjshourGreaterThan(Double value) {
            addCriterion("shjshour >", value, "shjshour");
            return (Criteria) this;
        }

        public Criteria andShjshourGreaterThanOrEqualTo(Double value) {
            addCriterion("shjshour >=", value, "shjshour");
            return (Criteria) this;
        }

        public Criteria andShjshourLessThan(Double value) {
            addCriterion("shjshour <", value, "shjshour");
            return (Criteria) this;
        }

        public Criteria andShjshourLessThanOrEqualTo(Double value) {
            addCriterion("shjshour <=", value, "shjshour");
            return (Criteria) this;
        }

        public Criteria andShjshourIn(List<Double> values) {
            addCriterion("shjshour in", values, "shjshour");
            return (Criteria) this;
        }

        public Criteria andShjshourNotIn(List<Double> values) {
            addCriterion("shjshour not in", values, "shjshour");
            return (Criteria) this;
        }

        public Criteria andShjshourBetween(Double value1, Double value2) {
            addCriterion("shjshour between", value1, value2, "shjshour");
            return (Criteria) this;
        }

        public Criteria andShjshourNotBetween(Double value1, Double value2) {
            addCriterion("shjshour not between", value1, value2, "shjshour");
            return (Criteria) this;
        }

        public Criteria andPathIsNull() {
            addCriterion("path is null");
            return (Criteria) this;
        }

        public Criteria andPathIsNotNull() {
            addCriterion("path is not null");
            return (Criteria) this;
        }

        public Criteria andPathEqualTo(String value) {
            addCriterion("path =", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotEqualTo(String value) {
            addCriterion("path <>", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThan(String value) {
            addCriterion("path >", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThanOrEqualTo(String value) {
            addCriterion("path >=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThan(String value) {
            addCriterion("path <", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThanOrEqualTo(String value) {
            addCriterion("path <=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLike(String value) {
            addCriterion("path like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotLike(String value) {
            addCriterion("path not like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathIn(List<String> values) {
            addCriterion("path in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotIn(List<String> values) {
            addCriterion("path not in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathBetween(String value1, String value2) {
            addCriterion("path between", value1, value2, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotBetween(String value1, String value2) {
            addCriterion("path not between", value1, value2, "path");
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