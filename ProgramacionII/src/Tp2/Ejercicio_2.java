package Tp2;
import java.util.Scanner;

public class Ejercicio_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de productos: ");
        int n = sc.nextInt();

        System.out.print("Ingrese la cantidad de depositos: ");
        int m = sc.nextInt();

        int[][] stock = new int[n][m];
        int[] stockTotalProducto = new int[n];
        int[] stockTotalDeposito = new int[m];

        // Cargar stock
        for (int i = 0; i < n; i++) {
            System.out.println("Producto " + (i + 1) + ":");
            for (int j = 0; j < m; j++) {
                System.out.print("  Cantidad en depósito " + (j + 1) + ": ");
                stock[i][j] = sc.nextInt();
                stockTotalProducto[i] += stock[i][j];
                stockTotalDeposito[j] += stock[i][j];
            }
        }

        // Mostrar stock total por producto
        System.out.println("\nStock total por producto:");
        for (int i = 0; i < n; i++) {
            System.out.println("Producto " + (i + 1) + ": " + stockTotalProducto[i]);
        }

        // Depósito con mayor cantidad acumulada
        int maxIndex = 0;
        for (int j = 1; j < m; j++) {
            if (stockTotalDeposito[j] > stockTotalDeposito[maxIndex]) {
                maxIndex = j;
            }
        }
        System.out.println("\nEl deposito con mayor stock acumulado es el Deposito " + (maxIndex + 1) +
                " con " + stockTotalDeposito[maxIndex] + " unidades.");

        sc.close();

    }

}
