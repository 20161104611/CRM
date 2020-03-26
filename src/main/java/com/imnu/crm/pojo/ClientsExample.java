package com.imnu.crm.pojo;

import java.util.ArrayList;
import java.util.List;

public class ClientsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClientsExample() {
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

        public Criteria andKhgongsiIsNull() {
            addCriterion("khgongsi is null");
            return (Criteria) this;
        }

        public Criteria andKhgongsiIsNotNull() {
            addCriterion("khgongsi is not null");
            return (Criteria) this;
        }

        public Criteria andKhgongsiEqualTo(String value) {
            addCriterion("khgongsi =", value, "khgongsi");
            return (Criteria) this;
        }

        public Criteria andKhgongsiNotEqualTo(String value) {
            addCriterion("khgongsi <>", value, "khgongsi");
            return (Criteria) this;
        }

        public Criteria andKhgongsiGreaterThan(String value) {
            addCriterion("khgongsi >", value, "khgongsi");
            return (Criteria) this;
        }

        public Criteria andKhgongsiGreaterThanOrEqualTo(String value) {
            addCriterion("khgongsi >=", value, "khgongsi");
            return (Criteria) this;
        }

        public Criteria andKhgongsiLessThan(String value) {
            addCriterion("khgongsi <", value, "khgongsi");
            return (Criteria) this;
        }

        public Criteria andKhgongsiLessThanOrEqualTo(String value) {
            addCriterion("khgongsi <=", value, "khgongsi");
            return (Criteria) this;
        }

        public Criteria andKhgongsiLike(String value) {
            addCriterion("khgongsi like", value, "khgongsi");
            return (Criteria) this;
        }

        public Criteria andKhgongsiNotLike(String value) {
            addCriterion("khgongsi not like", value, "khgongsi");
            return (Criteria) this;
        }

        public Criteria andKhgongsiIn(List<String> values) {
            addCriterion("khgongsi in", values, "khgongsi");
            return (Criteria) this;
        }

        public Criteria andKhgongsiNotIn(List<String> values) {
            addCriterion("khgongsi not in", values, "khgongsi");
            return (Criteria) this;
        }

        public Criteria andKhgongsiBetween(String value1, String value2) {
            addCriterion("khgongsi between", value1, value2, "khgongsi");
            return (Criteria) this;
        }

        public Criteria andKhgongsiNotBetween(String value1, String value2) {
            addCriterion("khgongsi not between", value1, value2, "khgongsi");
            return (Criteria) this;
        }

        public Criteria andKhhangyIsNull() {
            addCriterion("khhangy is null");
            return (Criteria) this;
        }

        public Criteria andKhhangyIsNotNull() {
            addCriterion("khhangy is not null");
            return (Criteria) this;
        }

        public Criteria andKhhangyEqualTo(String value) {
            addCriterion("khhangy =", value, "khhangy");
            return (Criteria) this;
        }

        public Criteria andKhhangyNotEqualTo(String value) {
            addCriterion("khhangy <>", value, "khhangy");
            return (Criteria) this;
        }

        public Criteria andKhhangyGreaterThan(String value) {
            addCriterion("khhangy >", value, "khhangy");
            return (Criteria) this;
        }

        public Criteria andKhhangyGreaterThanOrEqualTo(String value) {
            addCriterion("khhangy >=", value, "khhangy");
            return (Criteria) this;
        }

        public Criteria andKhhangyLessThan(String value) {
            addCriterion("khhangy <", value, "khhangy");
            return (Criteria) this;
        }

        public Criteria andKhhangyLessThanOrEqualTo(String value) {
            addCriterion("khhangy <=", value, "khhangy");
            return (Criteria) this;
        }

        public Criteria andKhhangyLike(String value) {
            addCriterion("khhangy like", value, "khhangy");
            return (Criteria) this;
        }

        public Criteria andKhhangyNotLike(String value) {
            addCriterion("khhangy not like", value, "khhangy");
            return (Criteria) this;
        }

