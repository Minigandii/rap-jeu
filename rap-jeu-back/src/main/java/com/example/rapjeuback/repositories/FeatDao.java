package com.example.rapjeuback.repositories;

import com.example.rapjeuback.models.Feat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface FeatDao {
    List<Feat> findAll();

    Optional<Feat> getById(Long id);

    Feat save(Feat feat);

    void deleteById(Long id);
}
