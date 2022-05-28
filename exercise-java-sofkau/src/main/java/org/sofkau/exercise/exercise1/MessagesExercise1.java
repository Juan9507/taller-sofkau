package org.sofkau.exercise.exercise1;

import org.jboss.logging.Logger;
import org.sofkau.exercise.interfaces.MessagesInterface;

/**
 * [ Clase para la creación de los mensajes
 * ]
 *
 * @author [Juan David Rivera Naranjo - juandavidnaranjo75@gmail.com]
 * @version [v1.0.0]
 * @since [v1.0.0]
 */
public class MessagesExercise1 implements MessagesInterface {

    private static final Logger logger = Logger.getLogger(MessagesExercise1.class);

    public static MessagesExercise1 getInstance() {
        return new MessagesExercise1();
    }


    /**
     * Mensaje para digitar el numero
     */
    public void showGetNumberText() {
        logger.info("Digite un número:");
    }

    /**
     * Mensaje del programa
     */
    public void showGetInfo() {
        logger.info("Comparar dos numeros y saber cual es mayor o igual: ");
    }

    /**
     * Mensaje para el numero mayor
     *
     * @param value recibe el numero
     */
    public void showNumBigger(Integer value) {
        logger.info("El numero mayor es: " + value);
    }

    /**
     * Mensaje para el numero menor
     *
     * @param value recibe el numero
     */
    public void showSmaller(Integer value) {
        logger.info("El numero menor es: " + value);
    }

    /**
     * Mensaje para el numero igual
     */
    public void showEqual() {
        logger.info("los numeros Son iguales");
    }
}
