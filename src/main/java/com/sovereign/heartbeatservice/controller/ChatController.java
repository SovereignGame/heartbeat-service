package com.sovereign.heartbeatservice.controller;

import com.sovereign.heartbeatservice.model.Message;
import com.sovereign.heartbeatservice.model.OutputMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class ChatController {

    private Logger log = LoggerFactory.getLogger(ChatController.class);

    @MessageMapping("/chat/{topic}")
    @SendTo("/topic/messages")
    public OutputMessage send(
            @DestinationVariable("topic") String topic, Message message)
            throws Exception {
        log.info("inside");
        return new OutputMessage(message.getFrom(), message.getText(), topic);
    }

}