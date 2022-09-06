package info.helton.creational_patterns.builder.implementation_01.builder;

public class JustFriesBuilder extends FastFoodMealBuilder {

    @Override
    public void buildSide() {
        meal.setSide("Large fries");
    }
}
