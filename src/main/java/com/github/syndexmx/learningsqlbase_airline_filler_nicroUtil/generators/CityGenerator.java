package com.github.syndexmx.learningsqlbase_airline_filler_nicroUtil.generators;


import com.github.syndexmx.learningsqlbase_airline_filler_nicroUtil.domain.City;
import com.github.syndexmx.learningsqlbase_airline_filler_nicroUtil.repositories.CityRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

import java.util.List;

@PropertySource("classpath:/src/main/resources/cities.properties")
public class CityGenerator {

    @Autowired
    @Value("#{${city.names}}")
    final private List<String> citiesList;

    @Autowired
    static CityRepository cityRepository;

    public CityGenerator(List<String> citiesList) {
        this.citiesList = citiesList;
    }

    public void generateCities() {
        for (String s : citiesList) {
            City city = City.builder().name(s).build();
            cityRepository.save(city);
        }
    }
}