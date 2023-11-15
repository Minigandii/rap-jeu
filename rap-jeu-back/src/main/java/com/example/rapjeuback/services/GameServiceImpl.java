package com.example.rapjeuback.services;

import com.example.rapjeuback.models.Game;
import com.example.rapjeuback.repositories.GameDao;

import java.util.List;
import java.util.Optional;

public class GameServiceImpl implements GameService {
    private final GameDao gameRepository;

    public GameServiceImpl(GameDao gameRepository) {
        this.gameRepository = gameRepository;
    }

    @Override
    public List<Game> getAllGames() {
        return gameRepository.findAll();
    }

    @Override
    public Optional<Game> getGameById(Long id) {
        return gameRepository.getById(id);
    }

    @Override
    public Game saveGame(Game game) {
        return gameRepository.save(game);
    }

    @Override
    public void deleteGame(Long id) {
        gameRepository.deleteById(id);
    }
}