/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import org.apache.commons.lang3.math.NumberUtils;

/**
 *
 * @author UTPL
 */
public class Problema05 {

    public static void main(String args[]) {
        String[] dataInicial = {"100", "90", "1n", "10", "H1", "H2"};
        int[] dataFinal = {100, 90, 0, 10, 0, 0};
        for (int i = 0; i < dataInicial.length; i++) {
            dataFinal[i] = NumberUtils.toInt(dataInicial[i]);
        }
        for (int i = 0; i < dataInicial.length; i++) {
            System.out.println(dataFinal[i]);
        }
    }
}
