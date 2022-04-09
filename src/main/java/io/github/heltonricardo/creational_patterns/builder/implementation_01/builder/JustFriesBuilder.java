package src.main.java.io.github.heltonricardo.creational_patterns.builder.implementation_01.builder;

public class JustFriesBuilder extends FastFoodMealBuilder {

    @Override
    public void buildSide() {
        meal.setSide("Large fries");
    }
}
