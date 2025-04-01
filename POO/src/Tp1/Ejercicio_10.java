package Tp1;
import java.util.Scanner;

public class Ejercicio_10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de términos de Fibonacci: ");
        int N = scanner.nextInt();

        int a = 0, b = 1, temp;

        System.out.println("Serie de Fibonacci:");
        for (int i = 0; i < N; i++) {
            System.out.print(a + " ");
            temp = a + b;
            a = b;
            b = temp;
        }

        scanner.close();
    }

}
