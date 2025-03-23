package com.product_app.product_app.data_transfer_object;

import java.math.BigDecimal;

public class Voucher {
    
    // attributes --------------------------------------------
    private Long id;
    private String code;
    private BigDecimal discount;
    private String expire_date;


    
    // getter and setter -------------------------------------
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public BigDecimal getDiscount() {
        return this.discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public String getExpire_date() {
        return this.expire_date;
    }

    public void setExpire_date(String expire_date) {
        this.expire_date = expire_date;
    }
}
