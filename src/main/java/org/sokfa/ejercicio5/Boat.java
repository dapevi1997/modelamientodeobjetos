package org.sokfa.ejercicio5;

import java.util.InputMismatchException;
import java.util.Scanner;
import org.sokfa.ejercicio4.Vehicles;

/**
 * Clase creada con el objetivo de poder crear vehículos tipo lanchas.
 *
 * @version 1.0.0 2022-06-03
 *
 * @author DANIEL PEREZ VITOLA - dapevi97@gmail.com
 *
 * @since 1.0.0
 *
 */
public class Boat extends Vehicles {

    /**
     * Representa el número de motores fuera de borda de la lancha.
     */
    private int numberOfEngines;

    /**
     * Constructor vacío de la clase.
     */
    public Boat() {
    }

    /**
     * Constructor para crear vehículos tipo lancha.
     *
     * @param name Nombre del vehículo.
     * @param numberOfPassenger Número de pasajeros de la lancha
     * @param crew Lleva o no tripulación la lancha.
     * @param numberOfWheels Número de ruedas.
     * @param way Medio por el que transita.
     * @param numberOfEngines Número de motores.
     */
    public Boat(String name, int numberOfPassenger, boolean crew, int numberOfWheels, String way, int numberOfEngines) {
        super(name, numberOfPassenger, crew, numberOfWheels, way);
        this.numberOfEngines = numberOfEngines;
    }

    @Override
    public Vehicles toCreateOneVehicle() {
        /**
         * Instancia de la clase Scanner para manejar las entradas del usuario.
         */
        Scanner in = new Scanner(System.in);
        /**
         * Variable auxiliar para almacenar la lancha construida.
         */
        Vehicles vehicle;

        /**
         * Variable auxiliar para almacenar el número de pasajeros de la lancha.
         */
        int numberOfPassenger = 0;
        /**
         * Variable auxiliar para almacenar si lleva o no tripulación la lancha.
         */
        boolean crew = true;
        /**
         * Variable auxiliar para almacenar el número de ruedas de la lancha.
         */
        int numberOfWheels = 0;
        /**
         * Variable auxiliar para almacenar el medio por el que transita la
         * lancha.
         */
        String way;
        /**
         * Variable auxiliar para almacenar la elección del usuario.
         */
        int auxCrew=0;
        /**
         * Variable auxiliar para almacenar el número de motores ingresado por
         * el usuario.
         */
        int auxNumberOfEngines = 0;
        /**
         * Bandera para el ciclo while.
         */
        boolean flag = true;

        System.out.println("------------------------------------------------");

        /**
         * Ciclo para verificar que el usuario digite una entrada correcta.
         */
        do {
            /**
             * Excepcion al usuario escribir una entrada inadecuada.
             */
            try {
                System.out.print("Capacidad de pasajeros: ");
                numberOfPassenger = in.nextInt();
                flag = false;

            } catch (InputMismatchException e) {
                System.out.println("*******Advertencia*******");
                System.out.println("¡Debe ingresar un entero!");
                System.out.println("*************************");
                in.next();

            }
        } while (flag);

        /**
         * Ciclo para verificar que el usuario digite una entrada correcta.
         */
        do {
            /**
             * Excepcion al usuario escribir una entrada inadecuada.
             */
            flag = true;
            try {
                System.out.println("¿Presencia de tripulación?");
                System.out.println(" 1. Si");
                System.out.println(" 2. No");
                auxCrew = in.nextInt();
                if (auxCrew >= 1 && auxCrew <= 2) {

                } else {
                    throw new IllegalArgumentException("******Advertencia**"
                            + "*****\nFuera de rango\n****************"
                            + "*********");
                }
                flag = false;

            } catch (InputMismatchException e) {

                System.out.println("*******Advertencia*******");
                System.out.println("¡Debe ingresar un entero (1 ó 2)!");
                System.out.println("*************************");
                in.next();

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } while (flag);
        if (auxCrew == 1) {
            crew = true;
        } else if (auxCrew == 2) {
            crew = false;
        }

        /**
         * Ciclo para verificar que el usuario digite una entrada correcta.
         */
        do {
            flag = true;
            /**
             * Excepcion al usuario escribir una entrada inadecuada.
             */
            try {
                System.out.print("Número de ruedas: ");
                numberOfWheels = in.nextInt();
                flag = false;

            } catch (InputMismatchException e) {
                System.out.println("*******Advertencia*******");
                System.out.println("¡Debe ingresar un entero!");
                System.out.println("*************************");
                in.next();

            }
        } while (flag);
        System.out.print("Medio por el que se transporta: ");
        way = in.next();

        /**
         * Ciclo para verificar que el usuario digite una entrada correcta.
         */
        do {
            flag = true;
            /**
             * Excepcion al usuario escribir una entrada inadecuada.
             */
            try {
                System.out.println("Número de motores fuera de borda: ");
                auxNumberOfEngines = in.nextInt();
                flag = false;

            } catch (InputMismatchException e) {
                System.out.println("*******Advertencia*******");
                System.out.println("¡Debe ingresar un entero!");
                System.out.println("*************************");
                in.next();

            }
        } while (flag);

        vehicle = new Boat("Lancha", numberOfPassenger, crew, numberOfWheels, way, auxNumberOfEngines);

        return vehicle;
    }

    /**
     * Método agregar un atributo a toString, basado en la clase padre.
     *
     * @return Cadena de texto que muestra los datos de la bicileta.
     */
    @Override
    public String toString() {
        return super.toString() + "\nNúmero de motores fuera de borda: " + numberOfEngines;
    }
}
