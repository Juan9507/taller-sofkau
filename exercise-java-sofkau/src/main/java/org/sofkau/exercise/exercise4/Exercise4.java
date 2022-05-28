package org.sofkau.exercise.exercise4;

/**
 * [Lee un número por teclado que pida el precio de un producto (puede tener decimales)
 * calcule el precio final con IVA. El IVA sera una constante que sera del 21%.
 * ]
 *
 * @author [Juan David Rivera Naranjo - juandavidnaranjo75@gmail.com]
 * @version [v1.0.0]
 * @since [v1.0.0]
 */
public class Exercise4 {

    /**
     * Atributo para el iva
     */
    private final Double iva = 0.21;

    /**
     * Atributo para el precio
     */
    private Double price;

    /**
     * Constructor de la clase
     * @param price recibe el precio
     */
    public Exercise4(Double price){
        this.price = price;
    }

    /**
     * Metodo para calcular el iva
     */
    public Double calculateIva() {
        Double amountTotal = price * iva;
        return amountTotal + price;
    }

}
