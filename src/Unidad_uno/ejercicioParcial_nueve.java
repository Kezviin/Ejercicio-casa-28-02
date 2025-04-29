package Unidad_uno;

import java.util.Scanner;

public class ejercicioParcial_nueve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa la primera nota del alumno");
        double notaUno = scanner.nextDouble();
        System.out.println("Ingresa la segunda nota del alumno");
        double notaDos = scanner.nextDouble();
        System.out.println("Ingresa la tercera nota del alumno");
        double notaTres = scanner.nextDouble();
        double promedio = (notaUno+notaDos+notaTres)/3;
        if (promedio>=7) {
            System.out.println("Promocionado");
        }
        if (promedio>=4 & promedio<7) {
            System.out.println("regular");
        }
        if (promedio<4) {
            System.out.println("reprobado");
        }
        scanner.close();
    }
}
