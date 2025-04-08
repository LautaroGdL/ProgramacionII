package Tp1;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio_7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secreto = random.nextInt(100) + 1;
        int intento;

        System.out.println("Adivina el número secreto (entre 1 y 100):");

        do {
            System.out.print("Ingresa tu número: ");
            intento = scanner.nextInt();

            if (intento < secreto) {
                System.out.println("El número es mayor.");
            } else if (intento > secreto) {
                System.out.println("El número es menor.");
            } else {
                System.out.println("¡Felicidades! Has adivinado el número.");
            }
        } while (intento != secreto);

        scanner.close();
    }

}
