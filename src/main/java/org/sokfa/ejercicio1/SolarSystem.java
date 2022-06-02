package org.sokfa.ejercicio1;

import java.util.LinkedList;
import java.util.List;

/**
 * Esta clase representa el sistema planetario llamado Sistema Solar.
 *
 * @version 1.0.0 2022-06-02
 *
 * @author DANIEL PEREZ VITOLA - dapevi97@gmail.com
 *
 * @since 1.0.0
 *
 */
public class SolarSystem extends PlanetarySystem implements ISystemBody {

    /**
     * Contructor de la clase.
     */
    public SolarSystem() {

        this.name = "SISTEMA SOLAR";
        this.numberOfBodies = 8;
        this.bodies = addBodies();

    }

    /**
     * Médodo para agregar cuerpos a la lista del Sistema Solar.
     *
     * @return Arreglo tipo object de los cuerpos del sistema solar.
     */
    private List<SystemBody> addBodies() {
        List<SystemBody> systemBodys = new LinkedList<>();

        systemBodys.add(new SystemBody("TIERRA", 5.97E24, 5.51, 12742, 151.71E6));
        systemBodys.add(new SystemBody("MARTE", 6.39E23, 3.93, 6779, 208.29E6));
        systemBodys.add(new SystemBody("MERCURIO", 3.28E23, 5.43, 4879.4, 69.29E6));
        systemBodys.add(new SystemBody("VENUS", 4.87E23, 5.24, 12104, 108.86E6));
        systemBodys.add(new SystemBody("JUPITER", 1.898E27, 1.33, 139820, 743.22E6));
        systemBodys.add(new SystemBody("SATURNO", 5.68E26, 0.7, 116460, 1.48E12));
        systemBodys.add(new SystemBody("URANO", 8.68E25, 1.27, 50724, 2.95E12));
        systemBodys.add(new SystemBody("NEPTUNO", 1.024E26, 5.24, 12104, 108.86E6));

        return systemBodys;
    }

    /**
     * Método que muestra en consola la información del Sistema Solar.
     */
    @Override
    public void showInformation() {

        System.out.println("**********************************************************************");
        System.out.println("Nombre del sistema planetario: " + name);
        System.out.println("Id del sistema planetario: " + id);
        System.out.println("Número de cuerpos: " + numberOfBodies);
        System.out.println("**********************************************************************");
        System.out.println("----------------Cuerpos del sistema------------------");

        for (int i = 0; i < bodies.size(); i++) {

            System.out.println("*" + bodies.get(i).getName() + ":");
            System.out.println("   id: " + bodies.get(i).getId());
            System.out.println("   Masa (kg): " + bodies.get(i).getMass());
            System.out.println("   Densidad (g/cm^3): " + bodies.get(i).getDensity());
            System.out.println("   Diametro (km): " + bodies.get(i).getDiameter());
            System.out.println("   Distancia respecto al sol (km): " + bodies.get(i).getDistanceToTheSun());

        }
        System.out.println("-----------------------------------------------------");

    }

    /**
     * Método para calcular la distancia entre dos cuerpos del sistema
     * planetario.
     *
     * @param body1 Tipo object, primer cuerpo.
     * @param body2 Tipo object, segundo cuerpo.
     * @return Distncia entre los dos cuerpos.
     */
    @Override
    public double distanceBetweenTwoBodies(SystemBody body1, SystemBody body2) {
        /**
         * Variable para almacenar la distancia.
         */
        double distance;

        distance = Math.abs(body1.getDistanceToTheSun() - body2.getDistanceToTheSun());

        return distance;

    }

    /**
     * Método para calcular la fuera de atracción entre dos cuerpos del sistema.
     *
     * @param body1 Tipo Enum, primer cuerpo.
     * @param body2 Tipo Enum, segundo cuerpo.
     */
    @Override
    public void attractionBetweenTwoBodies(Enum body1, Enum body2) {
        /**
         * Variable para almacenar el resultado de la fuerza de atracción.
         */
        double attraction;
        /**
         * Variable para almacenar el índice del vector que contiene al cuerpo
         * 1.
         */
        int locationBody1 = 0;
        /**
         * Variable para almacenar el índice del vector que contiene al cuerpo
         * 2.
         */
        int locationBody2 = 1;
        /**
         * Representa la masa del primer cuerpo.
         */
        double m1;
        /**
         * Representa la masa del segundo cuerpo.
         */
        double m2;
        /**
         * Representa la distancia entre el cuerpo1 y el cuerpo2.
         */
        double r;
        /**
         * Estructura condicional para encontrar la ubicación en el carreglo del
         * primer cuerpo.
         */
        for (int i = 0; i < bodies.size(); i++) {

            if (body1.toString().equals(bodies.get(i).getName().toUpperCase())) {
                locationBody1 = i;
                break;
            }
        }
        /**
         * Estructura condicional para encontrar la ubicación en el carreglo del
         * segundo cuerpo.
         */
        for (int i = 0; i < bodies.size(); i++) {

            if (body2.toString().equals(bodies.get(i).getName().toUpperCase())) {
                locationBody2 = i;
                break;
            }
        }
        m1 = bodies.get(locationBody1).getMass();
        m2 = bodies.get(locationBody2).getMass();
        r = distanceBetweenTwoBodies(bodies.get(locationBody1), bodies.get(locationBody2));

        attraction = G * (m1 * m2 / Math.pow(r, 2));

        String name1 = bodies.get(locationBody1).getName();
        String name2 = bodies.get(locationBody2).getName();
        System.out.println("*La fuerza de atracción (N) entre " + name1 + " y " + name2 + " es: " + attraction);

    }

    /**
     * Lista de cuerpos que se pueden poner en el método que calcular la fuerza
     * de atracción entre dos cuerpos.
     */
    public enum Body {
        TIERRA,
        MARTE,
        MERCURIO,
        VENUS,
        JUPITER,
        SATURNO,
        URANO,
        NEPTUNO;
    }

}
