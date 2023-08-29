package de.telran.g240123mbe_lesson22.task1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public Message message() {
        Message message = new Message();
        message.setMessage("This is message from bean.");
        return message;
    }
}
