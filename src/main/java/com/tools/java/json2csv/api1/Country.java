package com.tools.java.json2csv.api1;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Country {

  @JsonProperty("Country")
  private String countryName;
  @JsonProperty("CountryCode")
  private String countryCode;
  @JsonProperty("Slug")
  private String slug;
  @JsonProperty("NewConfirmed")
  private int newConfirmed;
  @JsonProperty("TotalConfirmed")
  private int totalConfirmed;
  @JsonProperty("NewDeaths")
  private int newDeaths;
  @JsonProperty("TotalDeaths")
  private int totalDeaths;
  @JsonProperty("NewRecovered")
  private int newRecovered;
  @JsonProperty("TotalRecovered")
  private int totalRecovered;
  @JsonProperty("Date")
  private Date date;

  public Country(String countryName, String countryCode, String slug, int newConfirmed, int totalConfirmed,
      int newDeaths, int totalDeaths, int newRecovered, int totalRecovered, Date date) {
    this.countryName = countryName;
    this.countryCode = countryCode;
    this.slug = slug;
    this.newConfirmed = newConfirmed;
    this.totalConfirmed = totalConfirmed;
    this.newDeaths = newDeaths;
    this.totalDeaths = totalDeaths;
    this.newRecovered = newRecovered;
    this.totalRecovered = totalRecovered;
    this.date = date;
  }

  public String getCountryName() {
    return countryName;
  }

  public String getCountryCode() {
    return countryCode;
  }

  public String getSlug() {
    return slug;
  }

  public int getNewConfirmed() {
    return newConfirmed;
  }

  public int getTotalConfirmed() {
    return totalConfirmed;
  }

  public int getNewDeaths() {
    return newDeaths;
  }

  public int getTotalDeaths() {
    return totalDeaths;
  }

  public int getNewRecovered() {
    return newRecovered;
  }

  public int getTotalRecovered() {
    return totalRecovered;
  }

  public Date getDate() {
    return date;
  }

  @Override
  public String toString() {
    return "Country [countryCode=" + countryCode + ", countryName=" + countryName + ", date=" + date + ", newConfirmed="
        + newConfirmed + ", newDeaths=" + newDeaths + ", newRecovered=" + newRecovered + ", slug=" + slug
        + ", totalConfirmed=" + totalConfirmed + ", totalDeaths=" + totalDeaths + ", totalRecovered=" + totalRecovered
        + "]";
  }

  public void setCountryName(String countryName) {
    if (countryName.contains(",")) {
      this.countryName = countryName.replace(",", ";");
    } else {
      this.countryName = countryName;
    }
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public void setSlug(String slug) {
    if (slug.contains(",")) {
      this.slug = slug.replace(",", ";");
    } else {
      this.slug = slug;
    }
  }

  public void setNewConfirmed(int newConfirmed) {
    this.newConfirmed = newConfirmed;
  }

  public void setTotalConfirmed(int totalConfirmed) {
    this.totalConfirmed = totalConfirmed;
  }

  public void setNewDeaths(int newDeaths) {
    this.newDeaths = newDeaths;
  }

  public void setTotalDeaths(int totalDeaths) {
    this.totalDeaths = totalDeaths;
  }

  public void setNewRecovered(int newRecovered) {
    this.newRecovered = newRecovered;
  }

  public void setTotalRecovered(int totalRecovered) {
    this.totalRecovered = totalRecovered;
  }

  public void setDate(Date date) {
    this.date = date;
  }

}
