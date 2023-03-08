package info.helton.creational_patterns.factory_method.implementation_02.half_simple_factory;

import info.helton.creational_patterns.factory_method.model.IPhone;
import info.helton.creational_patterns.factory_method.model.IPhoneX;
import info.helton.creational_patterns.factory_method.model.IPhoneXSMax;
import info.helton.creational_patterns.factory_method.model.ModelEnum;

public class IPhoneXFactory extends IPhoneFactory {

    @Override
    protected IPhone createIPhone(String level) {
        if (ModelEnum.STANDARD.get().equals(level)) {
            return new IPhoneX();
        }
        if (ModelEnum.HIGH_END.get().equals(level)) {
            return new IPhoneXSMax();
        }
        return null;
    }
}
