package org.example.randomrezept.service;

import lombok.AllArgsConstructor;
import org.example.randomrezept.model.Category;
import org.example.randomrezept.model.Dish;
import org.example.randomrezept.model.Menu;
import org.example.randomrezept.repository.CategoryRepository;
import org.example.randomrezept.repository.DishRepository;
import org.example.randomrezept.repository.MenuRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
@AllArgsConstructor
public class MenuService {
    MenuRepository menuRepository;
    CategoryRepository categoryRepository;
    DishRepository dishRepository;


    public Menu saveMenu(Menu menu) {
        return menuRepository.save(menu);
    }

    public void deleteMenu(Integer id) {
        menuRepository.deleteById(id);
    }

    public Menu randomizeMenu(Boolean noMeat, Boolean noNuts) {

        Menu menu = new Menu();
        List<Category> categories= categoryRepository.findAll();

        for (Category category : categories) {
            if(noMeat && noNuts){
                List<Dish> dishes = dishRepository.findAllByCategory(category)
                        .stream()
                        .filter(dish -> !dish.getMeat())
                        .filter(dish -> !dish.getNuts())
                        .toList();
                Dish randomDish = dishes.get(new Random().nextInt(dishes.size()));
                menu.getDishes().add(randomDish);
            } else if (noMeat) {
                List<Dish> dishes = dishRepository.findAllByCategory(category)
                        .stream()
                        .filter(dish -> !dish.getMeat())
                        .toList();
                Dish randomDish = dishes.get(new Random().nextInt(dishes.size()));
                menu.getDishes().add(randomDish);
            } else if (noNuts) {
                List<Dish> dishes = dishRepository.findAllByCategory(category)
                        .stream()
                        .filter(dish -> !dish.getNuts())
                        .toList();
                Dish randomDish = dishes.get(new Random().nextInt(dishes.size()));
                menu.getDishes().add(randomDish);
            } else {
                List<Dish> dishes = dishRepository.findAllByCategory(category);
                Dish randomDish = dishes.get(new Random().nextInt(dishes.size()));
                menu.getDishes().add(randomDish);
            }
        }
        menu.setName("Today's menu");
//        menuRepository.save(menu);
        return menu;
    }

    public List<Menu> getAllMenus() {
        return menuRepository.findAll();
    }
}

/*

    public Dish chooseDish(){
        menuRepository.
    }

@Service
public class MenuService {

    public Menu generateMenu() {
        Menu menu = new Menu();

        // Zufällige Kategorie für jede Speisekategorie auswählen
        for (Category category : categoryRepository.findAll()) {
            List<Dish> dishes = dishRepository.findByCategory(category);
            Dish randomDish = dishes.get(new Random().nextInt(dishes.size()));
            menu.addDish(category, randomDish);
        }

        return menu;
    }
}

 */
