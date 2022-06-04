package org.sokfa.ejercicio4;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

/**
 * Clase creada con el objetivo de poder crear vehículos generales.
 *
 * @version 1.0.0 2022-06-03
 *
 * @author DANIEL PEREZ VITOLA - dapevi97@gmail.com
 *
 * @since 1.0.0
 *
 */
public class Vehicles {

    /**
     * Instancia de la clase Scanner para leer las entradas del usuario.
     */
    Scanner in = new Scanner(System.in);
    /**
     * Representa el nombre común del vehículo.
     */
    private String name;
    /**
     * Representa la capacidad de pasajeros que puede tener el vehículo.
     */
    private int numberOfPassenger;
    /**
     * Representa si el vehículo tiene o no tripulación.
     */
    private boolean crew;
    /**
     * Representa el número de ruedas del vehículo.
     */
    private int numberOfWheels;
    /**
     * Representa la fecha en que ingresó el vehículo.
     */
    private LocalDate dateOfRegister;
    /**
     * Representa el medio por donde transita el vehículo.
     */
    private String way;

    /**
     * Contructir vacío de la clase que permite la instancia y manejo de métodos
     * públicos de la misma.
     */
    public Vehicles() {
    }

    /**
     * Contructor de la clase que permite crear un vehículo cualquiera.
     *
     * @param name Nombre general del vehículo.
     * @param numberOfPassenger Capacidad de pasajeros.
     * @param crew Tripulación o no.
     * @param numberOfWheels Número de ruedas.
     * @param way Medio por el que transita.
     */
    public Vehicles(String name, int numberOfPassenger, boolean crew, int numberOfWheels, String way) {
        dateOfRegister = LocalDate.now();
        this.name = Objects.requireNonNull(name);
        this.numberOfPassenger = Objects.requireNonNull(numberOfPassenger);
        this.crew = Objects.requireNonNull(crew);
        this.numberOfWheels = Objects.requireNonNull(numberOfWheels);
        this.way = Objects.requireNonNull(way);
    }

    /**
     * Método para determinar en cadena de caracteres si el vehículo lleva o no
     * tripulación.
     *
     * @return Cadenad de caracteres especificando si lleva o no tripulación el
     * vehículo.
     */
    public String isCrew() {
        /**
         * Estructura condicional para asignarle un valor al retorno.
         */
        if (crew) {
            return "si";
        } else {
            return "no";
        }
    }

