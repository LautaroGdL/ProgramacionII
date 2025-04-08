package arreglos;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejemplo3TareasArregloDinamico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tareas = new ArrayList<>();
        int opcion;

        do {
            // Menú
            System.out.println("\n--- MENÚ DE TAREAS ---");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Mostrar tareas");
            System.out.println("3. Eliminar tarea");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la nueva tarea: ");
                    String nuevaTarea = scanner.nextLine();
                    tareas.add(nuevaTarea);
                    System.out.println("Tarea agregada con éxito.");
                    break;
                case 2:
                    System.out.println("\nLista de tareas:");
                    if (tareas.isEmpty()) {
                        System.out.println("No hay tareas registradas.");
                    } else {
                        for (int i = 0; i < tareas.size(); i++) {
                            System.out.println((i + 1) + ". " + tareas.get(i));
                        }
                    }
                    break;
                case 3:
                    if (tareas.isEmpty()) {
                        System.out.println("No hay tareas para eliminar.");
                    } else {
                        System.out.print("Ingrese el número de la tarea a eliminar: ");
                        int indice = scanner.nextInt();
                        if (indice > 0 && indice <= tareas.size()) {
                            tareas.remove(indice - 1);
                            System.out.println("Tarea eliminada con éxito.");
                        } else {
                            System.out.println("Número inválido.");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}

