package org.sofkau.exercise.exercise11;

import org.sofkau.exercise.MyScanner;

/**
 * [Clase para ejecutar el programa]
 *
 * @author [Juan David Rivera Naranjo - juandavidnaranjo75@gmail.com]
 * @version [v1.0.0]
 * @since [v1.0.0]
 */
public class App {

    /**
     * Creacion del objeto scanner
     */
    static MyScanner scanner = MyScanner.getInstance();

    /**
     * Creacion del objeto MessagesExercise10 para los mensajes
     */
    static MessagesExercise11 message = MessagesExercise11.getInstance();

    public static void main(String[] args) {
        init();
    }

    public static void init() {
        message.showGetInfo();
        message.showGetNumberText();
        String text = scanner.getString();
        Exercise11 exercise11 = new Exercise11(text);
        message.showLength(exercise11.lengthSentence());
        exercise11.fillMap();
        exercise11.travelString();
        exercise11.toPrint();
    }
}
