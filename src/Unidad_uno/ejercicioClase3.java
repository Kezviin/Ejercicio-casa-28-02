import java.util.Scanner;

public class ejercicioClase3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int numUno = scanner.nextInt();
        System.out.println("Ingrese el segundo numero");
        int numDos = scanner.nextInt();
        System.out.println("Ingrese 1 para sumar, 2 para restar, 3 para multiplicar y (cualquier numero) para dividir");
        int numDefinitivo = scanner.nextInt();
        switch (numDefinitivo) {
            case 1:
                System.out.println("Se realiza suma");
                int suma = (numUno+numDos);
                System.out.println(suma);
                break;

                case 2:
                    System.out.println("se realiza una resta");
                    int resta = (numUno-numDos);
                    System.out.println(resta);
                break;
                case 3:
                    System.out.println("Se realiza multiplicacion");
                    int multiplicacion = (numUno*numDos);
                    System.out.println(multiplicacion);
                break;
        
            default:
                System.out.println("Se realiza divicion");
                int divicion = (numUno/numDos);
                System.out.println(divicion);
                break;
        }
    }
    
}
