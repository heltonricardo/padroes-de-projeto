package info.helton.creational_patterns.abstract_factory.implementation_01;

import info.helton.creational_patterns.abstract_factory.implementation_01.factory.IPhone11Factory;
import info.helton.creational_patterns.abstract_factory.implementation_01.factory.IPhoneFactory;
import info.helton.creational_patterns.abstract_factory.implementation_01.factory.IPhoneXFactory;
import info.helton.creational_patterns.abstract_factory.implementation_01.factory.abstractFactory.BrazilianRulesAbstractFactory;
import info.helton.creational_patterns.abstract_factory.implementation_01.factory.abstractFactory.CountryRulesAbstractFactory;
import info.helton.creational_patterns.abstract_factory.implementation_01.factory.abstractFactory.USRulesAbstractFactory;
import info.helton.creational_patterns.abstract_factory.implementation_01.model.iphone.IPhone;

public class ClientAbstractFactory1 {

    public static void main(String[] args) {

        CountryRulesAbstractFactory usRules =
                new USRulesAbstractFactory();

        CountryRulesAbstractFactory brRules =
                new BrazilianRulesAbstractFactory();

        IPhoneFactory genXFactory = new IPhoneXFactory(usRules);
        IPhoneFactory gen11Factory = new IPhone11Factory(brRules);

        System.out.println("### Ordering an IPhone X");
        IPhone iphoneX = genXFactory.orderIPhone("standard");
        System.out.println(iphoneX);

        System.out.println("\n\n### Ordering an IPhone 11");
        IPhone iphone11 = gen11Factory.orderIPhone("highEnd");
        System.out.println(iphone11);
    }
}
