package info.helton.creational_patterns.factory_method.implementation_02.half_simple_factory;

import info.helton.creational_patterns.factory_method.model.IPhone;

public abstract class IPhoneFactory {

    protected abstract IPhone createIPhone(String level);

    public IPhone orderIPhone(String level) {
        IPhone device = this.createIPhone(level);

        device.getHardware();
        device.assemble();
        device.certificates();
        device.pack();

        return device;
    }
}
