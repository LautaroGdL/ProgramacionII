package Tp4;

public class Ejercicio_5 implements Ejercicio_1{

    static class BancoRapido {
        private final ColaEstatica<String> cola = new ColaEstatica<>(5);

        public void nuevoCliente(String nombre) {
            if (!cola.isFull()) cola.enqueue(nombre);
            else System.out.println("Cola llena.");
        }

        public void atenderCliente() {
            if (!cola.isEmpty()) System.out.println("Atendiendo a: " + cola.dequeue());
            else System.out.println("Sin clientes.");
        }

        public void mostrarCola() {
            cola.display();
        }
    }

}
