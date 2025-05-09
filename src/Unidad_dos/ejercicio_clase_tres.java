package Unidad_dos;
class Persona {
    String nombre;
}
public class ejercicio_clase_tres {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.nombre = "juan";
        cambiarNombre(persona);
        System.out.println("El nombre de la persona es : " + persona.nombre);
    }
    public static void cambiarNombre(Persona persona){
        persona.nombre = "pedro";
        System.out.println("dentro de cambiar nombre : " + persona.nombre);
    }
}
