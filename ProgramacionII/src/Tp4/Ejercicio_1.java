package Tp4;

public interface Ejercicio_1 {

    // Interfaz de Cola
    interface Cola<T> {
        void enqueue(T elemento);
        T dequeue();
        boolean isEmpty();
        boolean isFull();
        T peek();
        void display();
    }

    // Implementación estática de Cola
    class ColaEstatica<T> implements Cola<T> {
        private T[] elementos;
        private int frente, fin, tamaño;

        public ColaEstatica(int capacidad) {
            elementos = (T[]) new Object[capacidad];
            frente = 0;
            fin = -1;
            tamaño = 0;
        }

        public void enqueue(T elemento) {
            if (isFull()) throw new RuntimeException("Cola llena");
            fin = (fin + 1) % elementos.length;
            elementos[fin] = elemento;
            tamaño++;
        }

        public T dequeue() {
            if (isEmpty()) throw new RuntimeException("Cola vacía");
            T temp = elementos[frente];
            frente = (frente + 1) % elementos.length;
            tamaño--;
            return temp;
        }

        public boolean isEmpty() {
            return tamaño == 0;
        }

        public boolean isFull() {
            return tamaño == elementos.length;
        }

        public T peek() {
            if (isEmpty()) throw new RuntimeException("Cola vacía");
            return elementos[frente];
        }

        public void display() {
            if (isEmpty()) {
                System.out.println("Cola vacía");
                return;
            }
            for (int i = 0; i < tamaño; i++) {
                int index = (frente + i) % elementos.length;
                System.out.print(elementos[index] + " ");
            }
            System.out.println();
        }
    }

    // Implementación dinámica de Cola con listas enlazadas
    class Nodo<T> {
        T dato;
        Nodo<T> siguiente;

        Nodo(T dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    class ColaDinamica<T> implements Cola<T> {
        Nodo<T> frente, fin;

        public void enqueue(T elemento) {
            Nodo<T> nuevo = new Nodo<>(elemento);
            if (isEmpty()) {
                frente = fin = nuevo;
            } else {
                fin.siguiente = nuevo;
                fin = nuevo;
            }
        }

        public T dequeue() {
            if (isEmpty()) throw new RuntimeException("Cola vacía");
            T dato = frente.dato;
            frente = frente.siguiente;
            if (frente == null) fin = null;
            return dato;
        }

        public boolean isEmpty() {
            return frente == null;
        }

        public boolean isFull() {
            return false;
        }

        public T peek() {
            if (isEmpty()) throw new RuntimeException("Cola vacía");
            return frente.dato;
        }

        public void display() {
            Nodo<T> actual = frente;
            while (actual != null) {
                System.out.print(actual.dato + " ");
                actual = actual.siguiente;
            }
            System.out.println();
        }
    }

}
