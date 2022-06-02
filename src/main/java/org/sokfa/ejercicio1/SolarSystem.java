package org.sokfa.ejercicio1;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author dapevi1997
 */
public class SolarSystem extends PlanetarySystem implements ISystemBody {

    public SolarSystem() {

        this.name = "SISTEMA SOLAR";
        this.numberOfBodies = 8;
        this.bodies = addBodies();

    }

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

    @Override
    public double distanceBetweenTwoBodies(SystemBody body1, SystemBody body2) {
        double distance;

        distance = Math.abs(body1.getDistanceToTheSun() - body2.getDistanceToTheSun());

        return distance;

    }

    @Override
    public void attractionBetweenTwoBodies(Enum body1, Enum body2) {
        double attraction;
        int locationBody1 = 0;
        int locationBody2 = 1;
        double m1;
        double m2;
        double r;

        for (int i = 0; i < bodies.size(); i++) {

            if (body1.toString().equals(bodies.get(i).getName().toUpperCase())) {
                locationBody1 = i;
                break;
            }
        }

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

   

}
