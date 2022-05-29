package org.sofkau.exercise.exercise5;

import org.jboss.logging.Logger;
import org.sofkau.exercise.interfaces.MessagesInterface;

/**
 * [Mensajes para el ejercicio 5
 * ]
 *
 * @author [Juan David Rivera Naranjo - juandavidnaranjo75@gmail.com]
 * @version [v1.0.0]
 * @since [v1.0.0]
 */
public class MessagesExercise5 implements MessagesInterface {

    /**
     * Metodo para inicializar la clase
     *
     * @return retorna la inicializacion
     */
    public static MessagesExercise5 getInstance() {
        return new MessagesExercise5();
    }

    /**
     * Objeto de la Logger
     */
    private static final Logger logger = Logger.getLogger(MessagesExercise5.class);

    /**
     * Mostrar mensaje del programa
     */
    public void showGetInfo() {
        logger.info("Programa para mostrar los numeros pares e impares del 1 al 100:");
    }

    /**
     * Mensaje para digitar el numero, posible actualizaciones
     */
    public void showGetNumberText() {
        logger.info("Digite un numero");
    }

    /**
     * Mensaje para los numero pares
     *
     * @param value recibe el numero
     */
    public void showPair(Integer value) {
        logger.info("EL numero: " + value + " Es par");
    }

    /**
     * Mensaje para los numero impares
     *
     * @param value recibe el numero
     */
    public void showOdd(Integer value) {
        logger.info("EL numero: " + value + " Es impar");
    }


}
