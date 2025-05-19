package Unidad_dos;

import java.util.Scanner;

public class ejercicio_2_arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contar = 1;
        String[] caracter = new String[5];
        for (int i = 0; i < caracter.length; i++) {
            System.out.println("Ingresa la palabra de la matriz N°" + contar);
            contar++;
            caracter[i]=scanner.nextLine();
        }
        System.out.println("Palabras en orden inverso:");
        for (int i = 0; i < caracter.length; i++) {
            String palabraInvertida = new StringBuilder(caracter[i]).reverse().toString();
            System.out.println("matriz[" + i + "] = " + palabraInvertida);
        }
        scanner.close();
    }
}