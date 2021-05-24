package com.github.rubenslavor.citiesapi.countries.repository;

import com.github.rubenslavor.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
