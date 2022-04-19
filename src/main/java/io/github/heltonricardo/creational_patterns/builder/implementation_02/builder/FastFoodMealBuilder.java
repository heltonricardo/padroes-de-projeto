package src.main.java.io.github.heltonricardo.creational_patterns.builder.implementation_02.builder;

import src.main.java.io.github.heltonricardo.creational_patterns.builder.implementation_02.model.FastFoodMeal;

public class FastFoodMealBuilder {

    // Mandatory
    private final String side;

    // Optionals
    private String main;
    private String drink;
    private String dessert;
    private String gift;

    public FastFoodMealBuilder(String side) {
        this.side = side;
    }

    public FastFoodMealBuilder andMain(String main) {
        this.main = main;
        return this;
    }

    public FastFoodMealBuilder forDrink(String drink) {
        this.drink = drink;
        return this;
    }

    public FastFoodMealBuilder andDessert(String dessert) {
        this.dessert = dessert;
        return this;
    }

    public FastFoodMealBuilder andGift(String gift) {
        this.gift = gift;
        return this;
    }

    public FastFoodMeal thatsAll() {
        return new FastFoodMeal(drink, main, side, dessert, gift);
    }
}
