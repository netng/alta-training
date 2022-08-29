package com.tarining.alterra.springjwt.repositories;

import com.tarining.alterra.springjwt.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
   User findByPhone(String phone);
}
