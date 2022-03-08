package src.main.java.io.github.heltonricardo.creational_patterns.abstract_factory.example_02.service.services;

public class CarEJBService implements CarService {

	@Override
	public void save(String model) {
		System.out.println("Saving " + model + " car through EJB's interface");
	}

	@Override
	public void update(String newModel) {
		System.out.println("Updating " + newModel + " car through EJB's interface");
	}
	
}
