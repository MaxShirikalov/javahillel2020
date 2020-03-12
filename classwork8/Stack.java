package classwork8;

import java.util.List;

public class Stack {
    public static void main(String[] args) {
        List<String> stack = new java.util.Stack<>();
        stack.add("One");
        stack.add("Two");
        stack.add("Three");
        stack.add("Four");
        stack.add("Five");

        ((java.util.Stack<String>) stack).push("Six");
        System.out.println(stack.toString());
        System.out.println(((java.util.Stack<String>) stack).peek());
        System.out.println(((java.util.Stack<String>) stack).pop());

    }
}
