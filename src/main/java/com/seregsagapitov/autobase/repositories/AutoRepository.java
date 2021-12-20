package com.seregsagapitov.autobase.repositories;

import com.seregsagapitov.autobase.entities.Auto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AutoRepository extends CrudRepository<Auto, Long> {
    //List<Auto> findByModel_id(Long id);


}
