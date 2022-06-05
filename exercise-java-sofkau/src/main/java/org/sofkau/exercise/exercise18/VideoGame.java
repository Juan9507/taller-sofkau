package org.sofkau.exercise.exercise18;

/**
 * [Clase Video juego ]
 *
 * @author [Juan David Rivera Naranjo - juandavidnaranjo75@gmail.com]
 * @version [v1.0.0]
 * @since [v1.0.0]
 */
public class VideoGame implements Deliverable {

    /**
     * Atributos de la clase video juegos
     */
    private String title;          // Titulo
    private Integer estimatedHours; // Horas estimadas
    public Boolean devoted;        // Entregado
    private String gender;         // Genero
    private String company;        // Compañia

    /**
     * Constructor por defecto
     * que almacena el valor a los atrubutos por defecto
     */
    public VideoGame() {
        this.title = "Fifa 21";
        this.estimatedHours = 10;
        this.devoted = false;
        this.gender = "Deporte";
        this.company = "Fifa";
    }

    /**
     * Metodo constructor con dos parametros y el resto por defecto
     *
     * @param title          - recibe el titulo
     * @param estimatedHours - recibe las horas estimadas
     */
    public VideoGame(String title, Integer estimatedHours) {
        this();                               // Atributos por defectos del constructor por defecto
        this.title = title;                   // Almacena el titulo enviado por parametro
        this.estimatedHours = estimatedHours; // Almacena las horas estimadas
    }

    /**
     * Constructor con todos los metodos menos entregado
     *
     * @param title          - recibe el titulo
     * @param estimatedHours - recibe las horas estimadas
     * @param gender         - recibe el genero
     * @param company        - recibe la compañia
     */
    public VideoGame(String title, Integer estimatedHours, String gender, String company) {
        this();                               // Atributos por defectos del constructor por defecto
        this.title = title;                   // Almacena el titulo enviado por parametro
        this.estimatedHours = estimatedHours; // Almacena las horas estimadas
        this.gender = gender;                 // Almacena el genero del juego
        this.company = company;               // Almacena la compañia del juego
    }

    /**
     * Retornar el titulo
     *
     * @return - El titulo
     */
    public String getTitle() {
        return title;
    }

    /**
     * Recibe el titulo
     *
     * @param - El titulo para modificar el titulo del juego
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Retornar las horas estimadas
     *
     * @return -estimatedHours
     */
    public Integer getEstimatedHours() {
        return estimatedHours;
    }

    /**
     * Recibe las horas estimada
     *
     * @param - Las horas estimadas para modificar las horas estimadas del juego
     */
    public void setEstimatedHours(Integer estimatedHours) {
        this.estimatedHours = estimatedHours;
    }

    /**
     * Retornar el genero
     *
     * @return - gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * Recibe el genero
     *
     * @param - EL genero para modificar el genero del juego
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Retornar el nombre de la compañia
     *
     * @return - company
     */
    public String getCompany() {
        return company;
    }

    /**
     * Recibe el nombre de la compañia
     *
     * @param - el nombre a modificar la compañia del juego
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * Sobre escritura del metodo to String
     *
     * @return - retorna la cadena de texto
     */
    @Override
    public String toString() {
        return "Titulo del juego: " + getTitle() + "\n" +
                "Genero del juego: " + getGender() + "\n" +
                "Horas estimadas del juego: " + getEstimatedHours() + "\n" +
                "Nombre de la compañia: " + getCompany() + "\n" +
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
        return this.devoted;
    }

    /**
     * Metodo compare To
     * Devuelve [1] Si la Horas estimadas del juego 1 es mayor al del juego 2
     * Devuelve [0] Si a Horas estimadas del juego  son iguales
     * Devuelve [-1] Si a Horas estimadas del juego  1 es menor al del juego 2
     *
     * @param a - recibe el objeto a comparar
     * @return
     */
    public int compareTo(Object a) {
        /*Casting de objetos para poder usar el metodo get
         * Casting hace refencia a ese objeto para poder usar sus metodos
         */
        VideoGame ref = (VideoGame) a;
        if (this.estimatedHours > ref.getEstimatedHours()) {
            return 1;
        } else if (this.estimatedHours == ref.getEstimatedHours()) {
            return 0;
        }
        return -1;
    }
}
