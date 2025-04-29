package Clases.Arboles;

public interface ArbolInterface {

    public void insertar(int dato);
    public boolean buscar(int dato);
    public void mostrarInOrden();
    public void mostrarPreOrden();
    public void mostrarPostOrden();
    public int contarNodos();
    public int altura();
    public boolean estaBlanceado();
    public <Nodo> boolean esHoja(Nodo nodo);
    public int contarHojas();
    public int mostrarHojas();
    public int mostarHermanos();

}
