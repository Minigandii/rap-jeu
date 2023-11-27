package com.example.rapjeuback.services;

import com.example.rapjeuback.jpa.JpaGameDao;
import com.example.rapjeuback.models.Game;
import com.example.rapjeuback.repositories.GameDao;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class GameServiceImpl implements GameService {
    private final JpaGameDao gameRepository;

    public GameServiceImpl(JpaGameDao gameRepository) {
        this.gameRepository = gameRepository;
    }

    @Override
    public List<Game> findAll() {
        return gameRepository.findAll();
    }

    @Override
    public Optional<Game> getById(Long id) {
        return gameRepository.getById(id);
    }

    @Override
    public Game save(Game game) {
        return gameRepository.save(game);
    }

    @Override
    public void delete(Long id) {
        gameRepository.deleteById(id);
    }

    @Override
    public List<Game> findBestGames() {
        return gameRepository.findBestGames();
    }
}