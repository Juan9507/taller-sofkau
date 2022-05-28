package org.sofkau.exercise.exercise3;


import org.jboss.logging.Logger;

/**
 * [Clase para los mensajes del ejercicio 3]
 *
 * @author [Juan David Rivera Naranjo - juandavidnaranjo75@gmail.com]
 * @version [v1.0.0]
 * @since [v1.0.0]
 */
public class MessagesExercise3 {
    /**
     * Objeto de la Logger
     */
    private static final Logger logger = Logger.getLogger(MessagesExercise3.class);

    /**
     * Metodo para inicializar la lcase
     *
     * @return retorna la inicializacion
     */
    public static MessagesExercise3 getInstance() {
        return new MessagesExercise3();
    }

    /**
     * Mensaje para digitar el numero
     */
    public void showGetInfo() {
        logger.info("Calcular el area de un circulo: ");
    }

    /**
     * Mensaje para digitar el numero
     */
    public void showGetNumber() {
        logger.info("Digite el radio para calcular el area:");
    }

    /**
     * Metodo para el mensaje de respuesta
     *
     * @param area recibe el valor a mostrar
     */
    public void showAnswer(Double area) {
        logger.info("El area del circulo es: " + area);
    }
}
