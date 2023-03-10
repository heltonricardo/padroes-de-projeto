package info.helton.creational_patterns.abstract_factory.implementation_01.factory.abstract_factory;

import info.helton.creational_patterns.abstract_factory.implementation_01.model.certificate.Certificate;
import info.helton.creational_patterns.abstract_factory.implementation_01.model.packing.Packing;

public interface CountryRulesAbstractFactory {

    Certificate getCertificates();

    Packing getPacking();
}
