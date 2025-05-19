package Unidad_dos;

import java.util.Scanner;

public class ejercicio_14_Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int NUM_ARTICULOS = 5;
        final int NUM_SUCURSALES = 4;
        double[] precios = new double[NUM_ARTICULOS];
        int[][] cantidades = new int[NUM_SUCURSALES][NUM_ARTICULOS];
        double[] recaudacionSucursal = new double[NUM_SUCURSALES];
        System.out.println("Ingrese los precios de los 5 artículos:");
        for (int i = 0; i < NUM_ARTICULOS; i++) {
            System.out.print("Precio artículo " + (i+1) + ": ");
            precios[i] = scanner.nextDouble();
        }
        for (int suc = 0; suc < NUM_SUCURSALES; suc++) {
            System.out.println("\nIngrese ventas para Sucursal " + (suc+1) + ":");
            for (int art = 0; art < NUM_ARTICULOS; art++) {
                System.out.print("Cantidad vendida del artículo " + (art+1) + ": ");
                cantidades[suc][art] = scanner.nextInt();
            }
        }
        int[] totalArticulos = new int[NUM_ARTICULOS];
        double recaudacionTotal = 0;
        
        for (int art = 0; art < NUM_ARTICULOS; art++) {
            for (int suc = 0; suc < NUM_SUCURSALES; suc++) {
                totalArticulos[art] += cantidades[suc][art];
                recaudacionSucursal[suc] += cantidades[suc][art] * precios[art];
            }
            recaudacionTotal += totalArticulos[art] * precios[art];
        }
        int sucursalMax = 0;
        double maxRecaudacion = recaudacionSucursal[0];
        for (int suc = 1; suc < NUM_SUCURSALES; suc++) {
            if (recaudacionSucursal[suc] > maxRecaudacion) {
                maxRecaudacion = recaudacionSucursal[suc];
                sucursalMax = suc;
            }
        }
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("\nCantidades totales por artículo:");
        for (int art = 0; art < NUM_ARTICULOS; art++) {
            System.out.println("Artículo " + (art+1) + ": " + totalArticulos[art]);
        }
        int totalSucursal2 = 0;
        for (int art = 0; art < NUM_ARTICULOS; art++) {
            totalSucursal2 += cantidades[1][art];
        }
        System.out.println("\nCantidad total de artículos en Sucursal 2: " + totalSucursal2);
        System.out.println("Cantidad del artículo 3 en Sucursal 1: " + cantidades[0][2]);
        System.out.println("\nRecaudación por sucursal:");
        for (int suc = 0; suc < NUM_SUCURSALES; suc++) {
            System.out.printf("Sucursal %d: $%.2f\n", (suc+1), recaudacionSucursal[suc]);
        }
        System.out.printf("\nRecaudación total de la empresa: $%.2f\n", recaudacionTotal);

        System.out.println("\nSucursal con mayor recaudación: Sucursal " + (sucursalMax+1) + 
                          " con $" + String.format("%.2f", maxRecaudacion));
        
        scanner.close();
    }
}
