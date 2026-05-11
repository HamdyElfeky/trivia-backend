package com.trivia.backend.websocket;

public class GameMessage {

    private String sender;
    private String content;

    public GameMessage() {
    }

    public GameMessage(String sender, String content) {
        this.sender = sender;
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}