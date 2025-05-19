package Unidad_dos;

import java.util.Scanner;

public class ejercicio_15_Arrays {
    public static void main(String[] args) {
        final int NUM_PARTIDOS = 15;
        Scanner scanner = new Scanner(System.in);
        String[][] equipos = new String[NUM_PARTIDOS][2];
        int[][] resultados = new int[NUM_PARTIDOS][2];
        System.out.println("INGRESO DE DATOS DE LA QUINIELA");
        System.out.println("--------------------------------");
        for (int i = 0; i < NUM_PARTIDOS; i++) {
            System.out.println("\nPartido " + (i + 1) + ":");
            System.out.print("Nombre del equipo local: ");
            equipos[i][0] = scanner.nextLine();
            System.out.print("Nombre del equipo visitante: ");
            equipos[i][1] = scanner.nextLine();
            System.out.print("Goles del equipo local: ");
            resultados[i][0] = scanner.nextInt();
            System.out.print("Goles del equipo visitante: ");
            resultados[i][1] = scanner.nextInt();
            scanner.nextLine();
        }
        System.out.println("\nRESULTADOS Y QUINIELA");
        System.out.println("---------------------");
        
        for (int i = 0; i < NUM_PARTIDOS; i++) {
            System.out.printf("\nPartido %2d: %-20s vs %-20s | Resultado: %d-%d | ",
                            i + 1, equipos[i][0], equipos[i][1], 
                            resultados[i][0], resultados[i][1]);
            if (resultados[i][0] > resultados[i][1]) {
                System.out.print("1 (Victoria local)");
            } else if (resultados[i][0] == resultados[i][1]) {
                System.out.print("X (Empate)");
            } else {
                System.out.print("2 (Victoria visitante)");
            }
        }
        scanner.close();
    }
}
