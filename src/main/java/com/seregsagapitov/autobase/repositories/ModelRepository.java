package com.seregsagapitov.autobase.repositories;

import com.seregsagapitov.autobase.entities.Model;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ModelRepository extends CrudRepository<Model, Long> {
    //List<Auto> findByModel_id(Long id);
}