package Unidad_dos;
//Crea un método que reciba una cadena de texto y trate de modificarla. Observa que las cadenas en Java son inmutables y no pueden ser modificadas dentro del método.
public class ejercicio_class_5 {

    public static void modificarCadena(String texto) {
        texto = texto + " modificado";
        System.out.println("Dentro del método: " + texto);
    }

    public static void main(String[] args) {
        String textoOriginal = "Hola";
        System.out.println("Antes de modificar: " + textoOriginal);
        modificarCadena(textoOriginal);
        System.out.println("Después de modificar: " + textoOriginal);  // No cambia
    }
}
