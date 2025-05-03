package Tp4;

public class Ejercicio_8 implements Ejercicio_1{

    static class Producto {
        String nombre;
        double precio;

        public Producto(String nombre, double precio) {
            this.nombre = nombre;
            this.precio = precio;
        }

        public String toString() {
            return nombre + " ($" + precio + ")";
        }
    }

    static class Carrito {
        private final ColaDinamica<Producto> productos = new ColaDinamica<>();

        public void agregarProducto(String nombre, double precio) {
            productos.enqueue(new Producto(nombre, precio));
        }

        public void pagar() {
            double total = 0;
            while (!productos.isEmpty()) {
                Producto p = productos.dequeue();
                System.out.println("Producto: " + p);
                total += p.precio;
            }
            System.out.println("Total a pagar: $" + total);
        }
    }

}
