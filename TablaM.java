package Trabajo;
import java.util.Scanner;

public class TablaM {

    public void tablaMultiplicar(){
        Scanner sc = new Scanner(System.in);


        int inicio;
        
        System.out.println("Ingrese un valor: ");
        inicio =sc.nextInt();

        System.out.println("La tabla de multiplicar de " + inicio + "es: ");

        for (int n = 0; n <= 9; n++) {
            System.out.println(inicio + " x " + n + " = " + (inicio * n));



       }
       sc.close();
    }
    
}
