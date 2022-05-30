package org.sofkau.exercise.exercise12;

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
public class Exercise12 {

    /**
     * Atributos para las frases
     */
    private final String sentenceOne;
    private final String sentenceTwo;

    /**
     * Atributos parael tamaño de las frases
     */
    private final int sentenceOneSize;

    private final int sentenceTwoSize;

    /**
     * Objeto para los mensajes
     */
    private static final MessagesExercise12 message = MessagesExercise12.getInstance();

    /**
     * Constructor de la clase
     *
     * @param one recibe la primera frase
     * @param two recibe la segunda frase
     */
    public Exercise12(String one, String two) {
        this.sentenceOne = one;
        this.sentenceTwo = two;
        this.sentenceOneSize = this.sentenceOne.length();
        this.sentenceTwoSize = this.sentenceTwo.length();
    }

    /**
     * Metodo para saber si las frases son iguales
     */
    public void sentenceEqual() {
        if (this.sentenceOne.equals(this.sentenceTwo)) {
            message.showEqual();
        } else {
            differencesOne();
        }
    }

    /**
     * Metodo para buscar las diferencia si no son iguales
     * se recorre la primera la frase si tiene el tamaño mas pequeño
     * para validar las direncia
     */
    public void differencesOne() {
        if (this.sentenceOneSize < this.sentenceTwoSize) {
            int i;
            for (i = 0; i < this.sentenceOneSize; i++) {
                char currentLetterOne = this.sentenceOne.charAt(i);
                char currentLetterTwo = this.sentenceTwo.charAt(i);
                if (!String.valueOf(currentLetterOne).equals(String.valueOf(currentLetterTwo))) {
                    message.showSentenceTextDifference(String.valueOf(currentLetterOne),
                            String.valueOf(currentLetterTwo));
                }
            }
            differencesSize();
        } else {
            differencesTwo();
        }
    }

    /**
     * Metodo para recorrer yvalidar la diferencia si la segunda frase
     * tiene el tamaño mas pequeño
     */
    public void differencesTwo() {
        int i;
        for (i = 0; i < this.sentenceTwoSize; i++) {
            char currentLetterOne = this.sentenceOne.charAt(i);
            char currentLetterTwo = this.sentenceTwo.charAt(i);
            if (!String.valueOf(currentLetterOne).equals(String.valueOf(currentLetterTwo))) {
                message.showSentenceTextDifference(String.valueOf(currentLetterOne),
                        String.valueOf(currentLetterTwo));
            }
        }
        differencesSize();
    }

    /**
     * Metodo para validar lo que no se puede recorrer ya
     * que hay una frase con mayor tamaño
     * se utiliza el metodo substring p
     */
    public void differencesSize() {
        if (this.sentenceOneSize > this.sentenceTwoSize) {
            String text = this.sentenceOne.substring(this.sentenceTwoSize);
            message.showSentenceSize(text);
        } else if (this.sentenceTwoSize > this.sentenceOneSize) {
            String text = this.sentenceTwo.substring(this.sentenceOneSize);
            message.showSentenceSize(text);
        }
    }

}
