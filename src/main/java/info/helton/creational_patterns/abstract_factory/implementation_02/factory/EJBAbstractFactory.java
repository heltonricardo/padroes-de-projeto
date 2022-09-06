package info.helton.creational_patterns.abstract_factory.implementation_02.factory;

import info.helton.creational_patterns.abstract_factory.implementation_02.services.CarEJBService;
import info.helton.creational_patterns.abstract_factory.implementation_02.services.CarService;
import info.helton.creational_patterns.abstract_factory.implementation_02.services.UserEJBService;
import info.helton.creational_patterns.abstract_factory.implementation_02.services.UserService;

public class EJBAbstractFactory implements ServicesAbstractFactory {

    @Override
    public CarService getCarService() {
        return new CarEJBService();
    }

    @Override
    public UserService getUserService() {
        return new UserEJBService();
    }
}
