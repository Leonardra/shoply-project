package com.ecommerce.shoply.service;

import com.ecommerce.shoply.data.model.Product;

import java.util.List;

public interface ProductService {
    Product save(Product product);
    List<Product> findAll();

}
