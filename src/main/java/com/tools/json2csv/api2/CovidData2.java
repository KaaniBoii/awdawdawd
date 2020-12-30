package com.tools.json2csv.api2;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CovidData2 {

  private Country2[] countries;

  public CovidData2() {
  }

  public Country2[] getCountries() {
    return countries;
  }

  public void setCountries(Country2[] countries) {
    this.countries = countries;
  }

  @Override
  public String toString() {
    return "CovidData2 [countries=" + Arrays.toString(countries) + "]";
  }
}
