package app;

import stack.MyStack;

public class TestMyStackClone {
    public static void main(String[] args) {
        MyStack stack1 = new MyStack();
        stack1.push("один");
        stack1.push("два");
        stack1.push("три");

        MyStack stack2 = (MyStack) stack1.clone();
        stack2.push("четыре");
        stack1.pop();

        System.out.println("Первый стек: " + stack1);
        System.out.println("Копия: " + stack2);
        System.out.println("Один и тот же объект: " + (stack1 == stack2));
    }
}
