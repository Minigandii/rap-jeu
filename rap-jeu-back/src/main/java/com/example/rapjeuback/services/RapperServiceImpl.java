package com.example.rapjeuback.services;

import com.example.rapjeuback.jpa.JpaRapperDao;
import com.example.rapjeuback.models.Rapper;
import com.example.rapjeuback.repositories.RapperDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RapperServiceImpl implements RapperService {
    private final RapperDao rapperRepository;

    public RapperServiceImpl(@Qualifier("jpaRapperDao") JpaRapperDao rapperRepository) {
        this.rapperRepository = rapperRepository;
    }

    @Override
    public List<Rapper> getAllRappers() {
        return rapperRepository.findAll();
    }

    @Override
    public Rapper getById(Long id) {
        return rapperRepository.getById(id).orElse(null);
    }

    @Override
    public Rapper save(Rapper rapper) {
        return rapperRepository.save(rapper);
    }

    @Override
    public void delete(Long id) {
        rapperRepository.deleteById(id);
    }


}
