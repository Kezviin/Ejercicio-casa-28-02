package Unidad_dos;

import java.util.Scanner;

public class ejercicio_4_arrays {
    public static void main(String[] args) {
        int[] numEnteros = new int[10];
        Scanner scanner = new Scanner(System.in);
        int contador = 1;
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el numero entero N°" + contador);
            contador++;
            numEnteros[i] =  scanner.nextInt();
            if (numEnteros[i]<0) {
                System.out.println("Se ingreso numero negativo, se finaliza el codigo");
                System.out.println(numEnteros[i]);
                break;
            }
            
        }
        System.out.println("------------------------------");
        for (int i = 0; i < 10; i++) {
            if (numEnteros[i]>0) {
                System.out.println(numEnteros[i]);
            }
        }
        
        scanner.close();
    }
}
