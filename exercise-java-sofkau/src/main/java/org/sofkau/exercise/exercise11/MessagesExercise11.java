package org.sofkau.exercise.exercise11;

import org.jboss.logging.Logger;
import org.sofkau.exercise.interfaces.MessagesInterface;

public class MessagesExercise11 implements MessagesInterface {

    /**
     * Objeto de Logger
     */
    private static final Logger logger = Logger.getLogger(MessagesExercise11.class);

    /**
     * Metodo para instanciar la clase
     *
     * @return Retorna la instancia
     */
    public static MessagesExercise11 getInstance() {
        return new MessagesExercise11();
    }

    /**
     * Mostrar mensaje del programa
     */
    public void showGetInfo() {
        logger.info("Programa para indicar la longitud de la frase y " +
                "cuantas vocales tiene");
    }

    /**
     * Mensaje para digitar el texto
     */
    public void showGetNumberText() {
        logger.info("Digite la palabra");
    }

    public void showLength(int lengthSentence) {
        logger.info("El tamaño de la frase es: " + lengthSentence);
    }

    /**
     * Mensaje para mostrar cada vocal
     */
    public void showVocal(String vocal, Integer valor) {
        logger.info("vocal: " + vocal + " veces: " + valor);
    }
}
