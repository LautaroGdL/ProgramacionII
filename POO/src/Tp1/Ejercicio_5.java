package Tp1;
import java.util.Scanner;

public class Ejercicio_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo n: ");
        int n = scanner.nextInt();

        int sumaPar = 0, sumaImpar = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sumaPar += i;
            } else {
                sumaImpar += i;
            }
        }

        System.out.println("Suma de pares: " + sumaPar);
        System.out.println("Suma de impares: " + sumaImpar);

        scanner.close();
    }

}
