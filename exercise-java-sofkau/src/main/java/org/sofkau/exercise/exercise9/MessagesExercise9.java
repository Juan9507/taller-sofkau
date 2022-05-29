package org.sofkau.exercise.exercise9;

import org.jboss.logging.Logger;
import org.sofkau.exercise.interfaces.MessagesInterface;

/**
 * [Mensajes para el ejercicio 8
 * ]
 *
 * @author [Juan David Rivera Naranjo - juandavidnaranjo75@gmail.com]
 * @version [v1.0.0]
 * @since [v1.0.0]
 */
public class MessagesExercise9 implements MessagesInterface {

    /**
     * Creacion el objeto logger
     */
    private static final Logger logger = Logger.getLogger(MessagesExercise9.class);

    /**
     * Metodo para instanciar la clase
     *
     * @return Retorna la instancia
     */
    public static MessagesExercise9 getInstance() {
        return new MessagesExercise9();
    }

    /**
     * Mostrar mensaje del programa
     */
    public void showGetInfo() {
        logger.info("Programa para reemplazar las 'a' de un texto en 'e' " +
                "y concatenar otro texto");
    }

    /**
     * Mensaje para digitar el texto
     */
    public void showGetNumberText() {
        logger.info("Digite el texto a concatenar");
    }

    /**
     * Mostrar la frase terminada
     *
     * @param text recibe la frase
     */
    public void showGeSentence(String text) {
        logger.info(text);
    }
}
