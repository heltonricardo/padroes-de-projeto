package io.github.heltonricardo.creational_patterns.abstract_factory.implementation_02.factory;

import io.github.heltonricardo.creational_patterns.abstract_factory.implementation_02.services.CarService;
import io.github.heltonricardo.creational_patterns.abstract_factory.implementation_02.services.UserService;

public interface ServicesAbstractFactory {

    CarService getCarService();

    UserService getUserService();
}
