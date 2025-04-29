package Unidad_uno;
import java.util.Scanner;

public class ejercicioParcial_seis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int numUno = scanner.nextInt();
        if (numUno>0) {
            System.out.println("El número es positivo");
        }
        if (numUno<0) {
            System.out.println("el número es negativo");
        }
        if (numUno==0) {
            System.out.println("el número es nulo");
        }
        scanner.close();
    }
}
