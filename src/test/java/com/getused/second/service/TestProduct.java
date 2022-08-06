package com.getused.second.service;

import com.getused.second.model.dto.ProductDTO;
import com.getused.second.model.entity.Category;
import com.getused.second.model.entity.Product;
import com.getused.second.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class TestProduct {



    @Mock
    private ProductRepository productRepository;

    @InjectMocks
    private ProductService productService;



    @Test
    void getAllProduct() {
        // init step
        List<Product> productList = new ArrayList<>();
        Product product1 = new Product(1L,"Apple iPhone 12","12MP, 3900mAh Battery",15555.99, Category cellphone);
        Product product2 = new Product(2L,"Apple iPhone 12 Pro","15MP, 4300mAh Battery",18999.99,Category cellphone);
        Product product3 = new Product(3L,"Apple iPhone 12 Pro Max","15MP, 4300mAh Battery",19999.99,Category cellphone);
        productList.add(product2);
        productList.add(product1);
        productList.add(product3);

        //stub - when step
        Mockito.when(productRepository.findAll()).thenReturn(productList);

        //then - validate step
        List<Product> actualProductList = productService.getAllProducts();

        Assert.assertEquals(productList.size(),actualProductList.size());

        System.out.println("First: "+productList);
        productList = productList.stream().sorted(getProductComparator()).collect(Collectors.toList());
        actualProductList = actualProductList.stream().sorted(getProductComparator()).collect(Collectors.toList());
        for (int i = 0; i < productList.size(); i++) {
            Product currExpProduct = productList.get(i);
            Product currActualProduct = actualProductList.get(i);
            Assert.assertEquals(currExpProduct.getId(),currActualProduct.getId());
            Assert.assertEquals(currExpProduct.getDescription(),currActualProduct.getDescription());
        }

        System.out.println("Second: "+productList);

    }

    private Comparator<Product> getProductComparator() {
        return (o1, o2) -> {
            if (o1.getId() - o2.getId() < 0)
                return -1;
            if (o1.getId() - o2.getId() == 0)
                return 0;
            return 1;
        };
    }

    @Test
    void getById() {
    }

    @Test
    void create() {
    }

    @Test
    void delete() {
    }

    @Test
    void update() {
    }
}