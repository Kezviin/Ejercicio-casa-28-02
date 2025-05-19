package Unidad_dos;

import java.util.Scanner;
public class ejercicio_6_arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nombresMeses = {
            "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };
        int[] diasMeses = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };
        System.out.print("Ingresa un número de mes (1-12): ");
        int mes = scanner.nextInt();
        if (mes < 1 || mes > 12) {
            System.out.println("Número de mes inválido. Debe ser entre 1 y 12.");
        } else {
            System.out.println("El mes de " + nombresMeses[mes - 1] + " tiene " + diasMeses[mes - 1] + " días.");
        }
        scanner.close();
    }
}