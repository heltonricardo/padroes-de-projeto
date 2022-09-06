package info.helton.creational_patterns.factory.implementation_01.factory;

import info.helton.creational_patterns.factory.model.IPhone;
import info.helton.creational_patterns.factory.model.IPhone11;

public class IPhone11Factory extends IPhoneFactory {

    @Override
    protected IPhone createIPhone() {
        return new IPhone11();
    }
}
