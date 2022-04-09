package src.main.java.io.github.heltonricardo.creational_patterns.builder.implementation_01;

import src.main.java.io.github.heltonricardo.creational_patterns.builder.implementation_01.builder.*;
import src.main.java.io.github.heltonricardo.creational_patterns.builder.implementation_01.director.MealDirector;
import src.main.java.io.github.heltonricardo.creational_patterns.builder.implementation_01.model.FastFoodMeal;

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
