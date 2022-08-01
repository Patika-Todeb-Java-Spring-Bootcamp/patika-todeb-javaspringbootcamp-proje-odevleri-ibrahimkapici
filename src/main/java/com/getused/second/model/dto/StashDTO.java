package com.getused.second.model.dto;

import com.getused.second.model.entity.Product;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class StashDTO {

    private Long id;
    private List<Product> productList;
    private Product product;



    public static final class StashDTOBuilder {
        private Long id;
        private List<Product> productList;
        private Product product;

        private StashDTOBuilder() {

        }

        public static StashDTOBuilder aStashDTO() {
            return new StashDTOBuilder();
        }

        public StashDTOBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public StashDTOBuilder productList(List<Product> products) {
            this.productList = products;
            return this;

        }

        public StashDTOBuilder product(Product product){
            this.product = product;
            return this;
        }

        public StashDTO build(){
            StashDTO stashDTO = new StashDTO();
            stashDTO.setId(id);
            stashDTO.setProductList(productList);
            stashDTO.setProduct(product);
            return stashDTO;
        }
    }
}
