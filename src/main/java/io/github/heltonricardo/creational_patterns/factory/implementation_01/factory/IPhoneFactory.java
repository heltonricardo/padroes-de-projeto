package src.main.java.io.github.heltonricardo.creational_patterns.factory.implementation_01.factory;

import src.main.java.io.github.heltonricardo.creational_patterns.factory.model.IPhone;

public abstract class IPhoneFactory {

    protected abstract IPhone createIPhone();

    public IPhone orderIPhone() {
        IPhone device = this.createIPhone();

        device.getHardware();
        device.assemble();
        device.certificates();
        device.pack();

        return device;
    }
}
