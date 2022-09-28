package com.seregsagapitov.autobase.repositories;

import com.seregsagapitov.autobase.entities.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CityRepository extends CrudRepository<City, Long> {
    //List<Auto> findByModel_id(Long id);
}