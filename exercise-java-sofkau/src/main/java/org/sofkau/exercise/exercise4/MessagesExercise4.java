package org.sofkau.exercise.exercise4;

import org.jboss.logging.Logger;
import org.sofkau.exercise.interfaces.MessagesInterface;

/**
 * [Mensajes para el ejercicio 4
 * ]
 *
 * @author [Juan David Rivera Naranjo - juandavidnaranjo75@gmail.com]
 * @version [v1.0.0]
 * @since [v1.0.0]
 */
public class MessagesExercise4 implements MessagesInterface {
    /**
     * Objeto de la Logger
     */
    private static final Logger logger = Logger.getLogger(MessagesExercise4.class);

    /**
     * Metodo para inicializar la lcase
     *
     * @return retorna la inicializacion
     */
    public static MessagesExercise4 getInstance() {
        return new MessagesExercise4();
    }

    /**
     * Mensaje del programa
     */
    public void showGetInfo() {
        logger.info("Precio final de un producto con iva: ");
    }


    /**
     * Mensaje a mostrar para pedir el valor
     */
    public void showGetNumberText() {
        logger.info("Digite el valor del producto: ");
    }

    /**
     * Mensaje del valor con el iva
     */
    public void showIncrease(Double price) {
        logger.info("El precio del producto con el iva es de: " + price);
    }


}
