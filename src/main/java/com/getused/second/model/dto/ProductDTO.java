package com.getused.second.model.dto;

import com.getused.second.model.entity.Category;
import com.getused.second.model.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {
    private Long id;
    private String name;
    private String description;
    private double price;
    private Category category;


    public static final class ProductDTOBuilder {
        private Long id;
        private String name;
        private String description;
        private double price;
        private Category category;

        private ProductDTOBuilder() {

        }

        public static ProductDTOBuilder aProductDTO() {
            return new ProductDTOBuilder();
        }

        public ProductDTO.ProductDTOBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public ProductDTO.ProductDTOBuilder category(Category category) {
            this.category= category;
            return this;

        }

        public ProductDTO.ProductDTOBuilder name(String name){
            this.name = name;
            return this;
        }

        public ProductDTO.ProductDTOBuilder description(String description){
            this.description = description;
            return this;
        }

        public ProductDTO.ProductDTOBuilder price(Double price){
            this.price = price;
            return this;
        }

        public ProductDTO build(){
            ProductDTO productDTO = new ProductDTO();
            productDTO.setId(id);
            productDTO.setName(name);
            productDTO.setDescription(description);
            productDTO.setCategory(category);
            productDTO.setPrice(price);
            return productDTO;
        }
    }

}
