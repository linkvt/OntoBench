package de.linkvt.bachelor.web.dtos;

import de.linkvt.bachelor.features.Feature;

/**
 * Contains all feature informations the REST api consumers need.
 */
public class FeatureDto {
  private String token;
  private String name;
  private String category;

  public FeatureDto() {
  }

  public FeatureDto(Feature feature) {
    this.token = feature.getToken();
    this.name = feature.getName();
    this.category = feature.getCategory().getDescription();
  }

  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }
}
