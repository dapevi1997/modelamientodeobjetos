package org.sokfa.ejercicio1;

/**
 * Clase contenedora del método main para el ejercicio 1.
 *
 * @version 1.0.0 2022-06-02
 *
 * @author DANIEL PEREZ VITOLA - dapevi97@gmail.com
 *
 * @since 1.0.0
 *
 */
public class Ejercicio1 {

    /**
     * Método main
     *
     * @param args Cadenas de texto.
     */
    public static void main(String[] args) {
        /**
         * Instancia del distema planetario: Sistema Solar.
         */
        PlanetarySystem planetarySystem = new SolarSystem();
        /**
         * Mostrar en consola información del sistema solar.
         */
        planetarySystem.showInformation();
        System.out.println("Cálculos:");
        System.out.println("");
        /**
         * Mostrar en consola la fuerza de atracción en N de dos cuerpos
         * elegidos del Sistema Solar.
         */
        planetarySystem.attractionBetweenTwoBodies(SolarSystem.Body.MERCURIO, SolarSystem.Body.MARTE);
    }
}
