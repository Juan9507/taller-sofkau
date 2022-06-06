package org.sofkau.exercise.exercise16;

/**
 * [Clase persona -> Calcular el IMC peso ideal]
 *
 * @author [Juan David Rivera Naranjo - juandavidnaranjo75@gmail.com]
 * @version [v1.0.0]
 * @since [v1.0.0]
 */
public class Persona {

    /**
     * Constantes
     */
    private static final char CONSTANTSEXO = 'H';

    /**
     * Atributos para utilizar en la clase persona
     */
    private String nombre;
    private int edad;
    private String dni;
    private char sexo;
    private int peso;
    private double altura;

    /**
     * Constructor por defecto
     */
    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.sexo = CONSTANTSEXO;
        this.peso = 0;
        this.altura = 0;
        generaDNI();
    }

    /**
     * Constructor con tres parametros
     *
     * @param nombre - recibe el nombre
     * @param edad   - recibe la edad
     * @param sexo   - recibe el sexo
     */
    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = 0;
        this.altura = 0;
        generaDNI();
    }

    /**
     * Constructor que recibe 5 parametros
     *
     * @param nombre - recibe el nombre de la persona
     * @param edad   - recibe la edad de la persona
     * @param sexo   - recibe el sexo de la persona
     * @param peso   - recibe el peso de la persona
     * @param altura - recibe la altura de la persona
     */
    public Persona(String nombre, int edad, char sexo, int peso, double altura) {
        this(nombre, edad, sexo);
        this.peso = peso;
        this.altura = altura;
        generaDNI();
    }

    /**
     * Metodo para calcular si la persona esta en su peso ideal
     * devuelve -1 si esta bajo de paso
     * devuelve 0 si esta en el peso ideal
     * devuelve 1 si esta en sobre peso
     */
    public Integer calcularIMC() {

        final int respuesta;

        double formulaImc = Math.round(this.peso / (Math.pow(this.altura, 2)));

        if (formulaImc < 20) {
            respuesta = -1;
        } else if (formulaImc <= 25) {
            respuesta = 0;
        } else {
            respuesta = 1;
        }
        return respuesta;
    }

    /**
     * Metodo para saber si la persona es mayor de edad
     *
     * @return - retorna true o false
     */
    public Boolean esMayorDeEdad() {
        return this.edad >= 18;
    }

    /**
     * Metodo para comprobar si el sexo fue bien digitado
     */
    private void comprobarSexo() {
        if (this.sexo != 'H' && this.sexo != 'M') {
            this.sexo = CONSTANTSEXO;
        }
    }

    /**
     * Metodo para generar el dni de la persona aleatorio
     */
    private void generaDNI() {
        int numDNI = ((int) Math.floor(Math.random() * 90000000 + 10000000));
        int resto = Math.floorMod(numDNI, 23);
        this.dni = String.valueOf(numDNI) + generarLetraDNI(resto);
    }

    /**
     * Metodo para saber la letra del dni dependiendo el residuo del dni
     *
     * @param resto - recibe el residuo
     * @return - retorna la letra
     */
    private char generarLetraDNI(int resto) {
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
                'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
                'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        return letras[resto];
    }

    /**
     * Sobre escritura del metodo toString para mostrar los
     * atributos de la persona
     *
     * @return - retorna el string
     */
    @Override
    public String toString() {
        comprobarSexo();
        return "Informacion de la persona\n"
                + "Nombre " + this.nombre + "\n"
                + "Edad " + this.edad + "\n"
                + "Sexo " + this.sexo + "\n"
                + "DNI " + this.dni + "\n"
                + "peso " + this.peso + "\n"
                + "Altura " + this.altura + "\n";
    }

    /**
     * Setters de todos el atributo name
     *
     * @param nombre - recibe como parametro el nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Setter para el atributo edad
     *
     * @param edad - recibe como parametro la edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Setter para el atributo sexo
     *
     * @param sexo - recibe como parametro el sexo
     */
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    /**
     * Setter para el atributo peso
     *
     * @param peso - recibe como parametro el peso
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }

    /**
     * Setter para el atributo altura
     *
     * @param altura recibe como parametro la altura
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

}
