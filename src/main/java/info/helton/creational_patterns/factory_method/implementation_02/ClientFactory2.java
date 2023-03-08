package info.helton.creational_patterns.factory_method.implementation_02;

import info.helton.creational_patterns.factory_method.implementation_02.half_simple_factory.IPhone11Factory;
import info.helton.creational_patterns.factory_method.implementation_02.half_simple_factory.IPhoneFactory;
import info.helton.creational_patterns.factory_method.implementation_02.half_simple_factory.IPhoneXFactory;
import info.helton.creational_patterns.factory_method.model.IPhone;

public class ClientFactory2 {

    public static void main(String[] args) {
        IPhoneFactory genXFactory = new IPhoneXFactory();
        IPhoneFactory gen11Factory = new IPhone11Factory();

        System.out.println("### Ordering an iPhone X Standard");
        IPhone iPhone1 = genXFactory.orderIPhone("standard");
        System.out.println(iPhone1);

        System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
        IPhone iPhone2 = gen11Factory.orderIPhone("highEnd");
        System.out.println(iPhone2);
    }
}
