package info.helton.creational_patterns.abstract_factory.implementation_01.model.iphone;

import info.helton.creational_patterns.abstract_factory.implementation_01.factory.abstract_factory.CountryRulesAbstractFactory;

public abstract class IPhone {

    CountryRulesAbstractFactory rules;

    protected IPhone(CountryRulesAbstractFactory rules) {
        this.rules = rules;
    }

    public abstract void getHardware();

    public void assemble() {
        System.out.println("Assembling all the hardwares");
    }

    public void certificates() {
        System.out.println("Testing all the certificates");
        System.out.println(rules.getCertificates().applyCertification());
    }

    public void pack() {
        System.out.println("Packing the device");
        System.out.println(rules.getPacking().pack());
    }
}
