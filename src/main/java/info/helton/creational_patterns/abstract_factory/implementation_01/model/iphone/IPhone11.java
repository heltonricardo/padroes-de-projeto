package info.helton.creational_patterns.abstract_factory.implementation_01.model.iphone;

import info.helton.creational_patterns.abstract_factory.implementation_01.factory.abstract_factory.CountryRulesAbstractFactory;

public class IPhone11 extends IPhone {

    public IPhone11(CountryRulesAbstractFactory rules) {
        super(rules);
    }

    @Override
    public void getHardware() {
        System.out.println("Hardware list");
        System.out.println("\t- 6.1in Screen");
        System.out.println("\t- A13 Chipset");
        System.out.println("\t- 4Gb RAM");
        System.out.println("\t- 256Gb Memory");
    }
}
