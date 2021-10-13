package com.ecommerce.shoply.web.controller;


import com.ecommerce.shoply.data.model.Product;
import com.ecommerce.shoply.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productServiceImpl;

    @GetMapping("")
    public List<Product> findAll() {
        return productServiceImpl.findAll();
    }

    @PostMapping("")
    public Product save(@RequestBody Product product){
        log.info("Product request -> {}", product);
        return productServiceImpl.save(product);
    }

}
