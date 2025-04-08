package Clases.Cola;

public abstract class Cola implements Colas {

    int[] datos;
    public int frente, fin, cantidad, capacidad;
    public Cola(int capacidad){

    }



    @Override
    public void Encolar(int elemento) {
        if (cantidad == capacidad){
            System.out.println("");
        }
    }

    @Override
    public void Desencolar() {
        int auxiliar;
        if (cantidad == 0){
            System.out.println("");
        }
        else {
            auxiliar = datos[frente];
            frente = (frente + 1) % capacidad;
            if (frente == fin){
                fin = -1;
                frente = 0;
            }
            cantidad--;
            System.out.println("");
        }
    }
}
