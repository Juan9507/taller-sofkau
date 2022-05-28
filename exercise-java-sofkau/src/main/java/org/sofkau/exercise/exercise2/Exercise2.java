package org.sofkau.exercise.exercise2;

import org.sofkau.exercise.exercise1.MessagesExercise1;

/**
 * [ Al ejercicio anterior agregar entrada por consola de dos valores e indicar si son mayores,
 * menores o iguales.
 * ]
 * <p>
 * Como funciona:
 * Ejercicio2 ejercicio2 = new Ejercicio2();
 * ejercicio2.numerosEvaluar();
 * String resultado = ejercicio2.toString();
 * logger.info(resultado);
 *
 * @author [Juan David Rivera Naranjo - juandavidnaranjo75@gmail.com]
 * @version [v1.0.0]
 * @since [v1.0.0]
 */

public class Exercise2 extends MessagesExercise1 {
    private final Integer value1;
    private final Integer value2;

    public Exercise2(Integer value1, Integer value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    /**
     * Metodo para el numero mayor, menor e igual
     */

    public void valueBiggerSameEqual() {
        if (value1 > value2) {
            super.showNumBigger(value1);
            super.showSmaller(value2);
        } else if (value2 > value1) {
            super.showNumBigger(value2);
            super.showSmaller(value1);
        } else {
            super.showEqual();
        }
    }

}
