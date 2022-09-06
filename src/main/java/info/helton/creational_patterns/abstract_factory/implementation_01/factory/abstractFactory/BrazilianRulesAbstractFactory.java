package info.helton.creational_patterns.abstract_factory.implementation_01.factory.abstractFactory;

import info.helton.creational_patterns.abstract_factory.implementation_01.model.certificate.BrazilianCertificate;
import info.helton.creational_patterns.abstract_factory.implementation_01.model.certificate.Certificate;
import info.helton.creational_patterns.abstract_factory.implementation_01.model.packing.BrazilianPacking;
import info.helton.creational_patterns.abstract_factory.implementation_01.model.packing.Packing;

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
