package info.helton.creational_patterns.prototype.implementation_02;

import info.helton.creational_patterns.prototype.implementation_02.model.Address;
import info.helton.creational_patterns.prototype.implementation_02.model.User;

public class ClientPrototype2 {

    public static void main(String[] args) throws CloneNotSupportedException {

        User user = new User("Original", 25, new Address("ABC Street", 1000));
        System.out.println(user);

        User cloneUser = user.clone();
        cloneUser.name = "Clone";
        cloneUser.address.street = "Double Street";

        System.out.println(user);
        System.out.println(cloneUser);
    }
}
