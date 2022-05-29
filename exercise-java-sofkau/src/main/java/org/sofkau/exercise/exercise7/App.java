package org.sofkau.exercise.exercise7;

import org.sofkau.exercise.MyScanner;

/**
 * [Lee un número por teclado y comprueba que este numero es mayor o igual que cero,
 * si no lo es lo volverá a pedir (do while), después muestra ese número por consola..]
 *
 * @author [Juan David Rivera Naranjo - juandavidnaranjo75@gmail.com]
 * @version [v1.0.0]
 * @since [v1.0.0]
 */
public class App {

    /**
     * Objecto para los mensajes
     */
    static MessagesExercise7 message = MessagesExercise7.getInstance();

    /**
     * Objeto Scanner para capturar el numero
     */
    static MyScanner scanner = MyScanner.getInstance();

    public static void main(String[] args) {
        init();
    }

    /**
     * Metodo para iniciar el programa
     */
    public static void init() {
        message.showGetInfo();
        int i;
        do {
            message.showGetNumberText();
            i = scanner.getInteger();
        } while (i < 0);
        message.showValue(i);
    }
}
