package de.linkvt.bachelor.features.special.parallelproperties;

import org.semanticweb.owlapi.model.OWLClass;
import org.springframework.stereotype.Component;

@Component
public class FourParallelPropertiesFeature extends MultipleParallelPropertiesFeature {

  public static final String PROPERTY_BASE_IRI = ":FourParallelProperties";
  public static final int PROPERTY_COUNT = 4;

  public FourParallelPropertiesFeature() {
    super(PROPERTY_BASE_IRI, PROPERTY_COUNT);
  }

  @Override
  public void addToOntology() {
    OWLClass domain = featurePool.getExclusiveClass(":FourParallelPropertiesDomain");
    OWLClass range = featurePool.getExclusiveClass(":FiveParallelPropertiesDomain");
    addPropertiesBetweenClasses(domain, range);
  }

}
