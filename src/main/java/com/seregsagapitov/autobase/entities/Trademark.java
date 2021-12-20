package com.seregsagapitov.autobase.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "trademark")
public class Trademark {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_trademark")
    private long id_trademark;

    @Column(name = "trademark")
    private String trademark;
}
