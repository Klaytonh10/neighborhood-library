package com.pluralsight;

import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.screen.Screen;

import java.io.IOException;

public class MyScreens {

    private String[] homeStringArr = {
            "Welcome to your Neighborhood Library!",
            "Please Select One: ",
            "(C)Available Books",
            "(V)Checked Out Books",
            "(X)Close Program"
    };

    String[][] availableBookArr = {{},{},{},{}};

    private String[] currentArr = homeStringArr;

    public MyScreens(String[] currentArr) {
        this.currentArr = currentArr;
    }


    public void loadHomeScreen(Screen screen, TextGraphics textGraphics) throws IOException, InterruptedException {

        //Home screen
        int textX = 20;
        int textY = 5;
        for (int i = 0; i < homeStringArr.length; i++) {

            for (int x = 0; x < homeStringArr[i].length(); x++) {
                textGraphics.putString(x + textX, textY, String.valueOf(homeStringArr[i].charAt(x)));
                Thread.sleep(80);
                screen.refresh();
            }
            textY += 2;
        }
    }

    public void loadAvailableBooks() {

    }

}
