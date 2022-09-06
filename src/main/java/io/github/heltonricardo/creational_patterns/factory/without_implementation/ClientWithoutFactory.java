package io.github.heltonricardo.creational_patterns.factory.without_implementation;

import io.github.heltonricardo.creational_patterns.factory.model.IPhone;
import io.github.heltonricardo.creational_patterns.factory.model.IPhone11;
import io.github.heltonricardo.creational_patterns.factory.model.IPhone11Pro;
import io.github.heltonricardo.creational_patterns.factory.model.IPhoneX;
import io.github.heltonricardo.creational_patterns.factory.model.IPhoneXSMax;

public class ClientWithoutFactory {

    public IPhone orderIPhone(String generation, String level) {
        IPhone device = null;

        if (generation.equals("X")) {
            if (level.equals("standard")) {
                device = new IPhoneX();
            } else if (level.equals("highEnd")) {
                device = new IPhoneXSMax();
            }
        } else if (generation.equals("11")) {
            if (level.equals("standard")) {
                device = new IPhone11();
            } else if (level.equals("highEnd")) {
                device = new IPhone11Pro();
            }
        }

        if (device != null) {
            device.getHardware();
            device.assemble();
            device.certificates();
            device.pack();
        }

        return device;
    }

    public static void main(String[] args) {
        ClientWithoutFactory client = new ClientWithoutFactory();

        System.out.println("### Ordering an iPhone X");
        IPhone iphone = client.orderIPhone("X", "standard");
        System.out.println(iphone);

        System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
        IPhone iphone2 = client.orderIPhone("11", "highEnd");
        System.out.println(iphone2);
    }
}
