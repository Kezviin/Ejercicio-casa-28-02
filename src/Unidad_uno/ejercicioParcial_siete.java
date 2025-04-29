package Unidad_uno;
import java.util.Scanner;

public class ejercicioParcial_siete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese un número de 3 cifras");
        int numUno = scanner.nextInt();
        if (numUno<=9) {
            System.out.println("el número es de una cifra");
        }
        if (numUno>9 & numUno<100) {
            System.out.println("el número es de 2 cifras");
        }
        if (numUno>=100 & numUno<1000) {
            System.out.println("El número es de 3 cifras");
        }
        if (numUno>1000) {
            System.out.println("ERROR EL NUMERO DE CIFRAS ES MAYOR");
        }
        scanner.close();
    }
}
