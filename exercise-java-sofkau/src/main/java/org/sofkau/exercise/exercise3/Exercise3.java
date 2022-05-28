package org.sofkau.exercise.exercise3;

/**
 * [Haz una aplicación que calcule el área de un círculo(pi*R2). El radio se pedirá por teclado
 * (recuerda pasar de String a double con Double.parseDouble).
 * Usa la constante PI y el método pow de Math.]
 *
 * @author [Juan David Rivera Naranjo - juandavidnaranjo75@gmail.com]
 * @version [v1.0.0]
 * @since [v1.0.0]
 */
public class Exercise3 {

    /**
     * Atributo patra la radip
     */
    private final Double radio;

    /**
     * Constructor de la clase
     *
     * @param radio recibe el valor del radio
     */
    public Exercise3(Double radio) {
        this.radio = radio;
    }

    /**
     * Metodo para calcular el area
     *
     * @return
     */
    public Double calculateArea() {
        final double pi = 3.14;
        return pi * Math.pow(radio, 2);
    }

}
