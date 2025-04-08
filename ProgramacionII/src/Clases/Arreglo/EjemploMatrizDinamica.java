package arreglos;


import java.util.ArrayList;

public class EjemploMatrizDinamica {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matriz = new ArrayList<>();

        // Crear una matriz de 3 filas y columnas dinámicas
        for (int i = 0; i < 3; i++) {
            matriz.add(new ArrayList<>()); // Agregar una nueva fila
            for (int j = 0; j < 3; j++) {
                matriz.get(i).add(i + j); // Agregar valores a la fila
            }
        }

        // Imprimir la matriz
        for (ArrayList<Integer> fila : matriz) {
            System.out.println(fila);
        }
    }
}
