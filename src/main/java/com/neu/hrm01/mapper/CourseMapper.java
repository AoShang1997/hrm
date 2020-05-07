package com.neu.hrm01.mapper;

import com.neu.hrm01.entity.Course;
import com.neu.hrm01.entity.Event;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface CourseMapper {

    @Select("select * from course where id=#{id}")
    Course selectCourseById(Integer id);

    @Insert("insert into course (courseName,content,type) values(#{courseName},#{content},#{type})")
    int addCourse(Course course);

    @Update("update course set courseName=#{courseName},content=#{content},type=#{type} where id=#{id}")
    int updateCourse(Course course);

    @Delete("delete from course where id=#{id}")
    int deleteByCourseId(Integer id);

    @Select("select * from course")
    List<Course> selectAllCourse();

    @Select("select * from course where type=#{type}")
    List<Course> selectByType(Integer type);

}
