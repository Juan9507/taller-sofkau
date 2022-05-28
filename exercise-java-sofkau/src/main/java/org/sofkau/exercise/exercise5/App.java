package org.sofkau.exercise.exercise5;

/**
 * [Muestra los números impares y pares del 1 al 100
 * (ambos incluidos). Usa un bucle while.]
 *
 * @author [Juan David Rivera Naranjo - juandavidnaranjo75@gmail.com]
 * @version [v1.0.0]
 * @since [v1.0.0]
 */
public class App {

    static MessagesExercise5 message = MessagesExercise5.getInstance();

    public static void main(String[] args) {
        init();
    }

    /**
     * Metodo para iniciar el programa
     */
    public static void init() {
        int i = 1;

        message.showGetInfo();
        while (i <= 100) {
            if (Math.floorMod(i, 2) == 0) {
                message.showPair(i);
            } else {
                message.showOdd(i);
            }
            i++;
        }
    }
}
