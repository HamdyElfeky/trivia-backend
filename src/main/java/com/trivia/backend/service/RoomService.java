package com.trivia.backend.service;

import com.trivia.backend.model.Room;
import com.trivia.backend.repository.RoomRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {

    private final RoomRepository repository;

    public RoomService(RoomRepository repository) {
        this.repository = repository;
    }

    public List<Room> getAll() {
        return repository.findAll();
    }

    public Room save(Room room) {
        return repository.save(room);
    }
}
