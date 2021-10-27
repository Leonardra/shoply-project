package com.ecommerce.shoply.service;

import com.ecommerce.shoply.web.exceptions.ProductDoesNotExistException;
import com.ecommerce.shoply.data.dto.ProductUpdateForm;
import com.ecommerce.shoply.data.model.Product;
import com.ecommerce.shoply.data.repository.ProductRepository;
import com.ecommerce.shoply.service.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    ProductRepository productRepository;

    @Autowired
    ProductMapper productMapper;

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product findById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public List<Product> saveAll(List<Product> products) {
        return productRepository.saveAll(products);
    }

    @Override
    public Product update(Long productId, ProductUpdateForm productUpdate) throws ProductDoesNotExistException {
        if(productUpdate == null){
            throw new NullPointerException("Product cannot be null");
        }
        Optional<Product> foundProduct = productRepository.findById(productId);

        if(foundProduct.isPresent()){
            Product existingProduct = foundProduct.get();
           productMapper.mapDtoTOProduct(productUpdate, existingProduct);
         return productRepository.save(existingProduct);
        }else {
            throw new ProductDoesNotExistException("Product with id" +productId+ "does not exist");
        }
    }
}
