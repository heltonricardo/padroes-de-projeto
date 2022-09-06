package io.github.heltonricardo.creational_patterns.factory.implementation_01.factory;

import io.github.heltonricardo.creational_patterns.factory.model.IPhone;
import io.github.heltonricardo.creational_patterns.factory.model.IPhoneXSMax;

public class IPhoneXSMaxFactory extends IPhoneFactory {

    @Override
    protected IPhone createIPhone() {
        return new IPhoneXSMax();
    }
}
