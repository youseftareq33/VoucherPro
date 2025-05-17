package com.product_app.product_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product_app.product_app.model.User;

public interface UserRepository extends JpaRepository<User,Long>{
    User findByEmail(String email);
}
