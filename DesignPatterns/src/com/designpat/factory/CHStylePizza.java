package com.designpat.factory;

public class CHStylePizza extends Pizza {

    public CHStylePizza() {
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add("Shredded Mozzarella Cheese");
    }

    @Override
    void bake() {
        System.out.println("Baking chicago style pizza ");
    }
}
