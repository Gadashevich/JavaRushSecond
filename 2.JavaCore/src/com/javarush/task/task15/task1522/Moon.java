package com.javarush.task.task15.task1522;

import java.util.Objects;

public class Moon implements Planet{
    private static Moon instance;

    private Moon() {

    }

    public static Moon getInstance() {
        if(Objects.isNull(instance)){
            instance = new Moon();
        }
        return instance;
    }

}
