package Tp4;

import java.util.PriorityQueue;

public class Ejercicio_6 implements Ejercicio_1{

    static class Paciente implements Comparable<Paciente> {
        String nombre;
        int prioridad;

        public Paciente(String nombre, int prioridad) {
            this.nombre = nombre;
            this.prioridad = prioridad;
        }

        public int compareTo(Paciente otro) {
            return Integer.compare(otro.prioridad, this.prioridad);
        }

        public String toString() {
            return nombre + " (prioridad: " + prioridad + ")";
        }
    }

    static class Triage {
        private final PriorityQueue<Paciente> cola = new PriorityQueue<>();

        public void ingresarPaciente(String nombre, int prioridad) {
            cola.add(new Paciente(nombre, prioridad));
        }

        public void atenderPaciente() {
            if (!cola.isEmpty()) System.out.println("Atendiendo: " + cola.poll());
            else System.out.println("Sin pacientes.");
        }

        public void mostrarEspera() {
            for (Paciente p : cola) System.out.println(p);
        }
    }

}
