package info.helton.creational_patterns.abstract_factory.implementation_02.factory;

import info.helton.creational_patterns.abstract_factory.implementation_02.services.CarService;
import info.helton.creational_patterns.abstract_factory.implementation_02.services.UserService;

public interface ServicesAbstractFactory {

    CarService getCarService();

    UserService getUserService();
}
