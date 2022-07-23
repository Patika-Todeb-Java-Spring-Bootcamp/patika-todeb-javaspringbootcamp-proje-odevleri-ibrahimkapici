package com.getused.second.service;

import antlr.StringUtils;
import com.getused.second.model.dto.CategoryDTO;
import com.getused.second.model.entity.Category;
import com.getused.second.model.mapper.CategoryMapper;
import com.getused.second.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public List<Category> getAllCategories(){
        List<Category> allCategories = categoryRepository.findAll();
        return allCategories;
    }

    public Category getById(Long id){
        Optional<Category> byId = categoryRepository.findById(id);
        return byId.orElseThrow(()-> new RuntimeException("Category not found"));
    }

    public Category create(CategoryDTO categoryDTO){
        Category category = CategoryMapper.toEntity(categoryDTO);
        return categoryRepository.save(category);
    }
    public void delete(long id){
        getById(id);
        categoryRepository.deleteById(id);
    }
    public Category update(String name, CategoryDTO category){
        Optional<Category> categoryByName = categoryRepository.findCategoryByName(name);
        if(!categoryByName.isPresent())
            return null;
        Category updatedCategory = categoryByName.get();
        if(!StringUtils.isEmpty(category.getName())){
            updatedCategory.setName(category.getName());
        }
        if(!StringUtils.isEmpty(category.getId())){
            updatedCategory.setId(category.getId());
        }
        return categoryRepository.save(updatedCategory);
    }
}