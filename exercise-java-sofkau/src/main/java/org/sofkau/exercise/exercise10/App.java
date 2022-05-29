package org.sofkau.exercise.exercise10;

import org.sofkau.exercise.MyScanner;

/**
 * [Realizar una aplicación de consola, que
 * al ingresar una frase por teclado elimine
 * los espacios que esta contenga.]
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
    static MessagesExercise10 message = MessagesExercise10.getInstance();

    public static void main(String[] args) {
        init();
    }

    /**
     * Metodo para iniciar el programa
     */
    public static void init() {
        message.showGetInfo();
        message.showGetNumberText();
        String text = scanner.getString();
        message.showTextNoSpaces();
        message.showText(removeSpaces(text));
    }

    /**
     * Metodo para remover los espacios del texto
     *
     * @param text recibe el texto
     * @return retorna el texto sin espacios
     */
    public static String removeSpaces(String text) {
        return text.replaceAll("\\s", "");
    }
}
