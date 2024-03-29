package Lab3;

import java.util.Stack;

public class StackTopBottomElement {

    private static void findTopAndBottom(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            int topElement = stack.peek();
            System.out.println("Top element of the stack is " + topElement);

            int bottomElement = stack.firstElement();
            System.out.println("Bottom element of the stack is " + bottomElement);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70);
        findTopAndBottom(stack);
    }
}
