package com.example.rapjeuback.services;

import com.example.rapjeuback.models.Feat;
import com.example.rapjeuback.repositories.FeatDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface FeatService {

    List<Feat> findAll() ;

    Optional<Feat> getById(Long id);

    Feat save(Feat feat);

    void deleteById(Long id);

}
