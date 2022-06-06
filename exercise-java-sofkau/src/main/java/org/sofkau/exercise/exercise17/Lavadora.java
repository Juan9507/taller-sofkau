package org.sofkau.exercise.exercise17;

/**
 * [Subclase lavadora ]
 *
 * @author [Juan David Rivera Naranjo - juandavidnaranjo75@gmail.com]
 * @version [v1.0.0]
 * @since [v1.0.0]
 */
public class Lavadora extends Electrodomestico {
    /**
     * Atributos
     */
    public Integer carga;

    /**
     * Constante
     */
    private static final Integer CONSTANTCARGA = 5;

    /**
     * Constructor por defecto
     */
    public Lavadora(){
        this.carga = CONSTANTCARGA;
    }

    /**
     * Constructor con dos parametros
     * @param peso - recibe el peso
     * @param precio - recibe el precio
     */
    public Lavadora(Double precio, Double peso){
        this.precioBase = precio;
        this.peso = peso;
        this.carga = CONSTANTCARGA;
    }

    /**
     * Constructor con todos los parametros
     * @param precioBase - recibe el precio
     * @param color - recibe el color
     * @param consumoEnergetico - recibe el consumo energetico
     * @param peso - recibe el peso
     * @param carga - recibe la carga
     */
    public Lavadora(Double precioBase, String color, char consumoEnergetico, Double peso, Integer carga){
        super(precioBase,color,consumoEnergetico,peso);
        this.carga = carga;
    }

    /**
     * Sobreescritura metodo precio final
     * se utiliza el metodo de la supreclase
     * @return - Retorna el precio aumentado
     */
    @Override
    public Double precioFinal(){
       double precioAumento = super.precioFinal();

       if(this.carga > 30){
           precioAumento +=50;
       }

       return precioAumento;

    }

    /**
     * Metodo getter
     * @return - retorna la carga
     */
    public Integer getCarga() {
        return carga;
    }
}
