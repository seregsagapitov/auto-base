package com.seregsagapitov.autobase.services;


import com.seregsagapitov.autobase.entities.Auto;
import com.seregsagapitov.autobase.entities.Trademark;
import com.seregsagapitov.autobase.repositories.AutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutoService {

    private AutoRepository autoRepository;

    @Autowired
    public void setAutoRepository(AutoRepository autoRepository) {
        this.autoRepository = autoRepository;
    }


    public Auto findById(Long id) {
        return autoRepository.findById(id).orElse(null);
    }

    public Auto findByTitle(String title){
        return autoRepository.findOneByTitle(title);
    }

    public List<Auto> getAllAuto() {
        return (List<Auto>) autoRepository.findAll();
    }


    public Auto getAutoById_auto(Long id_auto) {
        return  autoRepository.findById(id_auto).orElse(null);
    }
    public Auto saveOrUpdate(Auto auto) {
        return autoRepository.save(auto);
    }





}
