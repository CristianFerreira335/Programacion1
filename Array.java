package Trabajo;
import java.util.Random;
import java.util.Scanner;

public class Array {

    public void exibirArray() {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        int tam;

        System.out.println("Ingrese la cantidad de datos que quiera que esten en el Array: ");
        tam = sc.nextInt();

        int[] array = new int[tam];

       
        for (int i = 0; i < tam; i++) {
            array[i] = ran.nextInt(1000); 
        }

       
        System.out.println("Contenido del array:");
        for (int i = 0; i < tam; i++) {
            System.out.println(array[i]);
        }
        
        sc.close();
    }

    public static void main(String[] args) {
        Array exibir = new Array();
        exibir.exibirArray();
    }
}
