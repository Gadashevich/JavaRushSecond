package com.javarush.games.minigames.mini11;

import com.javarush.engine.cell.Color;

/* 
Закрашиваем поле
*/

public class FillOrangeGame extends FillGame {

    @Override
    public void fill() {
        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j <5 ; j++) {
                setCellColor(i,j,Color.ORANGE);
            }
        }
    }
}
