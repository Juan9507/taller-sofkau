package org.sofkau.exercise.exercise15;

/**
 * [Hacer un programa que muestre un menú de opciones]
 *
 * @author [Juan David Rivera Naranjo - juandavidnaranjo75@gmail.com]
 * @version [v1.0.0]
 * @since [v1.0.0]
 */
public class Exercise15 {

    static MessagesExercise15 message = MessagesExercise15.getInstance();

    /**
     * Constructo por defecto privado, sonar lo pedida
     */
    private Exercise15() {
    }

    /**
     * Metodo para mostrar el menu de opciones
     */
    public static Boolean menuCase(Integer option) {
        switch (option) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                showMenu();
                break;
            case 8: {
                return false;
            }
            default: {
                message.optionWrong();
                break;
            }
        }
        return true;
    }

    /**
     * Metodo para mostrar el menu
     */
    public static void showMenu() {
        message.optionAll();
    }

}
