package com.getused.second.model.entity;

import com.getused.second.model.dto.ProductDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "product")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private double price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn()
    private Category category;

    public static final class ProductBuilder {
        private Long id;
        private String name;
        private String description;
        private double price;

        private Category category;

        private ProductBuilder() {

        }

        public static Product.ProductBuilder aProductDTO() {
            return new Product.ProductBuilder();
        }

        public Product.ProductBuilder id(Long id) {
            this.id = id;
            return this;
        }


        public Product.ProductBuilder name(String name){
            this.name = name;
            return this;
        }

        public Product.ProductBuilder description(String description){
            this.description = description;
            return this;
        }

        public Product.ProductBuilder price(Category category){
            this.category = category;
            return this;
        }

        public Product.ProductBuilder price(Double price){
            this.price = price;
            return this;
        }

        public Product build(){
            Product product = new Product();
            product.setId(id);
            product.setName(name);
            product.setDescription(description);
            product.setPrice(price);
            return product;
        }
    }
}
