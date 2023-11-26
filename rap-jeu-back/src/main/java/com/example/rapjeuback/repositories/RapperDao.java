package com.example.rapjeuback.repositories;

import com.example.rapjeuback.models.Rapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RapperDao {

    List<Rapper> findAll();

    Optional<Rapper> getById(Long id);

    Rapper save(Rapper rapper);

    void deleteById(Long id);

    List<Rapper> getRapperTable(int number);
}