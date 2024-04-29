package Repetitivas;

import java.util.Scanner;

public class ejercicioMatriz4 {
    public static void main(String[] args) {
        
        System.out.println("Ingresa el numero del que quieres que se genere una tabla");
        Scanner sc = new Scanner(System.in);
        int numero=sc.nextInt();
        int Matriz[][]=new int[5][5];
        for (int f=0; f<5; f++){ 
            for (int c=0; c<5; c++){
                Matriz[f][c]=numero;
            }
        }
        for (int f=0; f<5; f++){ 
            for (int c=0; c<5; c++){
                System.out.print("|"+Matriz[f][c]+"|");
            }
            System.out.println("\n");
        }
    }
}
