package Unidad_uno;

import java.util.Scanner;

public class ejercicioParcial_cuatro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingresa el sueldo de la persona");
        int sueldo = scanner.nextInt();
        if (sueldo>3000) {
            System.out.println("debe abonar impuestos");
        } else {
            System.out.println("no debe abonar impuestos");
        }
        scanner.close();
    }
}
