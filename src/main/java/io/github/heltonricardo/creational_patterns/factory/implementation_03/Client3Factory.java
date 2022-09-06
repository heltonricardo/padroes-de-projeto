package io.github.heltonricardo.creational_patterns.factory.implementation_03;

import io.github.heltonricardo.creational_patterns.factory.implementation_03.simpleFactory.IPhoneFactory;
import io.github.heltonricardo.creational_patterns.factory.model.IPhone;

public class Client3Factory {

    public static void main(String[] args) {

        System.out.println("### Ordering an iPhone X Standard");
        IPhone iPhone1 = IPhoneFactory.orderIPhone("X", "standard");
        System.out.println(iPhone1);

        System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
        IPhone iPhone2 = IPhoneFactory.orderIPhone("11", "highEnd");
        System.out.println(iPhone2);
    }

}
