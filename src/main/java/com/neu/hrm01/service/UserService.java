package com.neu.hrm01.service;

import com.neu.hrm01.entity.User;

import java.util.List;

public interface UserService {

    int register(User user);

    int login(User user);

    List<User> allUser();

    User getById(Integer id);

    int update(User user);

    int delete(Integer id);

}
