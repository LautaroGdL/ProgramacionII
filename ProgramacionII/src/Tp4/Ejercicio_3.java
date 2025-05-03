package Tp4;

public class Ejercicio_3 implements Ejercicio_1{

    static class TareaImpresora {
        String nombre;
        int paginas;

        public TareaImpresora(String nombre, int paginas) {
            this.nombre = nombre;
            this.paginas = paginas;
        }

        public String toString() {
            return nombre + " (" + paginas + " páginas)";
        }
    }

    static class Impresora {
        private ColaDinamica<TareaImpresora> tareas = new ColaDinamica<>();
        private int totalPaginas = 0;

        public void agregarTarea(String nombre, int paginas) {
            tareas.enqueue(new TareaImpresora(nombre, paginas));
        }

        public void procesarTarea() {
            if (!tareas.isEmpty()) {
                TareaImpresora t = tareas.dequeue();
                totalPaginas += t.paginas;
                System.out.println("Imprimiendo: " + t);
            } else System.out.println("Sin tareas.");
        }

        public void mostrarTareas() {
            tareas.display();
        }

        public int getTotalPaginas() {
            return totalPaginas;
        }
    }

}
