package com.javarush.task.task15.task1522;

import java.util.Objects;

public class Sun implements Planet{
    private static Sun instance;

    private Sun() {

    }

    public static Sun getInstance() {
        if(Objects.isNull(instance)){
            instance = new Sun();
        }
        return instance;
    }

}


