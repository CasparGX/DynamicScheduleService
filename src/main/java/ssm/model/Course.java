package ssm.model;

public class Course {
    private Integer id;

    private String course;

    private String location;

    private String teacher;

    private Integer weekDay;

    private String weekString;

    private Integer sectionLength;

    private Integer sectionStart;

    private Integer sectionEnd;

    private String week;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course == null ? null : course.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher == null ? null : teacher.trim();
    }

    public Integer getWeekDay() {
        return weekDay;
    }

    public void setWeekDay(Integer weekDay) {
        this.weekDay = weekDay;
    }

    public String getWeekString() {
        return weekString;
    }

    public void setWeekString(String weekString) {
        this.weekString = weekString == null ? null : weekString.trim();
    }

    public Integer getSectionLength() {
        return sectionLength;
    }

    public void setSectionLength(Integer sectionLength) {
        this.sectionLength = sectionLength;
    }

    public Integer getSectionStart() {
        return sectionStart;
    }

    public void setSectionStart(Integer sectionStart) {
        this.sectionStart = sectionStart;
    }

    public Integer getSectionEnd() {
        return sectionEnd;
    }

    public void setSectionEnd(Integer sectionEnd) {
        this.sectionEnd = sectionEnd;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week == null ? null : week.trim();
    }
}