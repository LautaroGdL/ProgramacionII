package Tp3;

public class Ejercicio_4 {

    public static boolean isBalanced(String expr) {
        java.util.Stack<Character> stack = new java.util.Stack<>();
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

}
