package com.springboot.bengkel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springboot.bengkel.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
