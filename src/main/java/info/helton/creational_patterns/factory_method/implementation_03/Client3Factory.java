package info.helton.creational_patterns.factory_method.implementation_03;

import info.helton.creational_patterns.factory_method.implementation_03.simple_factory.IPhoneFactory;
import info.helton.creational_patterns.factory_method.model.IPhone;

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
