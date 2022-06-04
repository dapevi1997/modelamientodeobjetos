package org.sokfa.ejercicio5;

import java.util.InputMismatchException;
import java.util.Scanner;
import org.sokfa.ejercicio4.Vehicles;

/**
 * Clase contenedora del método main.
 *
 * @version 1.0.0 2022-06-03
 *
 * @author DANIEL PEREZ VITOLA - dapevi97@gmail.com
 *
 * @since 1.0.0
 *
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        /**
         * Instancia de la clase Scanner para manerjar las entradas del usuario.
         */
        Scanner in = new Scanner(System.in);
        /**
         * Objeto tipo vehículo que permite crear instancias de los diferentes
         * vehículos ya establecidos.
         */
        Vehicles vehicle;
        /**
         * Arreglo de objetos tipo vehículos.
         */
        Vehicles[] vehicles = new Vehicles[10];
        /**
         * Tipo de vehículo seleccionado por el usuario.
         */
        int vehicleType = 0;
        /**
         * Bandera para los ciclos do while
         */
        boolean flag = true;

        System.out.println("***Empecemos ingresando los vehículos***");
        /**
         * Ciclo que permite al usuario escoger el tipo de vehículos que van a
         * ingresar al ferry.
         */
        for (int i = 0; i < vehicles.length; i++) {

            /**
             * Ciclo para verificar que el usuario digite una entrada correcta.
             */
            do {
                /**
                 * Excepcion al usuario escribir una entrada inadecuada.
                 */
                try {
                    System.out.println("------------------------------------------------");
                    System.out.println("Escoga tipo de vehículo " + (i + 1) + ":");
                    System.out.println("");
                    System.out.println(" 1. Carro");
                    System.out.println(" 2. Moto");
                    System.out.println(" 3. Camión");
                    System.out.println(" 4. Bicicleta");
                    System.out.println(" 5. Lancha");
                    vehicleType = in.nextInt();

                    if (vehicleType >= 1 && vehicleType <= 5) {

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
            /**
             * Estructura condicional para crear el vehículo desde el teclado
             * según la selección del usuario.
             */
            switch (vehicleType) {
                case 1:
                    System.out.println("------------------------------------------------");
                    System.out.println("Ingreso de datos del carro (vehículo " + (i + 1) + "): ");
                    vehicle = new Car();
                    vehicles[i] = vehicle.toCreateOneVehicle();
                    break;
                case 2:
                    System.out.println("------------------------------------------------");
                    System.out.println("Ingreso de datos de la motocicleta (vehículo " + (i + 1) + "): ");
                    vehicle = new Motocycle();
                    vehicles[i] = vehicle.toCreateOneVehicle();
                    break;
                case 3:
                    System.out.println("------------------------------------------------");
                    System.out.println("Ingreso de datos del camión (vehículo " + (i + 1) + "): ");
                    vehicle = new Truck();
                    vehicles[i] = vehicle.toCreateOneVehicle();
                    break;
                case 4:
                    System.out.println("------------------------------------------------");
                    System.out.println("Ingreso de datos de la bicicleta (vehículo " + (i + 1) + "): ");
                    vehicle = new Bike();
                    vehicles[i] = vehicle.toCreateOneVehicle();
                    break;
                case 5:
                    System.out.println("------------------------------------------------");
                    System.out.println("Ingreso de datos de la lancha (vehículo " + (i + 1) + "): ");
                    vehicle = new Boat();
                    vehicles[i] = vehicle.toCreateOneVehicle();
                    break;
                default:
                    break;
            }

        }
        System.out.println("*******************************************");
        System.out.println("Vehículos ingresados:");
        System.out.println("*******************************************");
        System.out.println("");
        /**
         * Ciclo para mostrar las vehículos ingresados al ferry.
         */
        for (Vehicles vehicle1 : vehicles) {
            System.out.println("---------------------------------");
            System.out.println(vehicle1);
        }

    }
}
