package io.github.heltonricardo.creational_patterns.builder.implementation_03;

import io.github.heltonricardo.creational_patterns.builder.implementation_03.model.FastFoodMeal;

public class ClientBuilder3 {

    public static void main(String[] args) {

        FastFoodMeal meal = new FastFoodMeal
                .Builder("Fries")
                .andGift("Ball")
                .andDessert("Ice Cream")
                .andMain("X-Burger")
                .forDrink("Milkshake")
                .thatsAll();

        System.out.println(meal);
    }
}
