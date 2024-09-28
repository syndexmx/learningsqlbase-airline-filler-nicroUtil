package com.github.syndexmx.learningsqlbase_airline_filler_nicroUtil.repositories;

import com.github.syndexmx.learningsqlbase_airline_filler_nicroUtil.domain.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City, String> {
}
