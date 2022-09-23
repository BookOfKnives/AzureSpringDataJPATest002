package com.example.azurespringdatajpatest002.glasses;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GlassesRepository extends CrudRepository<GlassesModel, Long> {
    List<GlassesModel> findGlassesModelByName(String name);

    @Query("SELECT c FROM GlassesModel c")
    List<GlassesModel> findAllOrderById();
}
