package src.main.java.io.github.heltonricardo.creational_patterns.factory.implementation_03.simpleFactory;

import src.main.java.io.github.heltonricardo.creational_patterns.factory.model.IPhone;
import src.main.java.io.github.heltonricardo.creational_patterns.factory.model.IPhone11;
import src.main.java.io.github.heltonricardo.creational_patterns.factory.model.IPhone11Pro;
import src.main.java.io.github.heltonricardo.creational_patterns.factory.model.IPhoneX;
import src.main.java.io.github.heltonricardo.creational_patterns.factory.model.IPhoneXSMax;

import java.util.Objects;

public class IPhoneFactory {

    public static IPhone orderIPhone(String generation, String level) {

        IPhone device = null;

        if ("X".equals(generation)) {
            if ("standard".equals(level)) {
                device = new IPhoneX();
            } else if ("highEnd".equals(level)) {
                device = new IPhoneXSMax();
            }
        } else if ("11".equals(generation)) {
            if ("standard".equals(level)) {
                device = new IPhone11();
            } else if ("highEnd".equals(level)) {
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
