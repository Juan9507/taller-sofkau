package org.sofkau.exercise.exercise17;

/**
 * [Super clase Electrodoméstico - según el consumo energético,
 * aumentara su precio, y según su tamaño, también]
 *
 * @author [Juan David Rivera Naranjo - juandavidnaranjo75@gmail.com]
 * @version [v1.0.0]
 * @since [v1.0.0]
 */
public class Electrodomestico {
    /**
     * Atributos
     */
    protected Double precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected Double peso;

    /**
     * Constantes para valores por defectos
     */
    protected static final String CONSTANTCOLOR = "Blanco";
    protected static final char CONSTANTCONSUMOENERGETICO = 'F';
    protected static final Double CONSTANTPRECIOS = 100.0;
    protected static final Double CONSTANTPESO = 5.0;

    /**
     * Constructor por defecto
     */
    public Electrodomestico() {
        this.precioBase = CONSTANTPRECIOS;
        this.color = CONSTANTCOLOR;
        this.consumoEnergetico = CONSTANTCONSUMOENERGETICO;
        this.peso = CONSTANTPESO;
    }

    /**
     * Constructores con dos parametros
     *
     * @param precioBase - recibe el precio base
     * @param peso       - recibe el peso
     */
    public Electrodomestico(Double precioBase, Double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = CONSTANTCOLOR;
        this.consumoEnergetico = CONSTANTCONSUMOENERGETICO;
    }

    /**
     * Constructor con todos los parametros
     *
     * @param precioBase        - recibe el precio
     * @param color             - recine el color
     * @param consumoEnergetico - recibe el consumo energetico
     * @param peso              - recibe el peso
     */
    public Electrodomestico(Double precioBase, String color, char consumoEnergetico, Double peso) {
        this(precioBase, peso);
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        comprobarConsumoEnergetico(this.consumoEnergetico);
        comprobarColor(this.color);
    }

    /**
     * Metodo para verificar la letra en consumoEnergeticosea
     * sea correcta
     *
     * @param letra recibe el valor
     */
    private void comprobarConsumoEnergetico(char letra) {
        char[] letrasValidas = {'A', 'B', 'C', 'D', 'E', 'F'};
        int validarLetra = 0;
        int i;
        for (i = 0; i < letrasValidas.length; i++) {
            if (letra == letrasValidas[i]) {
                validarLetra = 1;
            }
        }
        if (validarLetra == 0) {
            this.consumoEnergetico = CONSTANTCONSUMOENERGETICO;
        }
    }

    /**
     * Metodo para comprobar que el color sea correcto
     *
     * @param color - recibe el color a verificar
     */
    private void comprobarColor(String color) {
        String[] coloresValidos = {"blanco", "negro", "rojo", "azul", "gris"};
        int validarColor = 0;
        for (String colores : coloresValidos) {
            if (colores.equals(color)) {
                validarColor = 1;
                break;
            }
        }
        if (validarColor == 0) {
            this.color = CONSTANTCOLOR;
        }
    }

    /**
     * Metodo para aumenta el precio base segun
     * consumo enegertico y el peso
     *
     * @return - retorna el precio base aumentado
     */
    public Double precioFinal() {
        Double aumento = this.precioBase;
        switch (this.consumoEnergetico) {
            case 'A':
                aumento += 100;
                break;
            case 'B':
                aumento += 80;
                break;
            case 'C':
                aumento += 60;
                break;
            case 'D':
                aumento += 50;
                break;
            case 'E':
                aumento += 30;
                break;
            case 'F':
                aumento += 10;
                break;
            default:
                aumento = 0.0;
        }
        return aumentoPeso(aumento);
    }

    /**
     * Metodo para el aumento segun el peso
     *
     * @param aumento - recibe lo aumentado segun el consumo
     * @return - retorna ya el precio base ya aumentado
     */
    private Double aumentoPeso(Double aumento) {
        //segun su peso
        if (this.peso >= 0 && this.peso <= 19) {
            aumento += 10;
        } else if (this.peso >= 20 && this.peso <= 49) {
            aumento += 50;
        } else if (this.peso >= 25 && this.peso <= 79) {
            aumento += 80;
        } else {
            aumento += 100;
        }
        this.precioBase = aumento;
        return this.precioBase;
    }

    /**
     * Metodos getters de la clase
     */
    public Double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public Double getPeso() {
        return peso;
    }
}
