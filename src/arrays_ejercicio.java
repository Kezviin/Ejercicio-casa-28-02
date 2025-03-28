import java.util.Scanner;

public class arrays_ejercicio {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        int suma=0;
        int promedio=0;
        Scanner scanner = new Scanner(System.in);
        int j=0;
        for (int i = 0; i < numeros.length; i++) {
            j++;
            System.out.println("Ingrese el numero N°" + j);
            numeros[i] = scanner.nextInt();
            suma += numeros[i];
        }
        promedio = suma/j;
        scanner.close();
        System.out.println("La suma total de los numeros es: " + suma);
        System.out.println("el promedio de las sumas es: " + promedio);
    }
}
