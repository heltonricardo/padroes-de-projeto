package io.github.heltonricardo.creational_patterns.abstract_factory.implementation_01.factory;

import io.github.heltonricardo.creational_patterns.abstract_factory.implementation_01.factory.abstractFactory.CountryRulesAbstractFactory;
import io.github.heltonricardo.creational_patterns.abstract_factory.implementation_01.model.iphone.IPhone;
import io.github.heltonricardo.creational_patterns.abstract_factory.implementation_01.model.iphone.IPhoneX;
import io.github.heltonricardo.creational_patterns.abstract_factory.implementation_01.model.iphone.IPhoneXSMax;

public class IPhoneXFactory extends IPhoneFactory {

    public IPhoneXFactory(CountryRulesAbstractFactory rules) {
        super(rules);
    }

    public IPhone createIPhone(String level) {
        if (level.equals("standard")) {
            return new IPhoneX(rules);
        } else if (level.equals("highEnd")) {
            return new IPhoneXSMax(rules);
        } else return null;
    }
}