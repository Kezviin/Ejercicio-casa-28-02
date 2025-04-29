package Unidad_uno;
import java.util.Scanner;

public class Quiz2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int num = scanner.nextInt();
        boolean esPerfecto = false;
        if (num>1) {
            int sumDivisores = 1;
            for (int i = 2; i <= Math.sqrt(num);i++) {
                if (num % i ==0) {
                    sumDivisores+=1;
                    System.out.println("el numero es " + num + " con un total de divisores de: " + sumDivisores);
                    if (i !=num/i) {
                        sumDivisores += num/i;
                        
                    }
                }
                

                
            }
            esPerfecto = (sumDivisores==num);
            System.out.println(esPerfecto);
            
        }
        scanner.close();
    }
}