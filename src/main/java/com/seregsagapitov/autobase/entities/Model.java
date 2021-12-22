package com.seregsagapitov.autobase.entities;

import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name = "model")
@Data
public class Model {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_model")
    private long id_model;

    @Column(name = "title_model")
    private String title_model;

}
