package com.neu.hrm01.service;

import com.neu.hrm01.entity.Event;
import com.neu.hrm01.entity.User;

import java.util.List;

public interface EventService {

    List<Event> getAllEvent();

    int addEvent(Event event);

    Event getById(Integer id);

    int update(Event event);

    int delete(Integer id);

}
