package com.seregsagapitov.autobase.services;

import com.seregsagapitov.autobase.entities.Model;
import com.seregsagapitov.autobase.repositories.ModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ModelServise {

    private ModelRepository modelRepository;

    @Autowired
    public void setModelRepository(ModelRepository modelRepository) {
        this.modelRepository = modelRepository;
    }

    public List<Model> getAllModels() {
        return (List<Model>) modelRepository.findAll();
    }

    public Model getModelById(Long id_model) {
        return  modelRepository.findById(id_model).orElse(null);
    }


}
