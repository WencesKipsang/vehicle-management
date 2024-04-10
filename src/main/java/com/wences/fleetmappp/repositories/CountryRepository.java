package com.wences.fleetmappp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wences.fleetmappp.models.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

}
