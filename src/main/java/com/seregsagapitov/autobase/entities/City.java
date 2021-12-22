package com.seregsagapitov.autobase.entities;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "city")
@Data
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_city")
    private long id_city;

    @Column(name = "title_city")
    private String title_city;

}
