package Unidad_dos;

    class rectagulo{
        int ancho;
        int largo;

        public rectagulo(int ancho, int largo){
            this.ancho=ancho;
            this.largo=largo;
        }
    }
public class ejercicio_class_dos {
    public static void cambiarRectagulo(rectagulo r){
        r.ancho=14;
        r.largo=20;
        System.out.println("las nuevas medidas del rectangulo son: ancho " + r.ancho + " largo = " + r.largo);
    }
    public static void main(String[] args) {
        System.out.println("MEDIDAS");
        rectagulo miRectangulo = new rectagulo(10, 10);
        System.out.println("las medidas de mi rectangulo son: ancho = " + miRectangulo.ancho + " largo = " + miRectangulo.largo);
        cambiarRectagulo(miRectangulo);
        System.out.println("mi rectangulo " + miRectangulo.ancho + miRectangulo.largo);
    }
    
}