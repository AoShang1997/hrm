package com.neu.hrm01.service;

import com.neu.hrm01.entity.Course;
import com.neu.hrm01.mapper.CourseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseMapper courseMapper;

    @Override
    public List<Course> getAllCourse() {
        return courseMapper.selectAllCourse();
    }

    @Override
    public List<Course> getByType(Integer type) {
        return courseMapper.selectByType(type);
    }

    @Override
    public int addCourse(Course course) {
        return courseMapper.addCourse(course);
    }

    @Override
    public Course getById(Integer id) {
        return courseMapper.selectCourseById(id);
    }

    @Override
    public int update(Course course) {
        return courseMapper.updateCourse(course);
    }

    @Override
    public int delete(Integer id) {
        return courseMapper.deleteByCourseId(id);
    }
}
