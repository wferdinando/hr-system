package com.hrsystem.userapi.services.impl;

import java.util.List;

import com.hrsystem.userapi.services.exceptions.ObjectNotFoundException;
import org.springframework.stereotype.Service;

import com.hrsystem.userapi.domain.User;
import com.hrsystem.userapi.repositories.UserRepository;
import com.hrsystem.userapi.services.UserService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Object not found."));
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

}
