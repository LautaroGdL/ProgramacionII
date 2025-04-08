package Tp2;
import java.util.Scanner;


public class Ejercicio_3a {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] libros = {
                "Cien años de soledad", "Don Quijote", "El principito",
                "1984", "Crimen y castigo", "Orgullo y prejuicio",
                "Rayuela", "Ficciones", "La Odisea", "Hamlet"
        };

        System.out.print("Ingrese parte del título del libro a buscar: ");
        String busqueda = sc.nextLine().toLowerCase();

        boolean encontrado = false;
        for (int i = 0; i < libros.length; i++) {
            if (libros[i].toLowerCase().contains(busqueda)) {
                System.out.println("Coincidencia encontrada en la posición " + i + ": " + libros[i]);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró ningún libro con ese título.");
        }

        sc.close();
    }

}
