package src.main.java.io.github.heltonricardo.creational_patterns.factory.implementation_02;

import src.main.java.io.github.heltonricardo.creational_patterns.factory.implementation_02.halfSimpleFactory.IPhone11Factory;
import src.main.java.io.github.heltonricardo.creational_patterns.factory.implementation_02.halfSimpleFactory.IPhoneFactory;
import src.main.java.io.github.heltonricardo.creational_patterns.factory.implementation_02.halfSimpleFactory.IPhoneXFactory;
import src.main.java.io.github.heltonricardo.creational_patterns.factory.model.IPhone;

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
