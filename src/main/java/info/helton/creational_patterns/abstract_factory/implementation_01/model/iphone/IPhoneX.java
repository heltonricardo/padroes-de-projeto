package info.helton.creational_patterns.abstract_factory.implementation_01.model.iphone;

import info.helton.creational_patterns.abstract_factory.implementation_01.factory.abstract_factory.CountryRulesAbstractFactory;

public class IPhoneX extends IPhone {

    public IPhoneX(CountryRulesAbstractFactory rules) {
        super(rules);
    }

    @Override
    public void getHardware() {
        System.out.println("Hardware list");
        System.out.println("\t- 5.8in Screen");
        System.out.println("\t- A11 Chipset");
        System.out.println("\t- 3Gb RAM");
        System.out.println("\t- 256Gb Memory");
    }
}
