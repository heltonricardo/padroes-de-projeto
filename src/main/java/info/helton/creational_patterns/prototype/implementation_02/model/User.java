package info.helton.creational_patterns.prototype.implementation_02.model;

public class User implements Cloneable {

    public String name;
    public Integer age;
    public Address address;

    public User(String name, Integer age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", age=" + age + ", address=" + address + "]";
    }

    @Override
    public User clone() throws CloneNotSupportedException {
        User clone = (User) super.clone();
        clone.address = address.clone();
        return clone;
    }
}
