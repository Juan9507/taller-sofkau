package org.sofkau.exercise.exercise3;

import org.sofkau.exercise.MyScanner;

public class App {

    static MessagesExercise3 message = MessagesExercise3.getInstance();
    static MyScanner scanner = MyScanner.getInstance();

    public static void main(String[] args) {
        init();
    }

    public static void init() {
        message.showGetInfo();
        message.showGetNumberText();
        Exercise3 exercise3 = new Exercise3(scanner.getDouble());
        Double area = exercise3.calculateArea();
        message.showAnswer(area);
    }
}
