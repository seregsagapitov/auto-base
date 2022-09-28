package com.seregsagapitov.autobase.services;

import com.seregsagapitov.autobase.entities.City;
import com.seregsagapitov.autobase.repositories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class CityServise {

    private CityRepository cityRepository;

    @Autowired
    public void setCityRepository(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    public List<City> getAllCities() {
        return (List<City>) cityRepository.findAll();
    }

    public City getCityById(Long id_city) {
        return  cityRepository.findById(id_city).orElse(null);
    }


}
