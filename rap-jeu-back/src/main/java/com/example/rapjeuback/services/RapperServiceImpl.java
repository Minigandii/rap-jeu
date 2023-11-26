package com.example.rapjeuback.services;

import com.example.rapjeuback.jpa.JpaRapperDao;
import com.example.rapjeuback.models.Rapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RapperServiceImpl implements RapperService {
    JpaRapperDao rapperRepository;

    public RapperServiceImpl(JpaRapperDao rapperRepository) {
        this.rapperRepository = rapperRepository;
    }


    @Override
    public List<Rapper> findAll() {
        return rapperRepository.findAll();
    }

    @Override
    public Optional<Rapper> getById(Long id) {
        return Optional.ofNullable(rapperRepository.getById(id).orElse(null));
    }

    @Override
    public Rapper save(Rapper rapper) {
        return rapperRepository.save(rapper);
    }

    @Override
    public void delete(Long id) {
        rapperRepository.deleteById(id);
    }

    @Override
    public List<Rapper> getRapperTable(int number) {
        return rapperRepository.getRapperTable(number);
    }
}
