package com.chrishsu.springbootchrismall.service.impl;

import com.chrishsu.springbootchrismall.dao.UserDao;
import com.chrishsu.springbootchrismall.dto.UserRegisterRequest;
import com.chrishsu.springbootchrismall.model.User;
import com.chrishsu.springbootchrismall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }

    @Override
    public User getUserById(Integer userId){
        return userDao.getUserById(userId);
    }


}
