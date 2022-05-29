package org.sofkau.exercise.exercise9;

import org.sofkau.exercise.MyScanner;

/**
 * [Del texto, “La sonrisa sera la mejor arma contra la tristeza”
 * Reemplaza todas las a del String anterior por una e,
 * adicionalmente concatenar a esta frase una adicional que
 * ustedes quieran incluir por consola y las muestre luego unidas..]
 *
 * @author [Juan David Rivera Naranjo - juandavidnaranjo75@gmail.com]
 * @version [v1.0.0]
 * @since [v1.0.0]
 */
public class App {

    static MessagesExercise9 message = MessagesExercise9.getInstance();

    static MyScanner scanner = MyScanner.getInstance();

    public static void main(String[] args) {
        init();
    }

    public static void init() {
        message.showGetInfo();
        message.showGetNumberText();
        String textNew = text(scanner.getString());
        message.showGeSentence(textNew);
    }

    private static String text(String text) {
        String sentence = "La sonrisa sera la mejor arma contra la tristeza ";
        return sentence.replace("a", "e").concat(text);
    }
}
