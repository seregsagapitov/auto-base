package com.seregsagapitov.autobase.repositories;


import com.seregsagapitov.autobase.entities.TypeVagon;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TypeVagonRepository extends CrudRepository<TypeVagon, Long> {
    //List<Auto> findByTypeVagon_id(Long id);
}