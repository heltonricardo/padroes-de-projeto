package info.helton.creational_patterns.factory_method.without_implementation;

import info.helton.creational_patterns.factory_method.model.IPhone;
import info.helton.creational_patterns.factory_method.model.IPhone11;
import info.helton.creational_patterns.factory_method.model.IPhone11Pro;
import info.helton.creational_patterns.factory_method.model.IPhoneX;
import info.helton.creational_patterns.factory_method.model.IPhoneXSMax;
import info.helton.creational_patterns.factory_method.model.ModelEnum;

public class ClientWithoutFactory {

    public IPhone orderIPhone(String generation, String level) {
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
        IPhone iphone = client.orderIPhone(ModelEnum.X.get(), ModelEnum.STANDARD.get());
        System.out.println(iphone);

        System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
        IPhone iphone2 = client.orderIPhone(ModelEnum.ELEVEN.get(), ModelEnum.HIGH_END.get());
        System.out.println(iphone2);
    }
}
