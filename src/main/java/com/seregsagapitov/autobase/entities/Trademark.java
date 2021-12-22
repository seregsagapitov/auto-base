package com.seregsagapitov.autobase.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "trademark")
@Data
public class Trademark {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_trademark")
    private long id_trademark;

    @Column(name = "title_trademark")
    private String title_trademark;

}
