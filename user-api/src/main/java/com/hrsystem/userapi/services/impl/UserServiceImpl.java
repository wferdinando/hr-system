package com.hrsystem.userapi.services.impl;

import java.util.List;

import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.hrsystem.userapi.domain.User;
import com.hrsystem.userapi.repositories.UserRepository;
import com.hrsystem.userapi.services.UserService;
import com.hrsystem.userapi.services.exceptions.ObjectNotFoundException;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Service
@Slf4j
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final Environment env;

    @Override
    public User findById(Long id) {
        log.info("USER_SERVICE ::: Get request on " + env.getProperty("local.server.port") + " port");
        return userRepository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Object not found."));
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

}
