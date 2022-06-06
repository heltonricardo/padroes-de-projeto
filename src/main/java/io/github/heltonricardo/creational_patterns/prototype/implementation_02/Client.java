package src.main.java.io.github.heltonricardo.creational_patterns.prototype.implementation_02;

import src.main.java.io.github.heltonricardo.creational_patterns.prototype.implementation_02.model.Address;
import src.main.java.io.github.heltonricardo.creational_patterns.prototype.implementation_02.model.User;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {

        User user = new User("Original", 25, new Address("ABC Street", 1000));
        System.out.println(user);

        User cloneUser = user.clone();
        cloneUser.name = "Clone x2";
        cloneUser.address.street = "Double Street";
        System.out.println(user);
        System.out.println(cloneUser);
    }
}
