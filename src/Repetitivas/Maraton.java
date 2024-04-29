package Repetitivas;

import java.util.Scanner;

public class Maraton {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la cedula");
        String cedulaParticipante=sc.nextLine();
        System.out.println("Ingrese el nombre");
        String nombeParticipante=sc.nextLine();
        
        
        System.out.println("Ingrese la edad");
        Scanner sc2 = new Scanner(System.in);
        int edadParticipante=sc2.nextInt();
        while (!cedulaParticipante.equals("0")|| !nombeParticipante.equals("fin")){
            if (edadParticipante>=6&&edadParticipante<=10) {
                System.out.println("La categoria es Menores A");
            } 
            else if (edadParticipante>=11&&edadParticipante<=17){
                System.out.println("La categoria es Menores B");
            }
            else if (edadParticipante>=18&&edadParticipante<=30){
                System.out.println("La categoria es Juveniles");
            }
            else if (edadParticipante>=31&&edadParticipante<=50){
                System.out.println("La categoria es Adultos");
            }
            else if (edadParticipante>50) {
                System.out.println("La categoria es Adultos mayores");
            }
            else {System.out.println("La persona no puede participar");}
        System.out.println("Ingresa la cedula");
        cedulaParticipante=sc.nextLine();
        System.out.println("Ingrese el nombre");
        nombeParticipante=sc.nextLine();
        System.out.println("Ingrese la edad");
        edadParticipante=sc2.nextInt();
        }
        
        
       }
}
