package org.sofkau.exercise.exercise7;

import org.jboss.logging.Logger;
import org.sofkau.exercise.interfaces.MessagesInterface;

/**
 * [Mensajes para el ejercicio 7
 * ]
 *
 * @author [Juan David Rivera Naranjo - juandavidnaranjo75@gmail.com]
 * @version [v1.0.0]
 * @since [v1.0.0]
 */
public class MessagesExercise7 implements MessagesInterface {

    /**
     * Metodo para inicializar la clase
     *
     * @return retorna la inicializacion
     */
    public static MessagesExercise7 getInstance() {
        return new MessagesExercise7();
    }

    /**
     * Objeto de la Logger
     */
    private static final Logger logger = Logger.getLogger(MessagesExercise7.class);


    /**
     * Mostrar mensaje del programa
     */
    public void showGetInfo() {
        logger.info("Programa que comprueba que un numero sea mayor o igual que cero");
    }

    /**
     * Mensaje para digitar el numero
     */
    public void showGetNumberText() {
        logger.info("Digite el numero:");
    }

    /**
     * Mensaje para mostrar el numero
     */
    public void showValue(Integer i) {
        logger.info(i);
    }
}
