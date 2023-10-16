package com.example.rapjeuback.repositories;

import com.example.rapjeuback.models.Rapper;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RapperRepository extends JpaRepository<Rapper, Long> {

    List<Rapper> findAll();

}