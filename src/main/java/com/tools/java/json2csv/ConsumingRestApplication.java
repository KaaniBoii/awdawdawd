package com.tools.java.json2csv;

import java.io.FileWriter;
import java.io.IOException;

import com.tools.java.json2csv.api1.Country;
import com.tools.java.json2csv.api1.CovidData;
import com.tools.java.json2csv.api2.Country2;
import com.tools.java.json2csv.api2.CovidData2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ConsumingRestApplication {

  private static final Logger log = LoggerFactory.getLogger(ConsumingRestApplication.class);

  public static void main(String[] args) {
    ConfigurableApplicationContext ctx = SpringApplication.run(ConsumingRestApplication.class, args);
    ctx.close();
  }

  @Bean
  public RestTemplate restTemplate(RestTemplateBuilder builder) {
    return builder.build();
  }

  @Bean
  public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
    return args -> {
      try {
        CovidData data = restTemplate.getForObject("https://api.covid19api.com/summary", CovidData.class);
        this.writeFile(data.getCountries());
        // log.info(data.toString());
      } catch (Exception e) {
        System.err.println(
            "GET auf API #1 (https://api.covid19api.com/summary) hat leider nicht geklappt. Weiter mit API #2 (https://covid19-api.org/api/status)...");
        CovidData2 data = new CovidData2();
        data.setCountries(restTemplate.getForObject("https://covid19-api.org/api/status", Country2[].class));
        this.writeFile(data.getCountries());
        // log.info(data.toString());
      } finally {
        log.info("COVID19 Daten erfolgreich erstellt!");
      }
    };
  }

  public <T> void writeFile(T[] countries) {
    try {
      FileWriter fw = new FileWriter("CovidData");
      int i = 0;
      if (countries instanceof Country[]) {
        fw.write(
            "Country,CountryCode,Slug,NewConfirmed,TotalConfirmed,NewDeaths,TotalDeaths,NewRecovered,TotalRecovered,Date"
                + System.lineSeparator());
        while (i < countries.length) {
          fw.write("\"" + ((Country) countries[i]).getCountryName() + "\",");
          fw.write("\"" + ((Country) countries[i]).getCountryCode() + "\",");
          fw.write("\"" + ((Country) countries[i]).getSlug() + "\",");
          fw.write(((Country) countries[i]).getNewConfirmed() + ",");
          fw.write(((Country) countries[i]).getTotalConfirmed() + ",");
          fw.write(((Country) countries[i]).getNewDeaths() + ",");
          fw.write(((Country) countries[i]).getTotalDeaths() + "\",");
          fw.write(((Country) countries[i]).getNewRecovered() + "\",");
          fw.write(((Country) countries[i]).getTotalRecovered() + "\",");
          fw.write("\"" + ((Country) countries[i]).getDate() + "\"" + System.lineSeparator());
          i++;
        }
      } else if (countries instanceof Country2[]) {
        fw.write("Country,Last_update,Cases,Deaths,Recovered" + System.lineSeparator());
        while (i < countries.length) {
          fw.write("\"" + ((Country2) countries[i]).getCountry() + "\",");
          fw.write("\"" + ((Country2) countries[i]).getLast_update() + "\",");
          fw.write(((Country2) countries[i]).getCases() + ",");
          fw.write(((Country2) countries[i]).getDeaths() + ",");
          fw.write(((Country2) countries[i]).getRecovered() + System.lineSeparator());
          i++;
        }
      }
      fw.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}