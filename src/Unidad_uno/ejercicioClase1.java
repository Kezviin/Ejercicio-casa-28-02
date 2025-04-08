import java.util.Scanner;

public class ejercicioClase1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int numUno = scanner.nextInt();
        System.out.println("Ingrese el segundo numero");
        int numDos = scanner.nextInt();
        System.out.println("Ingrese el tercer numero");
        int numTres = scanner.nextInt();
        if ((numUno>numDos)&&(numUno>numTres)) {
            System.out.println("El número mayor es: " + numUno);
        } else if ((numDos>numUno)&&(numDos>numTres)) {
            System.out.println("El número mayor es: " + numDos);
        } else {
            System.out.println("El número mayor es: " + numTres) ;
        }
    }
     
                
              

    

    
}
