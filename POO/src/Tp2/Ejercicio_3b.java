package Tp2;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_3b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> libros = new ArrayList<>();

        System.out.println("Ingrese los títulos de los libros (escriba 'fin' para terminar):");
        while (true) {
            String entrada = sc.nextLine();
            if (entrada.equalsIgnoreCase("fin")) break;
            libros.add(entrada);
        }

        System.out.print("Ingrese parte del título del libro a buscar: ");
        String busqueda = sc.nextLine().toLowerCase();

        boolean encontrado = false;
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).toLowerCase().contains(busqueda)) {
                System.out.println("Coincidencia en posición " + i + ": " + libros.get(i));
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró ningún libro con ese título.");
        }

        sc.close();
    }

}
