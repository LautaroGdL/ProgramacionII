package Tp2;
import java.util.Scanner;

public class Ejercicio_1 {

    public static void main(String[] args) {
        final int NUM_ESTUDIANTES = 5;
        final int NUM_MATERIAS = 4;
        double[][] notas = new double[NUM_ESTUDIANTES][NUM_MATERIAS];
        double[] promedios = new double[NUM_ESTUDIANTES];

        Scanner scanner = new Scanner(System.in);

        // Cargar notas por alumno
        for (int i = 0; i < NUM_ESTUDIANTES; i++) {
            System.out.println("Ingrese las notas del alumno " + (i + 1) + ":");
            double suma = 0;
            for (int j = 0; j < NUM_MATERIAS; j++) {
                System.out.print("  Materia " + (j + 1) + ": ");
                notas[i][j] = scanner.nextDouble();
                suma += notas[i][j];
            }
            promedios[i] = suma / NUM_MATERIAS;
        }

        // Mostrar promedio por alumno
        System.out.println("\nPromedios por alumno:");
        for (int i = 0; i < NUM_ESTUDIANTES; i++) {
            System.out.printf("Alumno %d: %.2f%n", (i + 1), promedios[i]);
        }

        // Encontrar al alumno con el mayor promedio
        int indiceMayor = 0;
        for (int i = 1; i < NUM_ESTUDIANTES; i++) {
            if (promedios[i] > promedios[indiceMayor]) {
                indiceMayor = i;
            }
        }

        System.out.printf("\nEl alumno con el mayor promedio es el Alumno %d con %.2f%n",
                (indiceMayor + 1), promedios[indiceMayor]);

        scanner.close();
    }

}
