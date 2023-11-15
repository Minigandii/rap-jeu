package com.example.rapjeuback.services;

import com.example.rapjeuback.models.Rapper;

import java.util.List;

public interface RapperService {
    List<Rapper> getAllRappers() ;

    Rapper getById(Long id) ;

    Rapper save(Rapper rapper) ;

    void delete(Long id) ;
}
