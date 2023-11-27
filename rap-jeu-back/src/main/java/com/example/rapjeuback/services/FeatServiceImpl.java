package com.example.rapjeuback.services;

import com.example.rapjeuback.JPA.JpaFeatDao;
import com.example.rapjeuback.models.Feat;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FeatServiceImpl implements FeatService {

    final
    JpaFeatDao featRepository;

    public FeatServiceImpl(JpaFeatDao featRepository) {
        this.featRepository = featRepository;
    }


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