        public Criteria andKhhangyIn(List<String> values) {
            addCriterion("khhangy in", values, "khhangy");
            return (Criteria) this;
        }

        public Criteria andKhhangyNotIn(List<String> values) {
            addCriterion("khhangy not in", values, "khhangy");
            return (Criteria) this;
        }

        public Criteria andKhhangyBetween(String value1, String value2) {
            addCriterion("khhangy between", value1, value2, "khhangy");
            return (Criteria) this;
        }

        public Criteria andKhhangyNotBetween(String value1, String value2) {
            addCriterion("khhangy not between", value1, value2, "khhangy");
            return (Criteria) this;
        }

        public Criteria andKhusuoyrIsNull() {
            addCriterion("khusuoyr is null");
            return (Criteria) this;
        }

        public Criteria andKhusuoyrIsNotNull() {
            addCriterion("khusuoyr is not null");
            return (Criteria) this;
        }

        public Criteria andKhusuoyrEqualTo(String value) {
            addCriterion("khusuoyr =", value, "khusuoyr");
            return (Criteria) this;
        }

        public Criteria andKhusuoyrNotEqualTo(String value) {
            addCriterion("khusuoyr <>", value, "khusuoyr");
            return (Criteria) this;
        }

        public Criteria andKhusuoyrGreaterThan(String value) {
            addCriterion("khusuoyr >", value, "khusuoyr");
            return (Criteria) this;
        }

        public Criteria andKhusuoyrGreaterThanOrEqualTo(String value) {
            addCriterion("khusuoyr >=", value, "khusuoyr");
            return (Criteria) this;
        }

        public Criteria andKhusuoyrLessThan(String value) {
            addCriterion("khusuoyr <", value, "khusuoyr");
            return (Criteria) this;
        }

        public Criteria andKhusuoyrLessThanOrEqualTo(String value) {
            addCriterion("khusuoyr <=", value, "khusuoyr");
            return (Criteria) this;
        }

        public Criteria andKhusuoyrLike(String value) {
            addCriterion("khusuoyr like", value, "khusuoyr");
            return (Criteria) this;
        }

        public Criteria andKhusuoyrNotLike(String value) {
            addCriterion("khusuoyr not like", value, "khusuoyr");
            return (Criteria) this;
        }

        public Criteria andKhusuoyrIn(List<String> values) {
            addCriterion("khusuoyr in", values, "khusuoyr");
            return (Criteria) this;
        }

        public Criteria andKhusuoyrNotIn(List<String> values) {
            addCriterion("khusuoyr not in", values, "khusuoyr");
            return (Criteria) this;
        }

        public Criteria andKhusuoyrBetween(String value1, String value2) {
            addCriterion("khusuoyr between", value1, value2, "khusuoyr");
            return (Criteria) this;
        }

        public Criteria andKhusuoyrNotBetween(String value1, String value2) {
            addCriterion("khusuoyr not between", value1, value2, "khusuoyr");
            return (Criteria) this;
        }

        public Criteria andKehuztaiIsNull() {
            addCriterion("kehuztai is null");
            return (Criteria) this;
        }

        public Criteria andKehuztaiIsNotNull() {
            addCriterion("kehuztai is not null");
            return (Criteria) this;
        }

        public Criteria andKehuztaiEqualTo(String value) {
            addCriterion("kehuztai =", value, "kehuztai");
            return (Criteria) this;
        }

        public Criteria andKehuztaiNotEqualTo(String value) {
            addCriterion("kehuztai <>", value, "kehuztai");
            return (Criteria) this;
        }

        public Criteria andKehuztaiGreaterThan(String value) {
            addCriterion("kehuztai >", value, "kehuztai");
            return (Criteria) this;
        }

        public Criteria andKehuztaiGreaterThanOrEqualTo(String value) {
            addCriterion("kehuztai >=", value, "kehuztai");
            return (Criteria) this;
        }

