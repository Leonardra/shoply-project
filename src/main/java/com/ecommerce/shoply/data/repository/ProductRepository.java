package com.ecommerce.shoply.data.repository;

import com.ecommerce.shoply.data.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository <Product, Long>{

}
