package org.sofkau.exercise.exercise16;

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
public class MessagesExercise16 implements MessagesInterface {
    /**
     * Objeto de Logger
     */
    private static final Logger logger = Logger.getLogger(MessagesExercise16.class);

    /**
     * Metodo para instanciar la clase
     *
     * @return Retorna la instancia
     */
    public static MessagesExercise16 getInstance() {
        return new MessagesExercise16();
    }


    /**
     * Mostrar mensaje del programa
     */
    public void showGetInfo() {
        logger.info("Programa para datos de la persona y calcular el IMC");
    }

    /**
     * Mensaje para digitar un valor
     */
    public void showGetNumberText() {
        logger.info("digite un valor");
    }

    /**
     * Mensaje para digitar el nombre
     */
    public void showGetNombre() {
        logger.info("digite el nombre");
    }

    /**
     * Mensaje para digitar la edad
     */
    public void showGetEdad() {
        logger.info("digite su edad");
    }

    /**
     * Mensaje para digitar su sexo
     */
    public void showGetSex() {
        logger.info("digite su sexo ej: 'H' -> Hombre, 'M' -> Mujer");
    }

    /**
     * Mensaje para digitar su sexo
     */
    public void showGetWeight() {
        logger.info("digite su peso");
    }

    /**
     * Mensaje para digitar su sexo
     */
    public void showGetHeight() {
        logger.info("digite su Altura");
    }

    /**
     * Mensaje para sabe en que objeto estamos
     * @param valor recibe el valor dependiendo la posicion del objeto
     */
    public void showTextPersona(int valor){
        logger.info("Objeto de la persona numero " + valor);
    }

    public void showBajoPeso(){
        logger.info("estas por debajo de su peso ideal");
    }

    public void showPesoIdeal(){
        logger.info("esta en su peso ideal");
    }

    public void showSobrePeso(){
        logger.info("tienes sobre peso");
    }

    /**
     * mostrar mensaje dependiendo su parametro
     */
    public void showAll(String all){
        logger.info(all);
    }

    /**
     * mostrar mensaje si es menor de edad
     */
    public void showMenor(){
        logger.info("Eres menor de edad");
    }

    /**
     * mostrar mensaje si es mayor de edad
     */
    public void showMayor(){
        logger.info("Eres mayor de edad");
    }
}
