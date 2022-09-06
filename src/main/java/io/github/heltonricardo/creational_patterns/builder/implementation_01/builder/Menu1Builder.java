package io.github.heltonricardo.creational_patterns.builder.implementation_01.builder;

public class Menu1Builder extends FastFoodMealBuilder {

    @Override
    public void buildDrink() {
        meal.setDrink("Coke");
    }

    @Override
    public void buildMain() {
        meal.setMain("Cheeseburger");
    }

    @Override
    public void buildDessert() {
        meal.setDessert("Apple");
    }
}
