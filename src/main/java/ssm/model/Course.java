package ssm.model;

public class Course {
    private Integer id;

    private Integer weekday;

    private Integer sectionlength;

    private Integer sectionstart;

    private Integer sectionend;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWeekday() {
        return weekday;
    }

    public void setWeekday(Integer weekday) {
        this.weekday = weekday;
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
}