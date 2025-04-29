package Unidad_dos;

import java.util.Scanner;

public class ejercicio_3_arrays {
    public static void main(String[] args) {
        int cantNotas = 5;
        int numNota=1;
        int contarNotas = 0;
        double sumNotas=0;
        double promedio=0;
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[5];
        for (int i = 0; i < cantNotas; i++) {
            System.out.println("Ingrese la Nota N°" + numNota);
            numNota++;
            notas[contarNotas] = scanner.nextDouble();
            sumNotas+=notas[contarNotas];
            contarNotas++;
        }
        promedio=sumNotas/5;
        System.out.println("Las notas ingresadas son:");
        for (int resultado = 0; resultado < cantNotas; resultado++) {
            System.out.println(notas[resultado]);
            
        }
        System.out.println("El promedio de las notas es: " + promedio);
        //me falta en esta parte como comparar todos los valores a la vez y decir cual es el mayor y cual es el menor
        scanner.close();
    }
}
