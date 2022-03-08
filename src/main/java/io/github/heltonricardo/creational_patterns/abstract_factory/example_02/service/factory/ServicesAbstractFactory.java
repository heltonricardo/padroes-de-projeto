package src.main.java.io.github.heltonricardo.creational_patterns.abstract_factory.example_02.service.factory;

import src.main.java.io.github.heltonricardo.creational_patterns.abstract_factory.example_02.service.services.CarService;
import src.main.java.io.github.heltonricardo.creational_patterns.abstract_factory.example_02.service.services.UserService;

public interface ServicesAbstractFactory {

    CarService getCarService();

    UserService getUserService();
}
