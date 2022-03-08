package src.main.java.io.github.heltonricardo.creational_patterns.abstract_factory.example_02.service;

import src.main.java.io.github.heltonricardo.creational_patterns.abstract_factory.example_02.service.factory.EJBAbstractFactory;
import src.main.java.io.github.heltonricardo.creational_patterns.abstract_factory.example_02.service.factory.RestApiAbstractFactory;
import src.main.java.io.github.heltonricardo.creational_patterns.abstract_factory.example_02.service.factory.ServicesAbstractFactory;
import src.main.java.io.github.heltonricardo.creational_patterns.abstract_factory.example_02.service.services.CarService;
import src.main.java.io.github.heltonricardo.creational_patterns.abstract_factory.example_02.service.services.UserService;

public class ClientAbstractFactory2 {

    public static void main(String[] args) {

        ServicesAbstractFactory servicesFactory;
        UserService userService;
        CarService carService;

        servicesFactory = new RestApiAbstractFactory();
        userService = servicesFactory.getUserService();
        userService.save("Helton");
        userService.delete(99);

        servicesFactory = new EJBAbstractFactory();
        carService = servicesFactory.getCarService();
        carService.update("Tesla X");
        carService.save("Tesla S Plaid");
    }
}
