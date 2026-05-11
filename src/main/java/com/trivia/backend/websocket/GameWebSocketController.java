package com.trivia.backend.websocket;

import org.springframework.messaging.handler.annotation.MessageMapping;

import org.springframework.messaging.handler.annotation.SendTo;

import org.springframework.stereotype.Controller;

@Controller
public class GameWebSocketController {

    @MessageMapping("/game")
    @SendTo("/topic/game")
    public GameMessage sendMessage(
            GameMessage message) {

        return message;
    }
}