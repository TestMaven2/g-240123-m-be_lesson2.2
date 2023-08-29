package de.telran.g240123mbe_lesson22.task2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Developer developer = (Developer) context.getBean("javaDeveloper");
        System.out.println(developer);

        Position position = context.getBean(Position.class);
        position.printInfo();
    }
}
