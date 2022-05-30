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

    private final int sentenceOneSize;

    private final int sentenceTwoSize;

    /**
     * Objeto para los mensajes
     */
    private static final MessagesExercise12 message = MessagesExercise12.getInstance();

    public Exercise12(String one, String two) {
        this.sentenceOne = one;
        this.sentenceTwo = two;
        this.sentenceOneSize = this.sentenceOne.length();
        this.sentenceTwoSize = this.sentenceTwo.length();
    }

    public void sentenceEqual() {
        if (this.sentenceOne.equals(this.sentenceTwo)) {
            message.showEqual();
        } else {
            differencesOne();
        }
    }

    /**
     * Metodo para buscar las diferencia si no son iguales
     */
    public void differencesOne() {
        if (this.sentenceOneSize < this.sentenceTwoSize) {
            int i;
            for (i = 0; i < this.sentenceOneSize; i++) {
                char currentLetterOne = this.sentenceOne.charAt(i);
                char currentLetterTwo = this.sentenceTwo.charAt(i);
                if (String.valueOf(currentLetterOne).equals(String.valueOf(currentLetterTwo))) {
                    message.showSentenceSin(String.valueOf(currentLetterOne), String.valueOf(currentLetterTwo));
                } else {
                    message.showSentenceCon(String.valueOf(currentLetterOne), String.valueOf(currentLetterTwo));
                }
            }
            differencesSize();
        } else {
            differencesTwo();
        }
    }

    public void differencesTwo() {
        int i;
        for (i = 0; i < this.sentenceTwoSize; i++) {
            char currentLetterOne = this.sentenceOne.charAt(i);
            char currentLetterTwo = this.sentenceTwo.charAt(i);
            if (String.valueOf(currentLetterOne).equals(String.valueOf(currentLetterTwo))) {
                message.showSentenceSin(String.valueOf(currentLetterOne), String.valueOf(currentLetterTwo));
            } else {
                message.showSentenceCon(String.valueOf(currentLetterOne), String.valueOf(currentLetterTwo));
            }
        }
        differencesSize();
    }

    public void differencesSize() {
        if (this.sentenceOneSize > this.sentenceTwoSize) {
            String text = this.sentenceOne.substring(this.sentenceTwoSize);
            message.showSentenceSize(this.sentenceOne, text);
        } else if (this.sentenceTwoSize > this.sentenceOneSize) {
            String text = this.sentenceTwo.substring(this.sentenceOneSize);
            message.showSentenceSize(this.sentenceTwo, text);
        }
    }

}
