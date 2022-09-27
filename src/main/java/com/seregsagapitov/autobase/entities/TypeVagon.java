package com.seregsagapitov.autobase.entities;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "type_vagon")
@Data
public class TypeVagon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_type_vagon")
    private long id_type_vagon;

    @Column(name = "title_type_vagon")
    private String title_type_vagon;

    public long getId_type_vagon() {
        return id_type_vagon;
    }

    public String getTitle_type_vagon() {
        return title_type_vagon;
    }
}
