package org.sofkau.exercise.exercise4;

import org.sofkau.exercise.MyScanner;

/**
 * [ Clase para iniciar el ejercicio
 * ]
 *
 * @author [Juan David Rivera Naranjo - juandavidnaranjo75@gmail.com]
 * @version [v1.0.0]
 * @since [v1.0.0]
 */

public class App {

    /**
     * Objeto para los mensajes
     */
    static MessagesExercise4 message = MessagesExercise4.getInstance();

    /**
     * Objeto Scanner para capturar
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
        message.showGetNumberText();
        Double valueProduct = scanner.getDouble();
        Exercise4 exercise4 = new Exercise4(valueProduct);
        Double priceFinal = exercise4.calculateIva();
        message.showIncrease(priceFinal);
    }
}
