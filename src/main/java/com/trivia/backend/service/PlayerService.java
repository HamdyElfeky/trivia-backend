package com.trivia.backend.service;

import com.trivia.backend.model.Player;
import com.trivia.backend.repository.PlayerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerService {

    private final PlayerRepository repository;

    public PlayerService(
            PlayerRepository repository) {

        this.repository = repository;
    }

    public Player save(Player player) {
        return repository.save(player);
    }

    public List<Player> getAll() {
        return repository.findAll();
    }

    public Optional<Player> login(String username, String password) {
        return repository.findByUsernameAndPassword(username, password);
    }
}
