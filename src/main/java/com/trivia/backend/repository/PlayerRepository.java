package com.trivia.backend.repository;

import com.trivia.backend.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PlayerRepository
        extends JpaRepository<Player, Long> {

    Optional<Player> findByUsernameAndPassword(String username, String password);
}
