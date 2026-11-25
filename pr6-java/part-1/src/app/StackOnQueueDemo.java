package app;

import stack.StackOnQueue;

public class StackOnQueueDemo {
    public static void main(String[] args) {
        StackOnQueue stack = new StackOnQueue();
        stack.push(5);
        stack.push(8);

        System.out.println("top() = " + stack.top());
        System.out.println("pop() = " + stack.pop());
        System.out.println("empty() = " + stack.empty());
        System.out.println(stack);

        stack.push(13);
        stack.push(21);
        System.out.println(stack);
        System.out.println("pop() = " + stack.pop());
        System.out.println(stack);
        System.out.println("empty() = " + stack.empty());
    }
}
