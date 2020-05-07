package com.neu.hrm01.entity;

import java.util.Date;

public class Event {

    private Integer id;
    private String eventName;
    private Date date;
    private String introduction;

    public Event() {
    }

    public Event(Integer id, String eventName, Date date, String introduction) {
        this.id = id;
        this.eventName = eventName;
        this.date = date;
        this.introduction = introduction;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", eventName='" + eventName + '\'' +
                ", date=" + date +
                ", introduction='" + introduction + '\'' +
                '}';
    }

}
