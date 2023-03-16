package info.helton.creational_patterns.factory_method.model;

public interface IPhone {

    void getHardware();

    default void assemble() {
        System.out.println("Assembling all the hardwares");
    }

    default void certificates() {
        System.out.println("Testing all the certificates");
    }

    default void pack() {
        System.out.println("Packing the device");
    }
}
