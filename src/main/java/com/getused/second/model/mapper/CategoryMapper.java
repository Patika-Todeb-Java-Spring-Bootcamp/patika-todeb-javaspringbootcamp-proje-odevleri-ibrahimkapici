package com.getused.second.model.mapper;

import com.getused.second.model.dto.CategoryDTO;
import com.getused.second.model.entity.Category;

public class CategoryMapper {
    public static CategoryDTO toDTO(Category category) {
        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setName(category.getName());
        return categoryDTO;
    }

    public static Category toEntity(CategoryDTO categoryDTO) {
        Category category = new Category();
        category.setId(categoryDTO.getId());
        category.setName(categoryDTO.getName());
        return category;
    }
}
