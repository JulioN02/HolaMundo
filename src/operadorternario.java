import java.util.Scanner;
public class operadorternario {
    
    public static void main(String[] args) {
        int promedio;
        String condicionFinal;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el promedio general del alumno");
        promedio=teclado.nextInt();
        condicionFinal = promedio >=6 ? "Aprovado" : "Desaprovado";
        System.out.println("La condicion final del alumno es: "+condicionFinal);
    }
}
