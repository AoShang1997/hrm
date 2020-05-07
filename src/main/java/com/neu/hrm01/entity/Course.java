package com.neu.hrm01.entity;

public class Course {

    private Integer id;
    private String courseName;
    private String content;
    private Integer type;

    public Course() {
    }

    public Course(Integer id, String courseName, String content, Integer type) {
        this.id = id;
        this.courseName = courseName;
        this.content = content;
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", courseName='" + courseName + '\'' +
                ", content='" + content + '\'' +
                ", type=" + type +
                '}';
    }

}
