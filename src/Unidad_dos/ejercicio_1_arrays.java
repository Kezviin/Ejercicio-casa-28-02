package Unidad_dos;

import java.util.Random;
public class ejercicio_1_arrays {
    public static void main(String[] args) {
        int[] vector_numeros = new int[10];
        Random random = new Random();
        for (int i = 0; i < vector_numeros.length; i++) {
            vector_numeros[i] = random.nextInt(10) + 1; 
        }
        System.out.println("Número\tCuadrado\tCubo");
        for (int numero : vector_numeros) {
            int cuadrado = numero * numero;
            int cubo = numero * numero * numero;
            System.out.printf("%d\t%d\t\t%d%n", numero, cuadrado, cubo);
        }
    }
}
