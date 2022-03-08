package src.main.java.io.github.heltonricardo.creational_patterns.abstract_factory.example_02.service.factory;

import src.main.java.io.github.heltonricardo.creational_patterns.abstract_factory.example_02.service.services.CarRestApiService;
import src.main.java.io.github.heltonricardo.creational_patterns.abstract_factory.example_02.service.services.CarService;
import src.main.java.io.github.heltonricardo.creational_patterns.abstract_factory.example_02.service.services.UserRestApiService;
import src.main.java.io.github.heltonricardo.creational_patterns.abstract_factory.example_02.service.services.UserService;

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
