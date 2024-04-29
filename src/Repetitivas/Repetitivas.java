package Repetitivas;

import java.net.ContentHandlerFactory;
import java.util.Scanner;

public class Repetitivas {
    public static void main(String[] args) {
        /*
        System.out.println("-------------------------------------");
        System.out.println("Ingresa el numero que quieres repetir");
        System.out.println("-------------------------------------");
        Scanner numero = new Scanner(System.in);
        int contador = numero.nextInt();
        while (contador <=100){
            System.out.println("Numero "+contador);
            contador++;
        }
        */
        
        for (int cont=0; cont<=10; cont++){
            System.out.println("Estoy en la vuelta: "+cont);
        }
    }
}
