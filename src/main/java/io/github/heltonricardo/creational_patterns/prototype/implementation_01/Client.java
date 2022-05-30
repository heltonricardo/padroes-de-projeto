package src.main.java.io.github.heltonricardo.creational_patterns.prototype.implementation_01;

import src.main.java.io.github.heltonricardo.creational_patterns.prototype.implementation_01.model.Person;

import java.util.ArrayList;
import java.util.List;


public class Client {

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

    public static void main(String[] args) {

    }
}
