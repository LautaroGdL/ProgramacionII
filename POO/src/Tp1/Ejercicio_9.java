package Tp1;
import java.util.Scanner;

public class Ejercicio_9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo: ");
        int numero = scanner.nextInt();

        long factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }

        System.out.println(numero + "! = " + factorial);

        scanner.close();
    }

}
