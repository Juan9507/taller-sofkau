package org.sofkau.exercise.exercise10;

import org.jboss.logging.Logger;
import org.sofkau.exercise.interfaces.MessagesInterface;

/**
 * [Mensajes para el ejercicio 10
 * ]
 *
 * @author [Juan David Rivera Naranjo - juandavidnaranjo75@gmail.com]
 * @version [v1.0.0]
 * @since [v1.0.0]
 */
public class MessagesExercise10 implements MessagesInterface {

    private static final Logger logger = Logger.getLogger(MessagesExercise10.class);

    /**
     * Metodo para instanciar la clase
     *
     * @return Retorna la instancia
     */
    public static MessagesExercise10 getInstance() {
        return new MessagesExercise10();
    }

    /**
     * Mostrar mensaje del programa
     */
    public void showGetInfo() {
        logger.info("Programa que apartir de un texto elimina " +
                "los espacios en blancos");
    }

    /**
     * Mensaje para digitar el texto
     */
    public void showGetNumberText() {
        logger.info("Digite el texto a modificar:");
    }

    /**
     * Mensaje para cuando se halla modificado el texto
     */
    public void showTextNoSpaces() {
        logger.info("Texto sin espacios");
    }

    /**
     * Mostrar el texto modificado
     *
     * @param text recibe el texto
     */
    public void showText(String text) {
        logger.info(text);
    }
}
