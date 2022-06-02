package org.sokfa.ejercicio1;

import java.util.UUID;

/**
 * Esta clase sirve para la creación de cuerpos para el sistema planetario.
 *
 * @version 1.0.0 2022-06-02
 *
 * @author DANIEL PEREZ VITOLA - dapevi97@gmail.com
 *
 * @since 1.0.0
 *
 */
public class SystemBody {

    /**
     * Representa un id único.
     */
    private final String id;
    /**
     * Representa el nombre del cuerpo.
     */
    private String name;
    /**
     * Representa la masa del cuerpo.
     */
    private double mass;
    /**
     * Representa la densidad del cuerpo.
     */
    private double density;
    /**
     * Representa el diámetro del cuerpo.
     */
    private double diameter;
    /**
     * Representa la distancia respecto al sol del cuerpo.
     */
    private double distanceToTheSun;

    /**
     * Contructor de la clase.
     *
     * @param name Nombre del cuerpo.
     * @param mass Masa del cuerpo en kg.
     * @param density Densidad del cuerpo en g/cm^3.
     * @param diameter Diámetro en km.
     * @param distanceToTheSun Distancia respecto al sol en km.
     */
    public SystemBody(String name, double mass, double density, double diameter,
            double distanceToTheSun) {
        /**
         * Iniciación de la cariable id asignándole un único valor a partir de
         * la clase UUID
         */
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.mass = mass;
        this.density = density;
        this.density = density;
        this.distanceToTheSun = distanceToTheSun;
    }

    /**
     * Retorna el id del cuerpo.
     *
     * @return Id del cuperpo.
     */
    public String getId() {
        return id;
    }

    /**
     * Retorna el nombre del cuerpo.
     *
     * @return Nombre del cuerpo.
     */
    public String getName() {
        return name;
    }

    /**
     * Método para cambiar el nombre del cuerpo.
     *
     * @param name Nuevo nombre.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retorna la densidad del cupero en g/cm^3.
     *
     * @return Densidad del cuerpo.
     */
    public double getDensity() {
        return density;
    }

    /**
     * Método para cambiar la densidad del cuerpo.
     *
     * @param density Densidad del cuerpo en g/cm^3.
     */
    public void setDensity(double density) {
        this.density = density;
    }

    /**
     * Retorna el diámetro del cuerpo en km.
     *
     * @return Diámetro del cuerpo.
     */
    public double getDiameter() {
        return diameter;
    }

    /**
     * Método para cambiar el diámetro del cuerpo.
     *
     * @param diameter Diámetro en km.
     */
    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    /**
     * Retorna la distancial respecto al sol del cuerpo en km.
     *
     * @return Distncia al sol.
     */
    public double getDistanceToTheSun() {
        return distanceToTheSun;
    }

    /**
     * Método para cambiar la distancia al sol del cuerpo.
     *
     * @param distanceToTheSun Distncia al sol en km.
     */
    public void setDistanceToTheSun(double distanceToTheSun) {
        this.distanceToTheSun = distanceToTheSun;
    }

    /**
     * Retorna la masa en kg del cuerpo.
     *
     * @return Masa del cuerpo.
     */
    public double getMass() {
        return mass;
    }

    /**
     * Método para cambiar la masa del cuerpo.
     *
     * @param mass Masa del cuerpo en kg.
     */
    public void setMass(double mass) {
        this.mass = mass;
    }
}
