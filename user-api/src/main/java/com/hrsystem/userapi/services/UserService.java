package com.hrsystem.userapi.services;

import java.util.List;

import com.hrsystem.userapi.domain.User;


public interface UserService {
    User findById(Long id);
    List<User> findAll();
}
