package Tp4;

public class Ejercicio_2 implements Ejercicio_1 {

    static class Cliente {
        int turno;
        String nombre;

        public Cliente(int turno, String nombre) {
            this.turno = turno;
            this.nombre = nombre;
        }

        public String toString() {
            return "Turno: " + turno + ", Nombre: " + nombre;
        }
    }

    static class Farmacia {
        private ColaDinamica<Cliente> cola = new ColaDinamica<>();
        private int contadorTurno = 1;

        public void nuevoCliente(String nombre) {
            cola.enqueue(new Cliente(contadorTurno++, nombre));
        }

        public void atenderCliente() {
            if (!cola.isEmpty()) {
                Cliente c = cola.dequeue();
                System.out.println("Atendiendo a: " + c);
            } else System.out.println("No hay clientes.");
        }

        public void mostrarEspera() {
            cola.display();
        }
    }


}



