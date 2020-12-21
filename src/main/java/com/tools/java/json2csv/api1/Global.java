package com.tools.java.json2csv.api1;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Global {
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

  public Global(int newConfirmed, int totalConfirmed, int newDeaths, int totalDeaths, int newRecovered,
      int totalRecovered) {
    this.newConfirmed = newConfirmed;
    this.totalConfirmed = totalConfirmed;
    this.newDeaths = newDeaths;
    this.totalDeaths = totalDeaths;
    this.newRecovered = newRecovered;
    this.totalRecovered = totalRecovered;
  }

  public int getNewConfirmed() {
    return newConfirmed;
  }

  public int getTotalConfirmed() {
    return this.totalConfirmed;
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

  @Override
  public String toString() {
    return "Global [TotalConfirmed=" + totalConfirmed + ", newConfirmed=" + newConfirmed + ", newDeaths=" + newDeaths
        + ", newRecovered=" + newRecovered + ", totalDeaths=" + totalDeaths + ", totalRecovered=" + totalRecovered
        + "]";
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

}