    /**
     * Méodo para ingresar vehículos.
     *
     * @param numberOfVehicles Número de vehículos a ingresar.
     * @return Arreglo tipo Vehicles que contine los vehículos creados.
     */
    public Vehicles[] toCreateVehicle(int numberOfVehicles) {
        /**
         * Creación del arreglo que contendrá los vehículos.
         */
        Vehicles[] vehicle = new Vehicles[numberOfVehicles];
        /**
         * Ciclo para crear los vehículos por teclado.
         */
        for (int i = 0; i < numberOfVehicles; i++) {
            /**
             * Variable temporal para almacenar el nombre ingresado por el
             * usuario para el vehículo.
             */
            String auxName;
            /**
             * Variable temporal para almacenar el número de pasajeros ingresado
             * por el usuario para el vehículo.
             */
            int auxNumberOfPassenger = 0;
            /**
             * Variable temporal para almacenar el booleano que indica si lleva
             * o no tripulación el vehículo.
             */
            boolean auxCrew = true;
            /**
             * Variable temporal para almacenar el número de ruedas ingresado
             * por el usuario para el vehículo.
             */
            int auxNumberOfWheels = 0;
            /**
             * Variable temporal para almacenar el medio por el que se
             * transporta ingresado por el usuario para el vehículo.
             */
            String auxWay;
            /**
             * Variable temporal para almacenar la opción ingresada por el
             * usuario sobre la tripulación del vehículo.
             */
            int auxCrew1 = 0;
            /**
             * Bandera para el ciclo while.
             */
            boolean flag = true;

            System.out.println("------------------------------------------------");
            System.out.print("Escriba el nombre del vehículo " + (i + 1) + ": ");
            /**
             * Adignación del valor ingresado por el usuario a la variable
             * auxName.
             */
            auxName = in.next();

            /**
             * Ciclo para verificar que el usuario digite una entrada correcta.
             */
            do {
                /**
                 * Excepcion al usuario escribir una entrada inadecuada.
                 */
                try {
                    System.out.print("Escriba el número de pasajeros del vehículo " + (i + 1) + ": ");
                    auxNumberOfPassenger = in.nextInt();
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
                    System.out.println("¿Necesita tripulación el vehículo "
                            + (i + 1) + "?");
                    System.out.println(" 1. Si");
                    System.out.println(" 2. No");
                    auxCrew1 = in.nextInt();
                    if (auxCrew1 >= 1 && auxCrew1 <= 2) {

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

            if (auxCrew1 == 1) {
                auxCrew = true;
            } else if (auxCrew1 == 2) {
                auxCrew = false;
            }
            /**
             * Ciclo para verificar que el usuario digite una entrada correcta.
             */
            do {
                /**
                 * Excepcion al usuario escribir una entrada inadecuada.
                 */
                flag = true;
                try {
                    System.out.print("Número de ruedas del vehículo " + (i + 1) + ": ");
                    auxNumberOfWheels = in.nextInt();
                    flag = false;

                } catch (InputMismatchException e) {
                    System.out.println("*******Advertencia*******");
                    System.out.println("¡Debe ingresar un entero!");
                    System.out.println("*************************");
                    in.next();

                }
            } while (flag);
            System.out.print("Medio por el que se transporta el vehículo " + (i + 1) + ": ");
            auxWay = in.next();

            vehicle[i] = new Vehicles(auxName, auxNumberOfPassenger, auxCrew, auxNumberOfWheels, auxWay);

        }
        return vehicle;
    }

    /**
     *
     * @return
     */
    public Vehicles toCreateOneVehicle() {
        /**
         * Variable temporal para almacenar el vehículo.
         */
        Vehicles vehicle;
        /**
         * Variable temporal para almacenar el nombre ingresado por el usuario
         * para el vehículo.
         */
        String auxName = "";
        /**
         * Variable temporal para almacenar el número de pasajeros ingresado por
         * el usuario para el vehículo.
         */
        int auxNumberOfPassenger = 0;
        /**
         * Variable temporal para almacenar si el vehículo lleva o no
         * tripulación.
         */
        boolean auxCrew = true;
        /**
         * Variable temporal para almacenar el número de ruedas ingresado por el
         * usuario.
         */
        int auxNumberOfWheels;
        /**
         * Variable temporal para almacenar el nombre ingresado por el usuario
         * para el vehículo.
         */
        String auxWay;
        /**
         * Variable temporal para almacenar el nombre ingresado por el usuario
         * para el vehículo.
         */
        int auxCrew1;
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
                System.out.print("Escribal el número de pasajeros del vehículo " + ": ");
                auxNumberOfPassenger = in.nextInt();
                flag = false;

            } catch (InputMismatchException e) {
                System.out.println("*******Advertencia*******");
                System.out.println("¡Debe ingresar un entero!");
                System.out.println("*************************");
                in.next();

            }
        } while (flag);
        System.out.println("¿Presencia de tripulación" + "?");
        System.out.println(" 1. Si");
        System.out.println(" 2. No");
        auxCrew1 = in.nextInt();
        if (auxCrew1 == 1) {
            auxCrew = true;
        } else if (auxCrew1 == 2) {
            auxCrew = false;
        }
        System.out.print("Número de ruedas del vehículo " + ": ");
        auxNumberOfWheels = in.nextInt();
        System.out.print("Medio por el que se transporta el vehículo " + ": ");
        auxWay = in.next();

        vehicle = new Vehicles(auxName, auxNumberOfPassenger, auxCrew, auxNumberOfWheels, auxWay);

        return vehicle;
    }

    /**
     * Sobreescritura del método toString para imprimir los datos del vehículo
     *
     * @return Cadena de texto de los datos del vehículo.
     */
    @Override
    public String toString() {
        return "Nombre del vehículo: " + name
                + "\nFecha de ingreso: " + dateOfRegister
                + "\nNúmero de pasajeros: " + numberOfPassenger
                + "\nTripulación: " + isCrew()
                + "\nNúmero de ruedas: " + numberOfWheels
                + "\nMedio de tránsito: " + way;

    }

}
