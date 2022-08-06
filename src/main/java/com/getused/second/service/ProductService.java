package com.getused.second.service;

import com.getused.second.model.entity.Product;
import com.getused.second.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    //Get all products
    public List<Product> getAllProducts() {
        List<Product> allProducts = productRepository.findAll();
        return allProducts;
    }


    public Product addProduct(Product product) {
        return productRepository.save(product);
    }
}
