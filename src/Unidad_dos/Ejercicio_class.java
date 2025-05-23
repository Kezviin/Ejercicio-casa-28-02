package Unidad_dos;

public class Ejercicio_class {


    public static void intercambiar(int a , int b){
        int tempA = a;
        a=b;
        b=tempA;
        System.out.println("Despues de llamar al metodo A = " + a + " y B = " + b);
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 25;
        System.out.println("Antes de llamar al metodo A = " + a + " y B = " + b);
        intercambiar(a, b);
        System.out.println("Antes de llamar al metodo A = " + a + " y B = " + b);
    }
}