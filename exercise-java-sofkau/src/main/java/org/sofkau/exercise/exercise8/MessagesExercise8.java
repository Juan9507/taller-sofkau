package org.sofkau.exercise.exercise8;

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
public class MessagesExercise8 implements MessagesInterface {

    /**
     * Metodo para inicializar la clase
     *
     * @return retorna la inicializacion
     */
    public static MessagesExercise8 getInstance() {
        return new MessagesExercise8();
    }

    /**
     * Objeto de la Logger
     */
    private static final Logger logger = Logger.getLogger(MessagesExercise8.class);

    /**
     * Mostrar mensaje del programa
     */
    public void showGetInfo() {
        logger.info("Programa que pide un dia de la semana y dice si es dia laboral o no");
    }

    /**
     * Mensaje para digitar el numero
     */
    public void showGetNumberText() {
        logger.info("Digite el dia de la semana ej:");
    }

    /**
     * Mensaje para mostrar si es dia laboral
     *
     * @param day recibe el nombre del dia
     */
    public void showWorkingDay(String day) {
        logger.info(day + " es un dia laboral");
    }

    /**
     * Mensaje para mostrar si no es dia laboral
     *
     * @param day recibe el nombre del dia
     */
    public void showWorkingDayNot(String day) {
        logger.info(day + " no es un dia laboral");
    }

    /**
     * mensaje mostrando como digitar los dias
     */
    public void showWeekDay() {
        logger.info("Lunes - Martes - Miercoles - Jueves - Viernes - Sabado - domingo");
    }

    /**
     * Mensaje si digita incorrecto
     */
    public void showDefault() {
        logger.info("Digitacion incorrecta fin del programa");
    }
}
