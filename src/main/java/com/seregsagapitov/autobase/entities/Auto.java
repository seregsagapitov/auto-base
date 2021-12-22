package com.seregsagapitov.autobase.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "auto")

public class Auto {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_auto")
    private long id_auto;


//    @Column(name = "trademark_id")
//    private long trademark_id;

    @ManyToOne
    @JoinColumn(name = "trademark_id")
    private Trademark trademark;


    @ManyToOne
    @JoinColumn(name = "model_id")
    private Model model;

    @ManyToOne
    @JoinColumn(name = "type_vagon_id")
    private TypeVagon typeVagon;

    @Column(name = "year_produce")
    private int year_produce;

    @Column(name = "mileage")
    private int mileage;

    @Column(name = "engine_capacity")
    private double engine_capacity;

    @Column(name = "engine_power")
    private double engine_power;


    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

    @Column(name = "price")
    private int price;

    @Column(name = "features")
    private String features;

}
