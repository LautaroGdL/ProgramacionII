package arreglos;

import java.util.ArrayList;

public class Ejemplo2MatrizEstatica {
    public static void main(String[] args) {
        int fila = 3;
        int columna = 3;
        int[][] matriz = new int[fila][columna];
        var numero = 1;
        //rellenar la matriz
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                matriz[i][j] = (int) Math.pow(numero,2);
                ++numero;
            }
        }
        //Mostrar la matriz
        System.out.println("La matriz cuadrada es: ");

        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.printf("%5d",matriz[i][j]);

            }
            System.out.println();
        }
    }
}
