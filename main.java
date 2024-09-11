package Trabajo;


public class main {
    public static void main(String[] args) {

        //Convertir a Mayusculas utilizando toUpperCase yeah
        Quince pal= new Quince();
        String mayus = pal.convertirMayus();
        System.out.println("La palabra en mayuscula: "+ mayus.toUpperCase());

        //Perimetro de Rectangulo

        Perimetro per = new Perimetro();
        double total= per.perimetroRec();
        System.out.println("El area total del rectangulo es: "+ total);

        //Mensaje de bienvenida
        Mensaje mensaje = new Mensaje();
        mensaje.imprimirBienvenida();

        //Tabla de Multiplicacion
        TablaM imprimir = new TablaM();
        imprimir.tablaMultiplicar();

        //Imprimir numeros del 1 al 10
        Secuencia sec = new Secuencia();
        sec.imprimirSec();
    

    }            
      
        
}

    

