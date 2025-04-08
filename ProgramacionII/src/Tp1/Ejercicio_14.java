package Tp1;
import java.util.Scanner;

public class Ejercicio_14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0, contador = 0;
        double promedio;

        while (true) {
            System.out.print("Ingrese una nota (-1 para finalizar): ");
            int nota = scanner.nextInt();

            if (nota == -1) break;

            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida. Debe estar entre 0 y 10.");
                continue;
            }

            suma += nota;
            contador++;
        }

        if (contador > 0) {
            promedio = (double) suma / contador;
            System.out.println("Promedio: " + promedio);
            System.out.println(promedio >= 6 ? "Aprobado" : "Reprobado");
        } else {
            System.out.println("No se ingresaron notas.");
        }

        scanner.close();
    }

}
