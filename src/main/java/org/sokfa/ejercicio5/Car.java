package org.sokfa.ejercicio5;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;
import org.sokfa.ejercicio4.Vehicles;

/**
 * Clase creada con el objetivo de poder crear vehículos tipo carros.
 *
 * @version 1.0.0 2022-06-03
 *
 * @author DANIEL PEREZ VITOLA - dapevi97@gmail.com
 *
 * @since 1.0.0
 *
 */
public class Car extends Vehicles {

    /**
     * Representa el número de puertas del carro.
     */
    private boolean fiveDoors;
    /**
     * Representa en texto el número de puertas del carro.
     */
    private String numberOfDoors;

    /**
     * Constructor vacío de la clase.
     */
    public Car() {
    }

    /**
     * Constructor para crear vehículos tipo carro.
     *
     * @param name Nombre del vehículo.
     * @param numberOfPassenger Número de pasajeros del carro.
     * @param crew Lleva o no tripulación del carro.
     * @param numberOfWheels Número de ruedas.
     * @param way Medio por el que transita.
     * @param fiveDoors Es o no cinco puertas.
     */
    public Car(String name, int numberOfPassenger, boolean crew, int numberOfWheels, String way, boolean fiveDoors) {
        super(name, numberOfPassenger, crew, numberOfWheels, way);
        this.fiveDoors = Objects.requireNonNull(fiveDoors);
        this.numberOfDoors = "";
    }

    /**
     * Método para establecer en cadena de texto el número de puertas del carro.
     *
     * @return Número de puertas del carro.
     */
    public String numberOfDoors() {
        if (fiveDoors) {
            numberOfDoors = "5";
            return numberOfDoors;
        } else {
            numberOfDoors = "3";
            return numberOfDoors;
        }
    }

    @Override
    public Vehicles toCreateOneVehicle() {
        /**
         * Instancia de la clase Scanner para manejar las entradas del usuario.
         */
        Scanner in = new Scanner(System.in);
        /**
         * Variable auxiliar para almacenar el carro construido.
         */
        Vehicles vehicle;

        /**
         * Variable auxiliar para almacenar el número de pasajeros del carro.
         */
        int numberOfPassenger = 0;
        /**
         * Variable auxiliar para almacenar si lleva o no tripulación el carro.
         */
        boolean crew = true;
        /**
         * Variable auxiliar para almacenar la elección del usuario.
         */
        boolean auxFiveDoors = true;
        /**
         * Variable auxiliar para almacenar el número de ruedas del carro.
         */
        int numberOfWheels = 0;
        /**
         * Variable auxiliar para almacenar el medio por el que transita el
         * carro.
         */
        String way;
        /**
         * Variable auxiliar para almacenar la elección del usuario.
         */
        int auxCrew=0;
        /**
         * Bandera para el ciclo while.
         */
        boolean flag = true;

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
            /**
             * Excepcion al usuario escribir una entrada inadecuada.
             */
            flag = true;
            try {
                System.out.println("¿Es cinco puertas?");
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
            auxFiveDoors = true;
        } else if (auxCrew == 2) {
            auxFiveDoors = false;
        }

        vehicle = new Car("Carro", numberOfPassenger, crew, numberOfWheels, way, auxFiveDoors);

        return vehicle;
    }

    /**
     * Método agregar un atributo a toString, basado en la clase padre.
     *
     * @return Cadena de texto que muestra los datos de la bicileta.
     */
    @Override
    public String toString() {
        return super.toString() + "\nNúmero de puertas: " + numberOfDoors();
    }

}
