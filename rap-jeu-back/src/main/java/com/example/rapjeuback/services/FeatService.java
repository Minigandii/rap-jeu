package com.example.rapjeuback.services;

import com.example.rapjeuback.models.Feat;
import com.example.rapjeuback.repositories.FeatDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface FeatService {

    List<Feat> getAllFeats() ;

    Feat getFeatById(Long id);

    Feat saveFeat(Feat feat);

    void deleteFeat(Long id);
}
