package Unidad_dos;
import java.util.Scanner;
public class prueba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeros = 1;
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese un numero N°" + numeros);
            try {
                int numero = scanner.nextInt();
                // Aquí puedes agregar la lógica que deseas realizar con el número
                System.out.println("El número ingresado es: " + numero);
                break; // Sale del bucle si se ingresa un número válido
            } catch (Exception e) {
                System.out.println("Error: has ingresado un valor no correcto. Por favor, ingresa un número entero.");
                scanner.next(); // Limpiar el buffer del scanner
            }
            numeros++;
        }
        
        scanner.close(); // Cierra el scanner para liberar recursos
    }
}