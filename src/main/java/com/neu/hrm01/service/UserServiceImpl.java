package com.neu.hrm01.service;

import com.neu.hrm01.entity.User;
import com.neu.hrm01.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int register(User user) {
        int result;
        User existUser = userMapper.selectUserByEmail(user.getEmail());
        if (existUser != null) {
            result = 0;
        } else {
            userMapper.addUser(user);
            result = 1;
        }
        return result;
    }

    @Override
    public int login(User user) {

        User reUser = userMapper.login(user);
        if (reUser == null) {
            return 0;
        }
        else {
            return 1;
        }
    }

    @Override
    public List<User> allUser() {
        return userMapper.selectAllUser();
    }

    @Override
    public User getById(Integer id) {
        return userMapper.selectUserById(id);
    }

    @Override
    public int update(User user) {
        return userMapper.updateUser(user);
    }

    @Override
    public int delete(Integer id) {
        return userMapper.deleteByUserId(id);
    }

}
