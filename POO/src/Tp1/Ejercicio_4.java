package Tp1;
import java.util.Scanner;

public class Ejercicio_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo: ");
        int numero = scanner.nextInt();

        int digitos = 0;
        int temp = numero;

        do {
            temp /= 10;
            digitos++;
        } while (temp > 0);

        System.out.println("El número tiene " + digitos + " dígitos.");

        scanner.close();
    }

}
