package de.linkvt.bachelor.features.assertions;

import de.linkvt.bachelor.features.Feature;
import de.linkvt.bachelor.features.FeatureCategory;

import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLLiteral;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.springframework.stereotype.Component;

@Component
public class OwlNegativeDataPropertyAssertionFeature extends Feature {
  @Override
  public void addToOntology() {
    OWLNamedIndividual source = factory.getOWLNamedIndividual(":NegativeDataPropertyAssertion_SourceIndividual", pm);
    OWLLiteral target = factory.getOWLLiteral("NegativeDataPropertyAssertion_TargetValue");
    OWLDataProperty property = factory.getOWLDataProperty(":negativeDataPropertyAssertionProperty", pm);

    addAxiomToOntology(factory.getOWLNegativeDataPropertyAssertionAxiom(property, source, target));
  }

  @Override
  public String getName() {
    return "owl:NegativePropertyAssertion (Data Property)";
  }

  @Override
  public String getToken() {
    return "negativeasserationdataprop";
  }

  @Override
  public FeatureCategory getCategory() {
    return FeatureCategory.ASSERTIONS;
  }
}
