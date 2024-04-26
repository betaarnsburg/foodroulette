package org.example.randomrezept;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.http.WebSocket;

@SpringBootApplication
public class RandomRezeptApplication {

    public static void main(String[] args) {
        SpringApplication.run(RandomRezeptApplication.class, args);
    }

}




/*
aus Repository ganze Liste holen

Array "Salate" - wie lang ist die Liste?

Menü = Entität
(Random Kombination aus Kategorien)

Kategorie = Entität -> OneToMany
(Salad, Side Dish, etc)

Datenbank mit einzelnen Dishes
Datenbank mit Menüs



*/
