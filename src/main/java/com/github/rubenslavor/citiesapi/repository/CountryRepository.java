package com.github.rubenslavor.citiesapi.repository;

import com.github.rubenslavor.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
