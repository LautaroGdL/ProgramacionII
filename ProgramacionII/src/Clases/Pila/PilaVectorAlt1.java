package Clases.Pila;
import java.util.Stack;

public class PilaVectorAlt1 {

    Stack<Integer> pila = new Stack<Integer>();

    int MAX = 5;
    int tope = -1;

    public boolean estaVacia () {

        if (tope == -1)
            return true;
        else
            return false;
    };

    public boolean estaLleno () {

        if (tope == MAX)
            return true;
        else
            return false;
    };

    public void agregarElem(int elem){

        if (estaLleno()){
            System.out.printf("La lista esta llena.");
        }
        else{
            pila.push(elem);
        }
    };

    public void eliminarElem(){

        if (estaVacia()){
            System.out.printf("La lista esta vacia.");
        }
        else{
            pila.pop();
        }
    };

    /*public void eliminarElemPorPosicion(){

        if (estaVacia()){
            System.out.printf("La lista esta vacia.");
        }
        else{
            for (int i = 0; i < ; i++) {

            }
        }
    };*/

    public void mostrarElem() {
        for (int i = pila.size() - 1; i >= 0; i--) {
            System.out.println("El elemento " + i + " tiene como valor: " + pila.get(i));
        }
    };

}


