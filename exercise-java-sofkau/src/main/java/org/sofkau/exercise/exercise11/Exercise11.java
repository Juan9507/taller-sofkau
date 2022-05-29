package org.sofkau.exercise.exercise11;

import java.util.HashMap;

/**
 * [Realizar la construcción de un algoritmo
 * que permita de acuerdo a una frase pasada por consola,
 * indicar cual es la longitud de esta frase,
 * adicionalmente cuantas vocales tiene de “a,e,i,o,u”..]
 *
 * @author [Juan David Rivera Naranjo - juandavidnaranjo75@gmail.com]
 * @version [v1.0.0]
 * @since [v1.0.0]
 */
public class Exercise11 {

    /**
     * 1 Atributo para la frase
     * 2 objeto para los mensajes
     * 3 Creamos el HasMap implementa la clave string y el valor integer
     */
    private final String sentence;
    private static final MessagesExercise11 message = MessagesExercise11.getInstance();
    private HashMap<String, Integer> hashMap;

    /**
     * Constructor de la clase
     *
     * @param sentence recibe la frase
     */
    public Exercise11(String sentence) {
        this.sentence = sentence;
    }

    /**
     * Metodo para saber el tamaño de la frase
     *
     * @return retorna el tamaño
     */
    public Integer lengthSentence() {
        return this.sentence.length();
    }

    /**
     * Metodo para llenar el map
     */
    public void fillMap() {
        hashMap = new HashMap<>();
        hashMap.put("a", 0);
        hashMap.put("e", 0);
        hashMap.put("i", 0);
        hashMap.put("o", 0);
        hashMap.put("u", 0);
    }

    /**
     * Metodo para recorrer la cadena para saber si es vocal
     */
    public void travelString() {
        int i;
        for (i = 0; i < this.sentence.length(); i++) {
            char currentLetter = this.sentence.charAt(i); // letra actual
            if (Boolean.TRUE.equals(esVocal(currentLetter))) {
                String key = String.valueOf(currentLetter).toLowerCase();
                hashMap.put(key, hashMap.get(key) + 1);
            }
        }
    }

    /**
     * Metodo para saber si es una vocal
     *
     * @param letter recibe el carcter
     * @return retorna true o false
     */
    private static Boolean esVocal(char letter) {
        return "aeiou".contains(String.valueOf(letter).toLowerCase());
    }

    /**
     * Metodo para imprimir el hashMap
     */
    public void toPrint() {
        hashMap.forEach(message::showVocal);
    }

}
