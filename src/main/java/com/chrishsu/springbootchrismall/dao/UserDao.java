package com.chrishsu.springbootchrismall.dao;

import com.chrishsu.springbootchrismall.dto.UserRegisterRequest;
import com.chrishsu.springbootchrismall.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}
