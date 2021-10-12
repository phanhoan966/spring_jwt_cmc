package com.example.spring_jwt_cmc.repo;

import com.example.spring_jwt_cmc.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUserName(String userName);
}
