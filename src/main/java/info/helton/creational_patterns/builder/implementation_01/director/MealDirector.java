package info.helton.creational_patterns.builder.implementation_01.director;

import info.helton.creational_patterns.builder.implementation_01.builder.FastFoodMealBuilder;
import info.helton.creational_patterns.builder.implementation_01.model.FastFoodMeal;

public class MealDirector {

    private final FastFoodMealBuilder builder;

    public MealDirector(FastFoodMealBuilder builder) {
        this.builder = builder;
    }

    public void constructCombo() {
        builder.buildDrink();
        builder.buildMain();
        builder.buildMain();
        builder.buildSide();
        builder.buildDessert();
        builder.buildGift();
    }

    public FastFoodMeal getCombo() {
        return builder.getMeal();
    }
}
