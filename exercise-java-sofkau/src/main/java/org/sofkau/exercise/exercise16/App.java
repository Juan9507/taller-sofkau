package org.sofkau.exercise.exercise16;

import org.sofkau.exercise.MyScanner;

public class App {

    /**
     * Objeto de Scanner
     */
    static MyScanner scanner = MyScanner.getInstance();

    /**
     * Objeto para los mensajes mensajes
     */
    static MessagesExercise16 message = MessagesExercise16.getInstance();

    public static void main(String[] args) {
        init();
    }

    /**
     * Meotod para crear los objetos e iniciar el programa
     */
    public static void init() {
        message.showGetInfo();
        message.showGetNombre();
        String nombre = scanner.getString();
        message.showGetEdad();
        Integer edad = scanner.getInteger();
        message.showGetSex();
        char sexo = scanner.getChar();
        message.showGetWeight();
        Integer peso = scanner.getInteger();
        message.showGetHeight();
        Double altura = scanner.getDouble();
        Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);
        Persona persona2 = new Persona(nombre, edad, sexo);
        Persona persona3 = new Persona();
        persona3.setNombre("Jose");
        persona3.setEdad(22);
        persona3.setSexo('H');
        persona3.setPeso(65);
        persona3.setAltura(1.76);

        message.showTextPersona(1); // persona numero1
        pesoIdeal(persona1.calcularIMC());
        mensageEsmayorMenor(persona1.esMayorDeEdad());
        message.showAll(persona1.toString());

        message.showTextPersona(2); // persona numero2
        pesoIdeal(persona2.calcularIMC());
        mensageEsmayorMenor(persona2.esMayorDeEdad());
        message.showAll(persona2.toString());

        message.showTextPersona(3); // persona numero2
        pesoIdeal(persona3.calcularIMC());
        mensageEsmayorMenor(persona3.esMayorDeEdad());
        message.showAll(persona3.toString());
    }

    /**
     * Metodo para el saber el IMC
     * @param valor
     */
    public static void pesoIdeal(int valor) {
        if (valor == -1) {
            message.showBajoPeso();
        } else if (valor == 0) {
            message.showPesoIdeal();
        } else {
            message.showSobrePeso();
        }
    }

    public static void mensageEsmayorMenor(Boolean edad) {
        if (Boolean.TRUE.equals(edad)) {
            message.showMayor();
        } else {
            message.showMenor();
        }
    }
}
