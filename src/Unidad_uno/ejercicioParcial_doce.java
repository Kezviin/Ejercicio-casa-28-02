import java.util.Scanner;

public class ejercicioParcial_doce {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int notasMayores = 0;
        int notasMenores = 0;
        for (int i = 0; i<=10; i++) {
            System.out.println("ingrese la nota del alumno" + i);
            int nota = scanner.nextInt();
            if (notas>=7) {
                notasMayores++;
            } else {
                notasMenores++;
            }
        }
        System.out.println("La cantidad de estudiantes con mayor a 7 son :" + notasMayores);
        System.out.println("la cantidad de estudiantes con menores a 7 son :" + notasMenores);
    }
}
