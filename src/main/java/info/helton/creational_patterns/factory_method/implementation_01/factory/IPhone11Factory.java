package info.helton.creational_patterns.factory_method.implementation_01.factory;

import info.helton.creational_patterns.factory_method.model.IPhone;
import info.helton.creational_patterns.factory_method.model.IPhone11;

public class IPhone11Factory extends IPhoneFactory {

    @Override
    protected IPhone createIPhone() {
        return new IPhone11();
    }
}