        public Criteria andKehuztaiLessThan(String value) {
            addCriterion("kehuztai <", value, "kehuztai");
            return (Criteria) this;
        }

        public Criteria andKehuztaiLessThanOrEqualTo(String value) {
            addCriterion("kehuztai <=", value, "kehuztai");
            return (Criteria) this;
        }

        public Criteria andKehuztaiLike(String value) {
            addCriterion("kehuztai like", value, "kehuztai");
            return (Criteria) this;
        }

        public Criteria andKehuztaiNotLike(String value) {
            addCriterion("kehuztai not like", value, "kehuztai");
            return (Criteria) this;
        }

        public Criteria andKehuztaiIn(List<String> values) {
            addCriterion("kehuztai in", values, "kehuztai");
            return (Criteria) this;
        }

        public Criteria andKehuztaiNotIn(List<String> values) {
            addCriterion("kehuztai not in", values, "kehuztai");
            return (Criteria) this;
        }

        public Criteria andKehuztaiBetween(String value1, String value2) {
            addCriterion("kehuztai between", value1, value2, "kehuztai");
            return (Criteria) this;
        }

        public Criteria andKehuztaiNotBetween(String value1, String value2) {
            addCriterion("kehuztai not between", value1, value2, "kehuztai");
            return (Criteria) this;
        }

        public Criteria andKehuzhiwIsNull() {
            addCriterion("kehuzhiw is null");
            return (Criteria) this;
        }

        public Criteria andKehuzhiwIsNotNull() {
            addCriterion("kehuzhiw is not null");
            return (Criteria) this;
        }

        public Criteria andKehuzhiwEqualTo(String value) {
            addCriterion("kehuzhiw =", value, "kehuzhiw");
            return (Criteria) this;
        }

        public Criteria andKehuzhiwNotEqualTo(String value) {
            addCriterion("kehuzhiw <>", value, "kehuzhiw");
            return (Criteria) this;
        }

        public Criteria andKehuzhiwGreaterThan(String value) {
            addCriterion("kehuzhiw >", value, "kehuzhiw");
            return (Criteria) this;
        }

        public Criteria andKehuzhiwGreaterThanOrEqualTo(String value) {
            addCriterion("kehuzhiw >=", value, "kehuzhiw");
            return (Criteria) this;
        }

        public Criteria andKehuzhiwLessThan(String value) {
            addCriterion("kehuzhiw <", value, "kehuzhiw");
            return (Criteria) this;
        }

        public Criteria andKehuzhiwLessThanOrEqualTo(String value) {
            addCriterion("kehuzhiw <=", value, "kehuzhiw");
            return (Criteria) this;
        }

        public Criteria andKehuzhiwLike(String value) {
            addCriterion("kehuzhiw like", value, "kehuzhiw");
            return (Criteria) this;
        }

        public Criteria andKehuzhiwNotLike(String value) {
            addCriterion("kehuzhiw not like", value, "kehuzhiw");
            return (Criteria) this;
        }

        public Criteria andKehuzhiwIn(List<String> values) {
            addCriterion("kehuzhiw in", values, "kehuzhiw");
            return (Criteria) this;
        }

        public Criteria andKehuzhiwNotIn(List<String> values) {
            addCriterion("kehuzhiw not in", values, "kehuzhiw");
            return (Criteria) this;
        }

        public Criteria andKehuzhiwBetween(String value1, String value2) {
            addCriterion("kehuzhiw between", value1, value2, "kehuzhiw");
            return (Criteria) this;
        }

        public Criteria andKehuzhiwNotBetween(String value1, String value2) {
            addCriterion("kehuzhiw not between", value1, value2, "kehuzhiw");
            return (Criteria) this;
        }

        public Criteria andKehusjihIsNull() {
            addCriterion("kehusjih is null");
            return (Criteria) this;
        }

        public Criteria andKehusjihIsNotNull() {
            addCriterion("kehusjih is not null");
            return (Criteria) this;
        }

