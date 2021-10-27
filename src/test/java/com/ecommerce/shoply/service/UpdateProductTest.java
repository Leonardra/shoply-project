package com.ecommerce.shoply.service;

import com.ecommerce.shoply.data.dto.ProductUpdateForm;
import com.ecommerce.shoply.data.model.Product;
import com.ecommerce.shoply.data.repository.ProductRepository;
import com.ecommerce.shoply.web.exceptions.ProductDoesNotExistException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
@Sql(scripts = {"/db/insert.sql"})
public class UpdateProductTest {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductService productServiceImpl;

    @Test
    void updateProductTest() throws ProductDoesNotExistException {
        Product product = productRepository.findById(110L).orElse(null);
        assertThat(product).isNotNull();
        assertThat(product.getName()).isEqualTo("luxury chair");

        ProductUpdateForm productDto = new ProductUpdateForm();
        productDto.setName("Mexican chair");

        product = productServiceImpl.update(110L, productDto);
        assertThat(product.getName()).isEqualTo(productDto.getName());
        assertThat(product.getPrice()).isEqualTo(4500);

    }
}
