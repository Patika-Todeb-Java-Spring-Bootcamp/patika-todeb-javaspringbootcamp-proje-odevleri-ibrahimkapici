package com.getused.second.model.mapper;

import com.getused.second.model.dto.CategoryDTO;
import com.getused.second.model.dto.ProductDTO;
import com.getused.second.model.entity.Product;

public class ProductMapper {
        public static ProductDTO toDTO(Product product) {
            ProductDTO productDTO = new ProductDTO();
            productDTO.setId(product.getId());
            productDTO.setName(product.getName());
            productDTO.setCategory(product.getCategory());
            productDTO.setDescription(product.getDescription());
            productDTO.setPrice(product.getPrice());
            return productDTO;
        }

        public static Product toEntity(ProductDTO productDTO) {
            Product product = new Product();
            product.setId(productDTO.getId());
            product.setName(productDTO.getName());
            product.setCategory(productDTO.getCategory());
            product.setDescription(productDTO.getDescription());
            product.setPrice(productDTO.getPrice());
            return product;
        }
}
