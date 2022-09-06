package io.github.heltonricardo.creational_patterns.factory.implementation_02.halfSimpleFactory;

import io.github.heltonricardo.creational_patterns.factory.model.IPhone;
import io.github.heltonricardo.creational_patterns.factory.model.IPhoneX;
import io.github.heltonricardo.creational_patterns.factory.model.IPhoneXSMax;

public class IPhoneXFactory extends IPhoneFactory {

    @Override
    protected IPhone createIPhone(String level) {
        return "standard".equals(level) ? new IPhoneX()
                : "highEnd".equals(level) ? new IPhoneXSMax()
                : null;
    }
}
