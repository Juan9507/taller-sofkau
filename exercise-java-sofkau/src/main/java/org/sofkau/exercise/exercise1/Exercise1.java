package org.sofkau.exercise.exercise1;

/**
 * [ Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos.
 * Si son iguales indicarlo también.
 * ]
 *
 * @author [Juan David Rivera Naranjo - juandavidnaranjo75@gmail.com]
 * @version [v1.0.0]
 * @since [v1.0.0]
 */

public class Exercise1 {

    /**
     * Creacion del objeto para los mensajes
     */
    static MessagesExercise1 message = MessagesExercise1.getInstance();

    /**
     * Atributo para el primer numero
     */
    private final Integer value1;

    /**
     * Atributo para el segndo numero
     */
    private final Integer value2;

    /**
     * Constructor por defecto
     */
    public Exercise1() {
        this.value1 = 10;
        this.value2 = 2;
    }

    /**
     * Validar si el numero es mayor o igual
     */
    public void valueBiggerEqual() {
        if (value1 > value2) {
            message.showNumBigger(value1);
        } else if (this.value2 > this.value1) {
            message.showNumBigger(value2);
        } else {
            message.showEqual();
        }
    }

}
