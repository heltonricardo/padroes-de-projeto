package io.github.heltonricardo.creational_patterns.abstract_factory.implementation_02.factory;

import io.github.heltonricardo.creational_patterns.abstract_factory.implementation_02.services.CarEJBService;
import io.github.heltonricardo.creational_patterns.abstract_factory.implementation_02.services.CarService;
import io.github.heltonricardo.creational_patterns.abstract_factory.implementation_02.services.UserEJBService;
import io.github.heltonricardo.creational_patterns.abstract_factory.implementation_02.services.UserService;

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
