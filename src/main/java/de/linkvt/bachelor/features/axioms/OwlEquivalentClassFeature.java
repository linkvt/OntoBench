package de.linkvt.bachelor.features.axioms;

import de.linkvt.bachelor.features.Feature;

import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLClass;
import org.springframework.stereotype.Component;

/**
 * Multiple equivalent owl classes.
 */
@Component
public class OwlEquivalentClassFeature extends Feature {
  @Override
  public void addToOntology() {
    OWLClass owlClass = featurePool.getReusableClassAndRemoveFromPool();
    OWLClass equivalentClass1 = featurePool.getExclusiveClass("EquivalentClass1");
    OWLClass equivalentClass2 = featurePool.getExclusiveClass("EquivalentClass2");
    OWLAxiom equivalentAxiom = factory.getOWLEquivalentClassesAxiom(owlClass, equivalentClass1, equivalentClass2);

    addAxiomToOntology(equivalentAxiom);
  }

  @Override
  public String getName() {
    return "owl:equivalentClass";
  }

  @Override
  public String getToken() {
    return "equivalentclass";
  }
}