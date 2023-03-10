package info.helton.creational_patterns.abstract_factory.implementation_01.factory;

import info.helton.creational_patterns.abstract_factory.implementation_01.factory.abstract_factory.CountryRulesAbstractFactory;
import info.helton.creational_patterns.abstract_factory.implementation_01.model.iphone.IPhone;
import info.helton.creational_patterns.abstract_factory.implementation_01.model.iphone.IPhone11;
import info.helton.creational_patterns.abstract_factory.implementation_01.model.iphone.IPhone11Pro;

public class IPhone11Factory extends IPhoneFactory {

    public IPhone11Factory(CountryRulesAbstractFactory rules) {
        super(rules);
    }

    public IPhone createIPhone(String level) {
        if (level.equals("standard")) {
            return new IPhone11(rules);
        } else if (level.equals("highEnd")) {
            return new IPhone11Pro(rules);
        } else
            return null;
    }

}
