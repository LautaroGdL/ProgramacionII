package Tp3;

public class Ejercicio_6 {

    public static String InfijaPostfija(String expr) {
        java.util.Stack<Character> stack = new java.util.Stack<>();
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

}
