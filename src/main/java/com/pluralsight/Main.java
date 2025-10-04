package com.pluralsight;

import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.input.KeyType;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.swing.SwingTerminalFontConfiguration;

import javax.swing.*;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        int colSize = 150;
        int rowSize = 150;

        DefaultTerminalFactory terminalFactory = new DefaultTerminalFactory()
                .setInitialTerminalSize(new TerminalSize(colSize, rowSize));
        SwingTerminalFontConfiguration fontConfiguration = SwingTerminalFontConfiguration.getDefaultOfSize(24);
        Screen screen = terminalFactory.setTerminalEmulatorFontConfiguration(fontConfiguration).createScreen();
        screen.startScreen();

        TextGraphics textGraphics = screen.newTextGraphics();
        textGraphics.setForegroundColor(TextColor.ANSI.DEFAULT);

        String[] stringArr = {
                "Welcome to your Neighborhood Library!",
                "Please Select One: ",
                "(C)Available Books",
                "(V)Checked Out Books",
                "(X)Close Program"
        };

        MyScreens screens = new MyScreens(stringArr);
        screens.loadHomeScreen(screen, textGraphics);
        inputChar(screen);
    }

    public static void inputChar(Screen screen) throws IOException {
        while (true) {
            KeyStroke keyStroke = screen.readInput();
            if (keyStroke.getKeyType() == KeyType.Character) {
                char thisKey = keyStroke.getCharacter();
                switch (thisKey) {
                    case 'c':
                        System.out.println("C");
                }

            }
        }
    }
}
