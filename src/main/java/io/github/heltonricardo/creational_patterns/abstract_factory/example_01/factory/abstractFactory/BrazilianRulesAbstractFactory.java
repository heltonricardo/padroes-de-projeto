package src.main.java.io.github.heltonricardo.creational_patterns.abstract_factory.example_01.factory.abstractFactory;

import src.main.java.io.github.heltonricardo.creational_patterns.abstract_factory.example_01.model.certificate.BrazilianCertificate;
import src.main.java.io.github.heltonricardo.creational_patterns.abstract_factory.example_01.model.certificate.Certificate;
import src.main.java.io.github.heltonricardo.creational_patterns.abstract_factory.example_01.model.packing.BrazilianPacking;
import src.main.java.io.github.heltonricardo.creational_patterns.abstract_factory.example_01.model.packing.Packing;

public class BrazilianRulesAbstractFactory implements CountryRulesAbstractFactory {

    @Override
    public Certificate getCertificates() {
        return new BrazilianCertificate();
    }

    @Override
    public Packing getPacking() {
        return new BrazilianPacking();
    }
}
