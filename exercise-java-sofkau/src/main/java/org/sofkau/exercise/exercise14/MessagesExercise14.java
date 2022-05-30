package org.sofkau.exercise.exercise14;

import org.jboss.logging.Logger;
import org.sofkau.exercise.interfaces.MessagesInterface;

/**
 * [Mensajes para el ejercicio 14
 * ]
 *
 * @author [Juan David Rivera Naranjo - juandavidnaranjo75@gmail.com]
 * @version [v1.0.0]
 * @since [v1.0.0]
 */
public class MessagesExercise14 implements MessagesInterface {
    /**
     * Objeto de Logger
     */
    private static final Logger logger = Logger.getLogger(MessagesExercise14.class);

    /**
     * Metodo para instanciar la clase
     *
     * @return Retorna la instancia
     */
    public static MessagesExercise14 getInstance() {
        return new MessagesExercise14();
    }

    /**
     * Mostrar mensaje del programa
     */
    public void showGetInfo() {
        logger.info("Programa para pedir un numero por consola y " +
                "mostrar desde el numero en dos en dos hasta 1000");
    }

    /**
     * Mensaje para digitar la fecha, posible actualizaciones
     */
    public void showGetNumberText() {
        logger.info("Digite el numero:");
    }

    /**
     * Mensaje para mostrar antes de los numeros
     */
    public void showNumberCount() {
        logger.info("realizando el programa:");
    }

    /**
     * Mostrar el nummero
     *
     * @param value - recibe el numero
     */
    public void showNumbers(int value) {
        logger.info(value);
    }
}
