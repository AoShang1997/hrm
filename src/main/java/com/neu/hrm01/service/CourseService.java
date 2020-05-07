package com.neu.hrm01.service;

import com.neu.hrm01.entity.Course;
import com.neu.hrm01.entity.Event;

import java.util.List;

public interface CourseService {

    List<Course> getAllCourse();

    List<Course> getByType(Integer type);

    int addCourse(Course course);

    Course getById(Integer id);

    int update(Course course);

    int delete(Integer id);

}
