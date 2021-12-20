package com.seregsagapitov.autobase.services;


import com.seregsagapitov.autobase.entities.Auto;
import com.seregsagapitov.autobase.repositories.AutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutoService {
    @Autowired
    private AutoRepository autoRepository;

    public List<Auto> getAllAuto() {
        return (List<Auto>) autoRepository.findAll();
    }

    public Auto getAutoById_auto(Long id_auto) {
        return  autoRepository.findById(id_auto).orElse(null);
        //return autoRepository.findById(id_auto).orElse(null);
    }
}
