package com.tools.json2csv.api1;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CovidData {

  @JsonProperty("Message")
  private String message;
  @JsonProperty("Global")
  private Global global;
  @JsonProperty("Countries")
  private Country[] countries;
  @JsonProperty("Date")
  private String date;

  public CovidData() {
  }

  public String getMessage() {
    return message;
  }

  public Global getGlobal() {
    return global;
  }

  public Country[] getCountries() {
    return countries;
  }

  public String getDate() {
    return date;
  }

  @Override
  public String toString() {
    return "CovidData [countries=" + Arrays.toString(countries) + ", date=" + date + ", global=" + global + ", message="
        + message + "]";
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public void setGlobal(Global global) {
    this.global = global;
  }

  public void setCountries(Country[] countries) {
    this.countries = countries;
  }

  public void setDate(String date) {
    this.date = date;
  }

}
