package org.sofkau.exercise.exercise13;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

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
