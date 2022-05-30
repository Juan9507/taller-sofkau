package org.sofkau.exercise.exercise13;

import org.jboss.logging.Logger;
import org.sofkau.exercise.interfaces.MessagesInterface;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * [Mensajes para el ejercicio 13
 * ]
 *
 * @author [Juan David Rivera Naranjo - juandavidnaranjo75@gmail.com]
 * @version [v1.0.0]
 * @since [v1.0.0]
 */
public class MessagesExercise13 implements MessagesInterface {

    /**
     * Objeto de Logger
     */
    private static final Logger logger = Logger.getLogger(MessagesExercise13.class);

    /**
     * Metodo para instanciar la clase
     *
     * @return Retorna la instancia
     */
    public static MessagesExercise13 getInstance() {
        return new MessagesExercise13();
    }

    /**
     * Mostrar mensaje del programa
     */
    public void showGetInfo() {
        logger.info("programa para consultar la fecha " +
                "y hora actual en el formato (AAAA/MM/DD) (HH:MM:SS)");
    }

    /**
     * Mensaje para digitar la fecha, posible actualizaciones
     */
    public void showGetNumberText() {
        logger.info("Digite la fecha");
    }

    /**
     * Metodo para mostrar la fecha actual
     */
    public void showDateNow() {
        logger.info("la fecha actual en formato (AAAA/MM/DD)");
    }

    /**
     * Metodo para mostrar la hora actual
     */
    public void showHourNow() {
        logger.info("La hora actual en formato (HH:MM:SS)");
    }

    /**
     * Metodo para mostrar la fecha
     *
     * @param date - recibe la fecha
     */
    public void showDate(LocalDate date) {
        logger.info(date);
    }

    /**
     * Metodo para mostrar la hora
     *
     * @param time - recibe la hora
     */
    public void showTime(LocalTime time) {
        logger.info(time);
    }
}
