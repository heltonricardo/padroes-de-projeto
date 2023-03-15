package info.helton.creational_patterns.builder.implementation_01;

import info.helton.creational_patterns.builder.implementation_01.builder.FastFoodMealBuilder;
import info.helton.creational_patterns.builder.implementation_01.builder.FatMealBuilder;
import info.helton.creational_patterns.builder.implementation_01.builder.JustFriesBuilder;
import info.helton.creational_patterns.builder.implementation_01.builder.Menu1Builder;
import info.helton.creational_patterns.builder.implementation_01.builder.Menu2Builder;
import info.helton.creational_patterns.builder.implementation_01.director.MealDirector;
import info.helton.creational_patterns.builder.implementation_01.model.FastFoodMeal;

public class ClientBuilder1 {

    private static void order(FastFoodMealBuilder builder) {
        MealDirector director = new MealDirector(builder);
        director.constructCombo();
        FastFoodMeal combo = director.getCombo();
        System.out.println(combo);
        System.out.println("==================");
    }

    public static void main(String[] args) {
        order(new FatMealBuilder());
        order(new Menu1Builder());
        order(new JustFriesBuilder());
        order(new Menu2Builder());
    }
}
