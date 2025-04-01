package Tp1;
import java.util.Scanner;

public class Ejercicio_13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();
        int original = numero;
        int invertido = 0;

        while (numero > 0) {
            int digito = numero % 10;
            invertido = invertido * 10 + digito;
            numero /= 10;
        }

        if (original == invertido) {
            System.out.println("El número " + original + " es capicúa.");
        } else {
            System.out.println("El número " + original + " NO es capicúa.");
        }

        scanner.close();
    }

}
