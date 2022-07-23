package com.getused.second.model.entity;

import lombok.Data;


@Data
public class Product {
    private Long id;
    private String name;
    private String description;
    private double price;

    private String category;
}
