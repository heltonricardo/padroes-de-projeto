package info.helton.creational_patterns.factory.implementation_01.factory;

import info.helton.creational_patterns.factory.model.IPhone;
import info.helton.creational_patterns.factory.model.IPhoneX;

public class IPhoneXFactory extends IPhoneFactory {

    @Override
    protected IPhone createIPhone() {
        return new IPhoneX();
    }
}
