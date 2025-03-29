package com.voucher_app.voucher_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.voucher_app.voucher_app.model.Role;

public interface RoleRepository extends JpaRepository<Role,Long>{
   
}
