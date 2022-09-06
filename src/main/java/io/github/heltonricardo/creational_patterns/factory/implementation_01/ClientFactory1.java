package io.github.heltonricardo.creational_patterns.factory.implementation_01;

import io.github.heltonricardo.creational_patterns.factory.implementation_01.factory.IPhone11ProFactory;
import io.github.heltonricardo.creational_patterns.factory.implementation_01.factory.IPhoneFactory;
import io.github.heltonricardo.creational_patterns.factory.implementation_01.factory.IPhoneXFactory;

public class ClientFactory1 {

    public static void main(String[] args) {
        System.out.println("### Ordering an iPhone X");
        IPhoneFactory iPhoneXFactory = new IPhoneXFactory();
        System.out.println(iPhoneXFactory.orderIPhone());

        System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
        IPhoneFactory iPhone11ProFactory = new IPhone11ProFactory();
        System.out.println(iPhone11ProFactory.orderIPhone());
    }
}
