package info.helton.creational_patterns.factory_method.implementation_01.factory;

import info.helton.creational_patterns.factory_method.model.IPhone;
import info.helton.creational_patterns.factory_method.model.IPhoneXSMax;

public class IPhoneXSMaxFactory extends IPhoneFactory {

    @Override
    protected IPhone createIPhone() {
        return new IPhoneXSMax();
    }
}
