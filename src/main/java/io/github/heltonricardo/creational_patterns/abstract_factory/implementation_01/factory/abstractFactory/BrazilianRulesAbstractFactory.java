package io.github.heltonricardo.creational_patterns.abstract_factory.implementation_01.factory.abstractFactory;

import io.github.heltonricardo.creational_patterns.abstract_factory.implementation_01.model.certificate.BrazilianCertificate;
import io.github.heltonricardo.creational_patterns.abstract_factory.implementation_01.model.certificate.Certificate;
import io.github.heltonricardo.creational_patterns.abstract_factory.implementation_01.model.packing.BrazilianPacking;
import io.github.heltonricardo.creational_patterns.abstract_factory.implementation_01.model.packing.Packing;

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
