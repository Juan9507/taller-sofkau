package org.sofkau.exercise.exercise15;

import org.jboss.logging.Logger;
import org.sofkau.exercise.interfaces.MessagesInterface;

/**
 * [Mensajes para el ejercicio 15
 * ]
 *
 * @author [Juan David Rivera Naranjo - juandavidnaranjo75@gmail.com]
 * @version [v1.0.0]
 * @since [v1.0.0]
 */
public class MessagesExercise15 implements MessagesInterface {

    /**
     * Objeto de Logger
     */
    private static final Logger logger = Logger.getLogger(MessagesExercise15.class);

    /**
     * Metodo para instanciar la clase
     *
     * @return Retorna la instancia
     */
    public static MessagesExercise15 getInstance() {
        return new MessagesExercise15();
    }

    /**
     * Mostrar mensaje del programa
     */
    public void showGetInfo() {
        logger.info("Programa para elegir entre las siguientes opciones");
    }

    /**
     * Mensaje para digitar el numero
     */
    public void showGetNumberText() {
        logger.info("Digite un opcion: [1] [2] [3] [4] [5] [6] [7] [8] ");
    }

    public void showMenuOption() {
        logger.info("****** GESTION CINEMATOGRÁFICA ********");
    }

    public void optionAll() {
        logger.info("\n1-NUEVO ACTOR\n2-BUSCAR ACTOR\n3-ELIMINAR ACTOR\n" +
                "4-MODIFICAR ACTOR\n5-VER TODOS LOS ACTORES\n" +
                "6-VER PELICULAS DE LOS ACTORES\n" +
                "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
                "8-SALIR");
    }

    /**
     * Mensaje para la opcion incorrecta
     */
    public void optionWrong() {
        logger.info("OPCION INCORRECTO");
    }

    /**
     * Mensaje que salio del sistema
     */
    public void showExit() {
        logger.info("Se salio del sistema");
    }
}
