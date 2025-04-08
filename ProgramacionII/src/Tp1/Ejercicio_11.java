package Tp1;
import java.util.Scanner;

public class Ejercicio_11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su usuario: ");
        String usuario = scanner.next();

        String contrasenaPredefinida = "Test1234";
        int intentos = 3;


        // Error en el 3er intento. Incluso  estando correcta la contraseña rechaza el acceso
        for (int i = 0; i < intentos; i++) {
            System.out.print("Ingrese la contraseña de su usuario " + usuario + ": ");
            String contraseña = scanner.next();

            if (contraseña.equals(contrasenaPredefinida)) {
                System.out.println("La contraseña que ha ingresado es correcta. Bienvenido, " + usuario + "!");
                break;
            } else {
                System.out.println("Contraseña incorrecta. Intentos restantes: " + (intentos - i - 1 ));
            }
        }

        System.out.println("Ha excedido el número de intentos. Acceso denegado.");
        scanner.close();
    }

}
