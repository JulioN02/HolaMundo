package Repetitivas;

import java.util.Scanner;

public class ejercicioMatriz {
    public static void main(String[] args) {
        /*
        int matriz[][]=new int[2][3];
        matriz[0][0]=10;
        matriz[0][1]=20;
        matriz[0][2]=30;
        matriz[1][0]=40;
        matriz[1][1]=50;
        matriz[1][2]=30;
        for (int fila=0; fila<2;fila++){
            for(int columna=0; columna<3; columna++){
                System.out.println("El valor en la fila: "+fila+" y en la columna: "+columna);
                System.out.println("Es de: "+matriz[fila][columna]);
            }
        }
        */
        int vector[] = new int[15];
        Scanner numero = new Scanner(System.in);
        System.out.println("Ingrese 15 numeros");
        for (int i=0; i<15; i++){
            vector[i]=numero.nextInt();
        } 
            int contador=0;
        for (int i=0; i<15; i++){
            if(vector[i]==3){
                contador=contador+1;
            }
        }
        System.out.println("El cantidad de numeros 3 ingresada es de: "+contador);      
}
}
