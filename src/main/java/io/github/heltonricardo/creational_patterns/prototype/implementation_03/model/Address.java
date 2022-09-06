package io.github.heltonricardo.creational_patterns.prototype.implementation_03.model;

public class Address implements Cloneable {

    public final String street;
    public final Integer number;

    public Address(String street, Integer number) {
        this.street = street;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Address [street=" + street + ", number=" + number + "]";
    }

    @Override
    public Address clone() throws CloneNotSupportedException {
        return (Address) super.clone();
    }

    public static class Builder {
        private String street;
        private Integer number;

        private Builder(String street, Integer number) {
            this.street = street;
            this.number = number;
        }

        public Builder street(String street) {
            this.street = street;
            return this;
        }

        public Builder number(Integer number) {
            this.number = number;
            return this;
        }

        public Address build() {
            return new Address(street, number);
        }
    }
}
