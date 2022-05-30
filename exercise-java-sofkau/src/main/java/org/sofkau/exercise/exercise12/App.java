package org.sofkau.exercise.exercise12;

import org.sofkau.exercise.MyScanner;

public class App {

    static MyScanner scanner = MyScanner.getInstance();

    static MessagesExercise12 message = MessagesExercise12.getInstance();

    public static void main(String[] args) {
        init();
    }

    public static void init(){
        message.showGetInfo();
        message.showGetNumberText();
        String sentenceOne = scanner.getString();
        message.showGetNumberText();
        String sentenceTwo = scanner.getString();
        Exercise12 exercise12 = new Exercise12(sentenceOne,sentenceTwo);
        exercise12.sentenceEqual();
    }
}
