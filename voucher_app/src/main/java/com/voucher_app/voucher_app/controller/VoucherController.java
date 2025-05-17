package com.voucher_app.voucher_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.voucher_app.voucher_app.repository.VoucherRepository;

@Controller
public class VoucherController {
    
    @Autowired
    private VoucherRepository voucher_repo;

    
}
