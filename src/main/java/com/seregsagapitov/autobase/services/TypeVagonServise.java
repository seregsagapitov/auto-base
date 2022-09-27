package com.seregsagapitov.autobase.services;

import com.seregsagapitov.autobase.entities.Trademark;
import com.seregsagapitov.autobase.entities.TypeVagon;
import com.seregsagapitov.autobase.repositories.TradeMarkRepository;
import com.seregsagapitov.autobase.repositories.TypeVagonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;




@Service
public class TypeVagonServise {

    private TypeVagonRepository typeVagonRepository;

    @Autowired
    public void setTypeVagonRepository(TypeVagonRepository typeVagonRepository) {
        this.typeVagonRepository = typeVagonRepository;
    }



    public List<TypeVagon> getAllTypeVagon() {
        return (List<TypeVagon>) typeVagonRepository.findAll();
    }

    public TypeVagon getTypeVagonById(Long id_type_vagon) {
        return  typeVagonRepository.findById(id_type_vagon).orElse(null);
    }
//        public Trademark saveOrUpdate(Trademark trademark) {
//        return tradeMarkRepository.save(trademark);
//    }

}