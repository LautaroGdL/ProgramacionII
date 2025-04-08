package arreglos;

import java.util.ArrayList;
import java.util.Random;

public class Ejemplo1ArregloDinamico {
    public static void main(String[] args) {
        ArrayList<Integer> legajos = new ArrayList<>();
//        ArrayList<Integer> numeros = new ArrayList<>();
        Random random = new Random();
        int elLegajoDeAlumno;
        int cantidadElementos = random.nextInt(20);
        for (int i = 0; i < cantidadElementos; i++) {
            elLegajoDeAlumno = random.nextInt(10000,20000);
            legajos.add(elLegajoDeAlumno);
        }
        System.out.println("Se inscribieron a la materia: "+legajos.size()+" alumnos");
        for (int i = 0; i < legajos.size(); i++) {
            System.out.print(legajos.get(i)+" - ");

        }


    }
}
