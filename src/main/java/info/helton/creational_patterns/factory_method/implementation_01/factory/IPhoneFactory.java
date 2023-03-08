package info.helton.creational_patterns.factory_method.implementation_01.factory;

import info.helton.creational_patterns.factory_method.model.IPhone;

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
