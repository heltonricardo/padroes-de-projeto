package src.main.java.io.github.heltonricardo.creational_patterns.abstract_factory.implementation_01.factory.abstractFactory;

import src.main.java.io.github.heltonricardo.creational_patterns.abstract_factory.implementation_01.model.certificate.Certificate;
import src.main.java.io.github.heltonricardo.creational_patterns.abstract_factory.implementation_01.model.packing.Packing;

public interface CountryRulesAbstractFactory {

    Certificate getCertificates();

    Packing getPacking();
}
