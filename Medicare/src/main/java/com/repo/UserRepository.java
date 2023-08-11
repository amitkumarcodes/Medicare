package com.repo;
import org.springframework.data.jpa.repository.JpaRepository;

import com.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    // You might want to add a method to find a user by username
    User findByUsername(String username);
}
