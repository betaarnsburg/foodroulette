-- noinspection SqlNoDataSourceInspectionForFile

-- noinspection SqlDialectInspectionForFile
INSERT INTO category (id, name) VALUES (1001, 'Soup');
INSERT INTO category (id, name) VALUES (1002, 'Main Dish');
INSERT INTO category (id, name) VALUES (1003, 'Side Dish');
INSERT INTO category (id, name) VALUES (1004, 'Salad');
INSERT INTO category (id, name) VALUES (1005, 'Dessert');


-- Sweet Potato Balls With Mango Chutney
INSERT INTO dish (id, name, preparation, meat, nuts, category_id, img_url) VALUES
    (1001, 'Sweet Potato Balls With Mango Chutney',
     'Boil or roast sweet potatoes until tender. Mash them and add flour, sugar, and spices (e.g., cinnamon, nutmeg) to form a dough. Roll the dough into balls and fry until golden brown. Serve with a side of mango chutney.',
     false, false, 1005, 'https://www.pinterest.com/pin/thai-dessert-sweet-potato-balls-fried-potato-ball-on-colorful-stock-photo-image-of-plate-street-7939--174866398021999432/');

-- Teriyaki Chicken Skewers
INSERT INTO dish (id, name, preparation, meat, nuts, category_id, img_url) VALUES
    (1002, 'Teriyaki Chicken Skewers',
     'Marinate chicken pieces in a mixture of soy sauce, mirin, sake, and ginger. Thread the chicken onto skewers and grill or bake until cooked through. Baste with the remaining marinade while cooking for a teriyaki glaze.',
     true, false, 1002, 'https://www.istockphoto.com/photos/teriyaki-chicken-kabobs');

-- Papaya Salad
INSERT INTO dish (id, name, preparation, meat, nuts, category_id, img_url) VALUES
    (1003, 'Papaya Salad',
     'Shred unripe papaya and green beans. Add cherry tomatoes, fish sauce, lime juice, sugar, and chili flakes for a dressing. Toss everything together and serve.',
     false, false, 1004, 'https://www.istockphoto.com/photos/papaya-salad');

-- Roasted Cauliflower With Basil And Mushrooms
INSERT INTO dish (id, name, preparation, meat, nuts, category_id, img_url) VALUES
    (1004, 'Roasted Cauliflower With Basil And Mushrooms',
     'Cut cauliflower florets into bite-sized pieces.',
     false, false, 1003, 'https://www-marthastewart-com.cdn.ampproject.org/c/www.marthastewart.com/1163533/cauliflower-and-mushroom-roast?amp');

-- Coconut Curry Soup With Prawns
INSERT INTO dish (id, name, preparation, meat, nuts, category_id, img_url) VALUES
    (1005, 'Coconut Curry Soup With Prawns',
     'Saute onions and curry paste in coconut milk. Add vegetables like carrots and bell peppers.',
     false, false, 1001, 'https://damndelicious.net/2015/02/18/easy-thai-shrimp-soup/');

-- Rote Gruetze
INSERT INTO dish (id, name, preparation, meat, nuts, category_id, img_url) VALUES
    (1006, 'Rote Gruetze',
     'Mix red fruits (e.g., berries, cherries) with sugar and lemon juice. Let it sit for some time to release juices.',
     false, false, 1005, 'https://www.internationaldessertsblog.com/german-rote-grutze-red-berry-dessert-with-cream/');

-- Rhineland Sauerbraten
INSERT INTO dish (id, name, preparation, meat, nuts, category_id, img_url) VALUES
    (1007, 'Rhineland Sauerbraten',
     'Marinate beef roast in a mixture of red wine, vinegar, and various spices for several days.',
     true, false, 1002, 'https://www.istockphoto.com/photos/sauerbraten');

-- Sauerkraut Salad
INSERT INTO dish (id, name, preparation, meat, nuts, category_id, img_url) VALUES
    (1008, 'Sauerkraut Salad',
     'Drain sauerkraut and rinse it to remove some of the tartness. Mix with chopped onions, apples, and caraway seeds.',
     false, false, 1004, 'https://www.simplystacie.net/sauerkraut-salad/');

-- Bavarian Bread Dumplings
INSERT INTO dish (id, name, preparation, meat, nuts, category_id, img_url) VALUES
    (1009, 'Bavarian Bread Dumplings',
     'Soak stale bread rolls in milk or broth. Mix with chopped onions, parsley, and eggs. Season with salt and pepper.',
     false, false, 1003, 'https://www.saveur.com/article/Recipes/Bavarian-Bread-Dumplings/');

-- German Potato Soup
INSERT INTO dish (id, name, preparation, meat, nuts, category_id, img_url) VALUES
    (1010, 'German Potato Soup',
     'Boil potatoes, onions, celery, and carrots in vegetable broth until tender. ',
     false, false, 1001, 'https://www.foodnetwork.com/recipes/alton-brown/german-potato-soup-recipe-1940640');

-- Roti
INSERT INTO dish (id, name, preparation, meat, nuts, category_id, img_url) VALUES
    (1011, 'Roti',
     'Mix whole wheat flour with water and salt to form a dough. Knead the dough until smooth and elastic.',
     false, false, 1003, 'https://www.bbcgoodfood.com/recipes/how-to-make-roti-2');

-- Red Lentil Curry Soup
INSERT INTO dish (id, name, preparation, meat, nuts, category_id, img_url) VALUES
    (1012, 'Red Lentil Curry Soup',
     'Saute onions, garlic, and spices (e.g., cumin, coriander) in oil. Add red lentils and water or vegetable broth.',
     false, false, 1001, 'https://minimalistbaker.com/easy-red-lentil-soup/');

