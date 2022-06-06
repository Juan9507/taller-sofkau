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
    public Integer resolucion;
    public Boolean sintonizadoTdt;

    /**
     * Constantes
     */
    private static final int CONCATRESOLUCION = 20;
    private static final Boolean CONCATSINTONIZADOTDT = false;

    /**
     * Constructor po defecto
     */
    public Television() {
        this.resolucion = CONCATRESOLUCION;
        this.sintonizadoTdt = CONCATSINTONIZADOTDT;
    }

    /**
     * Constructor con dos parametros
     *
     * @param precio - recibe el precio
     * @param peso   - recipe el peso
     */
    public Television(Double precio, Double peso) {
        this.precioBase = precio;
        this.peso = peso;
        this.resolucion = CONCATRESOLUCION;
        this.sintonizadoTdt = CONCATSINTONIZADOTDT;
    }

    /**
     * Metodo con todos los parametros
     *
     * @param resolucion        - recibe la resolucion
     * @param sintonizadoTdt    - recibe el sintonizadoTdt
     * @param precioBase        - precioBase
     * @param color             - recibe el color
     * @param consumoEnergetico - recibe el consumo energetico
     * @param peso              - recibe el peso
     */
    public Television(Integer resolucion, Boolean sintonizadoTdt, Double precioBase,
                      String color, char consumoEnergetico, Double peso) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadoTdt = sintonizadoTdt;
    }

    /**
     * Sobre escritura del metodo precioFinal
     * se llama tambien al metodo precioFinal de la clase super
     *
     * @return - El aumento del precio
     */
    @Override
    public Double precioFinal() {
        Double aumentoPrecio = super.precioFinal();
        if (this.resolucion > 40 && !Boolean.TRUE.equals(this.sintonizadoTdt)) {
            aumentoPrecio *= 1.30;
        } else if (this.resolucion > 40 && Boolean.TRUE.equals(this.sintonizadoTdt)) {
            aumentoPrecio += 50;
        }
        return aumentoPrecio;
    }
}
