package com.seregsagapitov.autobase.repositories;

import com.seregsagapitov.autobase.entities.Auto;
import com.seregsagapitov.autobase.entities.Trademark;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TradeMarkRepository extends CrudRepository<Trademark, Long> {
    //List<Auto> findByModel_id(Long id);
}