        public Criteria andKehusjihEqualTo(String value) {
            addCriterion("kehusjih =", value, "kehusjih");
            return (Criteria) this;
        }

        public Criteria andKehusjihNotEqualTo(String value) {
            addCriterion("kehusjih <>", value, "kehusjih");
            return (Criteria) this;
        }

        public Criteria andKehusjihGreaterThan(String value) {
            addCriterion("kehusjih >", value, "kehusjih");
            return (Criteria) this;
        }

        public Criteria andKehusjihGreaterThanOrEqualTo(String value) {
            addCriterion("kehusjih >=", value, "kehusjih");
            return (Criteria) this;
        }

        public Criteria andKehusjihLessThan(String value) {
            addCriterion("kehusjih <", value, "kehusjih");
            return (Criteria) this;
        }

        public Criteria andKehusjihLessThanOrEqualTo(String value) {
            addCriterion("kehusjih <=", value, "kehusjih");
            return (Criteria) this;
        }

        public Criteria andKehusjihLike(String value) {
            addCriterion("kehusjih like", value, "kehusjih");
            return (Criteria) this;
        }

        public Criteria andKehusjihNotLike(String value) {
            addCriterion("kehusjih not like", value, "kehusjih");
            return (Criteria) this;
        }

        public Criteria andKehusjihIn(List<String> values) {
            addCriterion("kehusjih in", values, "kehusjih");
            return (Criteria) this;
        }

        public Criteria andKehusjihNotIn(List<String> values) {
            addCriterion("kehusjih not in", values, "kehusjih");
            return (Criteria) this;
        }

        public Criteria andKehusjihBetween(String value1, String value2) {
            addCriterion("kehusjih between", value1, value2, "kehusjih");
            return (Criteria) this;
        }

        public Criteria andKehusjihNotBetween(String value1, String value2) {
            addCriterion("kehusjih not between", value1, value2, "kehusjih");
            return (Criteria) this;
        }

        public Criteria andKehemailIsNull() {
            addCriterion("kehemail is null");
            return (Criteria) this;
        }

        public Criteria andKehemailIsNotNull() {
            addCriterion("kehemail is not null");
            return (Criteria) this;
        }

        public Criteria andKehemailEqualTo(String value) {
            addCriterion("kehemail =", value, "kehemail");
            return (Criteria) this;
        }

        public Criteria andKehemailNotEqualTo(String value) {
            addCriterion("kehemail <>", value, "kehemail");
            return (Criteria) this;
        }

        public Criteria andKehemailGreaterThan(String value) {
            addCriterion("kehemail >", value, "kehemail");
            return (Criteria) this;
        }

        public Criteria andKehemailGreaterThanOrEqualTo(String value) {
            addCriterion("kehemail >=", value, "kehemail");
            return (Criteria) this;
        }

        public Criteria andKehemailLessThan(String value) {
            addCriterion("kehemail <", value, "kehemail");
            return (Criteria) this;
        }

        public Criteria andKehemailLessThanOrEqualTo(String value) {
            addCriterion("kehemail <=", value, "kehemail");
            return (Criteria) this;
        }

        public Criteria andKehemailLike(String value) {
            addCriterion("kehemail like", value, "kehemail");
            return (Criteria) this;
        }

        public Criteria andKehemailNotLike(String value) {
            addCriterion("kehemail not like", value, "kehemail");
            return (Criteria) this;
        }

        public Criteria andKehemailIn(List<String> values) {
            addCriterion("kehemail in", values, "kehemail");
            return (Criteria) this;
        }

        public Criteria andKehemailNotIn(List<String> values) {
            addCriterion("kehemail not in", values, "kehemail");
            return (Criteria) this;
        }

        public Criteria andKehemailBetween(String value1, String value2) {
            addCriterion("kehemail between", value1, value2, "kehemail");
            return (Criteria) this;
        }

        public Criteria andKehemailNotBetween(String value1, String value2) {
            addCriterion("kehemail not between", value1, value2, "kehemail");
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