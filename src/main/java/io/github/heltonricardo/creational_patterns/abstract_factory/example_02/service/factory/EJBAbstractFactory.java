package src.main.java.io.github.heltonricardo.creational_patterns.abstract_factory.example_02.service.factory;

import src.main.java.io.github.heltonricardo.creational_patterns.abstract_factory.example_02.service.services.CarEJBService;
import src.main.java.io.github.heltonricardo.creational_patterns.abstract_factory.example_02.service.services.CarService;
import src.main.java.io.github.heltonricardo.creational_patterns.abstract_factory.example_02.service.services.UserEJBService;
import src.main.java.io.github.heltonricardo.creational_patterns.abstract_factory.example_02.service.services.UserService;

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
