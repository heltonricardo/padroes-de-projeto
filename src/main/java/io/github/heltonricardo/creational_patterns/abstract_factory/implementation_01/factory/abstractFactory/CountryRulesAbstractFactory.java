package io.github.heltonricardo.creational_patterns.abstract_factory.implementation_01.factory.abstractFactory;

import io.github.heltonricardo.creational_patterns.abstract_factory.implementation_01.model.certificate.Certificate;
import io.github.heltonricardo.creational_patterns.abstract_factory.implementation_01.model.packing.Packing;

public interface CountryRulesAbstractFactory {

    Certificate getCertificates();

    Packing getPacking();
}
