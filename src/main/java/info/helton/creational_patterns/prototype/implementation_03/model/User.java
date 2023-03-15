package info.helton.creational_patterns.prototype.implementation_03.model;

public class User implements Cloneable {

    public final String name;
    public final Integer age;
    public final Address address;

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
    @SuppressWarnings({ "java:S2975", "java:S1182" })
    public User clone() throws CloneNotSupportedException {
        Address clonedAddress = address.clone();
        return new User(name, age, clonedAddress);
    }

    public Builder cloneBuilder() {
        return new Builder(name, age, address);
    }

    public static class Builder {
        private String name;
        private Integer age;
        private Address address;

        private Builder(String name, Integer age, Address address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(Integer age) {
            this.age = age;
            return this;
        }

        public Builder address(Address address) {
            this.address = address;
            return this;
        }

        public User build() {
            return new User(name, age, address);
        }
    }
}
