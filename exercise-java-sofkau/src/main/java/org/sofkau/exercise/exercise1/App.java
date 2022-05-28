package org.sofkau.exercise.exercise1;

/**
 * [ Clase para iniciar el ejercicio
 * ]
 *
 * @author [Juan David Rivera Naranjo - juandavidnaranjo75@gmail.com]
 * @version [v1.0.0]
 * @since [v1.0.0]
 */
public class App {

    static MessagesExercise1 message = MessagesExercise1.getInstance();

    public static void main(String[] args) {
        init();
    }

    public static void init(){
        Exercise1 exercise1 = new Exercise1();
        message.showGetInfo();
        exercise1.valueBiggerSame();
    }
}
