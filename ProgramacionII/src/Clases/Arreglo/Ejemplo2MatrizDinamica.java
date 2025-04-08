package arreglos;

import java.util.ArrayList;
import java.util.Random;

public class Ejemplo2MatrizDinamica {
    public static void main(String[] args) {
        Random random = new Random();
        int tope = random.nextInt(30);
        int fila = random.nextInt(1,tope);
        int columna = random.nextInt(1,tope);
        int numero = 1;
        ArrayList<ArrayList<Integer>> matriz = new ArrayList<>();
        //Agregar valor a la matriz

        for (int l = 0; l < fila; l++) {
            matriz.add(new ArrayList<>());
            for (int j = 0; j < columna; j++) {
                matriz.get(l).add((int) Math.pow(numero,2));
                ++numero;
            }
        }
        //mostrar
       //Recorrido con for tradicional
        System.out.println(("Matriz con "+fila+" filas y "+columna+" columnas"));
        for (int l = 0; l < fila; l++) {
//            matriz.add(new ArrayList<>());
            for (int j = 0; j < columna; j++) {
                System.out.printf("%10d",matriz.get(l).get(j));
            }
            System.out.println();
        }
        //Alternativa 2 con for-each
        System.out.println("UTILIZANDO FOR-EACH");
        for (ArrayList<Integer> laFila : matriz ){
            System.out.println(laFila);
        }
        //Alternativa 3
        System.out.println("Otra alernativa con doble for-each");
        for (ArrayList<Integer> laFila : matriz ){
            for (int valor : laFila){
                System.out.printf("%8d",valor);
            }
            System.out.println();

        }


    }
}
