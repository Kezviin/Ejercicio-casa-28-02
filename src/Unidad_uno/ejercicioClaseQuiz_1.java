package Unidad_uno;

import java.util.Scanner;

public class ejercicioClaseQuiz_1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = scanner.nextInt();
        if (num<=0) {
            System.out.println("El numero ingresado no es valido");
            scanner.close();
            return;
        }
        for (int i = num; i >= 1; i--) {
            for (int espacio = 1; espacio < i; espacio++) {
                System.out.print("  ");
            }

            for (int j = i; j <= num; j++) {
                System.out.print(j + " ");
            }

            for (int j = num - 1; j >= i; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
        scanner.close();
        }
        
        
    }

