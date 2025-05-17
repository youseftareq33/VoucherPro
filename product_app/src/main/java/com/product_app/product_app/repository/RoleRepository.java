package com.product_app.product_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product_app.product_app.model.Role;


public interface RoleRepository extends JpaRepository<Role,Long>{
   
}
