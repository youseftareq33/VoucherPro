package com.voucher_app.voucher_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.voucher_app.voucher_app.model.User;

public interface UserRepository extends JpaRepository<User,Long>{
    User findByEmail(String email);
}
