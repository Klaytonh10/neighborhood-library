package com.pluralsight;

import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.input.KeyType;
import com.googlecode.lanterna.screen.Screen;

import java.io.IOException;

public class MyScreens {

    private String[] stringArr = {
            "Welcome to your Neighborhood Library!",
            "Please Select One: ",
            "(C)Available Books",
            "(V)Checked Out Books",
            "(X)Close Program"
    };

    public MyScreens(String[] homeArr) {
        this.stringArr = homeArr;
    }



    public void loadHomeScreen(Screen screen, TextGraphics textGraphics) throws IOException, InterruptedException {

        //Home screen
        int textX = 20;
        int textY = 5;
        for (int i = 0; i < stringArr.length; i++) {

            for (int x = 0; x < stringArr[i].length(); x++) {
                textGraphics.putString(x + textX, textY, String.valueOf(stringArr[i].charAt(x)));
                Thread.sleep(80);
                screen.refresh();
            }
            textY += 2;
        }



    }
}
