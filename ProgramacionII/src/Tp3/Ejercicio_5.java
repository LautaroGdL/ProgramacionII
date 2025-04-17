package Tp3;

public class Ejercicio_5 {

    public static String reverseString(String input) {
        java.util.Stack<Character> stack = new java.util.Stack<>();
        for (char ch : input.toCharArray()) stack.push(ch);

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) reversed.append(stack.pop());
        return reversed.toString();
    }


}
