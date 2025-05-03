package Tp4;

public class Ejercicio_10 implements Ejercicio_1{

    static class Navegador {
        private final ColaEstatica<String> historial = new ColaEstatica<>(10);

        public void visitar(String url) {
            if (!historial.isFull()) historial.enqueue(url);
            else {
                historial.dequeue();
                historial.enqueue(url);
            }
        }

        public void mostrarHistorial() {
            historial.display();
        }
    }

}
