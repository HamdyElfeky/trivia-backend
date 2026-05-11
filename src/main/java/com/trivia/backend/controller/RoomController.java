package com.trivia.backend.controller;

import com.trivia.backend.model.Room;
import com.trivia.backend.service.RoomService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rooms")
public class RoomController {

    private final RoomService service;

    public RoomController(RoomService service) {
        this.service = service;
    }

    @GetMapping
    public List<Room> getRooms() {
        return service.getAll();
    }

    @PostMapping
    public Room addRoom(@RequestBody Room room) {
        return service.save(room);
    }
}
