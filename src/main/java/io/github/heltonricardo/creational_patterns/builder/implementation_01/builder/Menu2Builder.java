package io.github.heltonricardo.creational_patterns.builder.implementation_01.builder;

public class Menu2Builder extends FastFoodMealBuilder {

    @Override
    public void buildMain() {
        meal.setMain("Mac and cheese");
    }

    @Override
    public void buildDessert() {
        meal.setDessert("Mini apple pie");
    }
}
