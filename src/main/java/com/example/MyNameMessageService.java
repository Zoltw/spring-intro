package com.example;

import org.graalvm.compiler.lir.CompositeValue;
import org.springframework.stereotype.Component;
@Component("messageService") //dzieki temu te same hashe
public class MyNameMessageService implements MessageService {
    String name = "Filip Zolyniak";
    @Override
    public String getMessage() {
        return name;
    }

}
