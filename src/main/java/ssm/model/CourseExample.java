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

        public Criteria andWeekdayIsNull() {
            addCriterion("weekDay is null");
            return (Criteria) this;
        }

        public Criteria andWeekdayIsNotNull() {
            addCriterion("weekDay is not null");
            return (Criteria) this;
        }

        public Criteria andWeekdayEqualTo(Integer value) {
            addCriterion("weekDay =", value, "weekday");
            return (Criteria) this;
        }

        public Criteria andWeekdayNotEqualTo(Integer value) {
            addCriterion("weekDay <>", value, "weekday");
            return (Criteria) this;
        }

        public Criteria andWeekdayGreaterThan(Integer value) {
            addCriterion("weekDay >", value, "weekday");
            return (Criteria) this;
        }

        public Criteria andWeekdayGreaterThanOrEqualTo(Integer value) {
            addCriterion("weekDay >=", value, "weekday");
            return (Criteria) this;
        }

        public Criteria andWeekdayLessThan(Integer value) {
            addCriterion("weekDay <", value, "weekday");
            return (Criteria) this;
        }

        public Criteria andWeekdayLessThanOrEqualTo(Integer value) {
            addCriterion("weekDay <=", value, "weekday");
            return (Criteria) this;
        }

        public Criteria andWeekdayIn(List<Integer> values) {
            addCriterion("weekDay in", values, "weekday");
            return (Criteria) this;
        }

        public Criteria andWeekdayNotIn(List<Integer> values) {
            addCriterion("weekDay not in", values, "weekday");
            return (Criteria) this;
        }

        public Criteria andWeekdayBetween(Integer value1, Integer value2) {
            addCriterion("weekDay between", value1, value2, "weekday");
            return (Criteria) this;
        }

        public Criteria andWeekdayNotBetween(Integer value1, Integer value2) {
            addCriterion("weekDay not between", value1, value2, "weekday");
            return (Criteria) this;
        }

        public Criteria andWeekstringIsNull() {
            addCriterion("weekString is null");
            return (Criteria) this;
        }

        public Criteria andWeekstringIsNotNull() {
            addCriterion("weekString is not null");
            return (Criteria) this;
        }

        public Criteria andWeekstringEqualTo(String value) {
            addCriterion("weekString =", value, "weekstring");
            return (Criteria) this;
        }

        public Criteria andWeekstringNotEqualTo(String value) {
            addCriterion("weekString <>", value, "weekstring");
            return (Criteria) this;
        }

        public Criteria andWeekstringGreaterThan(String value) {
            addCriterion("weekString >", value, "weekstring");
            return (Criteria) this;
        }

        public Criteria andWeekstringGreaterThanOrEqualTo(String value) {
            addCriterion("weekString >=", value, "weekstring");
            return (Criteria) this;
        }

        public Criteria andWeekstringLessThan(String value) {
            addCriterion("weekString <", value, "weekstring");
            return (Criteria) this;
        }

        public Criteria andWeekstringLessThanOrEqualTo(String value) {
            addCriterion("weekString <=", value, "weekstring");
            return (Criteria) this;
        }

        public Criteria andWeekstringLike(String value) {
            addCriterion("weekString like", value, "weekstring");
            return (Criteria) this;
        }

        public Criteria andWeekstringNotLike(String value) {
            addCriterion("weekString not like", value, "weekstring");
            return (Criteria) this;
        }

        public Criteria andWeekstringIn(List<String> values) {
            addCriterion("weekString in", values, "weekstring");
            return (Criteria) this;
        }

        public Criteria andWeekstringNotIn(List<String> values) {
            addCriterion("weekString not in", values, "weekstring");
            return (Criteria) this;
        }

        public Criteria andWeekstringBetween(String value1, String value2) {
            addCriterion("weekString between", value1, value2, "weekstring");
            return (Criteria) this;
        }

        public Criteria andWeekstringNotBetween(String value1, String value2) {
            addCriterion("weekString not between", value1, value2, "weekstring");
            return (Criteria) this;
        }

        public Criteria andSectionlengthIsNull() {
            addCriterion("sectionLength is null");
            return (Criteria) this;
        }

        public Criteria andSectionlengthIsNotNull() {
            addCriterion("sectionLength is not null");
            return (Criteria) this;
        }

        public Criteria andSectionlengthEqualTo(Integer value) {
            addCriterion("sectionLength =", value, "sectionlength");
            return (Criteria) this;
        }

        public Criteria andSectionlengthNotEqualTo(Integer value) {
            addCriterion("sectionLength <>", value, "sectionlength");
            return (Criteria) this;
        }

        public Criteria andSectionlengthGreaterThan(Integer value) {
            addCriterion("sectionLength >", value, "sectionlength");
            return (Criteria) this;
        }

        public Criteria andSectionlengthGreaterThanOrEqualTo(Integer value) {
            addCriterion("sectionLength >=", value, "sectionlength");
            return (Criteria) this;
        }

        public Criteria andSectionlengthLessThan(Integer value) {
            addCriterion("sectionLength <", value, "sectionlength");
            return (Criteria) this;
        }

        public Criteria andSectionlengthLessThanOrEqualTo(Integer value) {
            addCriterion("sectionLength <=", value, "sectionlength");
            return (Criteria) this;
        }

        public Criteria andSectionlengthIn(List<Integer> values) {
            addCriterion("sectionLength in", values, "sectionlength");
            return (Criteria) this;
        }

        public Criteria andSectionlengthNotIn(List<Integer> values) {
            addCriterion("sectionLength not in", values, "sectionlength");
            return (Criteria) this;
        }

        public Criteria andSectionlengthBetween(Integer value1, Integer value2) {
            addCriterion("sectionLength between", value1, value2, "sectionlength");
            return (Criteria) this;
        }

        public Criteria andSectionlengthNotBetween(Integer value1, Integer value2) {
            addCriterion("sectionLength not between", value1, value2, "sectionlength");
            return (Criteria) this;
        }

        public Criteria andSectionstartIsNull() {
            addCriterion("sectionStart is null");
            return (Criteria) this;
        }

        public Criteria andSectionstartIsNotNull() {
            addCriterion("sectionStart is not null");
            return (Criteria) this;
        }

        public Criteria andSectionstartEqualTo(Integer value) {
            addCriterion("sectionStart =", value, "sectionstart");
            return (Criteria) this;
        }

        public Criteria andSectionstartNotEqualTo(Integer value) {
            addCriterion("sectionStart <>", value, "sectionstart");
            return (Criteria) this;
        }

        public Criteria andSectionstartGreaterThan(Integer value) {
            addCriterion("sectionStart >", value, "sectionstart");
            return (Criteria) this;
        }

        public Criteria andSectionstartGreaterThanOrEqualTo(Integer value) {
            addCriterion("sectionStart >=", value, "sectionstart");
            return (Criteria) this;
        }

        public Criteria andSectionstartLessThan(Integer value) {
            addCriterion("sectionStart <", value, "sectionstart");
            return (Criteria) this;
        }

        public Criteria andSectionstartLessThanOrEqualTo(Integer value) {
            addCriterion("sectionStart <=", value, "sectionstart");
            return (Criteria) this;
        }

        public Criteria andSectionstartIn(List<Integer> values) {
            addCriterion("sectionStart in", values, "sectionstart");
            return (Criteria) this;
        }

        public Criteria andSectionstartNotIn(List<Integer> values) {
            addCriterion("sectionStart not in", values, "sectionstart");
            return (Criteria) this;
        }

        public Criteria andSectionstartBetween(Integer value1, Integer value2) {
            addCriterion("sectionStart between", value1, value2, "sectionstart");
            return (Criteria) this;
        }

        public Criteria andSectionstartNotBetween(Integer value1, Integer value2) {
            addCriterion("sectionStart not between", value1, value2, "sectionstart");
            return (Criteria) this;
        }

        public Criteria andSectionendIsNull() {
            addCriterion("sectionEnd is null");
            return (Criteria) this;
        }

        public Criteria andSectionendIsNotNull() {
            addCriterion("sectionEnd is not null");
            return (Criteria) this;
        }

        public Criteria andSectionendEqualTo(Integer value) {
            addCriterion("sectionEnd =", value, "sectionend");
            return (Criteria) this;
        }

        public Criteria andSectionendNotEqualTo(Integer value) {
            addCriterion("sectionEnd <>", value, "sectionend");
            return (Criteria) this;
        }

        public Criteria andSectionendGreaterThan(Integer value) {
            addCriterion("sectionEnd >", value, "sectionend");
            return (Criteria) this;
        }

        public Criteria andSectionendGreaterThanOrEqualTo(Integer value) {
            addCriterion("sectionEnd >=", value, "sectionend");
            return (Criteria) this;
        }

        public Criteria andSectionendLessThan(Integer value) {
            addCriterion("sectionEnd <", value, "sectionend");
            return (Criteria) this;
        }

        public Criteria andSectionendLessThanOrEqualTo(Integer value) {
            addCriterion("sectionEnd <=", value, "sectionend");
            return (Criteria) this;
        }

        public Criteria andSectionendIn(List<Integer> values) {
            addCriterion("sectionEnd in", values, "sectionend");
            return (Criteria) this;
        }

        public Criteria andSectionendNotIn(List<Integer> values) {
            addCriterion("sectionEnd not in", values, "sectionend");
            return (Criteria) this;
        }

        public Criteria andSectionendBetween(Integer value1, Integer value2) {
            addCriterion("sectionEnd between", value1, value2, "sectionend");
            return (Criteria) this;
        }

        public Criteria andSectionendNotBetween(Integer value1, Integer value2) {
            addCriterion("sectionEnd not between", value1, value2, "sectionend");
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