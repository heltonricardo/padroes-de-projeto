package info.helton.creational_patterns.factory_method.implementation_02.half_simple_factory;

import info.helton.creational_patterns.factory_method.model.IPhone;
import info.helton.creational_patterns.factory_method.model.IPhone11;
import info.helton.creational_patterns.factory_method.model.IPhone11Pro;
import info.helton.creational_patterns.factory_method.model.ModelEnum;

public class IPhone11Factory extends IPhoneFactory {

    @Override
    protected IPhone createIPhone(String level) {
        if (ModelEnum.STANDARD.get().equals(level)) {
            return new IPhone11();
        }
        if (ModelEnum.HIGH_END.get().equals(level)) {
            return new IPhone11Pro();
        }

        return null;
    }
}
