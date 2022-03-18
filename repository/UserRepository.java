package com.siddhantbhardwaj.jwtspringbootmysql.repository;

import com.siddhantbhardwaj.jwtspringbootmysql.entity.CustomUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<CustomUser,Integer> {
    CustomUser findByUsername(String username);
}
