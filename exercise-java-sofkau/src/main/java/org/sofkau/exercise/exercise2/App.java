package org.sofkau.exercise.exercise2;

import org.sofkau.exercise.MyScanner;
import org.sofkau.exercise.exercise1.MessagesExercise1;

/**
 * [ Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos.
 * Si son iguales indicarlo también.
 * ]
 *
 * @author [Juan David Rivera Naranjo - juandavidnaranjo75@gmail.com]
 * @version [v1.0.0]
 * @since [v1.0.0]
 */

public class App {
    static MessagesExercise1 message = MessagesExercise1.getInstance();
    static MyScanner scanner = MyScanner.getInstance();

    public static void main(String[] args) {
        init();
    }
    public static void init() {
        message.showGetInfo();
        message.showGetNumberText();
        Integer value1 = scanner.getInteger();
        message.showGetNumberText();
        Integer value2 = scanner.getInteger();
        Exercise2 exercise2 = new Exercise2(value1, value2);
        exercise2.valueBiggerSameEqual();
    }
}
