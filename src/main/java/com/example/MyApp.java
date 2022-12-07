package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(MyAppConfig.class);

        MessageService messageService = ctx.getBean("messageService", MessageService.class);
        MessageService messageService1 = ctx.getBean("messageService", MessageService.class);

        System.out.println(messageService.getMessage());
        System.out.println(messageService1.getMessage());

        System.out.println(messageService.hashCode() + "\n" + messageService1.hashCode());

    }
}
