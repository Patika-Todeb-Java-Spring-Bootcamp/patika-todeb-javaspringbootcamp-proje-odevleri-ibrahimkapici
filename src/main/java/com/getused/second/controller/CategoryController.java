package com.getused.second.controller;

import com.getused.second.model.dto.CategoryDTO;
import com.getused.second.model.entity.Category;
import com.getused.second.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/all")
    public List<Category> getAllCategories(){
        return categoryService.getAllCategories();
    }
    @PostMapping("/create")
    public Category create(@RequestBody CategoryDTO categoryDTO){
        return categoryService.create(categoryDTO);
    }

    @DeleteMapping
    public ResponseEntity delete(@RequestParam(name = "id") Long id){
        try {
            categoryService.delete(id);
        }catch (RuntimeException exception){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.status(HttpStatus.OK).body("Related Category was deleted successfully");
    }

    public ResponseEntity updateCategory(
            @PathVariable String name,
            @RequestBody CategoryDTO category) {
        Category update = categoryService.update(name, category);
        if (update == null) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Category update failed");
        }
        return ResponseEntity.status(HttpStatus.OK).body(update);
    }

}


