package info.helton.creational_patterns.abstract_factory.implementation_02;

import info.helton.creational_patterns.abstract_factory.implementation_02.factory.EJBAbstractFactory;
import info.helton.creational_patterns.abstract_factory.implementation_02.factory.RestApiAbstractFactory;
import info.helton.creational_patterns.abstract_factory.implementation_02.factory.ServicesAbstractFactory;
import info.helton.creational_patterns.abstract_factory.implementation_02.services.CarService;
import info.helton.creational_patterns.abstract_factory.implementation_02.services.UserService;

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
