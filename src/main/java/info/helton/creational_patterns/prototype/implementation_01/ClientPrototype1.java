package info.helton.creational_patterns.prototype.implementation_01;

import info.helton.creational_patterns.prototype.implementation_01.model.Person;
import info.helton.creational_patterns.prototype.implementation_01.model.PersonSamples;

import java.util.ArrayList;
import java.util.List;


public class ClientPrototype1 {

    private final static List<Person> frames = new ArrayList<>();

    public static void animate() throws InterruptedException {
        System.out.println("*********************************");
        System.out.println("* ");
        System.out.println("* Adjust your screen's height!");
        System.out.println("* ");
        System.out.print("*********************************");

        Thread.sleep(3000);

        for (Person frame : frames) {
            frame.draw();
            Thread.sleep(500);
        }

        System.out.println("**********************");
        System.out.println("* ");
        System.out.println("* The End!");
        System.out.println("* ");
        System.out.print("**********************");
    }

    public static Person addRight(Person person) throws CloneNotSupportedException {
        Person clone = person.clone();
        clone.right();
        frames.add(clone);
        return clone;
    }

    public static Person addLeft(Person person) throws CloneNotSupportedException {
        Person clone = person.clone();
        clone.left();
        frames.add(clone);
        return clone;
    }

    public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {

		PersonSamples samples = new PersonSamples();
        Person person = samples.get("fatMan");

        frames.add(person);
        person = addLeft(person);
        person = addLeft(person);
        person = addLeft(person);
        person = addRight(person);
        person = addRight(person);
        person = addRight(person);
        person = addRight(person);
        person = addRight(person);
        person = addRight(person);
        person = addRight(person);
        person = addLeft(person);
        person = addLeft(person);
        addLeft(person);

        animate();
    }
}
