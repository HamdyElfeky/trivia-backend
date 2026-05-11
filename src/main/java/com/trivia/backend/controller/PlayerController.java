package com.trivia.backend.controller;

import com.trivia.backend.model.Player;
import com.trivia.backend.service.PlayerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/players")
public class PlayerController {

    private final PlayerService service;

    public PlayerController(
            PlayerService service) {

        this.service = service;
    }

    @GetMapping
    public List<Player> getPlayers() {
        return service.getAll();
    }

    @PostMapping
    public Player addPlayer(
            @RequestBody Player player) {

        return service.save(player);
    }

    @PostMapping("/login")
    public ResponseEntity<Player> login(@RequestBody Player player) {
        return service.login(player.getUsername(), player.getPassword())
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.status(401).build());
    }
}
