package com.ecommerce.shoply.service;

import com.ecommerce.shoply.data.model.Product;
import com.ecommerce.shoply.data.repository.ProductRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.*;

class ProductServiceImplTest {

    @Mock
    ProductRepository productRepository;
    @InjectMocks
    ProductService productServiceImpl;
    @BeforeEach
    void setUp() {
        productServiceImpl = new ProductServiceImpl();
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void saveProduct() {
        Product product = new Product();
        when(productRepository.save(product)).thenReturn(product);
        productServiceImpl.save(product);
        verify(productRepository, times(1)).save(product);
    }

    @Test
    void findAll() {
    }
}