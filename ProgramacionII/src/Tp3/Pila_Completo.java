package Tp3;
import java.util.*;

public class Pila_Completo {

    // Ejercicio 1
    static class PilaAdicional {
        private int[] stack;
        private int top;

        public PilaAdicional(int size) {
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

    // Ejercicio 2
    static class PilaDesplazamiento {
        private int[] stack;
        private int size;

        public PilaDesplazamiento(int capacity) {
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
            if (isEmpty()) throw new RuntimeException("esta vacio");
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

    // Ejercicio 3
    static class PilaEnlazada {
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

    // Ejercicio 4
    public static boolean estaBalanceado(String expr) {
        Stack<Character> stack = new Stack<>();
        for (char ch : expr.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty()) return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    // Ejercicio 5
    public static String reverseString(String input) {
        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray()) stack.push(ch);
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) reversed.append(stack.pop());
        return reversed.toString();
    }

    // Ejercicio 6
    public static String InfijaPostfija(String expr) {
        Stack<Character> stack = new Stack<>();
        StringBuilder output = new StringBuilder();
        for (char ch : expr.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                output.append(ch);
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(')
                    output.append(stack.pop());
                stack.pop();
            } else {
                while (!stack.isEmpty() && precedencia(ch) <= precedencia(stack.peek()))
                    output.append(stack.pop());
                stack.push(ch);
            }
        }
        while (!stack.isEmpty()) output.append(stack.pop());
        return output.toString();
    }

    private static int precedencia(char op) {
        return switch (op) {
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            case '^' -> 3;
            default -> -1;
        };
    }

    // Ejercicio 7
    static class EditorTexto {
        Stack<String> undoStack = new Stack<>();
        Stack<String> redoStack = new Stack<>();
        String content = "";

        public void type(String text) {
            undoStack.push(content);
            content += text;
            redoStack.clear();
        }

        public void undo() {
            if (!undoStack.isEmpty()) {
                redoStack.push(content);
                content = undoStack.pop();
            }
        }

        public void redo() {
            if (!redoStack.isEmpty()) {
                undoStack.push(content);
                content = redoStack.pop();
            }
        }

        public String getContent() {
            return content;
        }
    }

    // Menú
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EditorTexto editor = new EditorTexto();

        while (true) {
            System.out.println("\n--- MENÚ PRINCIPAL ---");
            System.out.println("1. Pila con métodos adicionales");
            System.out.println("2. Pila con desplazamiento");
            System.out.println("3. Pila con listas enlazadas");
            System.out.println("4. Verificar paréntesis balanceados");
            System.out.println("5. Invertir cadena con pila");
            System.out.println("6. Convertir infija a postfija");
            System.out.println("7. Simulador Deshacer/Rehacer");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            int opc = sc.nextInt(); sc.nextLine();

            switch (opc) {
                case 1 -> {
                    PilaAdicional pila = new PilaAdicional(10);
                    pila.push(10);
                    pila.push(20);
                    pila.push(30);
                    System.out.println("Top: " + pila.peek());
                    System.out.println("Tamaño: " + pila.size());
                    pila.clear();
                    System.out.println("¿Vacía?: " + pila.isEmpty());
                }
                case 2 -> {
                    PilaDesplazamiento s = new PilaDesplazamiento(5);
                    s.push(1);
                    s.push(2);
                    s.push(3);
                    System.out.println("Pop: " + s.pop());
                }
                case 3 -> {
                    PilaEnlazada l = new PilaEnlazada();
                    l.push(5);
                    l.push(10);
                    l.push(15);
                    System.out.print("Contenido de la pila: ");
                    l.display();
                }
                case 4 -> {
                    System.out.print("Ingrese expresión: ");
                    String expr = sc.nextLine();
                    System.out.println("¿Balanceado?: " + estaBalanceado(expr));
                }
                case 5 -> {
                    System.out.print("Ingrese cadena: ");
                    String cadena = sc.nextLine();
                    System.out.println("Invertida: " + reverseString(cadena));
                }
                case 6 -> {
                    System.out.print("Ingrese expresión infija: ");
                    String infija = sc.nextLine();
                    System.out.println("Postfija: " + InfijaPostfija(infija));
                }
                case 7 -> {
                    System.out.println("Escriba texto (o comandos 'undo', 'redo', 'exit'):");
                    while (true) {
                        String entrada = sc.nextLine();
                        if (entrada.equals("exit")) break;
                        if (entrada.equals("undo")) editor.undo();
                        else if (entrada.equals("redo")) editor.redo();
                        else editor.type(entrada);
                        System.out.println("Texto actual: " + editor.getContent());
                    }
                }
                case 0 -> {
                    System.out.println("¡Hasta luego!");
                    return;
                }
                default -> System.out.println("Opción inválida");
            }
        }
    }

}
