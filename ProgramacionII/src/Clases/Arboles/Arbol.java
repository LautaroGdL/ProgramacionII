package Clases.Arboles;

import java.util.Scanner;

public abstract class Arbol implements ArbolInterface {

    class Nodo{
        int dato;
        Nodo izq, der;
    }

    Nodo raiz;

    public Arbol() {
        raiz=null;
    }

    Scanner scanner = new Scanner(System.in);

    @Override
    public void insertar (int dato)
    {

        Nodo nodo;
        nodo = new Nodo ();
        nodo.dato = dato;
        nodo.izq = null;
        nodo.der = null;
        if (raiz == null)
            raiz = nodo;
        else
        {
            Nodo anterior = null, reco;
            reco = raiz;
            while (reco != null)
            {
                anterior = reco;
                if (dato < reco.dato)
                    reco = reco.izq;
                else
                    reco = reco.der;
            }
            if (dato < anterior.dato)
                anterior.izq = nodo;
            else
                anterior.der = nodo;
        }
    }

    private void mostrarPreOrden (Nodo nodo)
    {
        if (nodo != null)
        {
            System.out.print(nodo.dato + " ");
            mostrarPreOrden (nodo.izq);
            mostrarPreOrden (nodo.der);
        }
    }

    public void mostrarPreOrden()
    {
        this.mostrarPreOrden(raiz);
        System.out.println();
    }

    private void mostrarInOrden(Nodo nodo)
    {
        if (nodo != null)
        {
            mostrarInOrden(nodo.izq);
            System.out.print(nodo.dato + " ");
            mostrarInOrden(nodo.der);
        }
    }

    public void mostrarInOrden()
    {
        mostrarInOrden(raiz);
        System.out.println();
    }


    private void mostrarProOrden(Nodo nodo)
    {
        if (nodo != null)
        {
            mostrarProOrden(nodo.izq);
            mostrarProOrden(nodo.der);
            System.out.print(nodo.dato + " ");
        }
    }


    public void mostrarProOrden()
    {
        mostrarProOrden(raiz);
        System.out.println();
    }



}
