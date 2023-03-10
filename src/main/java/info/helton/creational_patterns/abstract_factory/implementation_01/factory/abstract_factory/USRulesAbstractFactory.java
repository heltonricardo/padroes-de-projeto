package info.helton.creational_patterns.abstract_factory.implementation_01.factory.abstract_factory;

import info.helton.creational_patterns.abstract_factory.implementation_01.model.certificate.Certificate;
import info.helton.creational_patterns.abstract_factory.implementation_01.model.certificate.USCertificate;
import info.helton.creational_patterns.abstract_factory.implementation_01.model.packing.Packing;
import info.helton.creational_patterns.abstract_factory.implementation_01.model.packing.USPacking;

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
