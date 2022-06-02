package org.sokfa.ejercicio1;

import java.util.UUID;

/**
 *
 * @author dapevi1997
 */
public class SystemBody {

    private final String id;
    private String name;
    private double mass; //kg
    private double density; //g/cm3
    private double diameter; //kg
    private double distanceToTheSun; //km

    public SystemBody(String name, double mass, double density, double diameter,
            double distanceToTheSun) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.mass = mass;
        this.density = density;
        this.density = density;
        this.distanceToTheSun = distanceToTheSun;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getDistanceToTheSun() {
        return distanceToTheSun;
    }

    public void setDistanceToTheSun(double distanceToTheSun) {
        this.distanceToTheSun = distanceToTheSun;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }
}