-- Gulab Jamun
INSERT INTO dish (id, name, preparation, meat, nuts, category_id, img_url) VALUES
    (1013, 'Gulab Jamun',
     'Mix milk powder, flour, and semolina to form a dough. Knead the dough until smooth and shape it into small balls.',
     false, false, 1005, 'https://www.indianhealthyrecipes.com/gulab-jamun-recipe/');

-- Paneer Tikka Masala
INSERT INTO dish (id, name, preparation, meat, nuts, category_id, img_url) VALUES
    (1014, 'Paneer Tikka Masala',
     'Marinate paneer cubes in a mixture of yogurt, spices (e.g., garam masala, turmeric), and lemon juice.',
     false, false, 1002, 'https://www.bbcgoodfood.com/recipes/paneer-tikka-masala-recipe-16863');

-- Kachumber Salad
INSERT INTO dish (id, name, preparation, meat, nuts, category_id, img_url) VALUES
    (1015, 'Kachumber Salad',
     'Finely chop onions, tomatoes, cucumbers, and cilantro. Add chopped green chilies for a spicy kick (optional). ',
     false, false, 1004, 'https://www.indianhealthyrecipes.com/kachumber-salad-recipe/');

-- Flan de Huevos
INSERT INTO dish (id, name, preparation, meat, nuts, category_id, img_url) VALUES
    (1016, 'Flan de Huevos',
     'Whisk together eggs, sugar, milk, and vanilla extract. Pour the mixture into a caramel-lined baking dish. ',
     false, false, 1005, 'https://www.foodnetwork.com/recipes/emeril-lagasse/classic-flan-de-huevos-recipe-1911903');

-- Asado Argentino
INSERT INTO dish (id, name, preparation, meat, nuts, category_id, img_url) VALUES
    (1017, 'Asado Argentino',
     'Asado is a traditional Argentinian barbecue featuring grilled meats like beef (steaks, ribs), sausage (chorizo)',
     true, false, 1002, 'https://media.vogue.mx/photos/653192924eca207f85d0c0f2/master/w_960,c_limit/asado-argentino-2.jpg');

-- Guacamole Salad
INSERT INTO dish (id, name, preparation, meat, nuts, category_id, img_url) VALUES
    (1018, 'Guacamole Salad',
     'Mash ripe avocados with lime juice, salt, and pepper. Optionally, add chopped onions, tomatoes, cilantro',
     false, false, 1004, 'https://www.einfachbacken.de/sites/einfachbacken.de/files/styles/973_730/public/2023-11/guacamole_5093.jpg?h=4521fff0&itok=l8Ofaful');

-- Patacones y Tostones
INSERT INTO dish (id, name, preparation, meat, nuts, category_id, img_url) VALUES
    (1019, 'Patacones y Tostones',
     'Peel green plantains and slice them into thick pieces. Fry the plantains twice: once at a lower temperature to soften them',
     false, false, 1003, 'https://img.chefkoch-cdn.de/rezepte/1959161318600824/bilder/550410/crop-642x428/don-diegos-patacones-y-tostones.jpg');

-- Cazuela
INSERT INTO dish (id, name, preparation, meat, nuts, category_id, img_url) VALUES
    (1020, 'Cazuela',
     'This hearty stew varies by region, but typically includes meat (chicken, seafood, or beef), vegetables (potatoes, carrots, corn)',
     true, false, 1001, 'https://media-cdn.tripadvisor.com/media/photo-s/1b/b7/c5/c9/cazuela-manabita-nuestra.jpg');

-- Baklava
INSERT INTO dish (id, name, preparation, meat, nuts, category_id, img_url) VALUES
    (1021, 'Baklava',
     'Layer filo pastry with chopped nuts (pistachios, walnuts) and spices like cinnamon. Drizzle with melted butter or ghee. ',
     false, true, 1005, 'https://www.einfachbacken.de/sites/einfachbacken.de/files/styles/973_730/public/2020-04/baklava.jpg?h=4521fff0&itok=NxiGLb8Q');

-- Greek Moussaka
INSERT INTO dish (id, name, preparation, meat, nuts, category_id, img_url) VALUES
    (1022, 'Greek Moussaka',
     'Layer sauteed ground lamb or beef with sliced eggplant and a creamy bechamel sauce. Bake until golden brown and bubbly. ',
     true, false, 1002, 'https://www.themediterraneandish.com/wp-content/uploads/2021/10/moussaka-recipe-75-1024x1536.jpg');

-- Mediterranean Chopped Salad
INSERT INTO dish (id, name, preparation, meat, nuts, category_id, img_url) VALUES
    (1023, 'Mediterranean Chopped Salad',
     'Combine chopped tomatoes, cucumbers, onions, feta cheese, olives, and fresh herbs (e.g., parsley, mint) in a bowl. ',
     false, false, 1004, 'https://feelgoodfoodie.net/wp-content/uploads/2019/02/Mediterranean-Chopped-Salad-12-1024x1536.jpg');

-- Falafel
INSERT INTO dish (id, name, preparation, meat, nuts, category_id, img_url) VALUES
    (1024, 'Falafel',
     'Grind chickpeas, herbs (parsley, cilantro), spices (cumin, coriander) and onion to form a paste. ',
     false, false, 1002, 'https://toriavey.com/images/2011/01/TOA109_18-740x555.jpeg');

-- Mediterranean White Bean Soup
INSERT INTO dish (id, name, preparation, meat, nuts, category_id, img_url) VALUES
    (1025, 'Mediterranean White Bean Soup',
     'Saute onions, garlic, and spices (e.g., oregano, thyme) in olive oil. Add cannellini beans, vegetable broth, and chopped tomatoes.',
     false, false, 1001, 'https://feelgoodfoodie.net/wp-content/uploads/2023/04/Mediterranean-White-Bean-Soup-09-1024x1536.jpg');


