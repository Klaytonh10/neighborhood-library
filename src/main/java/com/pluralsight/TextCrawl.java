package com.pluralsight;

import java.io.IOException;

public class TextCrawl {

    String text = "";

    public TextCrawl(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }

    public void startScrawl() throws IOException, InterruptedException {
            int delay = 100;

            for (int i = 0; 0 < text.length(); i++) {
                System.out.print(text.charAt(i));
                Thread.sleep(delay);
        }
        System.out.println();
    }
}
