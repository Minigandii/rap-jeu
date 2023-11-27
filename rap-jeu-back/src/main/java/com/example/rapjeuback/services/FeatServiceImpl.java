package com.example.rapjeuback.services;

import com.example.rapjeuback.jpa.JpaFeatDao;
import com.example.rapjeuback.models.Feat;
import com.example.rapjeuback.repositories.FeatDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FeatServiceImpl implements FeatService {

    @Autowired
    JpaFeatDao featRepository;


    @Override
    public List<Feat> findAll() {
        return featRepository.findAll();
    }

    @Override
    public Optional<Feat> getById(Long id) {
        return Optional.ofNullable(featRepository.getById(id).orElse(null));
    }

    @Override
    public Feat save(Feat feat) {
        return featRepository.save(feat);
    }

    @Override
    public void deleteById(Long id) {
        featRepository.deleteById(id);
    }
}