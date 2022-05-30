package org.sofkau.exercise.exercise14;

import org.sofkau.exercise.MyScanner;

/**
 * [Clase para ejecutar el programa
 * Crear un programa que pida un numero por teclado y que imprima por pantalla
 * los números desde el numero introducido hasta 1000 con saldos de 2 en 2.
 * ]
 *
 * @author [Juan David Rivera Naranjo - juandavidnaranjo75@gmail.com]
 * @version [v1.0.0]
 * @since [v1.0.0]
 */
public class App {

    /**
     * Creacion del objeto para los mensajes
     */
    static MessagesExercise14 messages = MessagesExercise14.getInstance();

    /**
     * Creacion del objeto para capturar por cpnsola
     */
    static MyScanner scanner = MyScanner.getInstance();

    public static void main(String[] args) {
        init();
    }

    /**
     * Metodo para inicializar el programa
     */
    public static void init() {
        messages.showGetInfo();
        messages.showGetNumberText();
        int value = scanner.getInteger();
        printAccount(value);
    }

    /**
     * Metodo para imprimir los numeros desde el valor hasta 1000
     * en dos en dos
     *
     * @param value
     */
    public static void printAccount(int value) {
        int i;
        messages.showNumbers(value);
        for (i = value; i <= 1000; i += 2) {
            messages.showNumbers(i);
        }
    }
}
