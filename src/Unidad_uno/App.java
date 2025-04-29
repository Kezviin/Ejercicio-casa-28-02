package Unidad_uno;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio para la casa 28/02");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int numerouno = scanner.nextInt();
        System.out.println("Ingrese el segundo numero");
        int numerodos = scanner.nextInt();
        System.out.println("Ingrese el tercer numero");
        int numerotres = scanner.nextInt();
        System.out.println("El numero " + numerouno + " Es mayor que el numero: " + numerodos + " Y menor que el numero " + numerotres + " ?");
        boolean condicion = (numerouno>numerodos) && (numerouno<numerotres);
        System.out.println(condicion);
        scanner.close();
       
        
    }
}
