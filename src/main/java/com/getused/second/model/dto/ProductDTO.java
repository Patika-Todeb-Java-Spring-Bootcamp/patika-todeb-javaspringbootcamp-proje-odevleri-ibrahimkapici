package com.getused.second.model.dto;

import com.getused.second.model.entity.Category;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDTO {
    private Long id;
    private String name;
    private String description;
    private double price;
    private Category category;

}
