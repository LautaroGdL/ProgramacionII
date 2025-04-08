package arreglos;

import java.util.Arrays;
import java.util.Scanner;

public class Ejemplo1ArregloEstatico {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //definir el vector
        int[] calificaciones = new int[5];
        int suma = 0;
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.print("Nota "+(i+1)+": ");
            calificaciones[i] = sc.nextInt();
            suma+=calificaciones[i];
        }
        System.out.print("Notas ingresadas: ");
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.print(calificaciones[i]+" - ");
        }
        System.out.println();
        System.out.println("La nota promedio es: "+suma/calificaciones.length);

    }

}
