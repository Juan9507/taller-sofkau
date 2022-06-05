package org.sofkau.exercise.exercise18;

import org.jboss.logging.Logger;
import org.sofkau.exercise.interfaces.MessagesInterface;

/**
 * [Mensajes para el ejercicio 18
 * ]
 *
 * @author [Juan David Rivera Naranjo - juandavidnaranjo75@gmail.com]
 * @version [v1.0.0]
 * @since [v1.0.0]
 */
public class MessagesExercise18 implements MessagesInterface {
    /**
     * Objeto de Logger
     */
    private static final Logger logger = Logger.getLogger(MessagesExercise18.class);

    public static MessagesExercise18 getInstance(){
        return new MessagesExercise18();
    }

    /**
     * Mostrar mensaje del programa
     */
    public void showGetInfo() {
        logger.info("Programa de alquiler de video juegos y series");
    }

    /**
     * Mensajes de los juegos entregados
     */
    public void showGetGameDeliver(Integer i){
        logger.info("Fueron entregados " + i + " Juegos, los cuales ya fueron devueltos");
    }

    /**
     * Mensajes de los juegos entregados
     */
    public void showGetSeriesDeliver(Integer i){
        logger.info("Fueron entregados " + i + " series, las cuales ya fueron devueltos");
    }


    public void showGetNumberText() {
        logger.info("Digite un texto:");
    }

    /**
     * Mensaje para imprimir el toString
     * @param a
     */
    public void printToString(String a){
        logger.info(a);
    }

    /**
     * Mensaje para el juego con mayor numero de horas
     */
    public void showGetGameMax(){
        logger.info("El juego con más horas es: ");
    }

    /**
     * Mensaje para la serie con mayor temporadas
     */
    public void showGetSerieMax(){
        logger.info("La serie con mayor temporadas es: ");
    }
}
