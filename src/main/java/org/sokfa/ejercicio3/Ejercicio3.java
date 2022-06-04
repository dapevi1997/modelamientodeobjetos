package org.sokfa.ejercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase contenedora del método main.
 *
 * @version 1.0.0 2022-06-02
 *
 * @author DANIEL PEREZ VITOLA - dapevi97@gmail.com
 *
 * @since 1.0.0
 *
 */
public class Ejercicio3 {

    public static void main(String[] args) throws Exception {
        /**
         * Intancia de la clase Scanner para manejar entradas del usuario.
         */
        Scanner in = new Scanner(System.in);
        /**
         * Variable para almacernar el tamaño del arreglo indicado por el
         * usuario.
         */
        int arraySize = 0;
        /**
         * Arreglo auxiliar para almacenar arrays creados.
         */
        double[] aux;
        /**
         * Variable para almacenar la opción de ordenamiento elegida por el
         * usuario.
         */
        int pickedMethod;
        /**
         * Bandera para el ciclo while.
         */
        boolean flag = true;

        System.out.println("***Bienvenido al programa***");
        /**
         * Ciclo para verificar que el usuario digite una entrada correcta.
         */
        do {
            /**
             * Excepcion al usuario escribir una entrada inadecuada.
             */
            try {
                System.out.print("Elija el tamaño del array: ");
                arraySize = in.nextInt();
                flag = false;

            } catch (InputMismatchException e) {
                System.out.println("*******Advertencia*******");
                System.out.println("¡Debe ingresar un entero!");
                System.out.println("*************************");
                in.next();

            }
        } while (flag);

        /**
         * Almacenar localmente la opción escogida por el usuario.
         */
        pickedMethod = Array.chooseMethod();
        System.out.println("----------------------------------");
        System.out.println("Arreglo original: ");
        /**
         * Almacenar el arreglo contruido.
         */
        aux = Array.buildArray(arraySize);
        /**
         * Mostrar en consola el arreglo original.
         */
        Array.shoWArray(aux);
        /**
         * Estructura condicional para ordenar el arreglo según la elección del
         * usuario.
         */
        if (pickedMethod == 1) {
            System.out.println("----------------------------------");
            System.out.println("Arreglo ordenado (método burbuja): ");
            aux = Array.organizeBubbleMethod(aux);
            Array.shoWArray(aux);

        } else if (pickedMethod == 2) {
            System.out.println("----------------------------------");
            System.out.println("Arreglo ordenado (método quick sort): ");
            aux = Array.oirganizeQuickSortMethod(aux, 0, arraySize - 1);
            Array.shoWArray(aux);
        }

        System.out.println("-----------");

    }
}
