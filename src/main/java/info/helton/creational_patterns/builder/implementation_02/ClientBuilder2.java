package info.helton.creational_patterns.builder.implementation_02;

import info.helton.creational_patterns.builder.implementation_02.builder.FastFoodMealBuilder;
import info.helton.creational_patterns.builder.implementation_02.model.FastFoodMeal;

public class ClientBuilder2 {

    public static void main(String[] args) {

        FastFoodMeal burgerCombo = new FastFoodMealBuilder("Fries")
                .forDrink("Coke")
                .andMain("CheeseBurger")
                .thatsAll();
        System.out.println(burgerCombo);

        FastFoodMeal justFries = new FastFoodMealBuilder("Large Fries")
                .thatsAll();
        System.out.println(justFries);

        FastFoodMeal heartAttackCombo = new FastFoodMealBuilder("A number 7 and two number 45's - one with cheese")
                .andMain("Two number 9 and a number 6 with extra dip")
                .andGift("Toy train")
                .andDessert("Large ice cream")
                .forDrink("Large soda")
                .thatsAll();
        System.out.println(heartAttackCombo);
    }
}
