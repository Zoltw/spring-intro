package com.example;

public class MyNameMessageService implements MessageService {
    String name = "Filip Zolyniak";
    @Override
    public String getMessage() {
        return name;
    }
}
