package org.sofkau.exercise.exercise17;

/**
 * [Subclase lavadora ]
 *
 * @author [Juan David Rivera Naranjo - juandavidnaranjo75@gmail.com]
 * @version [v1.0.0]
 * @since [v1.0.0]
 */
public class Television extends Electrodomestico {
    /**
     * Atributos
     */
    private final Integer resolucion;
    private final Boolean sintonizadoTdt;

    /**
     * Constantes
     */
    private static final int CONCATRESOLUCION = 20;
    private static final Boolean CONCATSINTONIZADOTDT = false;

    public Television(){
        this.resolucion = CONCATRESOLUCION;
        this.sintonizadoTdt = CONCATSINTONIZADOTDT;
    }

    public Television(Double precio, Double peso){
        this.precioBase = precio;
        this.peso = peso;
        this.resolucion = CONCATRESOLUCION;
        this.sintonizadoTdt = CONCATSINTONIZADOTDT;
    }

    public Television(Integer resolucion, Boolean sintonizadoTdt, Double precioBase,
                      String color, char consumoEnergetico, Double peso){
        super(precioBase,color,consumoEnergetico,peso);
        this.resolucion = resolucion;
        this.sintonizadoTdt = sintonizadoTdt;
    }
    @Override
    public Double precioFinal(){
        Double aumentoPrecio = super.precioFinal();
        if(this.resolucion > 40 && !Boolean.TRUE.equals(this.sintonizadoTdt)){
            aumentoPrecio*=1.30;
        } else if (this.resolucion > 40 && Boolean.TRUE.equals(this.sintonizadoTdt)) {
            aumentoPrecio+=50;
        }
        return aumentoPrecio;
    }
}
