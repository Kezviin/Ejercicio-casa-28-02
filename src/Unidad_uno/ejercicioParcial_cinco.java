import java.util.Scanner;

public class ejercicioParcial_cinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        int numUno = scanner.nextInt();
        System.out.println("ingrese el segundo número");
        int numDos = scanner.nextInt();
        if (numUno>numDos) {
            System.out.println("el numero mayor es:" + numUno);
        } else {
            System.out.println("el numero mayor es:" + numDos);
        }

    }
}
