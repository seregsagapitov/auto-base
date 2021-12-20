package com.seregsagapitov.autobase.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "auto")

public class Auto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_auto")
    private long id_auto;

    @Column(name = "trademark_id")
    private long trademark_id;

   // @OneToMany
    //@JoinColumn(name = "id_trademark")


    @Column(name = "model_id")
    private long model_id;

    @Column(name = "type_vagon_id")
    private long type_vagon_id;

    @Column(name = "year_produce")
    private int year_produce;

    @Column(name = "mileage")
    private int mileage;

    @Column(name = "engine_capacity")
    private double engine_capacity;

    @Column(name = "engine_power")
    private double engine_power;

    @Column(name = "city_id")
    private long city_id;

    @Column(name = "price")
    private int price;

    @Column(name = "features")
    private String features;

}
