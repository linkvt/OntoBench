package de.linkvt.bachelor.features.assertions;

import de.linkvt.bachelor.features.Feature;
import de.linkvt.bachelor.features.FeatureCategory;

import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.springframework.stereotype.Component;

@Component
public class OwlNegativeObjectPropertyAssertionFeature extends Feature {
  @Override
  public void addToOntology() {
    OWLNamedIndividual source = factory.getOWLNamedIndividual(":NegativeObjectPropertyAssertion_SourceIndividual", pm);
    OWLNamedIndividual target = factory.getOWLNamedIndividual(":NegativeObjectPropertyAssertion_TargetIndividual", pm);
    OWLObjectProperty property = featurePool.getExclusiveProperty(":negativeObjectPropertyAssertionProperty");

    addAxiomToOntology(factory.getOWLNegativeObjectPropertyAssertionAxiom(property, source, target));
  }

  @Override
  public String getName() {
    return "owl:NegativePropertyAssertion (Object Property)";
  }

  @Override
  public String getToken() {
    return "negativeasserationobjectprop";
  }

  @Override
  public FeatureCategory getCategory() {
    return FeatureCategory.ASSERTIONS;
  }
}
