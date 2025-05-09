package Unidad_dos;

import java.util.Scanner;

public class ejercicio_clase {
    public static void main(String[] args) {
        int contador=0;
        int[] num = new int[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            contador++;
            System.out.println("Ingresa el numero N°" + contador);
            num[i] = scanner.nextInt();
        }
        
        int mayor = encontrarMayor(num[0], num[1],num[2]);
        System.out.println("El número mayor es: " + mayor);
        scanner.close();
    }

    public static int encontrarMayor(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}