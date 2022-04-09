package src.main.java.io.github.heltonricardo.creational_patterns.builder.implementation_01.builder;

public class FatMealBuilder extends FastFoodMealBuilder {

    @Override
    public void buildDrink() {
        meal.setDrink("Large soda");
    }

    @Override
    public void buildMain() {
        meal.setMain("Two number 9 and a number 6 with extra dip");
    }

    @Override
    public void buildSide() {
        meal.setSide("A number 7 and two number 45's - one with cheese");
    }

    @Override
    public void buildDessert() {
        meal.setDessert("Large ice cream");
    }

    @Override
    public void buildGift() {
        meal.setGift("Toy train");
    }
}
