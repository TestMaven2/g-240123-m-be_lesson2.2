package de.telran.g240123mbe_lesson22.task1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Message message = context.getBean(Message.class);
        System.out.println(message);
    }
}
