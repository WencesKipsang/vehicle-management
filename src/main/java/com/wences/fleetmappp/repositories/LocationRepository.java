package com.wences.fleetmappp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.wences.fleetmappp.models.Location;

@Repository
public interface LocationRepository extends CrudRepository<Location, Integer> {

}
