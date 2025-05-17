package com.voucher_app.voucher_app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.voucher_app.voucher_app.model.Voucher;
import com.voucher_app.voucher_app.repository.VoucherRepository;

@RestController
@RequestMapping("/voucherapi")
public class VoucherRestController {
    @Autowired
    VoucherRepository voucher_repo;

    // Get request -------------------------------------------------------

    // get all voucher
    @GetMapping("/getvoucher")
    public List<Voucher> getAllVoucher(){
        return voucher_repo.findAll();
    }

    // get voucher
    @GetMapping("/getVoucher/{code}")
    public Voucher getVoucher(@PathVariable("code") String code){
        return voucher_repo.findByCode(code);
    }

    // Post request -------------------------------------------------------
    // create voucher
    @PostMapping("/createVoucher")
    public Voucher createVoucher(@RequestBody Voucher voucher){
        return voucher_repo.save(voucher);
    }
}
