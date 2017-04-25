package ssm.model;

public class Course {
    private Integer id;

    private String course;

    private String location;

    private String teacher;

    private Integer weekday;

    private String weekstring;

    private Integer sectionlength;

    private Integer sectionstart;

    private Integer sectionend;

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

    public Integer getWeekday() {
        return weekday;
    }

    public void setWeekday(Integer weekday) {
        this.weekday = weekday;
    }

    public String getWeekstring() {
        return weekstring;
    }

    public void setWeekstring(String weekstring) {
        this.weekstring = weekstring == null ? null : weekstring.trim();
    }

    public Integer getSectionlength() {
        return sectionlength;
    }

    public void setSectionlength(Integer sectionlength) {
        this.sectionlength = sectionlength;
    }

    public Integer getSectionstart() {
        return sectionstart;
    }

    public void setSectionstart(Integer sectionstart) {
        this.sectionstart = sectionstart;
    }

    public Integer getSectionend() {
        return sectionend;
    }

    public void setSectionend(Integer sectionend) {
        this.sectionend = sectionend;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week == null ? null : week.trim();
    }
}