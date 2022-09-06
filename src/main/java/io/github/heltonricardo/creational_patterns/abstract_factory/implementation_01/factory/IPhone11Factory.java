package io.github.heltonricardo.creational_patterns.abstract_factory.implementation_01.factory;

import io.github.heltonricardo.creational_patterns.abstract_factory.implementation_01.factory.abstractFactory.CountryRulesAbstractFactory;
import io.github.heltonricardo.creational_patterns.abstract_factory.implementation_01.model.iphone.IPhone;
import io.github.heltonricardo.creational_patterns.abstract_factory.implementation_01.model.iphone.IPhone11;
import io.github.heltonricardo.creational_patterns.abstract_factory.implementation_01.model.iphone.IPhone11Pro;

public class IPhone11Factory extends IPhoneFactory {

    public IPhone11Factory(CountryRulesAbstractFactory rules) {
        super(rules);
    }

    public IPhone createIPhone(String level) {
        if (level.equals("standard")) {
            return new IPhone11(rules);
        } else if (level.equals("highEnd")) {
            return new IPhone11Pro(rules);
        } else return null;
    }

}
