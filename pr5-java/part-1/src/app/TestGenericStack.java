package app;

import generics.GenericStack;
import java.util.Scanner;

public class TestGenericStack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GenericStack<String> stack = new GenericStack<>();
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
