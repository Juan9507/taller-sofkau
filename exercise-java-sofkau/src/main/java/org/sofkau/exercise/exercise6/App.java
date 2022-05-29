package org.sofkau.exercise.exercise6;

import org.sofkau.exercise.exercise5.MessagesExercise5;

/**
 * [Muestra los números impares y pares del 1 al 100
 * (ambos incluidos). Usa un bucle for.]
 *
 * @author [Juan David Rivera Naranjo - juandavidnaranjo75@gmail.com]
 * @version [v1.0.0]
 * @since [v1.0.0]
 */
public class App {

    /**
     * Reutilazmo la creacion del onjeto de
     * los mensajes del ejercicio 5 ya que
     * son iguales
     */
    static MessagesExercise5 message = MessagesExercise5.getInstance();

    public static void main(String[] args) {
        init();
    }

    /**
     * Metodo para iniciar el programa
     */
    public static void init() {
        message.showGetInfo();
        for (int i = 1; i <= 100; i++) {
            if (Math.floorMod(i, 2) == 0) {
                message.showPair(i);
            } else {
                message.showOdd(i);
            }
        }
    }
}
