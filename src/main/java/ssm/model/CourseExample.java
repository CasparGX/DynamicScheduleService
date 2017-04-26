package ssm.model;

import java.util.ArrayList;
import java.util.List;

public class CourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseExample() {
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

        public Criteria andCourseIsNull() {
            addCriterion("course is null");
            return (Criteria) this;
        }

        public Criteria andCourseIsNotNull() {
            addCriterion("course is not null");
            return (Criteria) this;
        }

        public Criteria andCourseEqualTo(String value) {
            addCriterion("course =", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseNotEqualTo(String value) {
            addCriterion("course <>", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseGreaterThan(String value) {
            addCriterion("course >", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseGreaterThanOrEqualTo(String value) {
            addCriterion("course >=", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseLessThan(String value) {
            addCriterion("course <", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseLessThanOrEqualTo(String value) {
            addCriterion("course <=", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseLike(String value) {
            addCriterion("course like", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseNotLike(String value) {
            addCriterion("course not like", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseIn(List<String> values) {
            addCriterion("course in", values, "course");
            return (Criteria) this;
        }

        public Criteria andCourseNotIn(List<String> values) {
            addCriterion("course not in", values, "course");
            return (Criteria) this;
        }

        public Criteria andCourseBetween(String value1, String value2) {
            addCriterion("course between", value1, value2, "course");
            return (Criteria) this;
        }

        public Criteria andCourseNotBetween(String value1, String value2) {
            addCriterion("course not between", value1, value2, "course");
            return (Criteria) this;
        }

        public Criteria andLocationIsNull() {
            addCriterion("location is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("location is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(String value) {
            addCriterion("location =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(String value) {
            addCriterion("location <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(String value) {
            addCriterion("location >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(String value) {
            addCriterion("location >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(String value) {
            addCriterion("location <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(String value) {
            addCriterion("location <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLike(String value) {
            addCriterion("location like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotLike(String value) {
            addCriterion("location not like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<String> values) {
            addCriterion("location in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<String> values) {
            addCriterion("location not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(String value1, String value2) {
            addCriterion("location between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(String value1, String value2) {
            addCriterion("location not between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andTeacherIsNull() {
            addCriterion("teacher is null");
            return (Criteria) this;
        }

        public Criteria andTeacherIsNotNull() {
            addCriterion("teacher is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherEqualTo(String value) {
            addCriterion("teacher =", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherNotEqualTo(String value) {
            addCriterion("teacher <>", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherGreaterThan(String value) {
            addCriterion("teacher >", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherGreaterThanOrEqualTo(String value) {
            addCriterion("teacher >=", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherLessThan(String value) {
            addCriterion("teacher <", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherLessThanOrEqualTo(String value) {
            addCriterion("teacher <=", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherLike(String value) {
            addCriterion("teacher like", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherNotLike(String value) {
            addCriterion("teacher not like", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherIn(List<String> values) {
            addCriterion("teacher in", values, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherNotIn(List<String> values) {
            addCriterion("teacher not in", values, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherBetween(String value1, String value2) {
            addCriterion("teacher between", value1, value2, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherNotBetween(String value1, String value2) {
            addCriterion("teacher not between", value1, value2, "teacher");
            return (Criteria) this;
        }

        public Criteria andWeekDayIsNull() {
            addCriterion("week_day is null");
            return (Criteria) this;
        }

        public Criteria andWeekDayIsNotNull() {
            addCriterion("week_day is not null");
            return (Criteria) this;
        }

        public Criteria andWeekDayEqualTo(Integer value) {
            addCriterion("week_day =", value, "weekDay");
            return (Criteria) this;
        }

        public Criteria andWeekDayNotEqualTo(Integer value) {
            addCriterion("week_day <>", value, "weekDay");
            return (Criteria) this;
        }

        public Criteria andWeekDayGreaterThan(Integer value) {
            addCriterion("week_day >", value, "weekDay");
            return (Criteria) this;
        }

        public Criteria andWeekDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("week_day >=", value, "weekDay");
            return (Criteria) this;
        }

        public Criteria andWeekDayLessThan(Integer value) {
            addCriterion("week_day <", value, "weekDay");
            return (Criteria) this;
        }

        public Criteria andWeekDayLessThanOrEqualTo(Integer value) {
            addCriterion("week_day <=", value, "weekDay");
            return (Criteria) this;
        }

        public Criteria andWeekDayIn(List<Integer> values) {
            addCriterion("week_day in", values, "weekDay");
            return (Criteria) this;
        }

        public Criteria andWeekDayNotIn(List<Integer> values) {
            addCriterion("week_day not in", values, "weekDay");
            return (Criteria) this;
        }

        public Criteria andWeekDayBetween(Integer value1, Integer value2) {
            addCriterion("week_day between", value1, value2, "weekDay");
            return (Criteria) this;
        }

        public Criteria andWeekDayNotBetween(Integer value1, Integer value2) {
            addCriterion("week_day not between", value1, value2, "weekDay");
            return (Criteria) this;
        }

        public Criteria andWeekStringIsNull() {
            addCriterion("week_string is null");
            return (Criteria) this;
        }

        public Criteria andWeekStringIsNotNull() {
            addCriterion("week_string is not null");
            return (Criteria) this;
        }

        public Criteria andWeekStringEqualTo(String value) {
            addCriterion("week_string =", value, "weekString");
            return (Criteria) this;
        }

        public Criteria andWeekStringNotEqualTo(String value) {
            addCriterion("week_string <>", value, "weekString");
            return (Criteria) this;
        }

        public Criteria andWeekStringGreaterThan(String value) {
            addCriterion("week_string >", value, "weekString");
            return (Criteria) this;
        }

        public Criteria andWeekStringGreaterThanOrEqualTo(String value) {
            addCriterion("week_string >=", value, "weekString");
            return (Criteria) this;
        }

        public Criteria andWeekStringLessThan(String value) {
            addCriterion("week_string <", value, "weekString");
            return (Criteria) this;
        }

        public Criteria andWeekStringLessThanOrEqualTo(String value) {
            addCriterion("week_string <=", value, "weekString");
            return (Criteria) this;
        }

        public Criteria andWeekStringLike(String value) {
            addCriterion("week_string like", value, "weekString");
            return (Criteria) this;
        }

        public Criteria andWeekStringNotLike(String value) {
            addCriterion("week_string not like", value, "weekString");
            return (Criteria) this;
        }

        public Criteria andWeekStringIn(List<String> values) {
            addCriterion("week_string in", values, "weekString");
            return (Criteria) this;
        }

        public Criteria andWeekStringNotIn(List<String> values) {
            addCriterion("week_string not in", values, "weekString");
            return (Criteria) this;
        }

        public Criteria andWeekStringBetween(String value1, String value2) {
            addCriterion("week_string between", value1, value2, "weekString");
            return (Criteria) this;
        }

        public Criteria andWeekStringNotBetween(String value1, String value2) {
            addCriterion("week_string not between", value1, value2, "weekString");
            return (Criteria) this;
        }

        public Criteria andSectionLengthIsNull() {
            addCriterion("section_length is null");
            return (Criteria) this;
        }

        public Criteria andSectionLengthIsNotNull() {
            addCriterion("section_length is not null");
            return (Criteria) this;
        }

        public Criteria andSectionLengthEqualTo(Integer value) {
            addCriterion("section_length =", value, "sectionLength");
            return (Criteria) this;
        }

        public Criteria andSectionLengthNotEqualTo(Integer value) {
            addCriterion("section_length <>", value, "sectionLength");
            return (Criteria) this;
        }

        public Criteria andSectionLengthGreaterThan(Integer value) {
            addCriterion("section_length >", value, "sectionLength");
            return (Criteria) this;
        }

        public Criteria andSectionLengthGreaterThanOrEqualTo(Integer value) {
            addCriterion("section_length >=", value, "sectionLength");
            return (Criteria) this;
        }

        public Criteria andSectionLengthLessThan(Integer value) {
            addCriterion("section_length <", value, "sectionLength");
            return (Criteria) this;
        }

        public Criteria andSectionLengthLessThanOrEqualTo(Integer value) {
            addCriterion("section_length <=", value, "sectionLength");
            return (Criteria) this;
        }

        public Criteria andSectionLengthIn(List<Integer> values) {
            addCriterion("section_length in", values, "sectionLength");
            return (Criteria) this;
        }

        public Criteria andSectionLengthNotIn(List<Integer> values) {
            addCriterion("section_length not in", values, "sectionLength");
            return (Criteria) this;
        }

        public Criteria andSectionLengthBetween(Integer value1, Integer value2) {
            addCriterion("section_length between", value1, value2, "sectionLength");
            return (Criteria) this;
        }

        public Criteria andSectionLengthNotBetween(Integer value1, Integer value2) {
            addCriterion("section_length not between", value1, value2, "sectionLength");
            return (Criteria) this;
        }

        public Criteria andSectionStartIsNull() {
            addCriterion("section_start is null");
            return (Criteria) this;
        }

        public Criteria andSectionStartIsNotNull() {
            addCriterion("section_start is not null");
            return (Criteria) this;
        }

        public Criteria andSectionStartEqualTo(Integer value) {
            addCriterion("section_start =", value, "sectionStart");
            return (Criteria) this;
        }

        public Criteria andSectionStartNotEqualTo(Integer value) {
            addCriterion("section_start <>", value, "sectionStart");
            return (Criteria) this;
        }

        public Criteria andSectionStartGreaterThan(Integer value) {
            addCriterion("section_start >", value, "sectionStart");
            return (Criteria) this;
        }

        public Criteria andSectionStartGreaterThanOrEqualTo(Integer value) {
            addCriterion("section_start >=", value, "sectionStart");
            return (Criteria) this;
        }

        public Criteria andSectionStartLessThan(Integer value) {
            addCriterion("section_start <", value, "sectionStart");
            return (Criteria) this;
        }

        public Criteria andSectionStartLessThanOrEqualTo(Integer value) {
            addCriterion("section_start <=", value, "sectionStart");
            return (Criteria) this;
        }

        public Criteria andSectionStartIn(List<Integer> values) {
            addCriterion("section_start in", values, "sectionStart");
            return (Criteria) this;
        }

        public Criteria andSectionStartNotIn(List<Integer> values) {
            addCriterion("section_start not in", values, "sectionStart");
            return (Criteria) this;
        }

        public Criteria andSectionStartBetween(Integer value1, Integer value2) {
            addCriterion("section_start between", value1, value2, "sectionStart");
            return (Criteria) this;
        }

        public Criteria andSectionStartNotBetween(Integer value1, Integer value2) {
            addCriterion("section_start not between", value1, value2, "sectionStart");
            return (Criteria) this;
        }

        public Criteria andSectionEndIsNull() {
            addCriterion("section_end is null");
            return (Criteria) this;
        }

        public Criteria andSectionEndIsNotNull() {
            addCriterion("section_end is not null");
            return (Criteria) this;
        }

        public Criteria andSectionEndEqualTo(Integer value) {
            addCriterion("section_end =", value, "sectionEnd");
            return (Criteria) this;
        }

        public Criteria andSectionEndNotEqualTo(Integer value) {
            addCriterion("section_end <>", value, "sectionEnd");
            return (Criteria) this;
        }

        public Criteria andSectionEndGreaterThan(Integer value) {
            addCriterion("section_end >", value, "sectionEnd");
            return (Criteria) this;
        }

        public Criteria andSectionEndGreaterThanOrEqualTo(Integer value) {
            addCriterion("section_end >=", value, "sectionEnd");
            return (Criteria) this;
        }

        public Criteria andSectionEndLessThan(Integer value) {
            addCriterion("section_end <", value, "sectionEnd");
            return (Criteria) this;
        }

        public Criteria andSectionEndLessThanOrEqualTo(Integer value) {
            addCriterion("section_end <=", value, "sectionEnd");
            return (Criteria) this;
        }

        public Criteria andSectionEndIn(List<Integer> values) {
            addCriterion("section_end in", values, "sectionEnd");
            return (Criteria) this;
        }

        public Criteria andSectionEndNotIn(List<Integer> values) {
            addCriterion("section_end not in", values, "sectionEnd");
            return (Criteria) this;
        }

        public Criteria andSectionEndBetween(Integer value1, Integer value2) {
            addCriterion("section_end between", value1, value2, "sectionEnd");
            return (Criteria) this;
        }

        public Criteria andSectionEndNotBetween(Integer value1, Integer value2) {
            addCriterion("section_end not between", value1, value2, "sectionEnd");
            return (Criteria) this;
        }

        public Criteria andWeekIsNull() {
            addCriterion("week is null");
            return (Criteria) this;
        }

        public Criteria andWeekIsNotNull() {
            addCriterion("week is not null");
            return (Criteria) this;
        }

        public Criteria andWeekEqualTo(String value) {
            addCriterion("week =", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekNotEqualTo(String value) {
            addCriterion("week <>", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekGreaterThan(String value) {
            addCriterion("week >", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekGreaterThanOrEqualTo(String value) {
            addCriterion("week >=", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekLessThan(String value) {
            addCriterion("week <", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekLessThanOrEqualTo(String value) {
            addCriterion("week <=", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekLike(String value) {
            addCriterion("week like", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekNotLike(String value) {
            addCriterion("week not like", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekIn(List<String> values) {
            addCriterion("week in", values, "week");
            return (Criteria) this;
        }

        public Criteria andWeekNotIn(List<String> values) {
            addCriterion("week not in", values, "week");
            return (Criteria) this;
        }

        public Criteria andWeekBetween(String value1, String value2) {
            addCriterion("week between", value1, value2, "week");
            return (Criteria) this;
        }

        public Criteria andWeekNotBetween(String value1, String value2) {
            addCriterion("week not between", value1, value2, "week");
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