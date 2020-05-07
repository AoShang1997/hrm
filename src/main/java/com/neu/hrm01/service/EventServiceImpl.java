package com.neu.hrm01.service;

import com.neu.hrm01.entity.Event;
import com.neu.hrm01.mapper.EventMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventServiceImpl implements EventService {

    @Autowired
    private EventMapper eventMapper;

    @Override
    public List<Event> getAllEvent() {
        return eventMapper.selectAllEvent();
    }

    @Override
    public int addEvent(Event event) {
        return eventMapper.addEvent(event);
    }

    @Override
    public Event getById(Integer id) {
        return eventMapper.selectEventById(id);
    }

    @Override
    public int update(Event event) {
        return eventMapper.updateEvent(event);
    }

    @Override
    public int delete(Integer id) {
        return eventMapper.deleteByEventId(id);
    }

}
