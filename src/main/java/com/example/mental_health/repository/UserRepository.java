package com.example.mental_health.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.mental_health.model.User;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByEmail(String email);
}
