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


//    @OneToMany
//    @JoinColumn(name = "trademark_id")
//    private List<Trademark> trademarks;

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

    public Auto() {
    }

    public long getId_auto() {
        return id_auto;
    }

//    public List<Trademark> getTrademarks() {
//        return trademarks;
//    }

    public Trademark getTrademark() {
        return trademark;
    }

    public Model getModel() {
        return model;
    }

    public TypeVagon getTypeVagon() {
        return typeVagon;
    }

    public int getYear_produce() {
        return year_produce;
    }

    public int getMileage() {
        return mileage;
    }

    public double getEngine_capacity() {
        return engine_capacity;
    }

    public double getEngine_power() {
        return engine_power;
    }

    public City getCity() {
        return city;
    }

    public int getPrice() {
        return price;
    }

    public String getFeatures() {
        return features;
    }

    public void setId_auto(long id_auto) {
        this.id_auto = id_auto;
    }

//    public void setTrademarks(List<Trademark> trademarks) {
//        this.trademarks = trademarks;
//    }

    public void setModel(Model model) {
        this.model = model;
    }

    public void setTypeVagon(TypeVagon typeVagon) {
        this.typeVagon = typeVagon;
    }

    public void setYear_produce(int year_produce) {
        this.year_produce = year_produce;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public void setEngine_capacity(double engine_capacity) {
        this.engine_capacity = engine_capacity;
    }

    public void setEngine_power(double engine_power) {
        this.engine_power = engine_power;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setFeatures(String features) {
        this.features = features;
    }
}
