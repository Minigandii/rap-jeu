package com.example.rapjeuback.services;

import com.example.rapjeuback.models.Rapper;

import java.util.List;
import java.util.Optional;

public interface RapperService {
    List<Rapper> findAll() ;

    Optional<Rapper> getById(Long id) ;

    Rapper save(Rapper rapper) ;

    void delete(Long id) ;

    List<Rapper> getRapperTable(int number);
}
