package info.helton.creational_patterns.abstract_factory.implementation_02.services;

public class UserEJBService implements UserService {

    @Override
    public void save(String name) {
        System.out.println("Saving " + name + " through EJB's interface");
    }

    @Override
    public boolean delete(Integer id) {
        System.out.println("Removing User #" + id + " through EJB's interface");
        return true;
    }
}
