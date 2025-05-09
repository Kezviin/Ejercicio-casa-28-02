package Unidad_dos;
class Persona {
    String nombre;
}

public class ejercicio_clase_cuatro {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.nombre = "Juan";
        cambiarPersona(persona);
        System.out.println("Después de cambiarPersona: " + persona.nombre);  
    }

    public static void cambiarPersona(Persona persona) {
        persona = new Persona();  
        persona.nombre = "Pedro";
        System.out.println("Dentro de cambiarPersona: " + persona.nombre);  
    }
}