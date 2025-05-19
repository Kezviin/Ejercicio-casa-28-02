package Unidad_dos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ejercicio_8_arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> nombres = new ArrayList<>();
        List<Integer> edades = new ArrayList<>();
        while (true) {
            System.out.print("Ingresa el nombre del alumno (o '*' para terminar): ");
            String nombre = scanner.nextLine();
            if (nombre.equals("*")) {
                break; 
            }
            System.out.print("Ingresa la edad de " + nombre + ": ");
            int edad = scanner.nextInt();
            scanner.nextLine();
            nombres.add(nombre);
            edades.add(edad);
        }
        System.out.println("\nAlumnos mayores de edad:");
        for (int i = 0; i < edades.size(); i++) {
            if (edades.get(i) >= 18) {
                System.out.println(nombres.get(i) + " - " + edades.get(i) + " años");
            }
        }
        int edadMaxima = 0;
        for (int edad : edades) {
            if (edad > edadMaxima) {
                edadMaxima = edad;
            }
        }
        System.out.println("\nAlumnos mayores (edad máxima: " + edadMaxima + " años):");
        for (int i = 0; i < edades.size(); i++) {
            if (edades.get(i) == edadMaxima) {
                System.out.println(nombres.get(i) + " - " + edades.get(i) + " años");
            }
        }
        scanner.close();
    }
}

