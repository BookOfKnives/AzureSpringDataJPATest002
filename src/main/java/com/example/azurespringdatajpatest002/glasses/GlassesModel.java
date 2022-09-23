package com.example.azurespringdatajpatest002.glasses;

import lombok.Setter;
import org.springframework.boot.autoconfigure.batch.BatchDataSource;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Setter
@Entity
public class GlassesModel {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    long Id;
    String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public GlassesModel(){
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }
}
