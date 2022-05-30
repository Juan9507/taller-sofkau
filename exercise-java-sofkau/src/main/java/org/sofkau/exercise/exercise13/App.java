package org.sofkau.exercise.exercise13;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * [Clase para ejecutar el programa]
 *
 * @author [Juan David Rivera Naranjo - juandavidnaranjo75@gmail.com]
 * @version [v1.0.0]
 * @since [v1.0.0]
 */
public class App {

    static MessagesExercise13 message = MessagesExercise13.getInstance();

    public static void main(String[] args) {
        init();
    }

    public static void init() {
        message.showGetInfo();
        message.showDateNow();
        LocalDate date = LocalDate.now();
        message.showDate(date);
        message.showHourNow();
        DateTimeFormatter dateFormatTime = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime time = LocalTime.parse(LocalTime.now().format(dateFormatTime));
        message.showTime(time);
    }
}
