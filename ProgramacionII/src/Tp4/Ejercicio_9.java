package Tp4;

public class Ejercicio_9 implements Ejercicio_1{

    static class Restaurante {
        private final ColaEstatica<String> cola = new ColaEstatica<>(10);

        public void nuevoCliente(String nombre) {
            if (!cola.isFull()) cola.enqueue(nombre);
            else System.out.println("Lista de espera llena.");
        }

        public void asignarMesa() {
            if (!cola.isEmpty()) System.out.println("Asignando mesa a: " + cola.dequeue());
            else System.out.println("Sin clientes en espera.");
        }

        public void mostrarEspera() {
            cola.display();
        }
    }

}
