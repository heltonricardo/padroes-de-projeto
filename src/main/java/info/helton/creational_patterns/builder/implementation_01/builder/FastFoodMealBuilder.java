package info.helton.creational_patterns.builder.implementation_01.builder;

import info.helton.creational_patterns.builder.implementation_01.model.FastFoodMeal;

public abstract class FastFoodMealBuilder {

    protected FastFoodMeal meal;

    protected FastFoodMealBuilder() {
        this.meal = new FastFoodMeal();
    }

    public FastFoodMeal getMeal() {
        return meal;
    }

    public void buildDrink() {
    }

    public void buildMain() {
    }

    public void buildSide() {
    }

    public void buildDessert() {
    }

    public void buildGift() {
    }
}
