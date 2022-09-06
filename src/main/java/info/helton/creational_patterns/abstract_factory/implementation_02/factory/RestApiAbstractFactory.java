package info.helton.creational_patterns.abstract_factory.implementation_02.factory;

import info.helton.creational_patterns.abstract_factory.implementation_02.services.CarRestApiService;
import info.helton.creational_patterns.abstract_factory.implementation_02.services.CarService;
import info.helton.creational_patterns.abstract_factory.implementation_02.services.UserRestApiService;
import info.helton.creational_patterns.abstract_factory.implementation_02.services.UserService;

public class RestApiAbstractFactory implements ServicesAbstractFactory {

    @Override
    public CarService getCarService() {
        return new CarRestApiService();
    }

    @Override
    public UserService getUserService() {
        return new UserRestApiService();
    }
}
