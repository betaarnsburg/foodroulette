package org.example.randomrezept.service;

import lombok.AllArgsConstructor;
import org.example.randomrezept.model.Dish;
import org.example.randomrezept.repository.DishRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class DishService {
    DishRepository dishRepository;


    public List<Dish> getAllDishes(){
        return dishRepository.findAll();
    }
    public void addDish(Dish newDish){
        dishRepository.save(newDish);
    }

    public void changeDish(Dish changedDish){

        if(changedDish.getId()!= null){
            dishRepository.save(changedDish);
        }
        //dishRepository.findById(id).get().setPreparation(changedDish.setPreparation(););
    }

    public void deleteDishById(Integer id){

        dishRepository.deleteById(id);
    }

    public Optional<Dish> findDishById(Integer id) {

        return dishRepository.findById(id);
    }
}
