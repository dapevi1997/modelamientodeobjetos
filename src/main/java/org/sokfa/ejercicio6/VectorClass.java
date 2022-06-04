package org.sokfa.ejercicio6;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;

/**
 * Clase creada con el objetivo proveer métodos para manejar los vectores.
 *
 * @version 1.0.0 2022-06-03
 *
 * @author DANIEL PEREZ VITOLA - dapevi97@gmail.com
 *
 * @since 1.0.0
 *
 */
public class VectorClass {

    /**
     * Contructor vacío de la clase.
     */
    public VectorClass() {
    }

    /**
     * Método que permite leer un número ingresado por el usuario.
     *
     * @return Número ingresado.
     */
    public static double readNumber() {
        /**
         * Instancia de la clase Scanner para manejar las entradas del usuario.
         */
        Scanner in = new Scanner(System.in);
        /**
         * Variable para almacenar el número leído.
         */
        double number = 0;
        /**
         * Bandera para controlar el ciclo while.
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
                System.out.print("Ingrese un número: ");
                number = (double) in.nextDouble();
                flag = false;

            } catch (InputMismatchException e) {
                System.out.println("*********************Advertencia************************");
                System.out.println("¡Debe ingresar un número real (utilizar comas, NO puntos)!");
                System.out.println("*********************************************************");
                in.next();

            }
        } while (flag);

        return number;
    }

    /**
     * Método que permite verificar si el número se encuentra en el vector.
     *
     * @param vector Vector a analizar.
     * @param number Número a verificar
     * @return Booleano indicando si se encuentra o no en el arreglo.
     */
    public static boolean verifyNumber(Vector vector, double number) {
        /**
         * Variable para almacenar temporalmente la respuesta si existe o no el
         * número.
         */
        boolean exists = false;
        /**
         * Ciclo para determinar si el número se encuentra en el vector.
         */
        for (int i = 0; i < vector.size(); i++) {
            if ((double) vector.get(i) == number) {
                exists = true;
                break;
            } else {
                exists = false;
            }

        }

        return exists;
    }

}
