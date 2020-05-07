package com.neu.hrm01.mapper;

import com.neu.hrm01.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserMapper {

    @Select("select * from user where id=#{id}")
    User selectUserById(Integer id);

    @Select("select * from user where email=#{email}")
    User selectUserByEmail(String email);

    @Insert("insert into user (email,password) values(#{email},#{password})")
    void addUser(User user);

    @Select("select * from user where email=#{email} and password=#{password}")
    User login(User user);

    @Select("select * from user")
    List<User> selectAllUser();

    @Update("update user set email=#{email},password=#{password} where id=#{id}")
    int updateUser(User user);

    @Delete("delete from user where id=#{id}")
    int deleteByUserId(Integer id);

}
