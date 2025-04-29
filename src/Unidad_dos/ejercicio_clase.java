package Unidad_dos;

import java.util.Scanner;

public class ejercicio_clase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contNum = 0;
        int[] numeros = new int[3];
        for (int i = 0; i < numeros.length; i++) {
            contNum++;
            System.out.println("Ingrese el numero N°" + contNum);
            numeros[i] = scanner.nextInt();
            
        }
        
        System.out.println("El numero 1 es : " +  numeros[0] );
    }
}