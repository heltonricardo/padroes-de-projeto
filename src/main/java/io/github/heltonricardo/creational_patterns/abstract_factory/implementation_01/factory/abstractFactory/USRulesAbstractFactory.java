package io.github.heltonricardo.creational_patterns.abstract_factory.implementation_01.factory.abstractFactory;

import io.github.heltonricardo.creational_patterns.abstract_factory.implementation_01.model.certificate.Certificate;
import io.github.heltonricardo.creational_patterns.abstract_factory.implementation_01.model.certificate.USCertificate;
import io.github.heltonricardo.creational_patterns.abstract_factory.implementation_01.model.packing.Packing;
import io.github.heltonricardo.creational_patterns.abstract_factory.implementation_01.model.packing.USPacking;

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
