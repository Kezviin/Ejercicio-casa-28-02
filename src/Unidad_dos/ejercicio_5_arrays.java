package Unidad_dos;

import java.util.Random;
import java.util.Arrays;
import java.util.Collections;

public class ejercicio_5_arrays {
    public static void main(String[] args) {
        Integer[] matriz = new Integer[4];
        Random random = new Random();
        for (int i = 0; i < matriz.length; i++) {
            matriz[i] = random.nextInt(100); 
        }
        System.out.println("Matriz desordenada:");
        for (int num : matriz) {
            System.out.print(num + " ");
        }
        System.out.println();
        Arrays.sort(matriz, Collections.reverseOrder());
        System.out.println("Matriz ordenada de mayor a menor:");
        for (int num : matriz) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

