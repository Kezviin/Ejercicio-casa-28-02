package Unidad_uno;
import java.util.Scanner;

public class ejercicioParcial_ocho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de preguntas");
        int numPreguntas = scanner.nextInt();
        System.out.println("ingrese la cantidad de respuestas bien");
        int numRespuestas = scanner.nextInt();
        double total = (numRespuestas-numPreguntas)*0.1;
        double totalDef = (total)*100;
        if (totalDef>=90) {
            System.out.println("Nivel maximo");
        }
        if (totalDef>=75 & totalDef<90) {
            System.out.println("nivel intermedio");
        }
        if (totalDef>=50 & totalDef<75) {
            System.out.println("nivel regular");
        }
        if (totalDef<50) {
            System.out.println("fuera del nivel");
        }
        scanner.close();

    }
}
