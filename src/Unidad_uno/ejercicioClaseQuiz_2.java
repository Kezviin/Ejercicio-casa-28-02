import java.util.Scanner;

public class ejercicioClaseQuiz_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese un numero para saber si es un numero perfecto");
        int num = scanner.nextInt();
        int LIMITE = 0;
        int LIMITE_TOTAL= 0;
        int CONTAR_NUMEROS = 0;
        while (LIMITE_TOTAL < num) {
            LIMITE_TOTAL++;
            if (num % LIMITE_TOTAL == 0) {
                CONTAR_NUMEROS += LIMITE_TOTAL; // Sumar el divisor
            }
        }
        CONTAR_NUMEROS = CONTAR_NUMEROS - num;
        if (CONTAR_NUMEROS==num) {
            System.out.println("el numero es perfecto");
        } else {
            System.out.println("el numero no es perfecto");
            
        }
        scanner.close();

        
        
        

    }
}