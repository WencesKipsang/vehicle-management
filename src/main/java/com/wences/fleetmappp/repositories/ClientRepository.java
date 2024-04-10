package com.wences.fleetmappp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wences.fleetmappp.models.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

}
