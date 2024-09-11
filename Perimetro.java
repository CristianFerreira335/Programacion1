package Trabajo;
import java.util.Scanner;

public class Perimetro {

    public Double perimetroRec(){
        Scanner sc = new Scanner(System.in);


        double largo,ancho,resultado;

        System.out.println("Ingrese el largo de su rectangulo para calcular el area: ");
        largo=sc.nextDouble();

        System.out.println("Ingrese el ancho de su rectangulo para calcular el area: ");
        ancho=sc.nextDouble();

        resultado=(2*largo)+(2*ancho);


        return resultado;

        
    }
    
    
}
