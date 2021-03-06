package de.linkvt.ontobench.features.axioms.dataproperty;

import de.linkvt.ontobench.features.Feature;
import de.linkvt.ontobench.features.FeatureCategory;

import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLDataProperty;
import org.springframework.stereotype.Component;

@Component
public class RdfsDataDomainFeature extends Feature {
  @Override
  public void addToOntology() {
    OWLClass domain = featurePool.getExclusiveClass(":Domain");
    OWLDataProperty objectProperty = factory.getOWLDataProperty(":noRangeDataProperty", pm);

    addAxiomToOntology(factory.getOWLDataPropertyDomainAxiom(objectProperty, domain));
  }

  @Override
  public String getName() {
    return "rdfs:domain";
  }

  @Override
  public String getToken() {
    return "domaindata";
  }

  @Override
  public FeatureCategory getCategory() {
    return FeatureCategory.DATA_PROPERTIES;
  }
}
