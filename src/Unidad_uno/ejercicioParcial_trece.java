package Unidad_uno;
import java.util.Scanner;

public class ejercicioParcial_trece {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese la cantidad de empleados");
        int empleados = scanner.nextInt();
        int sueldo100 = 0;
        int sueldo300 = 0;
        int sueldo500 = 0;
        for (int i = 1; empleados<=i; i++) {
            System.out.println("Ingresa el sueldo del empleado " + i);
            int sueldo = scanner.nextInt();
            if (sueldo<=100) {
                sueldo100++;
            }
            if (sueldo>100 & sueldo<=300) {
                sueldo300++;
            }
            if (sueldo>300) {
                sueldo500++;
            }
        }
        System.out.println("la cantidad de empleados que cobran 100 son: " + sueldo100);
        System.out.println("la cantidad de empleados que cobran 300 son: " + sueldo300);
        System.out.println("la cantidad de empleados que cobran mas de 300 son: " + sueldo500);
        scanner.close();
    }
}
