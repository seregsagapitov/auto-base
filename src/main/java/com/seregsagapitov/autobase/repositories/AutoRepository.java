package com.seregsagapitov.autobase.repositories;

import com.seregsagapitov.autobase.entities.Auto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface AutoRepository extends CrudRepository<Auto, Long> {
    //List<Auto> findByModel_id(Long id);
    //Auto findOneByTitle(String title);
    //Auto findAutoByTrademarkTitle_trademark(String title);
}
