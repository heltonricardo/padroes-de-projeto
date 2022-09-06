package io.github.heltonricardo.creational_patterns.abstract_factory.implementation_02.factory;

import io.github.heltonricardo.creational_patterns.abstract_factory.implementation_02.services.CarRestApiService;
import io.github.heltonricardo.creational_patterns.abstract_factory.implementation_02.services.CarService;
import io.github.heltonricardo.creational_patterns.abstract_factory.implementation_02.services.UserRestApiService;
import io.github.heltonricardo.creational_patterns.abstract_factory.implementation_02.services.UserService;

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
