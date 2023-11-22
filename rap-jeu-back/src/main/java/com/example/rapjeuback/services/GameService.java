package com.example.rapjeuback.services;

import com.example.rapjeuback.models.Game;

import java.util.List;
import java.util.Optional;

public interface GameService {

    List<Game> findAll();

    Optional<Game> getById(Long id);

    Game save(Game game);

    void delete(Long id);

}
