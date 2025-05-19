package Unidad_dos;
public class ejercicio_11_arrays {
    public static void main(String[] args) {
        int[][] diagonal = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) { 
                    diagonal[i][j] = 1;
                } else {
                    diagonal[i][j] = 0;
                }
            }
        }
        System.out.println("Matriz diagonal:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(diagonal[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}