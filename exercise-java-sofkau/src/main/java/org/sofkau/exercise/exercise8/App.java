package org.sofkau.exercise.exercise8;

import org.sofkau.exercise.MyScanner;

/**
 * [ Clase para iniciar el ejercicio]
 *
 * @author [Juan David Rivera Naranjo - juandavidnaranjo75@gmail.com]
 * @version [v1.0.0]
 * @since [v1.0.0]
 */
public class App {

    static MyScanner scanner = MyScanner.getInstance();
    static Exercise8 exercise8 = Exercise8.getInstance();
    static MessagesExercise8 message = MessagesExercise8.getInstance();

    public static void main(String[] args) {
        init();
    }

    public static void init() {
        message.showGetInfo();
        message.showGetNumberText();
        message.showWeekDay();
        String day = scanner.getString();
        exercise8.businessDayNot(day);
    }
}
