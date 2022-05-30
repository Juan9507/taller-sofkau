package org.sofkau.exercise.exercise15;

import org.sofkau.exercise.MyScanner;

/**
 * [Clase para ejecutar el programa]
 *
 * @author [Juan David Rivera Naranjo - juandavidnaranjo75@gmail.com]
 * @version [v1.0.0]
 * @since [v1.0.0]
 */
public class App {

    static MessagesExercise15 message = MessagesExercise15.getInstance();
    static MyScanner scanner = MyScanner.getInstance();


    public static void main(String[] args) {
        init();
    }

    public static void init() {
        Boolean bool = true;
        message.showGetInfo();
        do {
            Exercise15.showMenu();
            message.showGetNumberText();
            Integer option = scanner.getInteger();
            bool = Exercise15.menuCase(option);
        } while (Boolean.TRUE.equals(bool));
    }
}
