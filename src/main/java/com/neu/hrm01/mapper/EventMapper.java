package com.neu.hrm01.mapper;

import com.neu.hrm01.entity.Event;
import com.neu.hrm01.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface EventMapper {

    @Select("select * from event where id=#{id}")
    Event selectEventById(Integer id);

    @Insert("insert into event (eventName,date,introduction) values(#{eventName},#{date},#{introduction})")
    int addEvent(Event event);

    @Update("update event set eventName=#{eventName},date=#{date},introduction=#{introduction} where id=#{id}")
    int updateEvent(Event event);

    @Delete("delete from event where id=#{id}")
    int deleteByEventId(Integer id);

    @Select("select * from event")
    List<Event> selectAllEvent();

}
