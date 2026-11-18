package app;

import java.util.Scanner;
import stack.MyStack;

public class TestMyStack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MyStack stack = new MyStack();
        System.out.println("Введите пять строк:");
        for (int i = 0; i < 5; i++) {
            stack.push(input.nextLine());
        }
        System.out.println(stack);
        System.out.println("В обратном порядке:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
