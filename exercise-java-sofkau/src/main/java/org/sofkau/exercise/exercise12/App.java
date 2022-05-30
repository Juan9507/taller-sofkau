package org.sofkau.exercise.exercise12;

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
    static MessagesExercise12 message = MessagesExercise12.getInstance();

    public static void main(String[] args) {
        init();
    }

    /**
     * Metodo para iniciar el programa
     */
    public static void init() {
        message.showGetInfo();
        message.showGetNumberText();
        String sentenceOne = scanner.getString();
        message.showGetNumberText();
        String sentenceTwo = scanner.getString();
        Exercise12 exercise12 = new Exercise12(sentenceOne, sentenceTwo);
        exercise12.sentenceEqual();
    }
}
