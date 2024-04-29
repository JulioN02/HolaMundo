package Repetitivas;

import java.util.Scanner;

public class ejercicioTemperaturas {
    public static void main(String[] args) {
        String nombres[]=new String[3];
        int temperaturasMinimas[]=new int[3];
        int temperaturasMaximas[]=new int[3];
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        
        System.out.println("INGRESAR CIUDADES CON SU TEMPERATURA MINIMA Y MAXIMA");
        for (int i=0; i<nombres.length; i++){
            System.out.println("------------------------------------------------");
            System.out.println("Ingrese el nombre de la ciudad: "+i);
            nombres[i]=sc.nextLine(); 
            
            System.out.println("Ingrese la temperatura minima");
            temperaturasMinimas[i]=sc2.nextInt();
            
            System.out.println("Ingrese la temperaturas maxima");
            temperaturasMaximas[i]=sc2.nextInt();
        }
        double minima =99999.00;
        int posMin=-1;
        for (int i=0; i<nombres.length; i++){
            if (temperaturasMinimas[i]<minima){
                minima=temperaturasMinimas[i];
                posMin=i;
            }
        }
        double maxima=-999999.00;
        int posMax=-1;
        for (int i=0; i<nombres.length; i++){
            if (temperaturasMaximas[i]>maxima){
                maxima=temperaturasMaximas[i];
                posMax=i;
            }
        }
        System.out.println("------------------------------------------------");
        System.out.println("La temperatura minima registrada es de: "+minima);
        System.out.println("Se registro en la ciudad de: "+nombres[posMin]);
        System.out.println("------------------------------------------------");
        System.out.println("La temperatura maxima registrada es de: "+maxima);
        System.out.println("Se registro en la ciudad de: "+nombres[posMax]);
        System.out.println("------------------------------------------------");
   }
}
