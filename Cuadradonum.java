package Trabajo;
import java.util.Scanner;

public class Cuadradonum {
    
    public void numeroCuadrado(){
        Scanner sc= new Scanner(System.in);

        int num,cuadrado;

        System.out.println("Ingrese el numero que quiera saber su cuadrado: ");
        num=sc.nextInt();

        cuadrado= (num*num);


        System.out.println("El resultado es: " + cuadrado);




    }

    public static void main(String[] args) {
        
        Cuadradonum numcuad= new Cuadradonum();
        numcuad.numeroCuadrado();

    }
}
