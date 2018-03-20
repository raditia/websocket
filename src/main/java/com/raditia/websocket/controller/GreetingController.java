package com.raditia.websocket.controller;

import com.raditia.websocket.model.Greeting;
import com.raditia.websocket.model.HelloMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class GreetingController {


    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greeting greeting(HelloMessage message) throws Exception {
        Thread.sleep(1000); // simulated delay
        String time = new SimpleDateFormat("HH:mm").format(new Date());
        return new Greeting("Hello, " + message.getName() + "!", time);
    }
}
