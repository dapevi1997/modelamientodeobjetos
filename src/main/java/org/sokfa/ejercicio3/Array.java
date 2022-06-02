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
public class Array {

    /**
     * Constructor de la clase.
     */
    public Array() {
    }

    /**
     * Método para contruir el arreglo dependiendo del tamaño asignado por el
     * usuario con números reales aleatorios.
     *
     * @param size Tamaño del arreglo.
     * @return Arreglo de números reales.
     */
    public static double[] buildArray(int size) {
        /**
         * Arreglo para almacenar los valores que se le asignen al arreglo.
         */
        double[] array = new double[size];
        /**
         * Ciclo para almacenar los valores del arreglo en la variable array.
         */
        for (int i = 0; i < array.length; i++) {
            array[i] = (double) Math.random() * 100;

        }

        return array;

    }

    /**
     * Método para mostrar los valores almacenados en un arreglo.
     *
     * @param array Arreglo a mostrar
     */
    public static void shoWArray(double array[]) {
        /**
         * Bucle para recorrer el arreglo.
         */
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }

    }

    /**
     * Método para mostrar al usuario las opciones de ordenamiento disponibles.
     *
     * @return Selección del usuario.
     */
    public static int chooseMethod() {
        /**
         * Instancia de la clase Scanner para manejar las entradas el usuario.
         */
        Scanner in = new Scanner(System.in);
        /**
         * Variable para almacenar la opción seleccionada por el usuario.
         */
        int selected = 0;

        System.out.println("Elija el método para ordenar el arreglo: ");
        System.out.println(" 1. Burbuja");
        System.out.println(" 2. Quick Sort");
        /**
         * Verificar que sea un número entero el ingresado.
         */
        try {
            selected = in.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("***Entrada no permitida.***");
        }

        if (selected <= 2 && selected >= 1) {
            return selected;
        } else {
            System.out.println("Selección no disponible");
            chooseMethod();
        }

        return selected;

    }

    /**
     * Método para organizar un arreglo por el método burbuja.
     *
     * @param array Arreglo a ordenar.
     * @return Arreglo ordenado.
     */
    public static double[] organizeBubbleMethod(double array[]) {
        /**
         * Variable auxiliar para almacenar valores.
         */
        double aux;
        /**
         * Bucle burbuja para ordenar el arreglo.
         */
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;

                }
            }
        }
        return array;

    }

    /**
     * Método para organizar el arreglo por el método quick sort.
     *
     * @param array Arreglo a ordenar.
     * @param first Primera posición del arreglo.
     * @param last Última posición del arreglo.
     * @return Arreglo ordenado.
     */
    public static double[] oirganizeQuickSortMethod(double array[], int first, int last) {
        /**
         * Variable para almacenar el valor que servirá como pivote.
         */
        double pivot = array[first];
        /**
         * Almacenar el index de la primera posición.
         */
        int i = first;
        /**
         * Almacenar el index de la última posición.
         */
        int j = last;
        /**
         * Variable auxiliar para almacenar valores del arreglo.
         */
        double aux;

        while (i < j) {                                                            
            while (array[i] <= pivot && i < j) {
                i++; 
            }
            while (array[j] > pivot) {
                j--;           
            }
            if (i < j) {                                             
                aux = array[i];                      
                array[i] = array[j];
                array[j] = aux;
            }
        }

        array[first] = array[j];                                         
        array[j] = pivot;      

        if (first < j - 1) {
            oirganizeQuickSortMethod(array, first, j - 1);          
        }
        if (j + 1 < last) {
            oirganizeQuickSortMethod(array, j + 1, last);          
        }

        return array;
    }

}
