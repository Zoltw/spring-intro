package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomTextMessageService implements MessageService {
    List<String> messages = new ArrayList<>(Arrays.asList(
            "to0", "to1", "to2", "to3", "to4", "to5", "to6",
            "to7", "to8", "to9"
    ));

    @Override
    public String getMessage() {
        Random random = new Random();
        int randomInt = random. nextInt(10);
        return messages.get(randomInt);
    }
}
