import java.util.Scanner;

public class ejercicioParcial_once {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el sueldo");
        int sueldo = scanner.nextInt();
        System.out.println("Ingrese años de antiguedad");
        int antiguedad = scanner.nextInt();
        if (sueldo<500 & antiguedad>=10) {
            System.out.println("aumento del 20%");
            double aumento = (sueldo*0.2)
            double total = (aumento + sueldo)
            System.out.println("Total recibido :" + total);
        }
        if (sueldo<500 & antiguedad<10) {
            System.out.println("aumento del 5%");
            double aumento = (sueldo*0.05)
            double total = (aumento + sueldo)
            System.out.println("Total recibido :" + total);
        }
        if (sueldo>=500) {
            System.out.println("el sueldo recibido es:" + sueldo);
        }
    }
}
