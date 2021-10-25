package com.ecommerce.shoply.service;

import com.ecommerce.shoply.data.model.Product;
import org.thymeleaf.expression.Lists;

import java.util.List;

public interface ProductService {
    Product save(Product product);
    List<Product> findAll();
    Product findById(Long id);
    void deleteById(Long id);
    List<Product> saveAll(List<Product> products);

}
