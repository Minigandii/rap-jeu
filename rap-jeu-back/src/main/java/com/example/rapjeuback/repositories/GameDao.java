package com.example.rapjeuback.repositories;

import com.example.rapjeuback.models.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface GameDao {
    List<Game> findAll();

    Optional<Game> getById(Long id);

    Game save(Game game);

    void deleteById(Long id);


    List<Game> findBestGames();
}
