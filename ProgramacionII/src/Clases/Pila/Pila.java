package Clases.Pila;

public class Pila {

    public static void main(String[] args) {
        PilaVectorAlt1 pilaAlt1 = new PilaVectorAlt1();

        // Agrega elementos a la pila
        pilaAlt1.agregarElem(10);
        pilaAlt1.agregarElem(20);
        pilaAlt1.agregarElem(30);
        pilaAlt1.agregarElem(40);
        pilaAlt1.agregarElem(50);

        // Muestra los elementos
        pilaAlt1.mostrarElem();
    }


}
