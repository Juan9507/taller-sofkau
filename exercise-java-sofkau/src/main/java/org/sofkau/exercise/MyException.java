package org.sofkau.exercise;

/**
 * Clase para manejar las excepciones
 */
public class MyException extends RuntimeException{
    /**
     * Constructor con un solo parametro
     * @param message Recibe el mensaje
     */
    public MyException(String message) {
        super(message);
    }

    /**
     * Constructor con dos parametros
     * @param message Recibe el mensaje
     * @param exception Recibe la excepcion
     */
    public MyException(String message, Exception exception) {
        super(message, exception);
    }
}
