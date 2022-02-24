package src.main.java.io.github.heltonricardo.creational_patterns.abstract_factory.example_01.model.iphone;

import src.main.java.io.github.heltonricardo.creational_patterns.abstract_factory.example_01.factory.abstractFactory.CountryRulesAbstractFactory;

public abstract class IPhone {

    CountryRulesAbstractFactory rules;

    public IPhone(CountryRulesAbstractFactory rules) {
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
