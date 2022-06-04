package org.sokfa.ejercicio5;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;
import org.sokfa.ejercicio4.Vehicles;

/**
 * Clase creada con el objetivo de poder crear vehículos tipo bicicletas.
 *
 * @version 1.0.0 2022-06-03
 *
 * @author DANIEL PEREZ VITOLA - dapevi97@gmail.com
 *
 * @since 1.0.0
 *
 */
public class Bike extends Vehicles {

    /**
     * Representa si la bicicleta tiene sostenedor de botellas.
     */
    private boolean bottleHolder;
    /**
     * Representa en cadenas si tiene sostenedor de botellas.
     */
    private String haveBottleHolder;

    /**
     * Contructor vacio para poder instanciar la clase.
     */
    public Bike() {
    }

    /**
     * Constructor para poder crear vehículos tipo bicicleta.
     *
     * @param name Nombre del vehículo.
     * @param numberOfPassenger Número de pasajeros.
     * @param crew Tripulación.
     * @param numberOfWheels Número de ruedas.
     * @param way Medio por donde transita.
     * @param bottleHolder Sostenedor de botellas.
     */
    public Bike(String name, int numberOfPassenger, boolean crew, int numberOfWheels, String way, boolean bottleHolder) {
        super(name, numberOfPassenger, crew, numberOfWheels, way);
        this.bottleHolder = Objects.requireNonNull(bottleHolder);
    }

    /**
     * Método para obtener en caracteres si lleva o no sostenedor de botellas.
     *
     * @return Cadena que indica si tiene o no sostenedor de botellas.
     */
    public String haveBottleHolder() {
        /**
         * Estructura condicional para establacer si lleva o no sostenedor de
         * botellas.
         */
        if (bottleHolder) {
            haveBottleHolder = "si";
            return haveBottleHolder;
        } else {
            haveBottleHolder = "no";
            return haveBottleHolder;
        }
    }

    /**
     * Método para crear un vehículo tipo bicicleta desde el teclado.
     *
     * @return Vehículo tipo bicicleta.
     */
    @Override
    public Vehicles toCreateOneVehicle() {
        /**
         * Instancia de la clase Scanner para manejar las entradas del usuario.
         */
        Scanner in = new Scanner(System.in);
        /**
         * Variable auxiliar para almacenar la bicicleta construida.
         */
        Vehicles vehicle;
        /**
         * Variable auxiliar para almacenar el número de pasajeros de la
         * bicicleta.
         */
        int numberOfPassenger = 0;
        /**
         * Variable auxiliar para almacenar si lleva o no tripulación la
         * bicileta.
         */
        boolean crew = true;
        /**
         * Variable auxiliar para almacenar si tiene o no sostenedor de
         * botellas..
         */
        boolean auxBottleHolder = true;
        /**
         * Variable auxiliar para almacenar el número de ruedas de la bicicleta.
         */
        int numberOfWheels = 0;
        /**
         * Variable auxiliar para almacenar el medio por el que transita la
         * bicicleta.
         */
        String way;
        /**
         * Variable auxiliar para almacenar la elección del usuario.
         */
        int auxCrew = 0;
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
            /**
             * Excepcion al usuario escribir una entrada inadecuada.
             */
            flag = true;
            try {
                System.out.println("¿Tiene soporte para botella de agua?");
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
            auxBottleHolder = true;
        } else if (auxCrew == 2) {
            auxBottleHolder = false;
        }

        vehicle = new Bike("Bicileta", numberOfPassenger, crew, numberOfWheels, way, auxBottleHolder);

        return vehicle;
    }

    /**
     * Método agregar un atributo a toString, basado en la clase padre.
     *
     * @return Cadena de texto que muestra los datos de la bicileta.
     */
    @Override
    public String toString() {
        return super.toString() + "\nTiene soporte para botella de agua: " + haveBottleHolder();
    }

}
