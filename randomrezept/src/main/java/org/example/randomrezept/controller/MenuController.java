package org.example.randomrezept.controller;

import lombok.AllArgsConstructor;
import org.example.randomrezept.model.Category;
import org.example.randomrezept.model.Dish;
import org.example.randomrezept.model.Menu;
import org.example.randomrezept.service.MenuService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/menu")
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:4200/")
public class MenuController {

    MenuService menuService;

    @GetMapping("")
    public ResponseEntity<List<Menu>> getMenus(){
        return ResponseEntity.ok(menuService.getAllMenus());
    }

    @PostMapping
    public ResponseEntity<Menu> saveMenu(@RequestBody Menu menu) {
        return ResponseEntity.ok(menuService.saveMenu(menu));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteMenu(@PathVariable Integer id) {
        menuService.deleteMenu(id);
        return ResponseEntity.ok().build();
    }


    @GetMapping("/randomizer/{noMeat}/{noNuts}")
    public ResponseEntity<Menu> randomizeMenu(@PathVariable("noMeat") Boolean noMeat, @PathVariable("noNuts") Boolean noNuts) {

      return ResponseEntity.ok(menuService.randomizeMenu(noMeat, noNuts));
    }
}
