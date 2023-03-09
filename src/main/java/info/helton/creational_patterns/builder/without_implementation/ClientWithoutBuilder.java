package info.helton.creational_patterns.builder.without_implementation;

import info.helton.creational_patterns.builder.without_implementation.model.FastFoodMeal;

public class ClientWithoutBuilder {

    public static void main(String[] args) {

        FastFoodMeal burguerCombo = new FastFoodMeal("Coke", "CheeseBurguer", "Fries");
        System.out.println(burguerCombo);

        FastFoodMeal justFries = new FastFoodMeal(null, null, "Fries");
        System.out.println(justFries);

        FastFoodMeal heartAttackCombo = new FastFoodMeal("Milk Shake", "Monster Burguer", "Large Fries", "Fudge Cake",
                "2 Kilograms");
        System.out.println(heartAttackCombo);
    }
}