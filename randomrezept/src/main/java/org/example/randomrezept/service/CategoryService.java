package org.example.randomrezept.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.example.randomrezept.model.Category;
import org.example.randomrezept.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@Data
public class CategoryService {
    private CategoryRepository categoryRepository;

    public ArrayList<Category> getAllCategories(){
        return (ArrayList<Category>) categoryRepository.findAll();
    }

    public Optional<Category> getCategoryById(Integer id){
        return categoryRepository.findById(id);
    }
    public void addCategory(Category newCategory){
        categoryRepository.save(newCategory);
    }
    public void changeCategory(Category changedCategory){
        if (changedCategory.getId() != null){
            categoryRepository.save(changedCategory);
        }
    }

    public void deleteCategoryById(Integer id){
        categoryRepository.deleteById(id);
    }
}
