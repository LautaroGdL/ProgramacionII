package Tp3;

public class Ejercicio_3 {
    private static class Node {
        int data;
        Node next;
        Node(int val) { data = val; }
    }

    private Node top = null;

    public void push(int val) {
        Node newNode = new Node(val);
        newNode.next = top;
        top = newNode;
    }

    public int pop() {
        if (isEmpty()) throw new RuntimeException("Stack Empty");
        int val = top.data;
        top = top.next;
        return val;
    }

    public int peek() {
        if (isEmpty()) throw new RuntimeException("Stack Empty");
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void display() {
        Node current = top;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

}
