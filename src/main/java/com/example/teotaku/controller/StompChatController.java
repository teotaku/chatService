package com.example.teotaku.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Slf4j
@Controller
public class StompChatController {

    @MessageMapping("/chats")
    @SendTo("/sub/chats")
    public String handleMessage(@Payload String message) {
        log.info("{} received", message);

        return message;
    }

}
