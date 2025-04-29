package Unidad_uno;

import java.util.Scanner;

public class ejercicioClase4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el numero para sacar factorial");
        int numUno = scanner.nextInt();
        int factorial = 1;
        int i = 1;
        while (i<=numUno) {
            factorial*=i;
            i++;
            
        }
        System.out.println("El factorial de: " + numUno + " Es : " + factorial);
        scanner.close();
    }
}
