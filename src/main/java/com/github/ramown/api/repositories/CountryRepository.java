package com.github.ramown.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.ramown.api.entities.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long>{

}
