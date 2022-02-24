package src.main.java.io.github.heltonricardo.creational_patterns.abstract_factory.example_01.factory.abstractFactory;

import src.main.java.io.github.heltonricardo.creational_patterns.abstract_factory.example_01.model.certificate.Certificate;
import src.main.java.io.github.heltonricardo.creational_patterns.abstract_factory.example_01.model.certificate.USCertificate;
import src.main.java.io.github.heltonricardo.creational_patterns.abstract_factory.example_01.model.packing.Packing;
import src.main.java.io.github.heltonricardo.creational_patterns.abstract_factory.example_01.model.packing.USPacking;

public class USRulesAbstractFactory implements CountryRulesAbstractFactory {

    @Override
    public Certificate getCertificates() {
        return new USCertificate();
    }

    @Override
    public Packing getPacking() {
        return new USPacking();
    }
}
