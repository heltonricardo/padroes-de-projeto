package src.main.java.io.github.heltonricardo.creational_patterns.prototype.implementation_02.model;

public class Address implements Cloneable {

    public String street;
    public Integer number;

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
}
