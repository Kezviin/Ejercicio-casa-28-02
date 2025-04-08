import java.util.Scanner;

public class ejercicioParcial_tres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número postivo de 1 o 2 digitos");
        int numUno = scanner.nextInt();
        if (numUno<=9) {
            System.out.println("El número tiene 1 digito");
        } else {
            System.out.println("El número tiene 2 digitos");
        }
    }
}
