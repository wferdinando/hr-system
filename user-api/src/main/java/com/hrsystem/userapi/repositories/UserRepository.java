package com.hrsystem.userapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hrsystem.userapi.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
