package Unidad_dos;

public class Ejercicio_class_3 {

    public static void cambiarMatriz(int[] array){
        for (int i = 0; i < 3; i++) {
            array[i] *=2;
        }
        System.out.println("Matriz modificada : " + java.util.Arrays.toString(array));
    }
    public static void main(String[] args) {
        System.out.println("RESULTADOS");
        int[] matriz = {1,2,3};
        System.out.println("Matriz actual = "+ java.util.Arrays.toString(matriz));
        cambiarMatriz(matriz);
    }
}
