package Unidad_uno;
import java.util.Scanner;

public class ejercicioParcial_dieciseis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el primer nombre");
        String nombreUno = scanner.nextLine();
        System.out.println("ingrese el segundo nombre");
        String nombreDos = scanner.nextLine();
        System.out.println(nombreUno.compareToIgnoreCase(nombreDos));
        scanner.close();
    }
}
