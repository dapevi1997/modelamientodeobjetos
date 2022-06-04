package org.sokfa.ejercicio6;

import java.util.Vector;

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
public class Ejercicio6 {

    public static void main(String[] args) {
        /**
         * Instancia de la clase Vector.
         */
        Vector vector = new Vector();
        /**
         * variable para almacenar el número ingresado por el usuario.
         */
        double number = 0;
        /**
         * Variable booleana para almacenar si el número ingresado se repite o
         * no.
         */
        boolean exists = false;

        System.out.println("*************************************************");
        System.out.println("Si repites un número pierdes");
        System.out.println("");
        /**
         * Ciclo para ingresar número y verficar si ya existían.
         */
        while (!exists) {
            number = VectorClass.readNumber();
            exists = VectorClass.verifyNumber(vector, number);
            if (exists) {
                System.out.println("----------------------------------------");
                System.out.println("El número ya existe");

                vector.add(number);
            } else {
                vector.add(number);
            }
        }
        System.out.println("----------------------------------------");
        System.out.println("Estos fueron los números ingresados: ");
        /**
         * Ciclo para mostrar en consola los números ingresados.
         */
        for (int i = 0; i < vector.size(); i++) {
            System.out.println(vector.get(i));
        }

    }
}
