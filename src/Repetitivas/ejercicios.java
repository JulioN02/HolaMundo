package Repetitivas;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class ejercicios {
    public static void main(String[] args) {
        /*
        System.out.println("Ingrese un numero del 1 al 100");
        Scanner numero = new Scanner(System.in);
        int numeroIngresado=numero.nextInt();
        System.out.println("Estos son los numeros del 1 al "+numeroIngresado);
        int cont=0;

        for (cont=0; cont<=numeroIngresado;cont++){
            System.out.println("Numero "+cont);
        }

        while (cont <= numeroIngresado){
            System.out.println(cont);
            cont=cont+1;
        }
*/
        System.out.println("Adivina la palabra");
        Scanner palabra = new Scanner(System.in);
        String palabraIngresada=palabra.nextLine();
        String Salida="Salida";
        while (!palabraIngresada.equals(Salida)){
            System.out.println("La palabra es: "+palabraIngresada);
            System.out.println("Ingrese una palabra");
            palabraIngresada=palabra.next();
        }
        
    }
}
