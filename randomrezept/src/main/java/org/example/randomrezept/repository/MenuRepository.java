package org.example.randomrezept.repository;

import org.example.randomrezept.model.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.*;

public interface MenuRepository extends JpaRepository <Menu, Integer> {

}
