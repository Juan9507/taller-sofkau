package org.sofkau.exercise.exercise17;

import org.jboss.logging.Logger;
import org.sofkau.exercise.interfaces.MessagesInterface;

/**
 * [Mensajes para el ejercicio 16
 * ]
 *
 * @author [Juan David Rivera Naranjo - juandavidnaranjo75@gmail.com]
 * @version [v1.0.0]
 * @since [v1.0.0]
 */
public class MessagesExercise17 implements MessagesInterface {

    /**
     * Objeto de Logger
     */
    private static final Logger logger = Logger.getLogger(MessagesExercise17.class);

    /**
     * Metodo para instanciar la clase
     *
     * @return Retorna la instancia
     */
    public static MessagesExercise17 getInstance() {
        return new MessagesExercise17();
    }


    /**
     * Mostrar mensaje del programa
     */
    public void showGetInfo() {
        logger.info("Programa para saber los precios dfinales de los electrodomesticos");
    }

    /**
     * Mensaje para digitar un valor
     */
    public void showGetNumberText() {
        logger.info("digite un valor");
    }

    /**
     * Metodo para mostrar el precio final de la lavadora
     */
    public void precioFinalLavadora(Double precio){
        logger.info("El precio final del objeto lavadora es: " + precio );
    }

    /**
     * Metodo para mostrar el precio final de los televisores
     */
    public void precioFinalTelevisores(Double precio){
        logger.info("El precio final del objeto television es: " + precio );
    }

    /**
     * Metodo para mostrar el precio final de los televisores
     */
    public void precioFinalElectrodomesticos(Double precio){
        logger.info("El precio final del objeto electrodomestico es: " + precio );
    }

    /**
     * Metodo para mostrar el precio final de la suma de total
     */
    public void precioFinalSuma(Double precio){
        logger.info("El precio final de todos los electrodomestico es: " + precio );
    }
}
