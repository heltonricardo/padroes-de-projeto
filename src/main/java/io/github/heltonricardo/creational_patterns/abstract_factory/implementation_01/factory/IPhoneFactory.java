package src.main.java.io.github.heltonricardo.creational_patterns.abstract_factory.implementation_01.factory;

import src.main.java.io.github.heltonricardo.creational_patterns.abstract_factory.implementation_01.factory.abstractFactory.CountryRulesAbstractFactory;
import src.main.java.io.github.heltonricardo.creational_patterns.abstract_factory.implementation_01.model.iphone.IPhone;

public abstract class IPhoneFactory {
    CountryRulesAbstractFactory rules;

    public IPhoneFactory(CountryRulesAbstractFactory rules) {
        this.rules = rules;
    }

    protected abstract IPhone createIPhone(String level);

    public IPhone orderIPhone(String level) {
        IPhone device = null;

        device = createIPhone(level);

        device.getHardware();
        device.assemble();
        device.certificates();
        device.pack();

        return device;
    }
}
