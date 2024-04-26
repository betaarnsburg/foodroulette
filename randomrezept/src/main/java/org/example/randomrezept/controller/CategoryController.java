package org.example.randomrezept.controller;

import lombok.AllArgsConstructor;
import org.example.randomrezept.model.Category;
import org.example.randomrezept.model.Dish;
import org.example.randomrezept.service.CategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/category")
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:4200/")
public class CategoryController {

    CategoryService categoryService;

    @GetMapping("")
    public ResponseEntity<ArrayList<Category>> getAllCategories(){
        return ResponseEntity.ok(categoryService.getAllCategories());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Category> findCategoryById(@PathVariable Integer id){
        return ResponseEntity.of(categoryService.getCategoryById(id));
    }

    @PostMapping("")
    public ResponseEntity<Void> addCategory(@RequestBody @Validated Category newCategory){
       categoryService.addCategory(newCategory);
        return ResponseEntity.ok().build();
    }

    @PutMapping("")
    public ResponseEntity<Void> changeCategory(@RequestBody @Validated Category changedCategory){
        categoryService.changeCategory(changedCategory);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCategoryById(@PathVariable Integer id){
        categoryService.deleteCategoryById(id);
        return ResponseEntity.ok().build();
    }
}

