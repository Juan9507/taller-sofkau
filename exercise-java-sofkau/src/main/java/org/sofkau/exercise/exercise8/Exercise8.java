package org.sofkau.exercise.exercise8;

/**
 * [Crea una aplicación por consola que nos pida un día de la semana
 * y que nos diga si es un día laboral o no. Usa un switch para ello.]
 *
 * @author [Juan David Rivera Naranjo - juandavidnaranjo75@gmail.com]
 * @version [v1.0.0]
 * @since [v1.0.0]
 */
public class Exercise8 {

    /**
     * Objeto para utilizar los mensajes
     */
    static MessagesExercise8 message = MessagesExercise8.getInstance();

    public static Exercise8 getInstance() {
        return new Exercise8();
    }

    /**
     * Metodo para saber si es dia laboral o no
     *
     * @param day Recibe el nombre del dia de la semana
     */
    public void businessDayNot(String day) {
        String dayLowerCase = day.toLowerCase();
        switch (dayLowerCase) {
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes": {
                message.showWorkingDay(dayLowerCase);
                break;
            }
            case "sabado":
            case "domingo": {
                message.showWorkingDayNot(dayLowerCase);
                break;
            }
            default: {
                message.showDefault();
            }
        }
    }
}
