package Tp2;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Ingrese el tamaño N de las matrices: ");
        int n = sc.nextInt();

        int[][] A = new int[n][n];
        int[][] B = new int[n][n];
        int[][] suma = new int[n][n];
        int[][] resta = new int[n][n];

        // Generar matrices A y B con valores aleatorios
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = rand.nextInt(10) + 1;
                B[i][j] = rand.nextInt(10) + 1;
                suma[i][j] = A[i][j] + B[i][j];
                resta[i][j] = A[i][j] - B[i][j];
            }
        }

        // Mostrar matrices
        System.out.println("\nMatriz A:");
        imprimirMatriz(A);

        System.out.println("\nMatriz B:");
        imprimirMatriz(B);

        System.out.println("\nSuma A + B:");
        imprimirMatriz(suma);

        System.out.println("\nResta A - B:");
        imprimirMatriz(resta);

        sc.close();
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int val : fila) {
                System.out.printf("%4d", val);
            }
            System.out.println();
        }
    }
}
