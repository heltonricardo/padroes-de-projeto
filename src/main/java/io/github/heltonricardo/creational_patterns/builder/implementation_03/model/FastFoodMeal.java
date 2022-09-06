package io.github.heltonricardo.creational_patterns.builder.implementation_03.model;

/* Usando Record: seus componentes (equivalentes aos atributos de uma Classe) serão sempre 'private final', ou seja, só
 * podem ser definidos através do construtor padrão gerado (com todos os componentes). Por padrão, a Record cria os
 * getters, e implementa os métodos toString(), hashCode() e equals().
 */

public record FastFoodMeal(

        String main,
        String drink,
        String side,
        String dessert,
        String gift) {

    public static class Builder {

        // Mandatory
        private final String side;

        // Optionals
        private String main;
        private String drink;
        private String dessert;
        private String gift;

        public Builder(String side) {
            this.side = side;
        }

        public Builder andMain(String main) {
            this.main = main;
            return this;
        }

        public Builder forDrink(String drink) {
            this.drink = drink;
            return this;
        }

        public Builder andDessert(String dessert) {
            this.dessert = dessert;
            return this;
        }

        public Builder andGift(String gift) {
            this.gift = gift;
            return this;
        }

        public FastFoodMeal thatsAll() {
            return new FastFoodMeal(main, drink, side, dessert, gift);
        }
    }
}
