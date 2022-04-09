package src.main.java.io.github.heltonricardo.creational_patterns.builder.implementation_01.model;

public class FastFoodMeal {

    private String drink;
    private String main;
    private String side;
    private String dessert;
    private String gift;

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public String getDessert() {
        return dessert;
    }

    public void setDessert(String dessert) {
        this.dessert = dessert;
    }

    public String getGift() {
        return gift;
    }

    public void setGift(String gift) {
        this.gift = gift;
    }

    @Override
    public String toString() {
        return "Combo [drink=" + drink + ", main=" + main + ", side=" + side + ", dessert=" + dessert + ", " + "gift" +
                "=" + gift + "]";
    }
}
