package Tp4;

import java.util.PriorityQueue;

public class Ejercicio_7 implements Ejercicio_1{

    static class Proceso implements Comparable<Proceso> {
        int id;
        String nombre;
        int prioridad;

        public Proceso(int id, String nombre, int prioridad) {
            this.id = id;
            this.nombre = nombre;
            this.prioridad = prioridad;
        }

        public int compareTo(Proceso otro) {
            return Integer.compare(otro.prioridad, this.prioridad);
        }

        public String toString() {
            return "Proceso " + id + ": " + nombre + " (Prioridad: " + prioridad + ")";
        }
    }

    static class Planificador {
        private final PriorityQueue<Proceso> cola = new PriorityQueue<>();

        public void cargarProceso(int id, String nombre, int prioridad) {
            cola.add(new Proceso(id, nombre, prioridad));
        }

        public void ejecutarProceso() {
            if (!cola.isEmpty()) System.out.println("Ejecutando: " + cola.poll());
            else System.out.println("Sin procesos.");
        }

        public void mostrarProcesos() {
            for (Proceso p : cola) System.out.println(p);
        }
    }

}
