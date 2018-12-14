package com.roy.model;

import java.util.ArrayList;
import java.util.List;

public class MultiSelectExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_multi_select
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_multi_select
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_multi_select
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_multi_select
     *
     * @mbg.generated
     */
    public MultiSelectExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_multi_select
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_multi_select
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_multi_select
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_multi_select
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_multi_select
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_multi_select
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_multi_select
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_multi_select
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_multi_select
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_multi_select
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_multi_select
     *
     * @mbg.generated
     */
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMultiSelectionIdIsNull() {
            addCriterion("multi_selection_id is null");
            return (Criteria) this;
        }

        public Criteria andMultiSelectionIdIsNotNull() {
            addCriterion("multi_selection_id is not null");
            return (Criteria) this;
        }

        public Criteria andMultiSelectionIdEqualTo(String value) {
            addCriterion("multi_selection_id =", value, "multiSelectionId");
            return (Criteria) this;
        }

        public Criteria andMultiSelectionIdNotEqualTo(String value) {
            addCriterion("multi_selection_id <>", value, "multiSelectionId");
            return (Criteria) this;
        }

        public Criteria andMultiSelectionIdGreaterThan(String value) {
            addCriterion("multi_selection_id >", value, "multiSelectionId");
            return (Criteria) this;
        }

        public Criteria andMultiSelectionIdGreaterThanOrEqualTo(String value) {
            addCriterion("multi_selection_id >=", value, "multiSelectionId");
            return (Criteria) this;
        }

        public Criteria andMultiSelectionIdLessThan(String value) {
            addCriterion("multi_selection_id <", value, "multiSelectionId");
            return (Criteria) this;
        }

        public Criteria andMultiSelectionIdLessThanOrEqualTo(String value) {
            addCriterion("multi_selection_id <=", value, "multiSelectionId");
            return (Criteria) this;
        }

        public Criteria andMultiSelectionIdLike(String value) {
            addCriterion("multi_selection_id like", value, "multiSelectionId");
            return (Criteria) this;
        }

        public Criteria andMultiSelectionIdNotLike(String value) {
            addCriterion("multi_selection_id not like", value, "multiSelectionId");
            return (Criteria) this;
        }

        public Criteria andMultiSelectionIdIn(List<String> values) {
            addCriterion("multi_selection_id in", values, "multiSelectionId");
            return (Criteria) this;
        }

        public Criteria andMultiSelectionIdNotIn(List<String> values) {
            addCriterion("multi_selection_id not in", values, "multiSelectionId");
            return (Criteria) this;
        }

        public Criteria andMultiSelectionIdBetween(String value1, String value2) {
            addCriterion("multi_selection_id between", value1, value2, "multiSelectionId");
            return (Criteria) this;
        }

        public Criteria andMultiSelectionIdNotBetween(String value1, String value2) {
            addCriterion("multi_selection_id not between", value1, value2, "multiSelectionId");
            return (Criteria) this;
        }

        public Criteria andTeacCourseIdIsNull() {
            addCriterion("teac_course_id is null");
            return (Criteria) this;
        }

        public Criteria andTeacCourseIdIsNotNull() {
            addCriterion("teac_course_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeacCourseIdEqualTo(Long value) {
            addCriterion("teac_course_id =", value, "teacCourseId");
            return (Criteria) this;
        }

        public Criteria andTeacCourseIdNotEqualTo(Long value) {
            addCriterion("teac_course_id <>", value, "teacCourseId");
            return (Criteria) this;
        }

        public Criteria andTeacCourseIdGreaterThan(Long value) {
            addCriterion("teac_course_id >", value, "teacCourseId");
            return (Criteria) this;
        }

        public Criteria andTeacCourseIdGreaterThanOrEqualTo(Long value) {
            addCriterion("teac_course_id >=", value, "teacCourseId");
            return (Criteria) this;
        }

        public Criteria andTeacCourseIdLessThan(Long value) {
            addCriterion("teac_course_id <", value, "teacCourseId");
            return (Criteria) this;
        }

        public Criteria andTeacCourseIdLessThanOrEqualTo(Long value) {
            addCriterion("teac_course_id <=", value, "teacCourseId");
            return (Criteria) this;
        }

        public Criteria andTeacCourseIdIn(List<Long> values) {
            addCriterion("teac_course_id in", values, "teacCourseId");
            return (Criteria) this;
        }

        public Criteria andTeacCourseIdNotIn(List<Long> values) {
            addCriterion("teac_course_id not in", values, "teacCourseId");
            return (Criteria) this;
        }

        public Criteria andTeacCourseIdBetween(Long value1, Long value2) {
            addCriterion("teac_course_id between", value1, value2, "teacCourseId");
            return (Criteria) this;
        }

        public Criteria andTeacCourseIdNotBetween(Long value1, Long value2) {
            addCriterion("teac_course_id not between", value1, value2, "teacCourseId");
            return (Criteria) this;
        }

        public Criteria andExamIdIsNull() {
            addCriterion("exam_id is null");
            return (Criteria) this;
        }

        public Criteria andExamIdIsNotNull() {
            addCriterion("exam_id is not null");
            return (Criteria) this;
        }

        public Criteria andExamIdEqualTo(Integer value) {
            addCriterion("exam_id =", value, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdNotEqualTo(Integer value) {
            addCriterion("exam_id <>", value, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdGreaterThan(Integer value) {
            addCriterion("exam_id >", value, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("exam_id >=", value, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdLessThan(Integer value) {
            addCriterion("exam_id <", value, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdLessThanOrEqualTo(Integer value) {
            addCriterion("exam_id <=", value, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdIn(List<Integer> values) {
            addCriterion("exam_id in", values, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdNotIn(List<Integer> values) {
            addCriterion("exam_id not in", values, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdBetween(Integer value1, Integer value2) {
            addCriterion("exam_id between", value1, value2, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdNotBetween(Integer value1, Integer value2) {
            addCriterion("exam_id not between", value1, value2, "examId");
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

        public Criteria andDificultIsNull() {
            addCriterion("dificult is null");
            return (Criteria) this;
        }

        public Criteria andDificultIsNotNull() {
            addCriterion("dificult is not null");
            return (Criteria) this;
        }

        public Criteria andDificultEqualTo(String value) {
            addCriterion("dificult =", value, "dificult");
            return (Criteria) this;
        }

        public Criteria andDificultNotEqualTo(String value) {
            addCriterion("dificult <>", value, "dificult");
            return (Criteria) this;
        }

        public Criteria andDificultGreaterThan(String value) {
            addCriterion("dificult >", value, "dificult");
            return (Criteria) this;
        }

        public Criteria andDificultGreaterThanOrEqualTo(String value) {
            addCriterion("dificult >=", value, "dificult");
            return (Criteria) this;
        }

        public Criteria andDificultLessThan(String value) {
            addCriterion("dificult <", value, "dificult");
            return (Criteria) this;
        }

        public Criteria andDificultLessThanOrEqualTo(String value) {
            addCriterion("dificult <=", value, "dificult");
            return (Criteria) this;
        }

        public Criteria andDificultLike(String value) {
            addCriterion("dificult like", value, "dificult");
            return (Criteria) this;
        }

        public Criteria andDificultNotLike(String value) {
            addCriterion("dificult not like", value, "dificult");
            return (Criteria) this;
        }

        public Criteria andDificultIn(List<String> values) {
            addCriterion("dificult in", values, "dificult");
            return (Criteria) this;
        }

        public Criteria andDificultNotIn(List<String> values) {
            addCriterion("dificult not in", values, "dificult");
            return (Criteria) this;
        }

        public Criteria andDificultBetween(String value1, String value2) {
            addCriterion("dificult between", value1, value2, "dificult");
            return (Criteria) this;
        }

        public Criteria andDificultNotBetween(String value1, String value2) {
            addCriterion("dificult not between", value1, value2, "dificult");
            return (Criteria) this;
        }

        public Criteria andType1IsNull() {
            addCriterion("type1 is null");
            return (Criteria) this;
        }

        public Criteria andType1IsNotNull() {
            addCriterion("type1 is not null");
            return (Criteria) this;
        }

        public Criteria andType1EqualTo(String value) {
            addCriterion("type1 =", value, "type1");
            return (Criteria) this;
        }

        public Criteria andType1NotEqualTo(String value) {
            addCriterion("type1 <>", value, "type1");
            return (Criteria) this;
        }

        public Criteria andType1GreaterThan(String value) {
            addCriterion("type1 >", value, "type1");
            return (Criteria) this;
        }

        public Criteria andType1GreaterThanOrEqualTo(String value) {
            addCriterion("type1 >=", value, "type1");
            return (Criteria) this;
        }

        public Criteria andType1LessThan(String value) {
            addCriterion("type1 <", value, "type1");
            return (Criteria) this;
        }

        public Criteria andType1LessThanOrEqualTo(String value) {
            addCriterion("type1 <=", value, "type1");
            return (Criteria) this;
        }

        public Criteria andType1Like(String value) {
            addCriterion("type1 like", value, "type1");
            return (Criteria) this;
        }

        public Criteria andType1NotLike(String value) {
            addCriterion("type1 not like", value, "type1");
            return (Criteria) this;
        }

        public Criteria andType1In(List<String> values) {
            addCriterion("type1 in", values, "type1");
            return (Criteria) this;
        }

        public Criteria andType1NotIn(List<String> values) {
            addCriterion("type1 not in", values, "type1");
            return (Criteria) this;
        }

        public Criteria andType1Between(String value1, String value2) {
            addCriterion("type1 between", value1, value2, "type1");
            return (Criteria) this;
        }

        public Criteria andType1NotBetween(String value1, String value2) {
            addCriterion("type1 not between", value1, value2, "type1");
            return (Criteria) this;
        }

        public Criteria andType2IsNull() {
            addCriterion("type2 is null");
            return (Criteria) this;
        }

        public Criteria andType2IsNotNull() {
            addCriterion("type2 is not null");
            return (Criteria) this;
        }

        public Criteria andType2EqualTo(String value) {
            addCriterion("type2 =", value, "type2");
            return (Criteria) this;
        }

        public Criteria andType2NotEqualTo(String value) {
            addCriterion("type2 <>", value, "type2");
            return (Criteria) this;
        }

        public Criteria andType2GreaterThan(String value) {
            addCriterion("type2 >", value, "type2");
            return (Criteria) this;
        }

        public Criteria andType2GreaterThanOrEqualTo(String value) {
            addCriterion("type2 >=", value, "type2");
            return (Criteria) this;
        }

        public Criteria andType2LessThan(String value) {
            addCriterion("type2 <", value, "type2");
            return (Criteria) this;
        }

        public Criteria andType2LessThanOrEqualTo(String value) {
            addCriterion("type2 <=", value, "type2");
            return (Criteria) this;
        }

        public Criteria andType2Like(String value) {
            addCriterion("type2 like", value, "type2");
            return (Criteria) this;
        }

        public Criteria andType2NotLike(String value) {
            addCriterion("type2 not like", value, "type2");
            return (Criteria) this;
        }

        public Criteria andType2In(List<String> values) {
            addCriterion("type2 in", values, "type2");
            return (Criteria) this;
        }

        public Criteria andType2NotIn(List<String> values) {
            addCriterion("type2 not in", values, "type2");
            return (Criteria) this;
        }

        public Criteria andType2Between(String value1, String value2) {
            addCriterion("type2 between", value1, value2, "type2");
            return (Criteria) this;
        }

        public Criteria andType2NotBetween(String value1, String value2) {
            addCriterion("type2 not between", value1, value2, "type2");
            return (Criteria) this;
        }

        public Criteria andType3IsNull() {
            addCriterion("type3 is null");
            return (Criteria) this;
        }

        public Criteria andType3IsNotNull() {
            addCriterion("type3 is not null");
            return (Criteria) this;
        }

        public Criteria andType3EqualTo(String value) {
            addCriterion("type3 =", value, "type3");
            return (Criteria) this;
        }

        public Criteria andType3NotEqualTo(String value) {
            addCriterion("type3 <>", value, "type3");
            return (Criteria) this;
        }

        public Criteria andType3GreaterThan(String value) {
            addCriterion("type3 >", value, "type3");
            return (Criteria) this;
        }

        public Criteria andType3GreaterThanOrEqualTo(String value) {
            addCriterion("type3 >=", value, "type3");
            return (Criteria) this;
        }

        public Criteria andType3LessThan(String value) {
            addCriterion("type3 <", value, "type3");
            return (Criteria) this;
        }

        public Criteria andType3LessThanOrEqualTo(String value) {
            addCriterion("type3 <=", value, "type3");
            return (Criteria) this;
        }

        public Criteria andType3Like(String value) {
            addCriterion("type3 like", value, "type3");
            return (Criteria) this;
        }

        public Criteria andType3NotLike(String value) {
            addCriterion("type3 not like", value, "type3");
            return (Criteria) this;
        }

        public Criteria andType3In(List<String> values) {
            addCriterion("type3 in", values, "type3");
            return (Criteria) this;
        }

        public Criteria andType3NotIn(List<String> values) {
            addCriterion("type3 not in", values, "type3");
            return (Criteria) this;
        }

        public Criteria andType3Between(String value1, String value2) {
            addCriterion("type3 between", value1, value2, "type3");
            return (Criteria) this;
        }

        public Criteria andType3NotBetween(String value1, String value2) {
            addCriterion("type3 not between", value1, value2, "type3");
            return (Criteria) this;
        }

        public Criteria andType4IsNull() {
            addCriterion("type4 is null");
            return (Criteria) this;
        }

        public Criteria andType4IsNotNull() {
            addCriterion("type4 is not null");
            return (Criteria) this;
        }

        public Criteria andType4EqualTo(String value) {
            addCriterion("type4 =", value, "type4");
            return (Criteria) this;
        }

        public Criteria andType4NotEqualTo(String value) {
            addCriterion("type4 <>", value, "type4");
            return (Criteria) this;
        }

        public Criteria andType4GreaterThan(String value) {
            addCriterion("type4 >", value, "type4");
            return (Criteria) this;
        }

        public Criteria andType4GreaterThanOrEqualTo(String value) {
            addCriterion("type4 >=", value, "type4");
            return (Criteria) this;
        }

        public Criteria andType4LessThan(String value) {
            addCriterion("type4 <", value, "type4");
            return (Criteria) this;
        }

        public Criteria andType4LessThanOrEqualTo(String value) {
            addCriterion("type4 <=", value, "type4");
            return (Criteria) this;
        }

        public Criteria andType4Like(String value) {
            addCriterion("type4 like", value, "type4");
            return (Criteria) this;
        }

        public Criteria andType4NotLike(String value) {
            addCriterion("type4 not like", value, "type4");
            return (Criteria) this;
        }

        public Criteria andType4In(List<String> values) {
            addCriterion("type4 in", values, "type4");
            return (Criteria) this;
        }

        public Criteria andType4NotIn(List<String> values) {
            addCriterion("type4 not in", values, "type4");
            return (Criteria) this;
        }

        public Criteria andType4Between(String value1, String value2) {
            addCriterion("type4 between", value1, value2, "type4");
            return (Criteria) this;
        }

        public Criteria andType4NotBetween(String value1, String value2) {
            addCriterion("type4 not between", value1, value2, "type4");
            return (Criteria) this;
        }

        public Criteria andType5IsNull() {
            addCriterion("type5 is null");
            return (Criteria) this;
        }

        public Criteria andType5IsNotNull() {
            addCriterion("type5 is not null");
            return (Criteria) this;
        }

        public Criteria andType5EqualTo(String value) {
            addCriterion("type5 =", value, "type5");
            return (Criteria) this;
        }

        public Criteria andType5NotEqualTo(String value) {
            addCriterion("type5 <>", value, "type5");
            return (Criteria) this;
        }

        public Criteria andType5GreaterThan(String value) {
            addCriterion("type5 >", value, "type5");
            return (Criteria) this;
        }

        public Criteria andType5GreaterThanOrEqualTo(String value) {
            addCriterion("type5 >=", value, "type5");
            return (Criteria) this;
        }

        public Criteria andType5LessThan(String value) {
            addCriterion("type5 <", value, "type5");
            return (Criteria) this;
        }

        public Criteria andType5LessThanOrEqualTo(String value) {
            addCriterion("type5 <=", value, "type5");
            return (Criteria) this;
        }

        public Criteria andType5Like(String value) {
            addCriterion("type5 like", value, "type5");
            return (Criteria) this;
        }

        public Criteria andType5NotLike(String value) {
            addCriterion("type5 not like", value, "type5");
            return (Criteria) this;
        }

        public Criteria andType5In(List<String> values) {
            addCriterion("type5 in", values, "type5");
            return (Criteria) this;
        }

        public Criteria andType5NotIn(List<String> values) {
            addCriterion("type5 not in", values, "type5");
            return (Criteria) this;
        }

        public Criteria andType5Between(String value1, String value2) {
            addCriterion("type5 between", value1, value2, "type5");
            return (Criteria) this;
        }

        public Criteria andType5NotBetween(String value1, String value2) {
            addCriterion("type5 not between", value1, value2, "type5");
            return (Criteria) this;
        }

        public Criteria andAnswerIsNull() {
            addCriterion("answer is null");
            return (Criteria) this;
        }

        public Criteria andAnswerIsNotNull() {
            addCriterion("answer is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerEqualTo(String value) {
            addCriterion("answer =", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotEqualTo(String value) {
            addCriterion("answer <>", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerGreaterThan(String value) {
            addCriterion("answer >", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("answer >=", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLessThan(String value) {
            addCriterion("answer <", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLessThanOrEqualTo(String value) {
            addCriterion("answer <=", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLike(String value) {
            addCriterion("answer like", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotLike(String value) {
            addCriterion("answer not like", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerIn(List<String> values) {
            addCriterion("answer in", values, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotIn(List<String> values) {
            addCriterion("answer not in", values, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerBetween(String value1, String value2) {
            addCriterion("answer between", value1, value2, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotBetween(String value1, String value2) {
            addCriterion("answer not between", value1, value2, "answer");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_multi_select
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_multi_select
     *
     * @mbg.generated
     */
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