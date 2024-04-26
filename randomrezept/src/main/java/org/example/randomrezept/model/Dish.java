package org.example.randomrezept.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dish {

    @Id
    @GeneratedValue
    private Integer id;
    @NotBlank
    private String name;
    @NotBlank
    private String preparation;

    @JsonIgnoreProperties("dishes")
    @ManyToMany(mappedBy = "dishes")
    List<Menu> menus = new ArrayList<>();
    private Boolean meat;
    private Boolean nuts;

    @JsonIgnoreProperties("dishes")
    @ManyToOne
    Category category;

    private String img_url;


}
