package com.trivia.backend.controller;

import com.trivia.backend.model.Question;
import com.trivia.backend.service.QuestionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/questions")
public class QuestionController {

    private final QuestionService service;

    public QuestionController(QuestionService service) {
        this.service = service;
    }

    @GetMapping
    public List<Question> getQuestions(@RequestParam(required = false) String difficulty) {

        return service.getByDifficulty(difficulty);
    }

    @PostMapping
    public Question addQuestion(@RequestBody Question question) {
        return service.save(question);
    }
}
