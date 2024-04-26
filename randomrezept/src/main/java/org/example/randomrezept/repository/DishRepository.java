package org.example.randomrezept.repository;

import org.example.randomrezept.model.Category;
import org.example.randomrezept.model.Dish;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DishRepository extends JpaRepository<Dish, Integer> {

    public List<Dish> findAllByCategory(Category category);

}
