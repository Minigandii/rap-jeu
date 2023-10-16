package com.example.rapjeuback.repositories;

import com.example.rapjeuback.models.Feat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FeatRepository extends JpaRepository<Feat, Long> {
    List<Feat> findAll();
}
