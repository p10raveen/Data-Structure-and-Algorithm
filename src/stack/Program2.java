package stack;

import java.util.Stack;

public class Program2 {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();
        stack.push("James");
        stack.push("Peter");
        stack.push("Albert");
        System.out.println(stack);

        System.out.println("Poped out element: "+stack.pop());

        System.out.println(stack);
        System.out.println("Topmost element: "+stack.peek());

    }

}
