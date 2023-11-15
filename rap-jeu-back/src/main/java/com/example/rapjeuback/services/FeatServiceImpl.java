package com.example.rapjeuback.services;

import com.example.rapjeuback.models.Feat;
import com.example.rapjeuback.repositories.FeatDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class FeatServiceImpl implements FeatService {

    private final FeatDao featRepository;

    public FeatServiceImpl(FeatDao featRepository) {
        this.featRepository = featRepository;
    }


    @Override
    public List<Feat> getAllFeats() {
        return featRepository.findAll();
    }

    @Override
    public Feat getFeatById(Long id) {
        return featRepository.getById(id).orElse(null);
    }

    @Override
    public Feat saveFeat(Feat feat) {
        return featRepository.save(feat);
    }

    @Override
    public void deleteFeat(Long id) {
        featRepository.deleteById(id);
    }
}