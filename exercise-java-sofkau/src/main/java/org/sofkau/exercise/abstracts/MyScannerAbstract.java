package org.sofkau.exercise.abstracts;

import java.util.Scanner;

/**
 * Clase abstracta con los metodos a utilizar del Scanner
 */
public abstract class MyScannerAbstract {
    /**
     * creacion del Objecto protejido como constante para
     * el scanneer
     */
    protected static final Scanner scanneer = new Scanner(System.in);

    /**
     * Metodo para capturar datos de tipo int (Integer)
     *
     * @return retorna el capturador
     */
    public Integer getInteger() {
        return Integer.parseInt(scanneer.nextLine());
    }

    /**
     * Metodo para capturar datos de tipo double
     *
     * @return retorna el capturador
     */
    public Double getDouble() {
        return Double.parseDouble(scanneer.nextLine());
    }

    /**
     * Metodo abstracto para crearle el cuerpo desde
     * la subclase que hereda
     */
    public abstract String getString();

    /**
     * Metodo para cerrar el scanner abierto
     */
    public void close() {
        scanneer.close();
    }

}
