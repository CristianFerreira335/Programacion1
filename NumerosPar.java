package Trabajo;
import java.util.Scanner;

public class NumerosPar {

    public void mostrarPares(){
        Scanner sc = new Scanner(System.in);
        
        
       
        int inicio=0;
        int fin;
        int cont=0;

        System.out.println("Ingrese el numero final de la secuecia a la que quiere llegar: ");
        fin=sc.nextInt();

        while (inicio != fin) {
            System.out.println("imprime los numero: " + inicio);

            inicio= inicio +2;

            cont=fin;
            cont++;


        }
        sc.close();

        }
        public static void main(String[] args) {
            NumerosPar pares = new NumerosPar();
        
            pares.mostrarPares();
        }


    }






    

