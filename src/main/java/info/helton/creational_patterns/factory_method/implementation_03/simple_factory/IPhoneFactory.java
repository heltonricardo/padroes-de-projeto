package info.helton.creational_patterns.factory_method.implementation_03.simple_factory;

import java.util.Objects;

import info.helton.creational_patterns.factory_method.model.IPhone;
import info.helton.creational_patterns.factory_method.model.IPhone11;
import info.helton.creational_patterns.factory_method.model.IPhone11Pro;
import info.helton.creational_patterns.factory_method.model.IPhoneX;
import info.helton.creational_patterns.factory_method.model.IPhoneXSMax;
import info.helton.creational_patterns.factory_method.model.ModelEnum;

public interface IPhoneFactory {

    public static IPhone orderIPhone(String generation, String level) {

        IPhone device = null;

        if (ModelEnum.X.get().equals(generation)) {
            if (ModelEnum.STANDARD.get().equals(level)) {
                device = new IPhoneX();
            } else if (ModelEnum.HIGH_END.get().equals(level)) {
                device = new IPhoneXSMax();
            }
        } else if (ModelEnum.ELEVEN.get().equals(generation)) {
            if (ModelEnum.STANDARD.get().equals(level)) {
                device = new IPhone11();
            } else if (ModelEnum.HIGH_END.get().equals(level)) {
                device = new IPhone11Pro();
            }
        }

        if (Objects.nonNull(device)) {
            device.getHardware();
            device.assemble();
            device.certificates();
            device.pack();
        }

        return device;
    }
}
