package org.sofkau.exercise.exercise18;

/**
 * [Clase Serie ]
 *
 * @author [Juan David Rivera Naranjo - juandavidnaranjo75@gmail.com]
 * @version [v1.0.0]
 * @since [v1.0.0]
 */
public class Serie implements Deliverable {
    /**
     * Atributos de la clase serie
     */
    private String title;          // Titulo se la serie
    private Integer numberSeasons; // Numero de temporadas
    public Boolean devoted;       // Entregado
    private String gender;         // Genero
    private String creator;        // Creador

    /**
     * Constructor por defecto
     * que almacena el valor a los atrubutos por defecto
     */
    public Serie() {
        this.title = "Vikingos";
        this.numberSeasons = 3;
        this.devoted = false;
        this.gender = "Accion";
        this.creator = "Michael Hirst";
    }

    /**
     * Constructor con dos parametros, el resto por defectos
     *
     * @param title   - Recibe el titulo
     * @param creator - Recibe el creador
     */
    public Serie(String title, String creator) {
        this();                 // Atributos por defectos del constructor por defecto
        this.title = title;     // Almacena el titulo enviado por parametro
        this.creator = creator; // Almacena el creador enviaod por parametro
    }

    /**
     * Constructor con todos los Atributos menos el de entregado
     *
     * @param title         - Recibe el titulo
     * @param creator       - Recibe el creador
     * @param numberSeasons - recibe el numero de temporadas
     * @param gender        - recibe el genero
     */
    public Serie(String title, String creator, Integer numberSeasons, String gender) {
        this();                             // Atributos por defectos del constructor por defecto
        this.title = title;                 // Almacena el titulo enviado por parametro
        this.creator = creator;             // Almacena el creador enviado por parametro
        this.numberSeasons = numberSeasons; // Almacena el numero de temporada
        this.gender = gender;               // Almacena el genero
    }

    /**
     * mostrar El titulo
     *
     * @return - El titulo
     */
    public String getTitle() {
        return title;
    }

    /**
     * Modificar El titulo
     *
     * @param title - Recibe el titulo con el que se va a modificar
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Mostrar El numero de temporadas
     *
     * @return - El numero de temporadas
     */
    public Integer getNumberSeasons() {
        return numberSeasons;
    }

    /**
     * Modificar el numero de tempordas
     *
     * @param numberSeasons - Recibe el numero de temporda con el que se va a modificar
     */
    public void setNumberSeasons(Integer numberSeasons) {
        this.numberSeasons = numberSeasons;
    }

    /**
     * Mostrar El genero
     *
     * @return - El genero
     */
    public String getGender() {
        return gender;
    }

    /**
     * Modificar El genero
     *
     * @param gender - El genero con el que se va a modificar
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Mostrar El creador
     *
     * @return - El creador
     */
    public String getCreator() {
        return creator;
    }

    /**
     * Modificar el creador
     *
     * @param creator - Recibe el creador con el que se va a modificar
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /**
     * Sobre escritura del metodo to String
     *
     * @return - retorna la cadena de texto
     */
    @Override
    public String toString() {
        return "Titulo de la serie: " + getTitle() + "\n" +
                "Genero de la serie: " + getGender() + "\n" +
                "Creador de la serie: " + getCreator() + "\n" +
                "Numero de temporada " + getNumberSeasons() + "\n" +
                "Entregado [false] no, [true] si: " + this.devoted;
    }

    /**
     * Metodo entregar - para cambiar el atributo prestado a true
     */
    public void Deliver() {
        this.devoted = true;
    }

    /**
     * Metodo devolver - para cambiar el atributo prestado a false
     */
    public void repay() {
        this.devoted = false;
    }

    /**
     * Metodo isEntregado que devuelve el estado del atributo prestado
     *
     * @return - El atributo entregado
     */
    public Boolean isDevoted() {
        return devoted;
    }

    /**
     * Metodo compare To
     * Devuelve [1] Si el numero de temporada de la serie 1 es mayor al de la serie 2
     * Devuelve [0] Si el numero de temporada son iguales
     * Devuelve [-1] Si el numero de temporada de la serie 1 es menor al de la serie 2
     *
     * @param a - recibe el objeto a comparar
     * @return
     */
    public int compareTo(Object a) {
        /*Casting de objetos para poder usar el metodo get
         * Casting hace refencia a ese objeto para poder usar sus metodos
         */
        Serie ref = (Serie) a;
        if (this.numberSeasons > ref.getNumberSeasons()) {
            return 1;
        } else if (this.numberSeasons == ref.getNumberSeasons()) {
            return 0;
        }
        return -1;
    }
}
