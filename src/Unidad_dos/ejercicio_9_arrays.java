package Unidad_dos;

import java.util.Scanner;
import java.util.ArrayList;

public class ejercicio_9_arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int NUM_DIAS = 5;
        double[] tempMin = new double[NUM_DIAS];
        double[] tempMax = new double[NUM_DIAS];
        for (int i = 0; i < NUM_DIAS; i++) {
            System.out.println("Día " + (i + 1) + ":");
            System.out.print("  Temperatura mínima: ");
            tempMin[i] = scanner.nextDouble();
            System.out.print("  Temperatura máxima: ");
            tempMax[i] = scanner.nextDouble();
        }
        System.out.println("\nTemperatura media de cada día:");
        double[] tempMedia = new double[NUM_DIAS];
        for (int i = 0; i < NUM_DIAS; i++) {
            tempMedia[i] = (tempMin[i] + tempMax[i]) / 2;
            System.out.printf("Día %d: %.2f\n", i + 1, tempMedia[i]);
        }
        double minimaGlobal = tempMin[0];
        for (int i = 1; i < NUM_DIAS; i++) {
            if (tempMin[i] < minimaGlobal) {
                minimaGlobal = tempMin[i];
            }
        }
        System.out.println("\nDías con la temperatura mínima más baja (" + minimaGlobal + "):");
        for (int i = 0; i < NUM_DIAS; i++) {
            if (tempMin[i] == minimaGlobal) {
                System.out.println("Día " + (i + 1));
            }
        }
        System.out.print("\nIngresa una temperatura para buscar días con temperatura máxima igual: ");
        double tempBuscada = scanner.nextDouble();
        ArrayList<Integer> diasCoincidentes = new ArrayList<>();
        for (int i = 0; i < NUM_DIAS; i++) {
            if (tempMax[i] == tempBuscada) {
                diasCoincidentes.add(i + 1);
            }
        }
        if (diasCoincidentes.isEmpty()) {
            System.out.println("No hay días con temperatura máxima igual a " + tempBuscada);
        } else {
            System.out.println("Días con temperatura máxima igual a " + tempBuscada + ":");
            for (int dia : diasCoincidentes) {
                System.out.println("Día " + dia);
            }
        }
        scanner.close();
    }
}
