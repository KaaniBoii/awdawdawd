package com.tools.java.json2csv.api2;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Country2 {

  private String country;
  private Date last_update;
  private int cases;
  private int deaths;
  private int recovered;

  public Country2(String country, Date last_update, int cases, int deaths, int recovered) {
    this.country = country;
    this.last_update = last_update;
    this.cases = cases;
    this.deaths = deaths;
    this.recovered = recovered;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Date getLast_update() {
    return last_update;
  }

  public void setLast_update(Date last_update) {
    this.last_update = last_update;
  }

  public int getCases() {
    return cases;
  }

  public void setCases(int cases) {
    this.cases = cases;
  }

  public int getDeaths() {
    return deaths;
  }

  public void setDeaths(int deaths) {
    this.deaths = deaths;
  }

  public int getRecovered() {
    return recovered;
  }

  public void setRecovered(int recovered) {
    this.recovered = recovered;
  }

  @Override
  public String toString() {
    return "Country2 [cases=" + cases + ", country=" + country + ", deaths=" + deaths + ", last_update=" + last_update
        + ", recovered=" + recovered + "]";
  }
}
