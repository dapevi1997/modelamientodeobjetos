package org.sokfa.ejercicio4;

import java.util.Scanner;

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
public class Ejercicio4 {

    public static void main(String[] args) {
        /**
         * Instancia de la clase Scanner para manejar las entradas del usuario.
         */
        Scanner in = new Scanner(System.in);
        /**
         * Instancia de vehículos para poder utiliar los métodos públicos.
         */
        Vehicles v = new Vehicles();
        /**
         * Arreglo de tipo Vehicles para almacenar la información de los
         * vehículos.
         */
        Vehicles[] vehicles;

        System.out.println("***Empecemos Ingresando vehículos***");
        /**
         * Creación de los vehículos que van a ingresar al Ferry.
         */
        vehicles = v.toCreateVehicle(10);
        System.out.println("*************************************************");
        System.out.println("Vehículos ingresados:");
        System.out.println("");
        /**
         * Muestra en consola de los vehículos ingresados.
         */
        for (Vehicles vehicle : vehicles) {
            System.out.println(vehicle);
            System.out.println("--------------------------------");
        }

    }
}
