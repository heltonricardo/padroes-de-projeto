package io.github.heltonricardo.creational_patterns.factory.implementation_02.halfSimpleFactory;

import io.github.heltonricardo.creational_patterns.factory.model.IPhone;

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
