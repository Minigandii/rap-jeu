package com.example.rapjeuback.services;

import com.example.rapjeuback.models.Game;

import java.util.List;
import java.util.Optional;

public interface GameService {

    List<Game> getAllGames();

    Optional<Game> getGameById(Long id);

    Game saveGame(Game game);

    void deleteGame(Long id);

}
