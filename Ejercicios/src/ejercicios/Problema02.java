/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author reroes
 */
public class Problema02 {

    public static void main(String[] args) {
        double[][] datos1 = {{10, 2, 3}, {1, 5, 8}, {6, 2, 3}, {7, 8, 1}};
        double[][] datos2 = {{10, 2, 3}, {1, 5, 8}, {6, 2, 3}, {7, 8, 1}};
        double[][] datos3 = new double[4][3];

        for (int i = 0; i < datos1.length; i++) {
            for (int j = 0; j < datos1[i].length; j++) {
                // System.out.println(factorial(datos [i][j]));

                datos3[i][j] = obtenerSuma(datos1[i][j], datos2[i][j]);
            }

        }
        for (int i = 0; i < datos2.length; i++) {
            for (int j = 0; j < datos2[i].length; j++) {
                // System.out.println(factorial(datos [i][j]));

                System.out.printf("La suma de %.0f + %.0f: %.0f\n", 
                        datos1[i][j], 
                        datos2[i][j], 
                        datos3[i][j]);
            }
        }

    }

    public static double obtenerSuma(double numero, double numero2) {

        if (numero2 == 0) {

            return numero;
        } else {
            if (numero == 0) {
                return numero2;
            } else {

                return 1 + obtenerSuma(numero, numero2 - 1);

            }
        }

    }
}
