package com.chrishsu.springbootchrismall.service;

import com.chrishsu.springbootchrismall.dto.UserRegisterRequest;
import com.chrishsu.springbootchrismall.model.User;
import org.springframework.http.ResponseEntity;

public interface UserService {

    Integer register(UserRegisterRequest userRegisterRequest);

    User getUserById(Integer userId);



}
