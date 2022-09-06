package io.github.heltonricardo.creational_patterns.factory.implementation_02.halfSimpleFactory;

import io.github.heltonricardo.creational_patterns.factory.model.IPhone;
import io.github.heltonricardo.creational_patterns.factory.model.IPhone11;
import io.github.heltonricardo.creational_patterns.factory.model.IPhone11Pro;

public class IPhone11Factory extends IPhoneFactory {

    @Override
    protected IPhone createIPhone(String level) {
        return "standard".equals(level) ? new IPhone11()
                : "highEnd".equals(level) ? new IPhone11Pro()
                : null;
    }
}
