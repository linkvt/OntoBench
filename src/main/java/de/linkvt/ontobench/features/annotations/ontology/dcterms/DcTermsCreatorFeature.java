package de.linkvt.ontobench.features.annotations.ontology.dcterms;

import de.linkvt.ontobench.features.Feature;
import de.linkvt.ontobench.features.FeatureCategory;
import de.linkvt.ontobench.features.annotations.ontology.OntologyConstants;

import org.semanticweb.owlapi.model.AddOntologyAnnotation;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLAnnotation;
import org.semanticweb.owlapi.model.OWLAnnotationProperty;
import org.semanticweb.owlapi.vocab.Namespaces;
import org.springframework.beans.factory.annotation.Autowired;

public class DcTermsCreatorFeature extends Feature {

  @Autowired
  OntologyConstants ontologyConstants;

  @Override
  public void addToOntology() {
    OWLAnnotationProperty property = factory.getOWLAnnotationProperty(IRI.create(Namespaces.DCTERMS + "creator"));
    OWLAnnotation creator = factory.getOWLAnnotation(property, factory.getOWLLiteral(ontologyConstants.getCreator()));

    addChangeToOntology(new AddOntologyAnnotation(ontology, creator));
  }

  @Override
  public String getName() {
    return "dcterms:creator";
  }

  @Override
  public String getToken() {
    return "dctermscreator";
  }

  @Override
  public FeatureCategory getCategory() {
    return FeatureCategory.DC;
  }
}
