package Tp3;

public class Ejercicio_1 {

    private int[] stack;
    private int top;

    public void PilaAdicional(int size) {
        stack = new int[size];
        top = -1;
    }

    public void push(int value) {
        if (isFull()) throw new RuntimeException("Desbordamiento de pila.");
        stack[++top] = value;
    }

    public int pop() {
        if (isEmpty()) throw new RuntimeException("No se puede eliminar elemento, la pila se encuentra vacia.");
        return stack[top--];
    }

    public int peek() {
        if (isEmpty()) throw new RuntimeException("La pila se encuentra vacía.");
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == stack.length - 1;
    }

    public int size() {
        return top + 1;
    }

    public void clear() {
        top = -1;
    }

}
