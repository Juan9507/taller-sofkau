package org.sofkau.exercise.exercise12;

import org.jboss.logging.Logger;
import org.sofkau.exercise.interfaces.MessagesInterface;

/**
 * [Mensajes para el ejercicio 12
 * ]
 *
 * @author [Juan David Rivera Naranjo - juandavidnaranjo75@gmail.com]
 * @version [v1.0.0]
 * @since [v1.0.0]
 */
public class MessagesExercise12 implements MessagesInterface {

    /**
     * Objeto de Logger
     */
    private static final Logger logger = Logger.getLogger(MessagesExercise12.class);

    /**
     * Metodo para instanciar la clase
     *
     * @return Retorna la instancia
     */
    public static MessagesExercise12 getInstance() {
        return new MessagesExercise12();
    }

    /**
     * Mostrar mensaje del programa
     */
    public void showGetInfo() {
        logger.info("Pograma para recibir dos frases indicar si son iguales," +
                " sino son iguales mostrar sus diferencias.");
    }

    /**
     * Mensaje para digitar el texto
     */
    public void showGetNumberText() {
        logger.info("Digite la frase:");
    }

    /**
     * Mensaje para mostrar si las frases son iguales
     */
    public void showEqual() {
        logger.info("Las frases son iguales");
    }

    /**
     * Mensaje para mostrar los caracteres de la diferencia de las frases
     */
    public void showSentenceTextDifference(String a, String b) {
        logger.info( a + " - " + b + " Caracteres diferentes de las frases");
    }

    /**
     * Mensaje de diferencia de tamaños
     *
     * @param text recibe el String de diferencia estre las dos frases
     */
    public void showSentenceSize(String text) {
        logger.info(text + " - Diferencia por diferentes tamaños de la frase");
    }
}
