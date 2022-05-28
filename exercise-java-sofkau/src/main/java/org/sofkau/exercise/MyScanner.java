package org.sofkau.exercise;

import org.sofkau.exercise.abstracts.MyScannerAbstract;

/**
 * [Clase para implementar el metodo de la super
 * clase MyScannerAbstract,
 * manejos de errores para el objeto scanner]
 */
public class MyScanner extends MyScannerAbstract {

    /**
     * Metodo para instanciar esta clase
     * @return retorna la la instancia de la clase
     */
    public static MyScanner getInstance(){
        return new MyScanner();
    }

    /**
     * Sobre escritura del metodo getInteger
     * con manejo de excepciones
     * @return retorna metod getInteger de la super clase
     */
    @Override
    public Integer getInteger(){
        try {
            return super.getInteger();
        }catch (Exception exception){
            throw new MyException(exception.getMessage(), exception);
        }
    }

    /**
     * Sobre escritura del metodo getDouble
     * con manejo de excepciones
     * @return retorna metod getInteger de la super clase
     */
    @Override
    public Double getDouble(){
        try {
          return super.getDouble();
        }catch (Exception exception){
            throw new MyException(exception.getMessage(), exception);
        }
    }

    /**
     * Implementacio de metodo abstracto
     * @return retorna el String capturado
     */
    public String getString() {
        try {
            return scanneer.nextLine().replace("\\n", "");
        }catch (Exception exception){
            throw new MyException(exception.getMessage(), exception);
        }
    }
}
