package info.helton.creational_patterns.prototype.implementation_03;

import info.helton.creational_patterns.prototype.implementation_03.model.Address;
import info.helton.creational_patterns.prototype.implementation_03.model.User;

public class ClientPrototype3 {

    public static void main(String[] args) throws CloneNotSupportedException {

        User originalUser = new User("Ana", 20, new Address("A street", 1));

        User clonedUser1 = originalUser.clone();

        User clonedUser2 = originalUser
                .cloneBuilder()
                .name("Ivo")
                .build();

        User clonedUser3 = clonedUser2
                .cloneBuilder()
                .name("Ada")
                .age(30)
                .address(new Address("B street", 2))
                .build();

        System.out.println(originalUser);
        System.out.println(clonedUser1);
        System.out.println(clonedUser2);
        System.out.println(clonedUser3);
    }
}
