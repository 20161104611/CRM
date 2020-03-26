package com.imnu.crm.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ContractExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ContractExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andUNameIsNull() {
            addCriterion("u_name is null");
            return (Criteria) this;
        }

        public Criteria andUNameIsNotNull() {
            addCriterion("u_name is not null");
            return (Criteria) this;
        }

        public Criteria andUNameEqualTo(String value) {
            addCriterion("u_name =", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotEqualTo(String value) {
            addCriterion("u_name <>", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameGreaterThan(String value) {
            addCriterion("u_name >", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameGreaterThanOrEqualTo(String value) {
            addCriterion("u_name >=", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLessThan(String value) {
            addCriterion("u_name <", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLessThanOrEqualTo(String value) {
            addCriterion("u_name <=", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLike(String value) {
            addCriterion("u_name like", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotLike(String value) {
            addCriterion("u_name not like", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameIn(List<String> values) {
            addCriterion("u_name in", values, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotIn(List<String> values) {
            addCriterion("u_name not in", values, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameBetween(String value1, String value2) {
            addCriterion("u_name between", value1, value2, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotBetween(String value1, String value2) {
            addCriterion("u_name not between", value1, value2, "uName");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterionForJDBCDate("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterionForJDBCDate("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterionForJDBCDate("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterionForJDBCDate("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andLDateIsNull() {
            addCriterion("l_date is null");
            return (Criteria) this;
        }

        public Criteria andLDateIsNotNull() {
            addCriterion("l_date is not null");
            return (Criteria) this;
        }

        public Criteria andLDateEqualTo(Date value) {
            addCriterionForJDBCDate("l_date =", value, "lDate");
            return (Criteria) this;
        }

        public Criteria andLDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("l_date <>", value, "lDate");
            return (Criteria) this;
        }

        public Criteria andLDateGreaterThan(Date value) {
            addCriterionForJDBCDate("l_date >", value, "lDate");
            return (Criteria) this;
        }

        public Criteria andLDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("l_date >=", value, "lDate");
            return (Criteria) this;
        }

        public Criteria andLDateLessThan(Date value) {
            addCriterionForJDBCDate("l_date <", value, "lDate");
            return (Criteria) this;
        }

        public Criteria andLDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("l_date <=", value, "lDate");
            return (Criteria) this;
        }

        public Criteria andLDateIn(List<Date> values) {
            addCriterionForJDBCDate("l_date in", values, "lDate");
            return (Criteria) this;
        }

        public Criteria andLDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("l_date not in", values, "lDate");
            return (Criteria) this;
        }

        public Criteria andLDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("l_date between", value1, value2, "lDate");
            return (Criteria) this;
        }

        public Criteria andLDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("l_date not between", value1, value2, "lDate");
            return (Criteria) this;
        }

        public Criteria andCPathIsNull() {
            addCriterion("c_path is null");
            return (Criteria) this;
        }

        public Criteria andCPathIsNotNull() {
            addCriterion("c_path is not null");
            return (Criteria) this;
        }

        public Criteria andCPathEqualTo(String value) {
            addCriterion("c_path =", value, "cPath");
            return (Criteria) this;
        }

        public Criteria andCPathNotEqualTo(String value) {
            addCriterion("c_path <>", value, "cPath");
            return (Criteria) this;
        }

        public Criteria andCPathGreaterThan(String value) {
            addCriterion("c_path >", value, "cPath");
            return (Criteria) this;
        }

        public Criteria andCPathGreaterThanOrEqualTo(String value) {
            addCriterion("c_path >=", value, "cPath");
            return (Criteria) this;
        }

        public Criteria andCPathLessThan(String value) {
            addCriterion("c_path <", value, "cPath");
            return (Criteria) this;
        }

        public Criteria andCPathLessThanOrEqualTo(String value) {
            addCriterion("c_path <=", value, "cPath");
            return (Criteria) this;
        }

        public Criteria andCPathLike(String value) {
            addCriterion("c_path like", value, "cPath");
            return (Criteria) this;
        }

        public Criteria andCPathNotLike(String value) {
            addCriterion("c_path not like", value, "cPath");
            return (Criteria) this;
        }

        public Criteria andCPathIn(List<String> values) {
            addCriterion("c_path in", values, "cPath");
            return (Criteria) this;
        }

        public Criteria andCPathNotIn(List<String> values) {
            addCriterion("c_path not in", values, "cPath");
            return (Criteria) this;
        }

        public Criteria andCPathBetween(String value1, String value2) {
            addCriterion("c_path between", value1, value2, "cPath");
            return (Criteria) this;
        }

        public Criteria andCPathNotBetween(String value1, String value2) {
            addCriterion("c_path not between", value1, value2, "cPath");
            return (Criteria) this;
        }

        public Criteria andCMoneyIsNull() {
            addCriterion("c_money is null");
            return (Criteria) this;
        }

        public Criteria andCMoneyIsNotNull() {
            addCriterion("c_money is not null");
            return (Criteria) this;
        }

        public Criteria andCMoneyEqualTo(Double value) {
            addCriterion("c_money =", value, "cMoney");
            return (Criteria) this;
        }

        public Criteria andCMoneyNotEqualTo(Double value) {
            addCriterion("c_money <>", value, "cMoney");
            return (Criteria) this;
        }

        public Criteria andCMoneyGreaterThan(Double value) {
            addCriterion("c_money >", value, "cMoney");
            return (Criteria) this;
        }

        public Criteria andCMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("c_money >=", value, "cMoney");
            return (Criteria) this;
        }

        public Criteria andCMoneyLessThan(Double value) {
            addCriterion("c_money <", value, "cMoney");
            return (Criteria) this;
        }

        public Criteria andCMoneyLessThanOrEqualTo(Double value) {
            addCriterion("c_money <=", value, "cMoney");
            return (Criteria) this;
        }

        public Criteria andCMoneyIn(List<Double> values) {
            addCriterion("c_money in", values, "cMoney");
            return (Criteria) this;
        }

        public Criteria andCMoneyNotIn(List<Double> values) {
            addCriterion("c_money not in", values, "cMoney");
            return (Criteria) this;
        }

        public Criteria andCMoneyBetween(Double value1, Double value2) {
            addCriterion("c_money between", value1, value2, "cMoney");
            return (Criteria) this;
        }

        public Criteria andCMoneyNotBetween(Double value1, Double value2) {
            addCriterion("c_money not between", value1, value2, "cMoney");
            return (Criteria) this;
        }

        public Criteria andCNameIsNull() {
            addCriterion("c_name is null");
            return (Criteria) this;
        }

        public Criteria andCNameIsNotNull() {
            addCriterion("c_name is not null");
            return (Criteria) this;
        }

        public Criteria andCNameEqualTo(String value) {
            addCriterion("c_name =", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotEqualTo(String value) {
            addCriterion("c_name <>", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameGreaterThan(String value) {
            addCriterion("c_name >", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameGreaterThanOrEqualTo(String value) {
            addCriterion("c_name >=", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLessThan(String value) {
            addCriterion("c_name <", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLessThanOrEqualTo(String value) {
            addCriterion("c_name <=", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLike(String value) {
            addCriterion("c_name like", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotLike(String value) {
            addCriterion("c_name not like", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameIn(List<String> values) {
            addCriterion("c_name in", values, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotIn(List<String> values) {
            addCriterion("c_name not in", values, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameBetween(String value1, String value2) {
            addCriterion("c_name between", value1, value2, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotBetween(String value1, String value2) {
            addCriterion("c_name not between", value1, value2, "cName");
            return (Criteria) this;
        }

        public Criteria andCLocationIsNull() {
            addCriterion("c_location is null");
            return (Criteria) this;
        }

        public Criteria andCLocationIsNotNull() {
            addCriterion("c_location is not null");
            return (Criteria) this;
        }

        public Criteria andCLocationEqualTo(String value) {
            addCriterion("c_location =", value, "cLocation");
            return (Criteria) this;
        }

        public Criteria andCLocationNotEqualTo(String value) {
            addCriterion("c_location <>", value, "cLocation");
            return (Criteria) this;
        }

        public Criteria andCLocationGreaterThan(String value) {
            addCriterion("c_location >", value, "cLocation");
            return (Criteria) this;
        }

        public Criteria andCLocationGreaterThanOrEqualTo(String value) {
            addCriterion("c_location >=", value, "cLocation");
            return (Criteria) this;
        }

        public Criteria andCLocationLessThan(String value) {
            addCriterion("c_location <", value, "cLocation");
            return (Criteria) this;
        }

        public Criteria andCLocationLessThanOrEqualTo(String value) {
            addCriterion("c_location <=", value, "cLocation");
            return (Criteria) this;
        }

        public Criteria andCLocationLike(String value) {
            addCriterion("c_location like", value, "cLocation");
            return (Criteria) this;
        }

        public Criteria andCLocationNotLike(String value) {
            addCriterion("c_location not like", value, "cLocation");
            return (Criteria) this;
        }

        public Criteria andCLocationIn(List<String> values) {
            addCriterion("c_location in", values, "cLocation");
            return (Criteria) this;
        }

        public Criteria andCLocationNotIn(List<String> values) {
            addCriterion("c_location not in", values, "cLocation");
            return (Criteria) this;
        }

        public Criteria andCLocationBetween(String value1, String value2) {
            addCriterion("c_location between", value1, value2, "cLocation");
            return (Criteria) this;
        }

        public Criteria andCLocationNotBetween(String value1, String value2) {
            addCriterion("c_location not between", value1, value2, "cLocation");
            return (Criteria) this;
        }

        public Criteria andCHtyouxqiIsNull() {
            addCriterion("c_htyouxqi is null");
            return (Criteria) this;
        }

        public Criteria andCHtyouxqiIsNotNull() {
            addCriterion("c_htyouxqi is not null");
            return (Criteria) this;
        }

        public Criteria andCHtyouxqiEqualTo(String value) {
            addCriterion("c_htyouxqi =", value, "cHtyouxqi");
            return (Criteria) this;
        }

        public Criteria andCHtyouxqiNotEqualTo(String value) {
            addCriterion("c_htyouxqi <>", value, "cHtyouxqi");
            return (Criteria) this;
        }

        public Criteria andCHtyouxqiGreaterThan(String value) {
            addCriterion("c_htyouxqi >", value, "cHtyouxqi");
            return (Criteria) this;
        }

        public Criteria andCHtyouxqiGreaterThanOrEqualTo(String value) {
            addCriterion("c_htyouxqi >=", value, "cHtyouxqi");
            return (Criteria) this;
        }

        public Criteria andCHtyouxqiLessThan(String value) {
            addCriterion("c_htyouxqi <", value, "cHtyouxqi");
            return (Criteria) this;
        }

        public Criteria andCHtyouxqiLessThanOrEqualTo(String value) {
            addCriterion("c_htyouxqi <=", value, "cHtyouxqi");
            return (Criteria) this;
        }

        public Criteria andCHtyouxqiLike(String value) {
            addCriterion("c_htyouxqi like", value, "cHtyouxqi");
            return (Criteria) this;
        }

        public Criteria andCHtyouxqiNotLike(String value) {
            addCriterion("c_htyouxqi not like", value, "cHtyouxqi");
            return (Criteria) this;
        }

        public Criteria andCHtyouxqiIn(List<String> values) {
            addCriterion("c_htyouxqi in", values, "cHtyouxqi");
            return (Criteria) this;
        }

        public Criteria andCHtyouxqiNotIn(List<String> values) {
            addCriterion("c_htyouxqi not in", values, "cHtyouxqi");
            return (Criteria) this;
        }

        public Criteria andCHtyouxqiBetween(String value1, String value2) {
            addCriterion("c_htyouxqi between", value1, value2, "cHtyouxqi");
            return (Criteria) this;
        }

        public Criteria andCHtyouxqiNotBetween(String value1, String value2) {
            addCriterion("c_htyouxqi not between", value1, value2, "cHtyouxqi");
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