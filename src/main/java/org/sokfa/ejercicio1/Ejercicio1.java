
package org.sokfa.ejercicio1;

/**
 *
 * @author dapevi1997
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        
        PlanetarySystem planetarySystem = new SolarSystem();
        planetarySystem.showInformation();
        System.out.println("Cálculos:");
        System.out.println("");
        planetarySystem.attractionBetweenTwoBodies(SolarSystem.Body.TIERRA, SolarSystem.Body.MARTE);
    }
}
