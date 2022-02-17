package com.github.ramown.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.github.ramown.api.entities.City;

@Repository
public interface CityRepository extends JpaRepository<City, Long>{

	@Query(value = "SELECT ((SELECT lat_lon FROM cidade WHERE id=?1) <@> (SELECT lat_lon FROM cidade WHERE id=?2)) as distance", nativeQuery = true)
	Double distanceByPoints(Long cityId1, Long cityId2);

}
