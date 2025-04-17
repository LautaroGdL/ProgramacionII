package Tp3;

public class Ejercicio_2 {

    private int[] stack;
    private int size;

    public void PilaDesplazamiento(int capacity) {
        stack = new int[capacity];
        size = 0;
    }

    public void push(int value) {
        if (size == stack.length) throw new RuntimeException("Esta lleno");
        for (int i = size; i > 0; i--) {
            stack[i] = stack[i - 1];
        }
        stack[0] = value;
        size++;
    }

    public int pop() {
        if (isEmpty()) throw new RuntimeException("Esta vacio");
        int removed = stack[0];
        for (int i = 0; i < size - 1; i++) {
            stack[i] = stack[i + 1];
        }
        size--;
        return removed;
    }

    public boolean isEmpty() {
        return size == 0;
    }

}
