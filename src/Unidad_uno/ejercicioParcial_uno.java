package Unidad_uno;
import java.util.Scanner;

public class ejercicioParcial_uno {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        int numUno = scanner.nextInt();
        System.out.println("Ingrese el segundo número");
        int numDos = scanner.nextInt();
        if (numUno>numDos) {
            System.out.println("la Suma de los 2 numeros es:");
            int sumNum = (numUno+numDos);
            System.out.println(sumNum);
            System.out.println("la resta de los 2 numeros es:");
            int resNum = (numUno-numDos);
            System.out.println(resNum);
        } else {
            System.out.println("la multiplicación de los 2 numeros es:");
            int multNum = (numUno*numDos);
            System.out.println(multNum);
            System.out.println("la divición de los 2 numeros es:");
            double divNum = (numUno/numDos);
            System.out.println(divNum);
        }
        scanner.close();
    }

}