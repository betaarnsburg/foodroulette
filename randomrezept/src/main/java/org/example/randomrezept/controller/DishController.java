package org.example.randomrezept.controller;

import lombok.AllArgsConstructor;
import org.example.randomrezept.model.Dish;
import org.example.randomrezept.service.DishService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dish")
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:4200/")
public class DishController {

    DishService dishService;

    @GetMapping("")
    public ResponseEntity<List<Dish>> getAllDishes(){

        return ResponseEntity.ok(dishService.getAllDishes());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Dish> findDishById(@PathVariable Integer id) {
        return ResponseEntity.of(dishService.findDishById(id));
    }

    @PostMapping("")
    public ResponseEntity<Void> addDish(@RequestBody @Validated Dish newDish){
        dishService.addDish(newDish);
        return ResponseEntity.ok().build();
    }

    @PutMapping("")
    public ResponseEntity<Void> changeDish(@RequestBody @Validated Dish changedDish) {
        dishService.changeDish(changedDish);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDishById(@PathVariable Integer id){
        dishService.deleteDishById(id);
        return ResponseEntity.ok().build();
    }

}
