package Repetitivas;

import java.util.Scanner;

public class ejercicio3matrices {
    public static void main(String[] args) {
        System.out.println("Ingresa los nombres a guardar");
        String Vector[]=new String[8];
        Scanner Nombres = new Scanner(System.in);
        for (int i=0; i<8; i++){
            Vector[i]=Nombres.nextLine();
        }
        System.out.println("Estos son los nombres guardados en orden");
        for (int i=0; i<8; i++){
            System.out.println("Puesto: "+i+"  | "+" Nombre: "+Vector[i]);
        }
        System.out.println("Nombres guardados correcto");
    }
 
}
