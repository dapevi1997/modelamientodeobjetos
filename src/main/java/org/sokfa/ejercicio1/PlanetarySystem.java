package org.sokfa.ejercicio1;

import java.util.List;
import java.util.UUID;

/**
 * Con esta clase es posible la construcción de diferentes sistemas planetarios
 * extendiendo de la misma.
 *
 * @version 1.0.0 2022-06-02
 *
 * @author DANIEL PEREZ VITOLA - dapevi97@gmail.com
 *
 * @since 1.0.0
 *
 */
public abstract class PlanetarySystem {

    /**
     * Representa la lista de los cuerpos del sistema.
     */
    protected List<SystemBody> bodies;
    /**
     * Representa un Id único,
     */
    protected final String id;
    /**
     * Representa el nombre del sistema planetario.
     */
    protected String name;
    /**
     * Representa el número de cuperos del sistema.
     */
    protected int numberOfBodies;

    /**
     * Contructor de la clase.
     */
    public PlanetarySystem() {
        /**
         * Iniciaci+on de la variable id aginándole un valor único por medio de
         * la clase UUID.
         */
        this.id = UUID.randomUUID().toString();
    }

    /**
     * Método para calcular la fuerza de atracción entre dos cuperpos del
     * sistema.
     *
     * @param Body1 Tipo obcjet, primer cuerpo seleccionado.
     * @param Body2 Tipo obcjet, segundo cuerpo seleccionado.
     * @author DANIEL PEREZ VITOLA - dapevi97@gmail.com
     */
    public abstract void attractionBetweenTwoBodies(Enum Body1, Enum Body2);

    /**
     * Método para mostrar información en consola del sistema planetario.
     *
     * @author DANIEL PEREZ VITOLA - dapevi97@gmail.com
     */
    public abstract void showInformation();

}
