package de.linkvt.ontobench.features.classexpressions.connectivesandenumeration;

import de.linkvt.ontobench.features.Feature;
import de.linkvt.ontobench.features.FeatureCategory;

import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLObjectComplementOf;
import org.springframework.stereotype.Component;

@Component
public class OwlObjectComplementOfFeature extends Feature {
  @Override
  public void addToOntology() {
    OWLClass nonComplement = featurePool.getExclusiveClass(":NoObjectComplementOf");
    OWLObjectComplementOf complement = factory.getOWLObjectComplementOf(nonComplement);

    OWLClass owlClass = featurePool.getExclusiveClass(":ObjectComplementOf");

    addAxiomToOntology(factory.getOWLSubClassOfAxiom(owlClass, complement));
  }

  @Override
  public String getName() {
    return "owl:complementOf";
  }

  @Override
  public String getToken() {
    return "complementclass";
  }

  @Override
  public FeatureCategory getCategory() {
    return FeatureCategory.CLASS_EXPRESSIONS;
  }
}
