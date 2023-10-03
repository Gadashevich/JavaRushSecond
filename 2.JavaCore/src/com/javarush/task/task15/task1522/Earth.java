package com.javarush.task.task15.task1522;

import java.util.Objects;

public class Earth implements Planet {
    private static Earth instance;

    private Earth() {

    }

    public static Earth getInstance() {
        if(Objects.isNull(instance)){
            instance = new Earth();
        }
        return instance;
    }
}
