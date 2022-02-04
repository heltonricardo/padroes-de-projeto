package src.main.java.io.github.heltonricardo.creational_patterns.factory.implementation_01.factory;

import src.main.java.io.github.heltonricardo.creational_patterns.factory.model.IPhone;
import src.main.java.io.github.heltonricardo.creational_patterns.factory.model.IPhone11;

public class IPhone11Factory extends IPhoneFactory {

    @Override
    protected IPhone createIPhone() {
        return new IPhone11();
    }
}
