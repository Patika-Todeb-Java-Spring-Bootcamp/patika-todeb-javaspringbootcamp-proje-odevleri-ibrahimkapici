package com.getused.second.controller;

import com.getused.second.model.entity.Product;
import com.getused.second.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/all/products")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @PostMapping("/add")
    Product addProduct (@RequestBody Product product){
        return productService.addProduct(product);
    }


}
