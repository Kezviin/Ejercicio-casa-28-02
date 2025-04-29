package Unidad_uno;

import java.util.Scanner;

public class ejercicioClase5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();
        System.out.println("LA TABLA DE MULTIPLICAR DEL NUMERO " + numero + " Es:");

        for (int i = 1; i <= 10; i++) {
            
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        scanner.close();
    }
}
