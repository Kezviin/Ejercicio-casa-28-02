import java.util.Scanner;

public class ejercicioParcial_quince {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("la tabla de multiplicar del 5 es :");
        for (int i = 1; i <=10; i++) {
            int multiplicación = (5*i);
            System.out.println("5 * " + i + " = " + multiplicación);
        }
    }
}
