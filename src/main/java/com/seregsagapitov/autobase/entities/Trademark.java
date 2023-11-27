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

    public Trademark() {
    }

    public Trademark(String title_trademark) {
        this.title_trademark = title_trademark;
    }

    public long getId_trademark() {
        return id_trademark;
    }

    public String getTitle_trademark() {
        return title_trademark;
    }

    public void setId_trademark(long id_trademark) {
        this.id_trademark = id_trademark;
    }

    public void setTitle_trademark(String title_trademark) {
        this.title_trademark = title_trademark;
    }
}
