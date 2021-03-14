/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import javax.swing.JOptionPane;



/**
 * @author JUAN MARIN AND NICOLAS SANCHEZ
 */
public class metodos {

    String[][] nombresGolosinas = {
        {"KitKat", "Chicles de fresa", "Lacasitos", "Palotes"},
        {"Kinder Bueno", "Bolsa variada Haribo", "Chetoos", "Twix"},
        {"Kinder Bueno", "M&M'S", "Papa Delta", "Chicles de menta"},
        {"Lacasitos", "Crunch", "Milkybar", "KitKat"}

    };

    double[][] precio = {
        {1000, 200, 500, 950},
        {1800, 100, 120, 100},
        {1750, 130, 120, 800},
        {1500, 110, 720, 350}

    };

    int cantidad[][] = {
        {5, 5, 5, 5},
        {5, 5, 5, 5},
        {5, 5, 5, 5},
        {5, 5, 5, 5}

    };
    
    public static void rellenarMatriz(int[][] matriz, int num) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = num;
            }
        }

    }

    public static String pedirCadena(String mensaje) {
        String cadena;
        cadena = JOptionPane.showInputDialog(null, mensaje);

        return cadena;

    }

    public static String pedirInteger(String mensaje) {
        String numero;
        numero = JOptionPane.showInputDialog(null, mensaje);
        Integer.parseInt(numero);

        return numero;

    }

    public static boolean validarPos(String[][] matriz, String pos) {

        if (pos.length() != 2) {
            return false;
        }

        if (!(esNumero(pos.substring(0, 1)) && esNumero(pos.substring(1, 2)))) {
            return false;
        }

        int fila = extraerNumero(pos, 0);
        int columna = extraerNumero(pos, 1);

        if (!((fila >= 0 && fila < matriz.length) && (columna >= 0 && columna < matriz[0].length))) {
            return false;
        }

        return true;

    }

    public static boolean esNumero(String num) {

        try {
            Integer.parseInt(num);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }

    }

    public static int extraerNumero(String numero, int pos) {

        int num = -1;
        if (esNumero(numero)) {
            num = Integer.parseInt(numero.substring(pos, pos + 1));
        }

        return num;

    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
