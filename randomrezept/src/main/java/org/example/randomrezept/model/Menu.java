package org.example.randomrezept.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

import static java.awt.SystemColor.menu;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Menu {
    @Id
    @GeneratedValue
    Integer id;

    private String name;

    @JsonIgnoreProperties("menus")
    @ManyToMany
    List<Dish> dishes = new ArrayList<>();

/*  Dish soups;
    Dish mainDish;
    Dish sideDish;
    Dish salad;
    Dish dessert;
*/
}


