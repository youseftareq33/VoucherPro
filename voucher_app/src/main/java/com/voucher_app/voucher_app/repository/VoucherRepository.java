package com.voucher_app.voucher_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.voucher_app.voucher_app.model.Voucher;

public interface VoucherRepository extends JpaRepository<Voucher,Long>{
    
    Voucher findByCode(String code);
}
