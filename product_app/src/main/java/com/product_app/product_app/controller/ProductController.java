package com.product_app.product_app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.product_app.product_app.data_transfer_object.Voucher;
import com.product_app.product_app.model.Product;
import com.product_app.product_app.repository.ProductRepository;

@RestController
@RequestMapping("/productapi")
public class ProductController {
    @Autowired
    private ProductRepository product_repo;

    @Autowired
    private RestTemplate restTemplate;
    
    @Value("${voucherService.url}")
    private String voucherServiceUrl;

    // Get request -------------------------------------------------------

    // get all product
    @GetMapping("/getproduct")
    public List<Product> getAllProduct(){
        return product_repo.findAll();
    }

    // get product
    @GetMapping("/getproduct/{id}")
    public Optional<Product> getProduct(@PathVariable("id") long id){
        return product_repo.findById(id);
    }

    // Post request -------------------------------------------------------
    // create product
    @PostMapping("/createProduct")
    public Product createProduct(@RequestBody Product product){

        Voucher voucher=restTemplate.getForObject(voucherServiceUrl+product.getVoucherCode(), Voucher.class);
        product.setPrice(product.getPrice().subtract(voucher.getDiscount()));

        return product_repo.save(product);
    }
}
