package Unidad_dos;

import java.util.Scanner;

public class ejercicio_13_arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de conductores: ");
        int numConductores = scanner.nextInt();
        scanner.nextLine();
        String[] nombres = new String[numConductores];
        int[][] kms = new int[numConductores][7];
        int[] totalKms = new int[numConductores];
        for (int i = 0; i < numConductores; i++) {
            System.out.print("\nIngrese nombre del conductor " + (i+1) + ": ");
            nombres[i] = scanner.nextLine();
            System.out.println("Ingrese kilómetros recorridos cada día de la semana:");
            for (int j = 0; j < 7; j++) {
                System.out.print("Día " + (j+1) + ": ");
                kms[i][j] = scanner.nextInt();
                totalKms[i] += kms[i][j];
            }
            scanner.nextLine();
        }
        System.out.println("\nResumen de kilómetros por conductor:");
        for (int i = 0; i < numConductores; i++) {
            System.out.println("Conductor: " + nombres[i] + " - Total kms: " + totalKms[i]);
        }
        scanner.close();
    }
}