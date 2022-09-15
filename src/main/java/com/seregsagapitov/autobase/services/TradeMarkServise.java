package com.seregsagapitov.autobase.services;

import com.seregsagapitov.autobase.entities.Auto;
import com.seregsagapitov.autobase.repositories.TradeMarkRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


import com.seregsagapitov.autobase.entities.Trademark;
import org.springframework.stereotype.Service;

@Service
public class TradeMarkServise {

    private TradeMarkRepository tradeMarkRepository;

    @Autowired
    public void setTradeMarkRepository(TradeMarkRepository tradeMarkRepository) {
        this.tradeMarkRepository = tradeMarkRepository;
    }


    public List<Trademark> getAllTrademark() {
        return (List<Trademark>) tradeMarkRepository.findAll();
    }

    public Trademark getTradeMarkById(Long id_trademark) {
        return  tradeMarkRepository.findById(id_trademark).orElse(null);
    }
//        public Trademark saveOrUpdate(Trademark trademark) {
//        return tradeMarkRepository.save(trademark);
//    }

}
