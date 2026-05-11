package com.trivia.backend.service;

import com.trivia.backend.model.Question;
import com.trivia.backend.repository.QuestionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    public List<Question> getByDifficulty(String difficulty) {
        return repository.findByDifficulty(difficulty);
    }

    private final QuestionRepository repository;

    public QuestionService(QuestionRepository repository) {
        this.repository = repository;
    }

    public List<Question> getAll() {
        return repository.findAll();
    }

    public Question save(Question question) {
        return repository.save(question);
    }
}
