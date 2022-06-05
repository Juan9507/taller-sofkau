package org.sofkau.exercise.exercise18;

/**
 * [Interface entregable ]
 *
 * @author [Juan David Rivera Naranjo - juandavidnaranjo75@gmail.com]
 * @version [v1.0.0]
 * @since [v1.0.0]
 */
public interface Deliverable {
    /**
     * Metodo entregar - para cambiar el atributo prestado a true
     */
    void Deliver();

    /**
     * Metodo devolver - para cambiar el atributo prestado a false
     */
    void repay();

    /**
     * Metodo isEntregado que devuelve el estado del atributo prestado
     *
     * @return
     */
    Boolean isDevoted();

    /**
     * Metodo compare To
     *
     * @param a - recibe el objeto a comparar
     * @return
     */
    int compareTo(Object a);
}
