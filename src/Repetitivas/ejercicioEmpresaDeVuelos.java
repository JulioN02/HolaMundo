package Repetitivas;

import java.util.Scanner;

public class ejercicioEmpresaDeVuelos {

    public static void main(String[] args) {

        int vuelos[][] = new int[2][3];
        Scanner sc = new Scanner(System.in);
        for (int f = 0; f < 2; f++) {
            System.out.println("----------------------------" + "DESTINO " + f + "----------------------------");
            for (int c = 0; c < 3; c++) {
                System.out.println("Ingrese la cantidad de ASIENTOS para el Destino: " + f + "  | " + " Horario: " + c);
                vuelos[f][c] = sc.nextInt();
            }
        }
        Scanner sc2 = new Scanner(System.in);
        String bandera = "";
        int destino = 0, horario = 0, asientos = 0;
        while (!bandera.equalsIgnoreCase("finish")) {
            System.out.println("---------INICIAR RESERVACION---------");
            System.out.println("Ingrese el numero del destino");
            destino = sc.nextInt();
            System.out.println("Ingrese el horario");
            horario = sc.nextInt();
            System.out.println("Ingrese el numero de asientos a reservar");
            asientos = sc.nextInt();
            if (destino >= 0 && destino <= 1) {
                if (horario >= 0 && horario <= 2) {

                    if (vuelos[destino][horario] >= asientos) {
                        System.out.println("|----------------------------------------|");
                        System.out.println("|   Su reserva fue realizada con exito   |");
                        System.out.println("|----------------------------------------|");
                        vuelos[destino][horario] = vuelos[destino][horario] - asientos;
                    } else {
                        System.out.println("No hay asientos disponibles");
                    }

                } else {
                    System.out.println(" | ¡Horario no existente! Ingrese entre 0 y 2 | ");
                }

            } else {
                System.out.println(" | ¡Destino no existente! Ingresa enrte 0 y 1 | ");
            }

            System.out.println("¿Desea continuar con otra reservacion?  Ingrese cualquier letra");
            System.out.println("Si no desea continuar ingrese: | FINISH |");
            bandera = sc2.nextLine();
        }
    }
}
